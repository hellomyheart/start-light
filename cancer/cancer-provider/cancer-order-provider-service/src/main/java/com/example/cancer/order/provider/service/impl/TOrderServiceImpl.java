package com.example.cancer.order.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cancer.order.provider.service.mapper.TOrderMapper;
import com.example.cancer.order.provider.api.domain.TOrder;
import com.example.cancer.order.provider.api.service.TOrderService;
@Service
public class TOrderServiceImpl implements TOrderService{

    @Resource
    private TOrderMapper tOrderMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TOrder record) {
        return tOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(TOrder record) {
        return tOrderMapper.insertSelective(record);
    }

    @Override
    public TOrder selectByPrimaryKey(Integer id) {
        return tOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TOrder record) {
        return tOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TOrder record) {
        return tOrderMapper.updateByPrimaryKey(record);
    }

}
