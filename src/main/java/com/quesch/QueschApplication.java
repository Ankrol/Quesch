package com.quesch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.quesch.mapper")
@EnableSwagger2
public class QueschApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueschApplication.class, args);
    }

}
