package com.nfsq.yqf.springcloud_server_consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/30
 * Time:13:14
 **/
@RestController
public class Controller {
    @RequestMapping("/user")
    public String getUser(String userName){
        return "调用服务成功，查询到用户名："+userName;
    }
}
