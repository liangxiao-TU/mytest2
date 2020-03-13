package com.uzz.bootDemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiangXiao
 * @date 2019/12/17-23:02
 */
@RestController
public class hello {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot";
    }
}
