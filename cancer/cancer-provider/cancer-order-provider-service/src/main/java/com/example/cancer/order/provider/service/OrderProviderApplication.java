package com.example.cancer.order.provider.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.swing.*;

/**
 * @description
 * @className: OrderProviderApplication
 * @package: com.example.cancer.order.provider.service
 * @author: Stephen Shen
 * @date: 2020/11/7 下午5:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "com.example.cancer.order.provider.service.mapper")
public class OrderProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProviderApplication.class,args);
    }
}
