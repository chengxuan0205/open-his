package com.dcx.service;

import com.dcx.domain.RegisteredItem;
import com.dcx.dto.RegisteredItemDto;
import com.dcx.vo.DataGridView;

import java.util.List;

/**
 * @Author: 董承轩
 */

public interface RegisteredItemService {
    /**
     * 分页查询
     *
     * @param registeredItemDto
     * @return
     */
    DataGridView listRegisteredItemPage(RegisteredItemDto registeredItemDto);

    /**
     * 根据ID查询
     *
     * @param registeredItemId
     * @return
     */
    RegisteredItem getOne(Long registeredItemId);

    /**
     * 添加
     *
     * @param registeredItemDto
     * @return
     */
    int addRegisteredItem(RegisteredItemDto registeredItemDto);

    /**
     * 修改
     *
     * @param registeredItemDto
     * @return
     */
    int updateRegisteredItem(RegisteredItemDto registeredItemDto);

    /**
     * 根据ID删除
     *
     * @param registeredItemIds
     * @return
     */
    int deleteRegisteredItemByIds(Long[] registeredItemIds);

    /**
     * 查询所有可用的检查项目
     */
    List<RegisteredItem> selectAllRegisteredItem();

}
