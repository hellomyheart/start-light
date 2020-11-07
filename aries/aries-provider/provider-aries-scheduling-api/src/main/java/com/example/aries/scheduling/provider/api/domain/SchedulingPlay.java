package com.example.aries.scheduling.provider.api.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 排班计划表
 */
@Data
public class SchedulingPlay implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 排班计划名
     */
    private String spName;

    /**
     * 职位id,外键
     */
    private Long pId;

    /**
     * 排班开始时间
     */
    private Date startTime;

    /**
     * 排班结束时间
     */
    private Date endTime;

    /**
     * 工时
     */
    private Double totalTime;

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