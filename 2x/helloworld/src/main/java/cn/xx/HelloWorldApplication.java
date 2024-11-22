package cn.xx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * xx Copyright (C) 2015 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * @author xiangnzhang 2024/11/22 16:11
 */
@SpringBootApplication
public class HelloWorldApplication {
    // 网页快速初始化项目
    //  https://start.spring.io或者idea自带的新建项目的Spring Initializr
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
