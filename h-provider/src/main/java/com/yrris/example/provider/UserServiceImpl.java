package com.yrris.example.provider;

import com.yrris.example.common.model.User;
import com.yrris.example.common.service.UserService;

/**
 * 用户服务实现类
 */
public class UserServiceImpl implements UserService {
    /**
     * @param user
     * @return
     */
    @Override
    public User getUser(User user) {
        System.out.println("用户名："+user.getName());
        return user;
    }
}
