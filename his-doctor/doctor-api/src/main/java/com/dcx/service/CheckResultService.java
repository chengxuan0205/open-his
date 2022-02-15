package com.dcx.service;

import com.dcx.domain.CheckResult;
import com.dcx.dto.CheckResultDto;
import com.dcx.dto.CheckResultFormDto;
import com.dcx.vo.DataGridView;

/**
 * @Author: 董承轩
 * 检查项目的接口
 */
public interface CheckResultService {
    /**
     * 保存检查的检查项目
     *
     * @param checkResult
     * @return
     */
    int saveCheckResult(CheckResult checkResult);

    /**
     * 分页查询所有检查的项目
     *
     * @param checkResultDto
     * @return
     */
    DataGridView queryAllCheckResultForPage(CheckResultDto checkResultDto);

    /**
     * 完成检查
     *
     * @param checkResultFormDto
     * @return
     */
    int completeCheckResult(CheckResultFormDto checkResultFormDto);
}
