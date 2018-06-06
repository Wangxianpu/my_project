package com.wxp.user.service.impl;

import com.wxp.dao.user.mappers.UserDtoMapper;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:18
 * @Description :
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDtoMapper userDtoMapper;

    public UserDto getUser(int id) {
        return userDtoMapper.selectByPrimaryKey(id);
    }
}
