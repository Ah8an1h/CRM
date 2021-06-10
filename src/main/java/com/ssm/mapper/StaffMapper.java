package com.ssm.mapper;

import com.ssm.bean.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffMapper {


    Staff findByloginName(@Param("loginName")String loginName,
                          @Param("loginpwd")String loginpwd);


    int updatePwd(@Param("newPwd") String newPwd,
                  @Param("loginName") String loginName);

    Staff findStaffNameById(@Param("staffId")Staff staffId);
}