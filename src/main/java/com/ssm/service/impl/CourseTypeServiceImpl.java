package com.ssm.service.impl;

import com.ssm.bean.CourseType;
import com.ssm.mapper.CourseTypeMapper;
import com.ssm.service.CourseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/4/17.
 */
@Service
public class CourseTypeServiceImpl implements CourseTypeService {
    @Resource
    private CourseTypeMapper courseTypeMapper;


    @Override
    public List<CourseType> findAllCourseType() {
        return courseTypeMapper.findAllCourseType();
    }
}
