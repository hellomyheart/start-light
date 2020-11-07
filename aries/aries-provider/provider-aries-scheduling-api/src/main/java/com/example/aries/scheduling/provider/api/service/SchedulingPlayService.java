package com.example.aries.scheduling.provider.api.service;

import com.example.aries.scheduling.provider.api.domain.SchedulingPlay;

public interface SchedulingPlayService {

    /**
     * 删除排班计划
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加排班计划，通过实体类
     * @param record
     * @return
     */
    int insert(SchedulingPlay record);

    /**
     * 添加排班计划（动态sql）
     * @param record
     * @return
     */
    int insertSelective(SchedulingPlay record);

    /**
     * 查询排班计划（通过主键）
     * @param id
     * @return
     */
    SchedulingPlay selectByPrimaryKey(Long id);

    /**
     * 更新排班计划（动态sql）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SchedulingPlay record);

    /**
     * 更新排班计划，通过实体类
     * @param record
     * @return
     */
    int updateByPrimaryKey(SchedulingPlay record);

}

