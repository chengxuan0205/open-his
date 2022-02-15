package com.dcx.service;

import com.dcx.domain.Workload;
import com.dcx.domain.WorkloadStat;
import com.dcx.dto.WorkloadQueryDto;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface WorkloadService {
    /**
     * 医生工作量统计列表
     *
     * @param workloadQueryDto
     * @return
     */
    List<Workload> queryWorkload(WorkloadQueryDto workloadQueryDto);

    /**
     * 总体工作量统计列表
     *
     * @param workloadQueryDto
     * @return
     */
    List<WorkloadStat> queryWorkloadStat(WorkloadQueryDto workloadQueryDto);
}
