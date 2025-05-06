package com.qiye.pojo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * t_user
 */
@Repository
public class TUser implements Serializable {
    private Integer id;

    private String realName;

    private Integer age;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}