package com.yang.mapper;

import com.yang.bean.Tb_item_desc;
import com.yang.bean.Tb_item_descExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_item_descMapper {
    int countByExample(Tb_item_descExample example);

    int deleteByExample(Tb_item_descExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(Tb_item_desc record);

    int insertSelective(Tb_item_desc record);

    List<Tb_item_desc> selectByExampleWithBLOBs(Tb_item_descExample example);

    List<Tb_item_desc> selectByExample(Tb_item_descExample example);

    Tb_item_desc selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") Tb_item_desc record, @Param("example") Tb_item_descExample example);

    int updateByExampleWithBLOBs(@Param("record") Tb_item_desc record, @Param("example") Tb_item_descExample example);

    int updateByExample(@Param("record") Tb_item_desc record, @Param("example") Tb_item_descExample example);

    int updateByPrimaryKeySelective(Tb_item_desc record);

    int updateByPrimaryKeyWithBLOBs(Tb_item_desc record);

    int updateByPrimaryKey(Tb_item_desc record);
}