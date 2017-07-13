package org.huke.demo.springboot.sample.controller;

import org.huke.demo.springboot.api.UserService;
import org.huke.demo.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author huke
 * @create 6/7/2017
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("{userId}")
    public User getUser(@PathVariable("userId") long userId) {
        System.out.println(userId);
        System.out.println("huke");
        return this.userService.getUser(userId);
    }

    @RequestMapping("session")
    public String testSession(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            session = request.getSession(true);
            System.out.println("session not exists ");
        }

        System.out.println("session, s_id : " + session.getId());
        System.out.println(session.getMaxInactiveInterval());
        System.out.println("session create time : " + new Date(session.getCreationTime()).toString());

        return "sb";
    }

}
