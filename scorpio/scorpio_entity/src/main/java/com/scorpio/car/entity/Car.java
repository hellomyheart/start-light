package com.scorpio.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * projectName: start-light
 *
 * @author: xr
 * time: 2020/11/5 19:17
 * description:
 */

@Data
@NoArgsConstructor
public class Car implements Serializable {
    private Integer id;
    private Integer uid;
    private Integer skuid;
    private Integer scount;
    private Integer jprice;
    private Date ctime;


}