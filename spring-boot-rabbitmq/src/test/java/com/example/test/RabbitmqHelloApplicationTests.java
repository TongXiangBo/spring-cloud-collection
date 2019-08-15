package com.example.test;

import com.example.springbootrabbitmq.Sender;
import com.example.springbootrabbitmq.SpringBootRabbitmqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootRabbitmqApplication.class)
public class RabbitmqHelloApplicationTests {
    @Autowired
    private Sender sender;

    @Test
    public void contextLoads() {
        sender.send();
    }
}
