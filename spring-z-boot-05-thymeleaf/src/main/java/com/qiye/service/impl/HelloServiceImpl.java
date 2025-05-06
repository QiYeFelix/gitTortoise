package com.qiye.service.impl;//ClassName:HelloServiceImpl

import com.qiye.service.HelloService;
import org.springframework.stereotype.Service;

//Author: 齐爷
//Datetime:2025/4/20 19:13
//Version:1.0.0
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        //调用mapper查询数据库

        return "hello,spring mvc";
    }
}
