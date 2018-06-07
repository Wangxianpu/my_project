package com.wxp.user.service;

import com.wxp.dto.user.UserDto;
import com.wxp.service.BaseService;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 14:18
 * @Description :
 */
public interface UserService extends BaseService<UserDto> {
    /**
     * 根据id查询user
     * @param id
     * @return
     */
    UserDto getUser(int id);
}
