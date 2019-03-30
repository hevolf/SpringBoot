package com.itheone.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author caohaifengx@163.com 2019-03-14 10:58
 */
@SpringBootTest(classes = {App.class})
@RunWith(SpringRunner.class)
public class SpringRedisTest {

//    @Resource
//    private RedisTemplate<String,String> redisTemplate;
//
//    @Test
//    public void testRedis() throws Exception {
//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//        ops.set("name", "enjoy");
//        String value = ops.get("name");
//        System.out.println(value);
//    }
}
