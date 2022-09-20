package com.bjpowernode.test;

import com.bjpowernode.controller.UsersController;
import com.bjpowernode.pojo.Users;
import org.junit.Test;

public class MyTest {
    @Test
    public void testInsert(){
        UsersController usersController=new UsersController();
        int num=usersController.insert(new Users(200,"hello",22));
        System.out.println(num);
    }
}
