package com.example.cancer.order.provider.api.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TOrder implements Serializable {
    private Integer id;

    /**
    * 用户id
    */
    private Integer uid;

    /**
    * 收货地址id
    */
    private Integer aid;

    /**
    * 商品总价
    */
    private Double totalmoney;

    /**
    * 优惠金额
    */
    private Double freemoney;

    /**
    * 实付金额
    */
    private Double paymoney;

    /**
    * 支付方式
    */
    private Integer paytype;

    /**
    * 创建日期
    */
    private Date ctime;

    /**
    * 修改日期
    */
    private Date update;

    private static final long serialVersionUID = 1L;
}