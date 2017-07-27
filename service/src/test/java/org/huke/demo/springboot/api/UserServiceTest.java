package org.huke.demo.springboot.api;

import org.huke.demo.springboot.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author huke
 * @create 14/7/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = this.userService.getUser(12L);

        Assert.assertNotNull(user);
        Assert.assertEquals(12L, user.getUserId());
    }

    @Test
    public void testGetUser2() {
        User user = this.userService.getUser(12L);

        Assert.assertNotNull(user);
        Assert.assertEquals(12L, user.getUserId());
    }
}
