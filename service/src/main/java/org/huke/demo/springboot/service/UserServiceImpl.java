package org.huke.demo.springboot.service;


import org.huke.demo.springboot.api.UserService;
import org.huke.demo.springboot.model.User;
import org.springframework.stereotype.Service;

/**
 * @author huke
 * @create 6/7/2017
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(String username) {
        User user = new User();
        user.setUsername(username);
        user.setUserId(10000);
        return user;
    }

    @Override
    public User getUser(long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUsername("huke_" + userId);

        return user;
    }
}
