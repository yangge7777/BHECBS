package com.yang.mapper;

import com.yang.bean.Tb_admin;
import com.yang.bean.Tb_adminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Tb_adminMapper {
    int countByExample(Tb_adminExample example);

    int deleteByExample(Tb_adminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(Tb_admin record);

    int insertSelective(Tb_admin record);

    List<Tb_admin> selectByExample(Tb_adminExample example);

    Tb_admin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") Tb_admin record, @Param("example") Tb_adminExample example);

    int updateByExample(@Param("record") Tb_admin record, @Param("example") Tb_adminExample example);

    int updateByPrimaryKeySelective(Tb_admin record);

    int updateByPrimaryKey(Tb_admin record);
    Tb_admin selectByAccount_PSWD(Tb_admin tb_admin);
}