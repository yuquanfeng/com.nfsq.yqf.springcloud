package com.nfsq.yqf.springcloud_server9100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServer9100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer9100Application.class, args);
    }
}
