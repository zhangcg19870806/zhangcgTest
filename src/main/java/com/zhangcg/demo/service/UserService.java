package com.zhangcg.demo.service;

import com.zhangcg.demo.entity.User;
import java.util.List;

/**
 * Created by zhangcg.
 */
public interface UserService {
    List<User> getUser(int age);
}
