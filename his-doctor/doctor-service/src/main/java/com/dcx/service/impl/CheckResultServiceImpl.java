package com.dcx.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dcx.constants.Constants;
import com.dcx.domain.CareOrderItem;
import com.dcx.domain.CheckResult;
import com.dcx.domain.OrderChargeItem;
import com.dcx.dto.CheckResultDto;
import com.dcx.dto.CheckResultFormDto;
import com.dcx.mapper.CareOrderItemMapper;
import com.dcx.mapper.CheckResultMapper;
import com.dcx.mapper.OrderChargeItemMapper;
import com.dcx.service.CheckResultService;
import com.dcx.vo.DataGridView;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Method;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: 董承轩
 */
@Service(methods = {@Method(name = "saveCheckResult", retries = 1)})
public class CheckResultServiceImpl implements CheckResultService {
    @Autowired
    private CheckResultMapper checkResultMapper;

    @Autowired
    private OrderChargeItemMapper orderChargeItemMapper;

    @Autowired
    private CareOrderItemMapper careOrderItemMapper;

    @Override
    @Transactional
    public int saveCheckResult(CheckResult checkResult) {
        //直接保存
        int i = checkResultMapper.insert(checkResult);
        //更新收费详情状态
        OrderChargeItem orderChargeItem = new OrderChargeItem();
        orderChargeItem.setItemId(checkResult.getItemId());
        orderChargeItem.setStatus(Constants.ORDER_DETAILS_STATUS_3);//已完成
        orderChargeItemMapper.updateById(orderChargeItem);
        //更新处方详情状态
        CareOrderItem careOrderItem = new CareOrderItem();
        careOrderItem.setItemId(checkResult.getItemId());
        careOrderItem.setStatus(Constants.ORDER_DETAILS_STATUS_3);
        careOrderItemMapper.updateById(careOrderItem);
        return i;
    }

    @Override
    public DataGridView queryAllCheckResultForPage(CheckResultDto checkResultDto) {
        Page<CheckResult> page = new Page<>(checkResultDto.getPageNum(), checkResultDto.getPageSize());
        QueryWrapper<CheckResult> qw = new QueryWrapper<>();
        qw.in(checkResultDto.getCheckItemIds().size() > 0, CheckResult.COL_CHECK_ITEM_ID, checkResultDto.getCheckItemIds());
        qw.like(StringUtils.isNotBlank(checkResultDto.getRegId()), CheckResult.COL_REG_ID, checkResultDto.getRegId());
        qw.like(StringUtils.isNotBlank(checkResultDto.getPatientName()), CheckResult.COL_PATIENT_NAME, checkResultDto.getPatientName());
        qw.eq(StringUtils.isNotBlank(checkResultDto.getResultStatus()), CheckResult.COL_RESULT_STATUS, checkResultDto.getResultStatus());
        this.checkResultMapper.selectPage(page, qw);
        return new DataGridView(page.getTotal(), page.getRecords());
    }

    @Override
    public int completeCheckResult(CheckResultFormDto checkResultFormDto) {
        CheckResult checkResult = new CheckResult();
        BeanUtil.copyProperties(checkResultFormDto, checkResult);
        checkResult.setResultStatus(Constants.RESULT_STATUS_1);//检查完成
        checkResult.setUpdateBy(checkResultFormDto.getSimpleUser().getUserName());
        return this.checkResultMapper.updateById(checkResult);
    }
}
