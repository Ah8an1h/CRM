package com.ssm.controller;

import com.ssm.service.CourseTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/4/17.
 */
@Controller
public class CourseTypeController {
    @Resource
    private CourseTypeService courseTypeService;


}
