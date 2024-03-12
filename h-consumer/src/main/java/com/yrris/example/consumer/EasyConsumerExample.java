package com.yrris.example.consumer;

import com.yrris.example.common.model.User;
import com.yrris.example.common.service.UserService;
import com.yrris.hrpc.proxy.ServiceProxyFactory;

/**
 * 简单服务消费者实例
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User peter = new User();
        peter.setName("peter");
        User user = userService.getUser(peter);
        if(user!=null){
            System.out.println(user.getName());
        }else{
            System.out.println("user is null");
        }
    }
}
