package com.example.aries.scheduling.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.aries.scheduling.provider.api.domain.Scheduling;
import com.example.aries.scheduling.provider.service.mapper.SchedulingMapper;
import com.example.aries.scheduling.provider.api.service.SchedulingService;

@Service
public class SchedulingServiceImpl implements SchedulingService {

    @Resource
    private SchedulingMapper schedulingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return schedulingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Scheduling record) {
        return schedulingMapper.insert(record);
    }

    @Override
    public int insertSelective(Scheduling record) {
        return schedulingMapper.insertSelective(record);
    }

    @Override
    public Scheduling selectByPrimaryKey(Long id) {
        return schedulingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Scheduling record) {
        return schedulingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Scheduling record) {
        return schedulingMapper.updateByPrimaryKey(record);
    }

}

