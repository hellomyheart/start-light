package com.example.cancer.order.provider.api.domain;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author :LSS
 * @description: 订单主表
 * @date :2020/11/7 16:10
 */

@Data
public class Order implements Serializable {
    //订单id
    private Integer id;
    //用户id
    private Integer uid;
    //收货地址id
    private Integer aid;
    //商品总价
    private Double totalmoney;
    //优惠价格
    private Double freemoney;
    //实付价格
    private Double paymoney;
    //支付方式
    private Integer paytype;
    //创建时间
    private Date ctime;
    //修改时间
    private Date update;
}
