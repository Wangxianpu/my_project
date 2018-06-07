package com.wxp.test;

import com.wxp.common.RedisUtilService;
import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:44
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-service.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtilService redisUtilService;

    @Test
    public void testRedis(){
        UserDto user = userService.getUser(1);
        System.out.println("username:"+user.getUserName()+",password:"+user.getPassword());
        redisUtilService.set("1","1.1",1);
        System.out.println(redisUtilService.getString("1"));
    }

    @Test
    public void testService(){
        UserDto userDto = new UserDto();
        userDto.setUserName("2-1");
        userDto.setNickName("2-2");
        userDto.setPassword("2-3");
//        userService.add(userDto);
        userDto.setId(1);
        userService.update(userDto);
//        List<UserDto> userList = userService.selectList(userDto);
//        for(UserDto user : userList){
//            System.out.println("username:"+user.getUserName()+",password:"+user.getPassword());
//        }
    }
}
