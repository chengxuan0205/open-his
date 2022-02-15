package com.dcx.service.impl;

import com.dcx.domain.Check;
import com.dcx.domain.CheckStat;
import com.dcx.dto.CheckQueryDto;
import com.dcx.mapper.CheckMapper;
import com.dcx.service.CheckService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 董承轩
 */
@Service
public class CheckServiceImpl implements CheckService {


    @Autowired
    private CheckMapper checkMapper;

    @Override
    public List<Check> queryCheck(CheckQueryDto checkQueryDto) {
        return this.checkMapper.queryCheck(checkQueryDto);
    }

    @Override
    public List<CheckStat> queryCheckStat(CheckQueryDto checkQueryDto) {
        return this.checkMapper.queryCheckStat(checkQueryDto);
    }
}
