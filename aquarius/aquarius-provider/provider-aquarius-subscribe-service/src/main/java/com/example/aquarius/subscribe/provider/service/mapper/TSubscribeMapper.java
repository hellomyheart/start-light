package com.example.aquarius.subscribe.provider.service.mapper;

import com.example.aquarius.subscribe.provider.api.domain.TSubscribe;

public interface TSubscribeMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TSubscribe record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TSubscribe record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TSubscribe selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TSubscribe record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TSubscribe record);
}