package com.qiye.service;//ClassName:UserService

import com.github.pagehelper.PageInfo;
import com.qiye.pojo.TUser;
import org.springframework.stereotype.Service;

//Author: 齐爷
//Datetime:2025/4/21 9:50
//Version:1.0.0
@Service
public interface UserService {
    TUser getUserById(Integer id);

    PageInfo<TUser> getUserByPage(Integer current);

    int updateUser();

}
