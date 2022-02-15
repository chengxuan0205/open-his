package com.dcx.service.impl;

import com.dcx.domain.Drug;
import com.dcx.domain.DrugStat;
import com.dcx.dto.DrugQueryDto;
import com.dcx.mapper.DrugMapper;
import com.dcx.service.DrugService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 董承轩
 */
@Service
public class DrugServiceImpl implements DrugService {


    @Autowired
    private DrugMapper drugMapper;

    @Override
    public List<Drug> queryDrug(DrugQueryDto drugQueryDto) {
        return this.drugMapper.queryDrug(drugQueryDto);
    }

    @Override
    public List<DrugStat> queryDrugStat(DrugQueryDto drugQueryDto) {
        return this.drugMapper.queryDrugStat(drugQueryDto);
    }
}
