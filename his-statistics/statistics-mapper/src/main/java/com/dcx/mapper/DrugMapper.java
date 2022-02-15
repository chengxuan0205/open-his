package com.dcx.mapper;

import com.dcx.domain.Drug;
import com.dcx.domain.DrugStat;
import com.dcx.dto.DrugQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface DrugMapper {
    /**
     * 药品统计列表
     *
     * @param drugQueryDto
     * @return
     */
    List<Drug> queryDrug(@Param("drug") DrugQueryDto drugQueryDto);

    /**
     * 药品数量统计列表
     *
     * @param drugQueryDto
     * @return
     */
    List<DrugStat> queryDrugStat(@Param("drug") DrugQueryDto drugQueryDto);
}
