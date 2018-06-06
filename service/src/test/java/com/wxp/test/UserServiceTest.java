package com.wxp.test;

import com.wxp.dto.user.UserDto;
import com.wxp.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void test(){
        UserDto user = userService.getUser(1);
        System.out.println("username:"+user.getUsername()+",password:"+user.getPassword());
    }
}
