package com.hanshan.hanaicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanshan.hanaicodemother.mapper")
public class HanAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanAiCodeMotherApplication.class, args);
    }

}
