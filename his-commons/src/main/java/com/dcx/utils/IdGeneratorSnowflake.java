package com.dcx.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: 董承轩
 */
public class IdGeneratorSnowflake {
    private static final Logger log = LoggerFactory.getLogger(HttpUtils.class);
    private static long workId = 0;
    private static long datacenterId = 1;
    private static Snowflake snowflake;

    static {
        try {
            //workId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            //log.info("当前机器的工作 ID 为:" + workId);
            snowflake = IdUtil.createSnowflake(workId, datacenterId);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("当前机器的 workId 获取失败", e);
            workId = NetUtil.getLocalhostStr().hashCode();
        }
    }

    /**
     * 生成 ID
     */
    public static synchronized Long snowflakeId() {
        return snowflake.nextId();
    }

    /**
     * 根据前缀前成 ID
     */
    public static String generatorIdWithProfix(String profix) {
        return profix + snowflakeId();
    }
}
