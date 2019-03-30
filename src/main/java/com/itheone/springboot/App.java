package com.itheone.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author caohaifengx@163.com 2019-03-11 0:41
 */
@RestController //@Controller + @ResponseBody
//@EnableAutoConfiguration //auto config
@MapperScan("com.itheone.springboot.dao") //扫描mybatis Mapper

@SpringBootApplication  //包含@EnableAutoConfiguration
@EnableTransactionManagement  //开启事务管理
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
