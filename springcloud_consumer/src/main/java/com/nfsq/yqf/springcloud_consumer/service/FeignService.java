package com.nfsq.yqf.springcloud_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by qfyu
 * Date:2018/11/29
 * Time:13:55
 **/
@FeignClient("springcloud-provider")
public interface FeignService {
    @RequestMapping("/user")
    String testFeign(@RequestParam("userName") String userName);
}
