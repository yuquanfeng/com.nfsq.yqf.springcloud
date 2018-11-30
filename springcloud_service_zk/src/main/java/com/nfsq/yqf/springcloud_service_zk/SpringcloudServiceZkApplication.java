package com.nfsq.yqf.springcloud_service_zk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringcloudServiceZkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceZkApplication.class, args);
    }
    @Value("{server.port}")
    private String serverPort;
    @RequestMapping("/user")
    public String getUser(String userName){
        return "查询到用户："+userName+"端口号："+serverPort;
    }
}
