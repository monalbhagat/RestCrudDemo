package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Monal Bhagat on 08-03-2021.
 */

@SpringBootApplication
@ComponentScan
public class SpringBootConfig {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootConfig.class, args);        
    }
}
