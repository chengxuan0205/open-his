package com.dcx.service;

import com.dcx.domain.Check;
import com.dcx.domain.CheckStat;
import com.dcx.dto.CheckQueryDto;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface CheckService {
    /**
     * 查询检查项列表
     *
     * @param checkQueryDto
     * @return
     */
    List<Check> queryCheck(CheckQueryDto checkQueryDto);

    /**
     * 查询检查项统计列表
     *
     * @param checkQueryDto
     * @return
     */
    List<CheckStat> queryCheckStat(CheckQueryDto checkQueryDto);
}
