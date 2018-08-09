package com.yang.mapper;

import com.yang.bean.Tb_item_param_item;
import com.yang.bean.Tb_item_param_itemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_item_param_itemMapper {
    int countByExample(Tb_item_param_itemExample example);

    int deleteByExample(Tb_item_param_itemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tb_item_param_item record);

    int insertSelective(Tb_item_param_item record);

    List<Tb_item_param_item> selectByExampleWithBLOBs(Tb_item_param_itemExample example);

    List<Tb_item_param_item> selectByExample(Tb_item_param_itemExample example);

    Tb_item_param_item selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tb_item_param_item record, @Param("example") Tb_item_param_itemExample example);

    int updateByExampleWithBLOBs(@Param("record") Tb_item_param_item record, @Param("example") Tb_item_param_itemExample example);

    int updateByExample(@Param("record") Tb_item_param_item record, @Param("example") Tb_item_param_itemExample example);

    int updateByPrimaryKeySelective(Tb_item_param_item record);

    int updateByPrimaryKeyWithBLOBs(Tb_item_param_item record);

    int updateByPrimaryKey(Tb_item_param_item record);
}