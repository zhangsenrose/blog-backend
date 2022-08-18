package com.cloud.top.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangsw
 * @date ：2022/8/18
 */
@RestController
public class BlogController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }
}
