package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.atguigu.mapper
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/24 16:51
 * @Version 1.0
 */
public interface UserMapper {
    List<User> queryAll();

    int delete(int i);
}
