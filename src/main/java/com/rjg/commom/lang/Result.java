package com.rjg.commom.lang;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {
    private  int code;
    private  String msg;
    private Object data;
    public static Result succ(Object data){

        return Result.succ(200,"操作成功",data);
    }
    public static Result succ(int code,String msg,Object data){
        Result s=new Result();
        s.setCode(code);
        s.setMsg(msg);
        s.setData(data);
        return s;
    }
    public static Result fail(String msg){

        return Result.fail(250,msg,null);
    }
    public static Result fail(int code,String msg,Object data){
        Result s=new Result();
        s.setCode(code);
        s.setMsg(msg);
        s.setData(data);
        return s;
    }



}
