package com.bjpowernode.dao;

import com.bjpowernode.pojo.Users;

/*
* 数据访问层实现类
* */
public class UsersMapperImpl implements UsersMapper{
    @Override
    public int insert(Users u) {
        System.out.println(u.getUname()+"增加成功！");
        return 1;
    }
}
