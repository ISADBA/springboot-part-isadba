package com.atguigu.controller;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: UserController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/24 17:03
 * @Version 1.0
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @Autowired
    private UserService userService;

    @GetMapping("query")
    public List<User> query(){
        List<User> users = userService.queryAll();
        return users;
    }

    // 测试spring-tx与删除
    @Transactional
    @DeleteMapping("delete/{id}")
    public Integer delete(@PathVariable  Integer id){
        int rows = userService.delete(id);
        // 测试tx
        int i = 1/0;
        return rows;
    }
}
