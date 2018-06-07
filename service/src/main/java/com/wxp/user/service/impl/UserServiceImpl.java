package com.wxp.user.service.impl;

import com.wxp.dao.user.mappers.UserDtoMapper;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import com.wxp.common.RedisUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:18
 * @Description :
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDtoMapper userDtoMapper;

    @Autowired
    private RedisUtilService redisUtilService;

    public UserDto getUser(int id) {
        UserDto user =  userDtoMapper.selectByPrimaryKey(id);
        redisUtilService.set("t_user_"+id,user);
        Map<Object,Object> map = redisUtilService.getMap("t_user_"+id);
        for(Map.Entry<Object,Object> entry : map.entrySet()){
            System.out.println("属性:"+entry.getKey()+","+"值:"+entry.getValue());
        }
        return user;
    }
}
