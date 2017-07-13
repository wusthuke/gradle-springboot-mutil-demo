package org.huke.demo.springboot.model;

/**
 * @author huke
 * @create 6/7/2017
 */
public class User {

    private long userId;

    private String username;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
