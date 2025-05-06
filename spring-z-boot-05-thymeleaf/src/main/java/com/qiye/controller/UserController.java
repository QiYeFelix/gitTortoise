package com.qiye.controller;//ClassName:UserController

import com.qiye.result.CodeEnum;
import com.qiye.result.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Author: 齐爷
//Datetime:2025/4/24 17:43
//Version:1.0.0
@RestController  //使用RestController注解标记这是一个控制器类,且所有的方法都返回JSON或者字符串
public class UserController {
    @RequestMapping("/hello123")
    public String user(){
        return "hello123";
    }
    @RequestMapping("/hello1234")
    public R result(){
        return R.ok(CodeEnum.OK2);
    }
}
