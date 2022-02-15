package com.dcx.mapper;

import com.dcx.domain.Workload;
import com.dcx.domain.WorkloadStat;
import com.dcx.dto.WorkloadQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface WorkloadMapper {
    /**
     * 医生工作量统计列表
     *
     * @param workloadQueryDto
     * @return
     */
    List<Workload> queryWorkload(@Param("workload") WorkloadQueryDto workloadQueryDto);

    /**
     * 总体工作量统计列表
     *
     * @param workloadQueryDto
     * @return
     */
    List<WorkloadStat> queryWorkloadStat(@Param("workload") WorkloadQueryDto workloadQueryDto);
}
