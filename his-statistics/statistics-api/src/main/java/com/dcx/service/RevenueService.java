package com.dcx.service;

import com.dcx.dto.RevenueQueryDto;

import java.util.Map;

/**
 * @Author: 董承轩
 */
public interface RevenueService {
    /**
     * 查询收支统计的数据
     *
     * @param revenueQueryDto
     * @return
     */
    Map<String, Object> queryAllRevenueData(RevenueQueryDto revenueQueryDto);
}
