package com.example.cancer.order.provider.service.mapper;

import com.example.cancer.order.provider.api.domain.TOrder;

public interface TOrderMapper {
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
    int insert(TOrder record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TOrder record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TOrder selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TOrder record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TOrder record);
}