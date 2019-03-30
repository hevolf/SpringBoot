package com.itheone.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caohaifengx@163.com 2019-03-12 18:25
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("/hi")
    public String sayHello() {
        return "index";
    }
}
