package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HomeController
 * Package: com.atguigu.controller
 * Description:
 *
 * @Author: fenghao
 * @Create 2023/12/24 11:52
 * @Version 1.0
 */
@RestController
@RequestMapping("home")
public class HomeController {

//    @Value("${zwf.name}")
    private String name;


    @GetMapping("boot")
    public String hello(){
//        System.out.println(name);
        return "hello springboot3!!";
    }
}
