package com.dcx.service;

import com.dcx.domain.LoginInfo;
import com.dcx.dto.LoginInfoDto;
import com.dcx.vo.DataGridView;

/**
 * @Author: 董承轩
 */

public interface LoginInfoService {
    /**
     * 添加
     *
     * @param loginInfo
     * @return
     */
    int insertLoginInfo(LoginInfo loginInfo);

    /**
     * 分页查询
     *
     * @param loginInfoDto
     * @return
     */
    DataGridView listForPage(LoginInfoDto loginInfoDto);

    /**
     * 删除登陆日志
     *
     * @param infoIds
     * @return
     */
    int deleteLoginInfoByIds(Long[] infoIds);

    /**
     * 清空登陆日志
     *
     * @return
     */
    int clearLoginInfo();

}
