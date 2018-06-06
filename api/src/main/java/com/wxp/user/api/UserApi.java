package com.wxp.user.api;

import com.wxp.dto.user.UserDto;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:14
 * @Description :
 */
public interface UserApi {
    UserDto getUser(int id);
}
