package org.huke.demo.springboot.sample.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author huke
 * @create 17/7/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerNoPortTest {

    @Autowired
    private UserController userController;

    @Test
    public void testAssert() {
        Assert.assertTrue(userController != null);
    }
}
