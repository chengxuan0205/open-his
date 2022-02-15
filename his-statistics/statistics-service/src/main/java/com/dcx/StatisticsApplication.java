package com.dcx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 董承轩
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.dcx.mapper"})
@EnableDubbo
public class StatisticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatisticsApplication.class, args);
        System.out.println("统计分析子系统启动成功");
    }
}
