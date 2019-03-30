package com.itheone.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caohaifengx@163.com 2019-03-12 18:17
 */
@RestController
public class BaseController {

    @RequestMapping("/404.do")
    public Object error_404() {
        return "你要找的页面，被lison偷吃了！";
    }
}