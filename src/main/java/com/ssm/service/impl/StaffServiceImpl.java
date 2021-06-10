package com.ssm.service.impl;

import com.ssm.bean.Staff;
import com.ssm.mapper.StaffMapper;
import com.ssm.service.StaffService;
import com.ssm.utils.AjaxResult;
import com.ssm.utils.SoutUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by dllo on 18/4/16.
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    @Resource
    private HttpServletRequest request;

    @Override
    public AjaxResult findByloginName(String loginName, String loginpwd) {
        Staff staff = new Staff();
        staff.setLoginname(loginName);
        staff.setLoginpwd(loginpwd);
        AjaxResult ajaxResult = new AjaxResult();

        if (!userArgs(staff)) {
            ajaxResult.setCode("0");
            ajaxResult.setMsg("用户名密码不能为空");
            return ajaxResult;
        }
        Staff staff1 = staffMapper.findByloginName(loginName, loginpwd);
        if (staff1 == null) {
            ajaxResult.setMsg("用户名或密码错误");
            ajaxResult.setCode("0");
            return ajaxResult;
        } else {
            String name = staff1.getLoginname();
            String pwd = staff1.getLoginpwd();
            String id = staff1.getStaffid();
            HttpSession session = request.getSession();
            session.setAttribute("id",id);
            session.setAttribute("name", name);
            session.setAttribute("pwd", pwd);
            SoutUtils.resultStr(name);
            ajaxResult.setCode("1");
            ajaxResult.setMsg("登入成功");
            ajaxResult.setData(staff1);
            return ajaxResult;
        }
    }

    @Override
    public int updatePwd(String oldPwd,String newPwd,String newTwoPwd) {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        String pwd = (String) session.getAttribute("pwd");
        if (oldPwd != null && !oldPwd.equals("")
                && newPwd != null && !newPwd.equals("")
                && newTwoPwd != null && !newTwoPwd.equals("")){
            if (oldPwd.equals(pwd) && newPwd.equals(newTwoPwd)){
                int num = staffMapper.updatePwd(newPwd,name);
                return num;
            }else {
                return 0;
            }
        }else {
            return 0;
        }
    }

    @Override
    public AjaxResult showLoginName(HttpServletRequest request) {
        AjaxResult ajaxResult = new AjaxResult();
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        SoutUtils.resultStr(name+"  "+"showname");
        ajaxResult.setData(name);
        return ajaxResult;
    }

    private boolean userArgs(Staff staff) {
        // 用户名和密码不能为空
        if (SoutUtils.isNull(staff.getLoginname()) ||
                SoutUtils.isNull(staff.getLoginpwd())) {
            return false;
        }
        return true;

    }
}
