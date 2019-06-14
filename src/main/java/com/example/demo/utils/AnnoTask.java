package com.example.demo.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 注解执行的任务
 */
@Component
public class AnnoTask {

    /**
     * 使用注解,5秒执行一次
     */
    @Scheduled(cron = "0/5 * * * * ? ")
    public void task() {
        System.out.println("注解的方式的任务执行了" + new Date().toLocaleString());
    }
}