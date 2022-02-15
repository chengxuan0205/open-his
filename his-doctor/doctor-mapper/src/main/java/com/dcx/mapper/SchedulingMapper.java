package com.dcx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcx.domain.Scheduling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 董承轩
 */

public interface SchedulingMapper extends BaseMapper<Scheduling> {
    /**
     * 根据条件查询有号的部门编号
     *
     * @param deptId
     * @param schedulingDay
     * @param schedulingType
     * @param subsectionType
     * @return
     */
    List<Long> queryHasSchedulingDeptIds(@Param("deptId") Long deptId, @Param("schedulingDay") String schedulingDay, @Param("schedulingType") String schedulingType, @Param("subsectionType") String subsectionType);
}