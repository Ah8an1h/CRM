package com.ssm.mapper;

import com.ssm.bean.CourseType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseTypeMapper {
    List<CourseType> findAllCourseType();
    CourseType findcourseName(@Param("courseTypeId")String courseTypeId);
}