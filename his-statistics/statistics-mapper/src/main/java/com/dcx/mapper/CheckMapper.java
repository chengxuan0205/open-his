package com.dcx.mapper;

import com.dcx.domain.Check;
import com.dcx.domain.CheckStat;
import com.dcx.dto.CheckQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: 董承轩
 */
public interface CheckMapper {
    /**
     * 查询检查项列表
     *
     * @param checkQueryDto
     * @return
     */
    List<Check> queryCheck(@Param("check") CheckQueryDto checkQueryDto);

    /**
     * 查询检查项统计列表
     *
     * @param checkQueryDto
     * @return
     */
    List<CheckStat> queryCheckStat(@Param("check") CheckQueryDto checkQueryDto);
}
