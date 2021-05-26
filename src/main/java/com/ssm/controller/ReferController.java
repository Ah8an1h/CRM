package com.ssm.controller;

import com.ssm.service.ReferService;
import com.ssm.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/4/17.
 */
@Controller
public class ReferController {
    @Resource
    private ReferService referService;


    @ResponseBody
    @RequestMapping("/listRefer1")
    public AjaxResult findBystatus(@RequestParam(value = "status",required =false)String status,
                               @RequestParam(value = "pageNum",required = false)Integer pageNum,
                               @RequestParam(value = "pageSize",required = false)Integer pageSize){
        ModelAndView modelAndView = new ModelAndView();
        AjaxResult ajaxResult= referService.findByStatus(pageNum,pageSize,status);
        modelAndView.addObject("result",ajaxResult);
        modelAndView.setViewName("refer/listRefer");
        return ajaxResult;
        //测试
    }


    @ResponseBody
    @RequestMapping(value = "/addStaffStu" ,method = RequestMethod.GET)
    public int addStaffStu(@RequestParam(value = "name" ) String name,
                           @RequestParam(value = "telephone",required = false) String telephone,
                           @RequestParam(value = "qq",required = false) String qq,
                           @RequestParam(value = "intentionLevel",required = false) String intentionLevel,
                           @RequestParam(value = "classId",required = false) String classId,
                           @RequestParam(value = "courseTypeId",required = false) String courseTypeId,
                           @RequestParam(value = "source",required = false) String source,
                           @RequestParam(value = "remark",required = false) String remark
                           ){
        System.out.println(name);
        System.out.println(telephone);
        System.out.println(qq);
        System.out.println(intentionLevel);
        System.out.println(classId);
        System.out.println(courseTypeId);
        System.out.println(source);
        System.out.println(remark);
        int num = referService.addReferStu(name,telephone,qq,intentionLevel,classId,courseTypeId,source,remark);
        return num;
    }
}
