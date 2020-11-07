package com.example.cancer.order.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.cancer.order.provider.service.mapper.TOrderdetailedMapper;
import com.example.cancer.order.provider.api.domain.TOrderdetailed;
import com.example.cancer.order.provider.api.service.TOrderdetailedService;
@Service
public class TOrderdetailedServiceImpl implements TOrderdetailedService{

    @Resource
    private TOrderdetailedMapper tOrderdetailedMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tOrderdetailedMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TOrderdetailed record) {
        return tOrderdetailedMapper.insert(record);
    }

    @Override
    public int insertSelective(TOrderdetailed record) {
        return tOrderdetailedMapper.insertSelective(record);
    }

    @Override
    public TOrderdetailed selectByPrimaryKey(Integer id) {
        return tOrderdetailedMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TOrderdetailed record) {
        return tOrderdetailedMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TOrderdetailed record) {
        return tOrderdetailedMapper.updateByPrimaryKey(record);
    }

}
