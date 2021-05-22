package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.bean.Refer;
import com.ssm.mapper.ReferMapper;
import com.ssm.service.ReferService;
import com.ssm.utils.AjaxResult;
import com.ssm.utils.GuidUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import com.ssm.mapper.ReferMapper;
import com.ssm.service.ReferService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dllo on 18/4/17.
 */
@Service
public class ReferServiceImpl implements ReferService {
    @Resource
    private ReferMapper referMapper;
    @Resource
    private HttpServletRequest request;

    private String staId;
    @Override
    public AjaxResult findByStatus(Integer pageNum, Integer pageSize,String status) {
        AjaxResult ajaxResult = new AjaxResult();
//        pageNum = pageNum == null ? 1 : pageNum;//默认为第一页
//        pageSize = pageSize == null ? 1 : pageSize;//默认显示条数据
//        PageHelper.startPage(pageNum, pageSize);
        List<Refer> refers = referMapper.findBystatus(status);
//        PageInfo<Refer> referPageInfo = new PageInfo<Refer>(refers);
        ajaxResult.setData(refers);
        return ajaxResult;
    }



    @Override
    public int addReferStu(String name, String telephone, String qq, String intentionLevel, String classId, String courseTypeId, String source, String remark) {
        staId = (String) request.getSession().getAttribute("id");
        String refId = GuidUtil.getGuid();
        int num = referMapper.addReferStu(refId,name,telephone,qq,intentionLevel,courseTypeId,classId,source,remark,staId);
        return num;
    }

}
