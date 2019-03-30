package com.itheone.springboot.controller;

import com.itheone.springboot.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author caohaifengx@163.com 2019-03-12 11:12
 */
@RestController
public class UserController {

    @Resource
    private IUserService iUserService;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/hello")
    public Object sayHello() {
        logger.debug("this is hello logger日志11111");
        return "hello";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = iUserService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = iUserService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }

    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        iUserService.batchAdd(username, passwd);
        return "成功";
    }

}
