package com.quesch.common;

import lombok.Data;

@Data
public class Result {
    private static final String SUCCESS_CODE = "200";
    private static final String ERROR_CODE = "-1";

    private String code;
    private Object data;
    private String msg;

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        System.out.println(result.getCode());
        result.setData(data);
        System.out.println(result.getData());
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String code,String msg){
        Result result = new Result();
        result.setCode(ERROR_CODE);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
