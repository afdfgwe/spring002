package com.bjpowernode.controller;

import com.bjpowernode.pojo.Users;
import com.bjpowernode.service.UsersService;
import com.bjpowernode.service.UsersServiceImpl;

//hello world
/*
* 界面层
* */
public class UsersController {
    //在所有界面层中都必定有业务逻辑层的对象
    private UsersService usersService=new UsersServiceImpl();
    public int insert(Users users){
        return usersService.insert(users);
    }
}
