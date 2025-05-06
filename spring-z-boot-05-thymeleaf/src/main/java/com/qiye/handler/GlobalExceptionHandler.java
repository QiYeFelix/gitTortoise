package com.qiye.handler;//ClassName:GlobalExceptionHandler

import com.qiye.result.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Author: 齐爷
//Datetime:2025/4/24 17:09
//Version:1.0.0
@RestControllerAdvice //全局异常处理类
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class) //捕获所有异常
    public R tran(Exception e){
       return R.fail(e.getMessage());
    }
}
