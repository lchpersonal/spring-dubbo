package com.chengli.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: chengli
 * @Date: 2018/8/16 17:41
 */
@Service
public class UserService implements IUserService {

    private final List<User> list = new ArrayList() {{
        add(new User(1, "张三", 10));
        add(new User(2, "李四", 23));
        add(new User(3, "王五", 34));
        add(new User(4, "赵六", 43));
        add(new User(5, "田七", 36));
        add(new User(6, "黄八", 52));
    }};

    @PostConstruct
    public void init(){
        System.out.println("UserService inited~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public User selectUser(int id) {
        return list.stream().findAny().get();
    }
}
