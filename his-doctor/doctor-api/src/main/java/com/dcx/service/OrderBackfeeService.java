package com.dcx.service;

import com.dcx.domain.OrderBackfeeItem;
import com.dcx.dto.OrderBackfeeDto;
import com.dcx.dto.OrderBackfeeFormDto;
import com.dcx.vo.DataGridView;

import java.util.List;

/**
 * @Author: 董承轩
 * 退费接口
 */
public interface OrderBackfeeService {

    /**
     * 保存退费单
     *
     * @param orderBackfeeFormDto
     */
    void saveOrderAndItems(OrderBackfeeFormDto orderBackfeeFormDto);

    /**
     * 退费成功之后更改状态
     *
     * @param backId
     * @param backPlatformId
     * @param backType       退费类型
     */
    void backSuccess(String backId, String backPlatformId, String backType);

    /**
     * 分页查询所有退费单
     *
     * @param orderBackfeeDto
     * @return
     */
    DataGridView queryAllOrderBackfeeForPage(OrderBackfeeDto orderBackfeeDto);

    /**
     * 根据退费单的ID查询退费详情信息
     *
     * @param backId
     * @return
     */
    List<OrderBackfeeItem> queryrderBackfeeItemByBackId(String backId);
}
