package com.dcx.mapper;

import com.dcx.domain.Income;
import com.dcx.domain.Refund;
import com.dcx.dto.RevenueQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface RevenueMapper {
    /**
     * 查询收入的数据
     *
     * @param revenueQueryDto
     * @return
     */
    List<Income> queryIncome(@Param("revenue") RevenueQueryDto revenueQueryDto);

    /**
     * 查询退费的数据
     *
     * @param revenueQueryDto
     * @return
     */
    List<Refund> queryRefund(@Param("revenue") RevenueQueryDto revenueQueryDto);
}
