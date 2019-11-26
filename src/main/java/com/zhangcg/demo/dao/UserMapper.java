package com.zhangcg.demo.dao;

import com.zhangcg.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Created by zhangcg.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id,username,age,phone,email FROM users WHERE age=#{age}")
    List<User> getUser(int age);
}
