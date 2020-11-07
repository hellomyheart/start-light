package com.example.cancer.order.provider.service.mapper;

import com.example.cancer.order.provider.api.domain.TOrderdetailed;

public interface TOrderdetailedMapper {
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
    int insert(TOrderdetailed record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TOrderdetailed record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TOrderdetailed selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TOrderdetailed record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TOrderdetailed record);
}