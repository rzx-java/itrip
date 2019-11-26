package com.itrip.common;

import com.itrip.beans.dto.Dto;

/**
 * Dto工具类
 */
public class DtoUtil {

    private static final String FLAG_SUCCESS="success";
    private static final String FLAG_FAIL="fail";
    public static Dto returnSuccess(){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        return dto;
    }
    public static Dto returnSuccess(String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnSuccess(Object data){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setData(data);
        return dto;
    }
    public static Dto returnSuccess(Object data,String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_SUCCESS);
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setMsg(msg);
        dto.setData(data);
        return dto;
    }
    public static Dto returnFile(){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_FAIL);
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        return dto;
    }
    public static Dto returnFile(String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_FAIL);
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnFile(Object data){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_FAIL);
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setData(data);
        return dto;
    }
    public static Dto returnFile(Object data,String msg){
        Dto dto=new Dto();
        dto.setSuccess(FLAG_FAIL);
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setData(data);
        dto.setMsg(msg);
        return dto;
    }
}
