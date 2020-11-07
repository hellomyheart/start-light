package com.example.aries.scheduling.provider.service.mapper;

import com.example.aries.scheduling.provider.api.domain.SchedulingPlay;

public interface SchedulingPlayMapper {
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
    int insert(SchedulingPlay record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SchedulingPlay record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SchedulingPlay selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SchedulingPlay record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SchedulingPlay record);
}