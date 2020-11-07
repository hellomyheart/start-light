package com.example.cancer.order.provider.api.service;

import com.example.cancer.order.provider.api.domain.TOrderdetailed;
public interface TOrderdetailedService{


    int deleteByPrimaryKey(Integer id);

    int insert(TOrderdetailed record);

    int insertSelective(TOrderdetailed record);

    TOrderdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrderdetailed record);

    int updateByPrimaryKey(TOrderdetailed record);

}
