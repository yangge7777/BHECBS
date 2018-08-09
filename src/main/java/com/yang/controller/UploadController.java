package com.yang.controller;



import com.alibaba.fastjson.JSONObject;
import com.sun.jersey.api.client.Client;

import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.yang.common.pojo.TaotaoResult;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by dllo on 18/8/8.
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * My Dear Taoism's Friend .Please SitDown.
 */
@Controller
@RequestMapping("/upload")
public class UploadController {

    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;

    //上传图片  通过@RequestParam(required = false) MultipartFile获取图片
    @RequestMapping(value = "/uploadPic.do")
    @ResponseBody
    public Map<String,Object> uploadBrandPic(@RequestParam(required = false) MultipartFile uploadFile, HttpServletResponse response){
        //图片名称生成策略---采用时间格式(精确到毫秒)并追加随机3位(10以内)数字
        //精确到毫秒
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String picName = df.format(new Date());
        //随机再生成3位 10以内的数
        Random r = new Random();
        for(int i=0;i<3;i++){
            picName += r.nextInt(10);
        }
        //获取扩展名
        String originalFilename = uploadFile.getOriginalFilename();
        String ext = FilenameUtils.getExtension(originalFilename);
        //相对路径
        String path = "upload/" + picName + "." + ext;
        //全路径，该路径为后面创建的tomcat图片服务器的上传图片的web工程下存放图片的路径
        String url = IMAGE_SERVER_URL + path;
        //jersey 发送另一台Tomcat(可读写的)
        Client client = new Client();
        WebResource resource = client.resource(url);

        try {
            resource.put(String.class, uploadFile.getBytes());
        } catch (UniformInterfaceException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (ClientHandlerException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Map<String, Object> result = new HashMap<>();
        result.put("error", 0);
        result.put("url", url);
        result.put("message", "上传图片成功！");
        return result;
    }




}
