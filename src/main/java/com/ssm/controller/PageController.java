package com.ssm.controller;

import com.ssm.bean.Staff;
import com.ssm.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/4/13.
 */
@Controller
public class PageController {

    @RequestMapping(value = {"", "/","/login"})
    public String test() {
        return "login";
    }

    @RequestMapping("/frame")
    public String frame() {
        return "frame";
    }

    @RequestMapping("/left")
    public String left(){
        return "frame/left";
    }

    @RequestMapping("/left1")
    public String left1(){
        return "frame/left1";
    }

    @RequestMapping("/left2")
    public String left2(){
        return "frame/left2";
    }

    @RequestMapping("/top")
    public String top(){
        return "frame/top";
    }

    @RequestMapping("/control")
    public String control(){
        return "frame/control";
    }

    @RequestMapping("/right")
    public String right(){
        return "frame/right";
    }

    @RequestMapping("/updPwd")
    public String updPwd(){
        return "staff/updPwd";
    }

    @RequestMapping("/listRefer")
    public String listRefer(){
        return "refer/listRefer";
    }

    @RequestMapping("/listStudent")
    public String listStudent(){
        return "student/listStudent";
    }

    @RequestMapping("/listStation")
    public String listStation(){
        return "station/listStation";
    }

    @RequestMapping("/listRunoff")
    public String listRunoff(){
        return "runoff/listRunoff";
    }

    @RequestMapping("/listClass")
    public String listClass(){
        return "classesm/listClass";
    }

    @RequestMapping("/listCourse")
    public String listCourse(){
        return "coursetype/listCourse";
    }

    @RequestMapping("/listGraduate")
    public String listGraduate(){
        return "graduate/listGraduate";
    }

    @RequestMapping("/listDepartment")
    public String listDepartment(){
        return "department/listDepartment";
    }

    @RequestMapping("/listPost")
    public String listPost(){
        return "post/listPost";
    }

    @RequestMapping("/listStaff")
    public String listStaff(){
        return "staff/listStaff";
    }

    @RequestMapping("/showRefer")
    public String showRefer(){
        return "refer/showRefer";
    }

    @RequestMapping("/editRefer")
    public String editRefer(){
        return "refer/editRefer";
    }

    @RequestMapping("/addOrEditFollow")
    public String addOrEditFollow(){
        return "follow/addOrEditFollow";
    }

    @RequestMapping("/addStudent")
    public String addStudent(){
        return "refer/addStudent";
    }

    @RequestMapping("/addRefer")
    public String addRefer(){
        return "refer/addRefer";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
