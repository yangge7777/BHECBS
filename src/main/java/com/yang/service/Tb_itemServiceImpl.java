package com.yang.service;

import com.yang.bean.Tb_item;
import com.yang.bean.Tb_item_desc;
import com.yang.common.pojo.TaotaoResult;
import com.yang.mapper.Tb_itemMapper;
import com.yang.mapper.Tb_item_descMapper;
import com.yang.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
@Service
public class Tb_itemServiceImpl implements Tb_itemService {

    @Resource
    private Tb_itemMapper tb_itemMapper;
    @Resource
    private Tb_item_descMapper tb_item_descMapper;

    @Override
    public List<Tb_item> select_Tb_itemAll() {
        return null;
    }

    @Override
    public TaotaoResult createItem(Tb_item tb_item, String desc) throws Exception {
        long itemId = IDUtils.genItemId();
        tb_item.setId(itemId);
        tb_item.setStatus((byte) 1);
        tb_item.setCreated(new Date());
        tb_item.setUpdated(new Date());
        tb_itemMapper.insert(tb_item);
        insertItemDesc(itemId,desc);
        return TaotaoResult.ok();
    }


    private void insertItemDesc(long itemId,String desc){
        //创建一个商品描述表对应的pojo
        Tb_item_desc itemDesc = new Tb_item_desc();
        //补全pojo的属性
        itemDesc.setItemId(itemId);
        itemDesc.setItemDesc(desc);
        itemDesc.setCreated(new Date());
        itemDesc.setUpdated(new Date());
        //向商品描述表插入数据
        tb_item_descMapper.insert(itemDesc);

    }
}
