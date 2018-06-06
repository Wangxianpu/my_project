package com.wxp.user.controller;

import com.wxp.dto.user.UserDto;
import com.wxp.user.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 15:42
 * @Description :
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserApi userApi;

    @RequestMapping("/getUser.do")
    public UserDto getUser(){
        UserDto user = userApi.getUser(1);
        System.out.println("username:"+user.getUsername()+"password:"+user.getPassword());
        return user;
    }

}
