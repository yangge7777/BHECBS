package com.yang.mapper;

import com.yang.bean.Tb_order_item;
import com.yang.bean.Tb_order_itemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_order_itemMapper {
    int countByExample(Tb_order_itemExample example);

    int deleteByExample(Tb_order_itemExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tb_order_item record);

    int insertSelective(Tb_order_item record);

    List<Tb_order_item> selectByExample(Tb_order_itemExample example);

    Tb_order_item selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tb_order_item record, @Param("example") Tb_order_itemExample example);

    int updateByExample(@Param("record") Tb_order_item record, @Param("example") Tb_order_itemExample example);

    int updateByPrimaryKeySelective(Tb_order_item record);

    int updateByPrimaryKey(Tb_order_item record);
}