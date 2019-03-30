package com.itheone.springboot.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caohaifengx@163.com 2019-03-14 16:10
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue firstQueue() {
        // 创建一个队列，名称为：enjoy
        return new Queue("enjoy");
    }

    @Bean
    public Queue secondQueue() {
        // 创建一个队列，名称为：enjoy
        return new Queue("enjoy_2");
    }
}