package com.yuwen.spring.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yuwen.spring.demo.entity.User;

/**
 * 用户的增删改查相关接口单元测试
 */
@SpringBootTest
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void testGetOneUser() {
        Long id = 90955L;
        User oneUser = userController.getOneUser(id);
        System.out.println(oneUser);
    }
}
