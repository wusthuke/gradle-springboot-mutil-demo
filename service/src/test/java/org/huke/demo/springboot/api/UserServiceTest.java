package org.huke.demo.springboot.api;

import org.huke.demo.springboot.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author huke
 * @create 14/7/2017
 */
public class UserServiceTest extends TestSupport {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() {
        User user = this.userService.getUser(12L);

        Assert.assertNotNull(user);
        Assert.assertEquals(12L, user.getUserId());
    }

}
