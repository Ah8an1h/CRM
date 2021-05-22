package com.ssm.service;

import com.ssm.utils.AjaxResult;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 18/4/17.
 */
public interface ReferService {
    AjaxResult findByStatus(Integer pageNum, Integer pageSize,String status);
    int addReferStu(String name,String telephone,String qq,String intentionLevel
                    ,String classId,String courseTypeId,String source,String remark);
}
