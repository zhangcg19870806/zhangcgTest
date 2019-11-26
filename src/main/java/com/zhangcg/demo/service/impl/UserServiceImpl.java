package com.zhangcg.demo.service.impl;

import com.zhangcg.demo.dao.UserMapper;
import com.zhangcg.demo.entity.User;
import com.zhangcg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangcg.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value = "testUser")
    @CacheEvict(value="common",allEntries=true)
    public List<User> getUser(int age){
        return userMapper.getUser(age);
    }
}
