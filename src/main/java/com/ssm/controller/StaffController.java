package com.ssm.controller;

import com.ssm.service.StaffService;
import com.ssm.utils.AjaxResult;
import com.ssm.utils.SoutUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 18/4/16.
 */
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;

    @ResponseBody
    @RequestMapping("/findByloginName")
    public AjaxResult findByloginName(@RequestParam(value = "loginName",required = false) String loginName,
                                      @RequestParam(value = "loginpwd",required = false) String loginpwd) {
        SoutUtils.resultStr(loginName);
        return staffService.findByloginName(loginName, loginpwd);
    }

    @ResponseBody
    @RequestMapping("/updatePwd")
    public int updatePwd(@RequestParam(value = "oldPwd") String oldPwd,
                         @RequestParam(value = "newPwd") String newPwd,
                         @RequestParam(value = "newTwoPwd") String newTwoPwd){
        int num = staffService.updatePwd(oldPwd,newPwd,newTwoPwd);
        return num;

    }
    @ResponseBody
    @RequestMapping("/showLoginName")
    public AjaxResult showLoginName(HttpServletRequest request){
       return staffService.showLoginName(request);
    }


}
