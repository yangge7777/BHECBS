package com.yang.controller;


import com.github.pagehelper.PageHelper;
import com.yang.bean.Tb_item;
import com.yang.bean.Tb_itemExample;
import com.yang.common.pojo.EUTreeNode;
import com.yang.common.pojo.TaotaoResult;
import com.yang.mapper.Tb_itemMapper;
import com.yang.service.Tb_itemService;
import com.yang.service.Tb_item_catService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 18/8/7.
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
@RequestMapping("/item")
public class ItemController {

    @Resource
    private Tb_itemMapper mapper;
    @Resource
    private Tb_item_catService tb_item_catServiceImpl;
    @Resource
    private Tb_itemService tb_itemService;
        @RequestMapping("itemlist.do")
        @PostMapping
        @ResponseBody
        public Map<String,Object> itemlist(String page, String rows){
            Map<String, Object> map = new HashMap<>();
            Tb_itemExample example = new Tb_itemExample();
            PageHelper.startPage(Integer.parseInt(page),Integer.parseInt(rows));
            List<Tb_item> tb_items = mapper.selectByExample(example);
            int total = mapper.selectByExample(example).size();
            map.put("total", total);
            map.put("rows",tb_items);
            return map;
        }


    @RequestMapping("/tb_item_cat.do")
    @ResponseBody
    public List<EUTreeNode> tb_tiem_cat(@RequestParam(name="id",defaultValue = "0") Long parentId){
        return tb_item_catServiceImpl.getItemCatList(parentId);
    }

    @RequestMapping("/itemsave.do")
    @PostMapping
    @ResponseBody
    public TaotaoResult addItem(Tb_item tb_item,String desc){
        System.out.println("hahaha");
        try {
            TaotaoResult result = tb_itemService.createItem(tb_item, desc);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TaotaoResult.build(500, "添加商品失败");
    }

}
