package com.itheone.springboot.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author caohaifengx@163.com 2019-03-14 16:13
 */
@Component
@RabbitListener(queues = "enjoy")
public class Receiver {
    @RabbitHandler  //指定对消息的处理
    public void process(String msg) {
        System.out.println("receive msg : " + msg);
    }
}