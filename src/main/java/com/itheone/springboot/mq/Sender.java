package com.itheone.springboot.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author caohaifengx@163.com 2019-03-14 16:12
 */
@Component
public class Sender {
    @Resource
    private AmqpTemplate rabbitTemplate;
    public void send() {
        rabbitTemplate.convertAndSend("enjoy", "this a messages !!!");
    }
}
