package com.ssm.service.impl;

import com.ssm.bean.Class;
import com.ssm.mapper.ClassMapper;
import com.ssm.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/4/17.
 */
@Service
public class ClassServiceImpl implements ClassService{
    @Resource
    private ClassMapper classMapper;


    @Override
    public List<Class> findAllClassName() {
        return classMapper.findAllClassName();
    }
}
