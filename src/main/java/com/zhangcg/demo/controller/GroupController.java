package com.zhangcg.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zhangcg.demo.entity.User;

import java.util.*;
import java.util.stream.Collectors;


public class GroupController {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setGroup("1组");
        list.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setGroup("2组");
        list.add(user2);

        User user3 = new User();
        user3.setId(3);
        user3.setGroup("3组");
        list.add(user3);

        User user4 = new User();
        user4.setId(4);
        user4.setGroup("1组");
        list.add(user4);

        User user5 = new User();
        user5.setId(5);
        user5.setGroup("2组");
        list.add(user5);

        User user6 = new User();
        user6.setId(6);
        user6.setGroup("5组");
        list.add(user6);

        User user7 = new User();
        user7.setId(7);
        user7.setGroup("1组");
        list.add(user7);

        User user8 = new User();
        user8.setId(8);
        user8.setGroup("2组");
        list.add(user8);

        //按group属性分组
        Map<String, List<User>> userMap = list.stream().collect(Collectors.groupingBy(User::getGroup));

        //打印分组后的对象
        System.out.println("分组后：" + JSON.toJSONString(userMap, SerializerFeature.PrettyFormat));
    }
}
