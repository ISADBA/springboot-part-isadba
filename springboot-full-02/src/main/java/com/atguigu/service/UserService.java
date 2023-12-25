package com.atguigu.service;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName: UserService
 * Package: com.atguigu.service
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/24 17:03
 * @Version 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll(){
        return userMapper.queryAll();
    }

    @Transactional
    public Integer delete(Integer id){
        Integer rows = userMapper.delete(id);
        System.out.println("rows = " + rows);
//        int i = 1/0;
        return rows;
    }
}
