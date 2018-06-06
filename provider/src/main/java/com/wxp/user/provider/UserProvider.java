package com.wxp.user.provider;

import com.wxp.user.api.UserApi;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:21
 * @Description :
 */
@Component
public class UserProvider implements UserApi {

    @Autowired
    private UserService userService;

    public UserDto getUser(int id) {
        return userService.getUser(id);
    }
}
