package com.dcx.service;

import com.dcx.domain.Drug;
import com.dcx.domain.DrugStat;
import com.dcx.dto.DrugQueryDto;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface DrugService {
    /**
     * 查询发药统计列表
     *
     * @param drugQueryDto
     * @return
     */
    List<Drug> queryDrug(DrugQueryDto drugQueryDto);

    /**
     * 查询发药数量统计列表
     *
     * @param drugQueryDto
     * @return
     */
    List<DrugStat> queryDrugStat(DrugQueryDto drugQueryDto);
}
