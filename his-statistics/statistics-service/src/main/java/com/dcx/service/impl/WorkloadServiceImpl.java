package com.dcx.service.impl;

import com.dcx.domain.Workload;
import com.dcx.domain.WorkloadStat;
import com.dcx.dto.WorkloadQueryDto;
import com.dcx.mapper.WorkloadMapper;
import com.dcx.service.WorkloadService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 董承轩
 */
@Service
public class WorkloadServiceImpl implements WorkloadService {


    @Autowired
    private WorkloadMapper workloadMapper;

    @Override
    public List<Workload> queryWorkload(WorkloadQueryDto workloadQueryDto) {
        return this.workloadMapper.queryWorkload(workloadQueryDto);
    }

    @Override
    public List<WorkloadStat> queryWorkloadStat(WorkloadQueryDto workloadQueryDto) {
        return this.workloadMapper.queryWorkloadStat(workloadQueryDto);
    }
}
