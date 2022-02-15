package com.dcx.service;

import com.dcx.domain.Scheduling;
import com.dcx.dto.SchedulingFormDto;
import com.dcx.dto.SchedulingQueryDto;

import java.util.List;

/**
 * @Author: 董承轩
 */

public interface SchedulingService {

    /**
     * 查询排班数据
     *
     * @param schedulingQueryDto
     * @return
     */
    List<Scheduling> queryScheduling(SchedulingQueryDto schedulingQueryDto);

    /**
     * 保存排班数据
     *
     * @param schedulingFormDto
     * @return
     */
    int saveScheduling(SchedulingFormDto schedulingFormDto);

    /**
     * 根据条件查询有号的部门编号
     *
     * @param deptId
     * @param schedulingDay
     * @param schedulingType
     * @param subsectionType
     * @return
     */
    List<Long> queryHasSchedulingDeptIds(Long deptId, String schedulingDay, String schedulingType, String subsectionType);
}
