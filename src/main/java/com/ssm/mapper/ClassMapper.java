package com.ssm.mapper;

import com.ssm.bean.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassMapper {
    List<Class> findAllClassName();
    Class findClassNamebyId(@Param("class")String classId);
}