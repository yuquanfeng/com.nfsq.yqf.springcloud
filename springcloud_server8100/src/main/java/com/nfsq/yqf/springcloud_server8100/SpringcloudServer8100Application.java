package com.nfsq.yqf.springcloud_server8100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServer8100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServer8100Application.class, args);
    }
}
