package com.example.aquarius.subscribe.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.aquarius.subscribe.provider.service.mapper.TSubscribeMapper;
import com.example.aquarius.subscribe.provider.api.domain.TSubscribe;
import com.example.aquarius.subscribe.provider.api.service.TSubscribeService;
@Service
public class TSubscribeServiceImpl implements TSubscribeService{

    @Resource
    private TSubscribeMapper tSubscribeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        //

        return tSubscribeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TSubscribe record) {
        //










        return tSubscribeMapper.insert(record);
    }

    @Override
    public int insertSelective(TSubscribe record) {
        return tSubscribeMapper.insertSelective(record);
    }

    @Override
    public TSubscribe selectByPrimaryKey(Integer id) {
        return tSubscribeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSubscribe record) {
        return tSubscribeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TSubscribe record) {
        return tSubscribeMapper.updateByPrimaryKey(record);
    }

}
