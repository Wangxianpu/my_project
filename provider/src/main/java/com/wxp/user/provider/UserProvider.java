package com.wxp.user.provider;

import com.wxp.user.api.UserApi;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public void add(UserDto userDto) {
        userService.add(userDto);
    }

    public void deleteById(String id) {
        userService.deleteById(id);
    }

    public void update(UserDto userDto) {
        userService.update(userDto);
    }

    public UserDto selectOne(UserDto userDto) {
        return userService.selectOne(userDto);
    }

    public List<UserDto> selectList(UserDto userDto) {
        return userService.selectList(userDto);
    }
}
