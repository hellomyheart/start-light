package com.example.aquarius.subscribe.provider.api.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TSubscribe implements Serializable {
    private Integer id;

    private String sname;

    private String phone;

    /**
    * 预约状态：0 未到 1 已到
    */
    private Integer flag;

    private Date ctime;

    private Date utime;

    private static final long serialVersionUID = 1L;
}