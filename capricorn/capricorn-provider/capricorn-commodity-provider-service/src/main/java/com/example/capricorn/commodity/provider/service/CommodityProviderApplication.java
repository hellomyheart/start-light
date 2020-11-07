package com.example.capricorn.commodity.provider.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * projectName: start-light
 * author: 张宁
 * time: 2020/11/7 18:47
 * description:
 */
//nacos注解
@EnableDiscoveryClient
//开启事务注解
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.example.capricorn.commodity.provider.service.mapper")
public class CommodityProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommodityProviderApplication.class,args);
    }
}
