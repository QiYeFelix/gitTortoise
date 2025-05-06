package com.qiye.controller;//ClassName:HelloController

import com.github.pagehelper.PageInfo;
import com.qiye.pojo.TUser;
import com.qiye.result.CodeEnum;
import com.qiye.result.R;
import com.qiye.service.HelloService;
import com.qiye.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Author: 齐爷
//Datetime:2025/4/20 19:09
//Version:1.0.0
@Controller //控制器
public class HelloController {
    @Resource
    private HelloService helloService;
    @Resource
    private UserService userService;
    @RequestMapping("/web/hello")//请求映射
    public @ResponseBody R hello(Model model){//方法参数注入。Model用于封装数据，传递给视图
        //model是一个容器，底层是一个Map集合，以键值对的方式存放数据
        //调用service
        String hello = helloService.hello();//调用service
        model.addAttribute("info", hello);
        //跳转到页面
        return R.ok(); //前缀 + main + 后缀  /admin/main.jsp
    }

    @RequestMapping("/web/page")
    public @ResponseBody R page(@RequestParam(value = "current") Integer current){
        PageInfo<TUser> tUser = userService.getUserByPage(current);
        return R.ok(CodeEnum.OK2,tUser);
    }
    @RequestMapping("/web/tran")
    public @ResponseBody R tran(){
        int update = userService.updateUser();
        int a =  10/0;
//        update = -1;
        return update>0?R.ok(CodeEnum.OK2):R.fail(CodeEnum.FAIL2);
    }

    @RequestMapping("/web/user1")
    public String test(Model model){
        TUser userById = userService.getUserById(1);
        model.addAttribute("user", userById);
        return "main";
    }
}
