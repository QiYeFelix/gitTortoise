package com.qiye.result;//ClassName:CodeEnum

import lombok.Getter;
import lombok.Setter;

//Author: 齐爷
//Datetime:2025/4/23 18:45
//Version:1.0.0

public enum CodeEnum {
    //使用无参构造方法创建CodeEnum枚举类对象
    OK,
    FAIL,
    LOGIN_PASSWORD_ERROR,
    //使用有参构造方法创建CodeEnum枚举类对象
    OK2(200,"成功"),
    FAIL2(500,"失败"),
    USER_PASSWORD_ERROR(601,"密码错误"),
    USER_ACCOUNT_LOCK(602,"账号锁定"),
    ;

    //CodeEnum枚举类的成员变量
    @Setter
    @Getter
    private int code;
    @Setter
    @Getter
    private String msg;

    //枚举的无参构造方法
    CodeEnum(){}
    //枚举的有参构造方法
    CodeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
