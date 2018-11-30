package com.nfsq.yqf.springcloud_server_consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudServerConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerConsulApplication.class, args);
    }
}
