package com.yang.mapper;

import com.yang.bean.Tb_item;
import com.yang.bean.Tb_itemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_itemMapper {
    int countByExample(Tb_itemExample example);

    int deleteByExample(Tb_itemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tb_item record);

    int insertSelective(Tb_item record);

    List<Tb_item> selectByExample(Tb_itemExample example);

    Tb_item selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tb_item record, @Param("example") Tb_itemExample example);

    int updateByExample(@Param("record") Tb_item record, @Param("example") Tb_itemExample example);

    int updateByPrimaryKeySelective(Tb_item record);

    int updateByPrimaryKey(Tb_item record);
}