package com.dcx.utils;

import cn.hutool.core.date.DateUtil;

/**
 * @Author: 董承轩
 */
public class HisDateUtils {
    /**
     * 得到时段
     * 1上午
     * 2下午
     * 3晚上
     */
    public static String getCurrentTimeType() {
        int hour = DateUtil.hour(DateUtil.date(), true);
        if (hour >= 6 && hour < 12) {
            return "1";
        } else if (hour >= 12 && hour < 18) {
            return "2";
        } else {
            return "3";
        }
    }
}
