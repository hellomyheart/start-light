package com.example.aries.scheduling.provider.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.aries.scheduling.provider.api.domain.SchedulingPlay;
import com.example.aries.scheduling.provider.service.mapper.SchedulingPlayMapper;
import com.example.aries.scheduling.provider.api.service.SchedulingPlayService;

@Service
public class SchedulingPlayServiceImpl implements SchedulingPlayService {

    @Resource
    private SchedulingPlayMapper schedulingPlayMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        //删除排班计划，在这里写业务

        //这里是核心

        return schedulingPlayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SchedulingPlay record) {
        return schedulingPlayMapper.insert(record);
    }

    @Override
    public int insertSelective(SchedulingPlay record) {
        return schedulingPlayMapper.insertSelective(record);
    }

    @Override
    public SchedulingPlay selectByPrimaryKey(Long id) {
        return schedulingPlayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SchedulingPlay record) {
        return schedulingPlayMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SchedulingPlay record) {
        return schedulingPlayMapper.updateByPrimaryKey(record);
    }

}

