package com.nfsq.yqf.springcloud_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:13:58
 **/
@RestController
public class RestTemplateController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/test/rest")
    public String testRest(String userName){
        String url = "http://springcloud-provider/user?userName="+userName;
        return restTemplate.getForObject(url,String.class);
    }

}
