package com.bjpowernode.service;

import com.bjpowernode.dao.UsersMapper;
import com.bjpowernode.dao.UsersMapperImpl;
import com.bjpowernode.pojo.Users;

/*
* 业务逻辑层的实现类
* */
public class UsersServiceImpl implements UsersService{
    //在所有业务逻辑层中都必定有数据访问层的对象
    private UsersMapper usersMapper=new UsersMapperImpl();
    @Override
    public int insert(Users users) {
        return usersMapper.insert(users);
    }
}
