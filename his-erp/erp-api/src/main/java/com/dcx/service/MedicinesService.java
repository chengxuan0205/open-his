package com.dcx.service;

import com.dcx.domain.Medicines;
import com.dcx.dto.MedicinesDto;
import com.dcx.vo.DataGridView;

import java.util.List;

/**
 * @Author: 董承轩
 */

public interface MedicinesService {
    /**
     * 分页查询
     *
     * @param medicinesDto
     * @return
     */
    DataGridView listMedicinesPage(MedicinesDto medicinesDto);

    /**
     * 根据ID查询
     *
     * @param medicinesId
     * @return
     */
    Medicines getOne(Long medicinesId);

    /**
     * 添加
     *
     * @param medicinesDto
     * @return
     */
    int addMedicines(MedicinesDto medicinesDto);

    /**
     * 修改
     *
     * @param medicinesDto
     * @return
     */
    int updateMedicines(MedicinesDto medicinesDto);

    /**
     * 根据ID删除
     *
     * @param medicinesIds
     * @return
     */
    int deleteMedicinesByIds(Long[] medicinesIds);

    /**
     * 查询所有可用生产厂家
     */
    List<Medicines> selectAllMedicines();

    /**
     * 调整库存
     */
    int updateMedicinesStorage(Long medicinesId, Long medicinesStockNum);

    /**
     * 扣减库存
     *
     * @param medicinesId 药品ID
     * @param num         扣减的量
     * @return
     */
    int deductionMedicinesStorage(Long medicinesId, long num);
}
