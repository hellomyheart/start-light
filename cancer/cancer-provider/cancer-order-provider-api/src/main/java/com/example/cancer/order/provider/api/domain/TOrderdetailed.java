package com.example.cancer.order.provider.api.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TOrderdetailed implements Serializable {
    private Integer id;

    /**
    * 商品的skuid
    */
    private Integer skuid;

    /**
    * 商品数量
    */
    private Integer count;

    /**
    * 商品单价
    */
    private Double price;

    /**
    * 创建时间
    */
    private Date ctime;

    private static final long serialVersionUID = 1L;
}