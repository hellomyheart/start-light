package com.example.aries.scheduling.provider.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description
 * @className: SchedulingProviderApplication
 * @package: com.example.aries.scheduling.provider.service
 * @author: Stephen Shen
 * @date: 2020/11/7 上午11:03
 */
//nacos注解
@EnableDiscoveryClient
//开启事务注解
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.example.aries.scheduling.provider.service.mapper")
public class SchedulingProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchedulingProviderApplication.class,args);
    }
}
