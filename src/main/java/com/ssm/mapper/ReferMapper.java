package com.ssm.mapper;

import com.ssm.bean.Refer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReferMapper {
    List<Refer> findBystatus(@Param("status") String status);

    int addReferStu(
            @Param("referId") String referId,
            @Param("name") String name,
            @Param("telephone") String telephone,
            @Param("qq") String qq,
            @Param("intentionLevel") String intentionLevel,
            @Param("courseTypeId") String courseTypeId,
            @Param("classId") String classId,
            @Param("source") String source,
            @Param("remark") String remark,
            @Param("staffId") String staffId);
}