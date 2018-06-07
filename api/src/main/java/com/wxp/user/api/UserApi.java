package com.wxp.user.api;

import com.wxp.dto.user.UserDto;
import com.wxp.service.BaseService;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:14
 * @Description :
 */
public interface UserApi extends BaseService<UserDto> {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    UserDto getUser(int id);
}
