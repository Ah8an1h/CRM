package com.ssm.controller;

import com.ssm.bean.Class;
import com.ssm.bean.CourseType;
import com.ssm.service.ClassService;
import com.ssm.service.CourseTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/4/17.
 */
@Controller
public class ClassController {
    @Resource
    private ClassService classService;
    @Resource
    private CourseTypeService courseTypeService;

    @RequestMapping(value = "/className")
    public String ClassName(Model model){
        List<Class> classes = classService.findAllClassName();
        List<CourseType> courseTypes = courseTypeService.findAllCourseType();
        model.addAttribute("classes",classes);
        model.addAttribute("courseTypes",courseTypes);
        return "refer/addRefer";
    }
}
