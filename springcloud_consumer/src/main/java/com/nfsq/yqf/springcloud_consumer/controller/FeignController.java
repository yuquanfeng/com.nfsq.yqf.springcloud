package com.nfsq.yqf.springcloud_consumer.controller;

import com.nfsq.yqf.springcloud_consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:13:54
 **/
@RestController
public class FeignController {
    @Autowired
    FeignService feignService;
    @RequestMapping("/test/feign")
    public String testFeign(String userName){
        return feignService.testFeign(userName);
    }
}
