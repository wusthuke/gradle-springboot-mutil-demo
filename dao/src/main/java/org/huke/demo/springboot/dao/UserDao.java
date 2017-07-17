package org.huke.demo.springboot.dao;

import org.apache.ibatis.annotations.*;
import org.huke.demo.springboot.dao.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * @author huke
 * @create 17/7/2017
 */
@Mapper
@Component
public interface UserDao {

    @Insert("insert into tb_user(user_id, user_name, user_age) values (#{id}, #{name}, #{age})")
    void insert(UserEntity entity);

    @Select("select user_id id, user_name name, user_age age from tb_user where user_id = #{userId}")
    UserEntity selectByPrimaryKey(String userId);
}
