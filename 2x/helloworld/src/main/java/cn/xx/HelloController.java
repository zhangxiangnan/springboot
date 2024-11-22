package cn.xx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * xx Copyright (C) 2015 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * @author xiangnzhang 2024/11/22 16:10
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hi")
    public String hi() {
        return "hi, there";
    }
}
