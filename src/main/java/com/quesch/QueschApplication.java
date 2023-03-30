package com.quesch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.quesch.mapper")
public class QueschApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueschApplication.class, args);
    }

}
