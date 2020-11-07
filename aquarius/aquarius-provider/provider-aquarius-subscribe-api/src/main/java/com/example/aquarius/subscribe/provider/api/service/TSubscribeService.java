package com.example.aquarius.subscribe.provider.api.service;

import com.example.aquarius.subscribe.provider.api.domain.TSubscribe;
public interface TSubscribeService{


    /**
     * 删除预约
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加预约(实体类)
     * @param record
     * @return
     */
    int insert(TSubscribe record);

    /**
     * 添加预约（动态sql）
     * @param record
     * @return
     */
    int insertSelective(TSubscribe record);

    /**
     * 通过主键查询预约
     * @param id
     * @return
     */
    TSubscribe selectByPrimaryKey(Integer id);

    /**
     * 更新预约 动态sql
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TSubscribe record);

    /**
     * 更新预约 实体类
     * @param record
     * @return
     */
    int updateByPrimaryKey(TSubscribe record);

}
