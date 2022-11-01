package com.qingge.springboot.exception;

import com.qingge.springboot.config.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.rowset.serial.SerialException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SerialException.class)
    @ResponseBody
    public Result handle(ServiceException se){
        return Result.error(se.getCode(),se.getMessage());
    }
}
