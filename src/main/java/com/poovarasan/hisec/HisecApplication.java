package com.poovarasan.hisec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;


@EnableScheduling
@EnableCaching
@EnableWebSocket
@IntegrationComponentScan
@EnableAspectJAutoProxy
@SpringBootApplication
@EnableAutoConfiguration
public class HisecApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisecApplication.class, args);
    }
}
