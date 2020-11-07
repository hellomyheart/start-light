package com.example.aries.scheduling.provider.api.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 排班表
 */
@Data
public class Scheduling implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 排班计划id
     */
    private Long spId;

    /**
     * 职工id
     */
    private Long eId;

    /**
     * 状态：0未开始，1.正常，2.迟到，3.早退，4.旷工，5.请假
     */
    private Integer status;

    /**
     * 排班日期
     */
    private Date sphedulingTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}