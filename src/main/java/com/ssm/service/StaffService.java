package com.ssm.service;


import com.ssm.utils.AjaxResult;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by dllo on 18/4/16.
 */
public interface StaffService {

    AjaxResult findByloginName(String loginName, String loginpwd);

    int updatePwd(String oldPwd,String newPwd,String newTwoPwd);

    AjaxResult showLoginName(HttpServletRequest request);
}
