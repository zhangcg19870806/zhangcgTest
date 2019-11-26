package com.zhangcg.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.zhangcg.demo.controller","com.zhangcg.demo.service","com.zhangcg.demo.dao"})
@MapperScan(basePackages = {"com.zhangcg.demo.dao"})
@EnableCaching
@EnableRabbit
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }













































}

