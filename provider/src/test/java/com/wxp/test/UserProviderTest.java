package com.wxp.test;

import com.wxp.user.api.UserApi;
import com.wxp.dto.user.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:55
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-provider.xml"})
public class UserProviderTest {

    @Autowired
    private UserApi userApi;

    @Test
    public void test(){
        UserDto userDto = userApi.getUser(1);
        System.out.println("username:"+userDto.getUsername()+",password:"+userDto.getPassword());
    }
}
