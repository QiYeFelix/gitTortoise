package com.qiye.service.impl;//ClassName:UserServiceImpl

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qiye.constant.Constants;
import com.qiye.mapper.TUserDao;
import com.qiye.pojo.TUser;
import com.qiye.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Author: 齐爷
//Datetime:2025/4/21 9:51
//Version:1.0.0
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private TUserDao tUserDao;
    @Override
    public TUser getUserById(Integer id) {
        return tUserDao.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<TUser> getUserByPage(Integer current) {
        //1.设置PageHelper
        PageHelper.startPage(current, Constants.PAGE_SIZE);
        //2.查询
        List<TUser> list = tUserDao.selectUserPage();
        //3.封装分页数据到PageInfo
        PageInfo<TUser> info = new PageInfo<>(list);
        //4.返回结果
        return info;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateUser() {
        TUser tUser = new TUser();
        tUser.setId(1);
        tUser.setRealName("zhangsan");
        int count = tUserDao.updateByPrimaryKeySelective(tUser);
        //制造一个异常
        //int a = 10/0;
        return count;
    }


}
