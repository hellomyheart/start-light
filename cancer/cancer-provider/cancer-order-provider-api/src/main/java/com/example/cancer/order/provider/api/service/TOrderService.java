package com.example.cancer.order.provider.api.service;

import com.example.cancer.order.provider.api.domain.TOrder;
public interface TOrderService{


    int deleteByPrimaryKey(Integer id);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);

}
