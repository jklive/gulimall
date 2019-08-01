package com.atguigu.gulimall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan(basePackages = "com.atguigu.gulimall.ums.dao")
@SpringBootApplication
public class GulimallUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallUmsApplication.class, args);
    }

}
