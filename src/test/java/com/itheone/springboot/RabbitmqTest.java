package com.itheone.springboot;

import com.itheone.springboot.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author caohaifengx@163.com 2019-03-14 16:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class RabbitmqTest {
    @Resource
    private Sender sender;
    @Test
    public void testRabbitmq() throws Exception {
        sender.send();
    }
}
