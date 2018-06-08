package com.wxp.user.service.impl;

import com.wxp.dao.user.mappers.UserDtoMapper;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import com.wxp.common.RedisUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
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
        UserDto user =  userDtoMapper.selectByPrimaryKey(String.valueOf(id));
        redisUtilService.set("t_user_"+id,user);
        Map<Object,Object> map = redisUtilService.getMap("t_user_"+id);
        for(Map.Entry<Object,Object> entry : map.entrySet()){
            System.out.println("属性:"+entry.getKey()+","+"值:"+entry.getValue());
        }
        return user;
    }

    public void add(UserDto userDto) {
        userDtoMapper.insertSelective(userDto);
    }

    public void deleteById(String id) {
        userDtoMapper.deleteByPrimaryKey(id);
    }

    public void update(UserDto userDto) {
        userDtoMapper.updateByPrimaryKeySelective(userDto);
    }

    public UserDto selectOne(UserDto userDto) {
        return userDtoMapper.selectOne(userDto);
    }

    public List<UserDto> selectList(UserDto userDto) {
        return userDtoMapper.selectList(userDto);
    }
}
