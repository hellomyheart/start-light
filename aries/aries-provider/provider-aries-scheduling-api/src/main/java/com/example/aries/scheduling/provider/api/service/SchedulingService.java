package com.example.aries.scheduling.provider.api.service;

import com.example.aries.scheduling.provider.api.domain.Scheduling;

public interface SchedulingService {


    int deleteByPrimaryKey(Long id);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);

}

