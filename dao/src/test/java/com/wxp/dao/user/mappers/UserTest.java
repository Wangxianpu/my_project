package com.wxp.dao.user.mappers;

import com.wxp.dto.user.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 10521 on 2018/3/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext-dao.xml"})
public class UserTest {

    @Autowired
    private UserDtoMapper userDtoMapper;

    @Test
    public void testUser(){
//        UserDto userDto = new UserDto();
//        userDto.setUsername("1-1");
//        userDto.setNickname("1-2");
//        userDto.setPassword("1-3");
        UserDto userDto =  userDtoMapper.selectByPrimaryKey(1);
        System.out.println("最後輸出結果為："+userDto.getUsername());
    }
}
