package com.dcx.controller.system;

import com.dcx.dto.OperLogDto;
import com.dcx.service.OperLogService;
import com.dcx.vo.AjaxResult;
import com.dcx.vo.DataGridView;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 董承轩
 */
@Log4j2
@RestController
@RequestMapping("system/operLog")
public class OperLogController {

    @Autowired
    private OperLogService operLogService;

    /**
     * 分页查询
     */
    @GetMapping("listForPage")
    public AjaxResult listForPage(OperLogDto operLogDto) {
        DataGridView gridView = operLogService.listForPage(operLogDto);
        return AjaxResult.success("查询成功", gridView.getData(), gridView.getTotal());
    }

    /**
     * 删除
     */
    @DeleteMapping("deleteOperLogByIds/{infoIds}")
    public AjaxResult deleteOperLogByIds(@PathVariable Long[] infoIds) {
        return AjaxResult.toAjax(this.operLogService.deleteOperLogByIds(infoIds));
    }

    /**
     * 清空删除
     */
    @DeleteMapping("clearAllOperLog")
    public AjaxResult clearAllOperLog() {
        return AjaxResult.toAjax(this.operLogService.clearAllOperLog());
    }

}
