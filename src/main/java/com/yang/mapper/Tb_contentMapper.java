package com.yang.mapper;

import com.yang.bean.Tb_content;
import com.yang.bean.Tb_contentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_contentMapper {
    int countByExample(Tb_contentExample example);

    int deleteByExample(Tb_contentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tb_content record);

    int insertSelective(Tb_content record);

    List<Tb_content> selectByExampleWithBLOBs(Tb_contentExample example);

    List<Tb_content> selectByExample(Tb_contentExample example);

    Tb_content selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tb_content record, @Param("example") Tb_contentExample example);

    int updateByExampleWithBLOBs(@Param("record") Tb_content record, @Param("example") Tb_contentExample example);

    int updateByExample(@Param("record") Tb_content record, @Param("example") Tb_contentExample example);

    int updateByPrimaryKeySelective(Tb_content record);

    int updateByPrimaryKeyWithBLOBs(Tb_content record);

    int updateByPrimaryKey(Tb_content record);
}