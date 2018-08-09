package com.yang.mapper;

import com.yang.bean.Tb_user;
import com.yang.bean.Tb_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_userMapper {
    int countByExample(Tb_userExample example);

    int deleteByExample(Tb_userExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tb_user record);

    int insertSelective(Tb_user record);

    List<Tb_user> selectByExample(Tb_userExample example);

    Tb_user selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tb_user record, @Param("example") Tb_userExample example);

    int updateByExample(@Param("record") Tb_user record, @Param("example") Tb_userExample example);

    int updateByPrimaryKeySelective(Tb_user record);

    int updateByPrimaryKey(Tb_user record);
}