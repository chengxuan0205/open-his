package com.dcx.service;

import com.dcx.dto.InventoryLogDto;
import com.dcx.vo.DataGridView;

/**
 * @Author: 董承轩
 */
public interface InventoryLogService {
    /**
     * 分页查询
     *
     * @param inventoryLogDto
     * @return
     */
    DataGridView listInventoryLogPage(InventoryLogDto inventoryLogDto);
}
