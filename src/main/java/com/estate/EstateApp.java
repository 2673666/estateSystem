package com.estate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhiyuan
 * @date 2022/11/26 -14:49
 */

@SpringBootApplication  // 启动类的注释
@MapperScan("com.estate.mapper")
public class EstateApp {
    public static void main(String[] args) {
        SpringApplication.run(EstateApp.class,args);
    }
}
