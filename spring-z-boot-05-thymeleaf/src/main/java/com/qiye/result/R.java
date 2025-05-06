package com.qiye.result;//ClassName:R

//Author: 齐爷
//Datetime:2025/4/23 18:13
//Version:1.0.0

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Controller层的返回结果对象
 * Controller的返回结果统一使用这个类封装
 */
@Builder //使用lombok的Builder注解，可以很方便的构建R对象
@NoArgsConstructor//无参构造器
@AllArgsConstructor//全参构造器
@Data//使用lombok的Data注解，可以很方便的封装对象的属性
public class R {

    //返回的状态码，比如200表示成功，500表示失败
    private int code;
    //返回的状态信息，也就是返回的那个状态码是代表后端什么错误，比如：用户不存在，登录密码错误....
    private String msg;
    //返回的具体数据，数据可以是任何类型，比如登录成功，那么返回user对象
    private Object data;
    //封装成功和失败方法，方便调用
    public static R ok(){
        return R.builder().code(200).msg("成功").build();
    }

    public static R ok(Object data){
        return R.builder().code(200).data(data).msg("成功").build();
    }
    public static R fail(){
        return R.builder().code(500).msg("失败").build();
    }

    public static R ok(CodeEnum codeEnum){
        return R.builder().code(codeEnum.getCode()).msg(codeEnum.getMsg()).build();
    }
    public static R ok(CodeEnum codeEnum,Object data){
        return R.builder().code(codeEnum.getCode()).msg(codeEnum.getMsg()).data(data).build();
    }
    public static R fail(CodeEnum codeEnum){
        return R.builder().code(codeEnum.getCode()).msg(codeEnum.getMsg()).build();
    }
    public static R fail(String msg){
        return R.builder().code(500).msg(msg).build();
    }
}
