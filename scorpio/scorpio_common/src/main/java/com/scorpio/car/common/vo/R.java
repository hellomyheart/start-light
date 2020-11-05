package com.scorpio.car.common.vo;

import lombok.Data;
/**
 * projectName: start-light
 *
 * @author: xr
 * time: 2020/11/5 19:12
 * description:
 */
@Data
public class R<T> {
    private int code;//返回码
    private String msg;//返回码的字符串信息
    private T data;//返回的数据

    public static <T> R setR(int c,String m,T obj){
        R r=new R();
        r.setCode(c);
        r.setData(obj);
        r.setMsg(m);
        return r;
    }
    //成功
    public static R ok(){
        return setR(1,"OK",null);
    }
    //成功
    public static <T> R ok(T t){
        return setR(1,"OK",t);
    }
    //失败
    public static R fail(){
        return setR(2,"Fail",null);
    }
    public static R fail(String msg){
        return setR(2,msg,null);
    }
}
