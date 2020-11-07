package com.example.cancer.order.provider.api.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author :LSS
 * @description: 订单详细表
 * @date :2020/11/7 16:40
 */
@Data
public class OrderDetailed {
    //订单详情id
    private Integer id;
    //订单skuid
    private Integer skuid;
    //订单数量
    private Integer count;
    //单价
    private Double price;
    //创建时间
    private Date ctime;

}
