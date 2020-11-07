package com.example.aquarius.subscribe.provider.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description
 * @className: SubscribeProviderApplicaton
 * @package: com.example.aquarius.subscribe.provider.service
 * @author: Stephen Shen
 * @date: 2020/11/7 下午5:06
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.example.aquarius.subscribe.provider.service.mapper")
@EnableTransactionManagement
public class SubscribeProviderApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class,args);
    }
}
