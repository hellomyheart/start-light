package com.example.aries.scheduling.provider.service.mapper;

import com.example.aries.scheduling.provider.api.domain.Scheduling;

public interface SchedulingMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Scheduling record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Scheduling record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Scheduling selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Scheduling record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Scheduling record);
}