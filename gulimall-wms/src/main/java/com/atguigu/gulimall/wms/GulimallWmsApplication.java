package com.atguigu.gulimall.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan(basePackages = "com.atguigu.gulimall.wms.dao")
@SpringBootApplication
public class GulimallWmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallWmsApplication.class, args);
    }

}
