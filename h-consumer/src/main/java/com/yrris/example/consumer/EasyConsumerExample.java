package com.yrris.example.consumer;

import com.yrris.example.common.model.User;
import com.yrris.example.common.service.UserService;

/**
 * 简单服务消费者实例
 */
public class EasyConsumerExample {
    public static void main(String[] args) {
        // todo 需要获取userService的实现类对象
        UserService userService = null;
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
