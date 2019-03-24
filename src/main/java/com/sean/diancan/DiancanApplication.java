package com.sean.diancan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sean.diancan.dao")
public class DiancanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiancanApplication.class, args);
    }

}
