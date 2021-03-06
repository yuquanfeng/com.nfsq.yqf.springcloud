package com.nfsq.yqf.springcloud_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:13:49
 **/
@RestController
public class UserController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/user")
    public String getUser(String userName){
        return "查询到"+userName+"的信息,端口号："+serverPort;
    }
}
