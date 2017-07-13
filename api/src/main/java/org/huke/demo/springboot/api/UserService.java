package org.huke.demo.springboot.api;


import org.huke.demo.springboot.model.User;

/**
 * @author huke
 * @create 6/7/2017
 */
public interface UserService {

    User saveUser(String username);

    User getUser(long userId);
}
