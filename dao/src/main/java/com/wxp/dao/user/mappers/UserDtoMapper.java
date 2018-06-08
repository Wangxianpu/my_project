package com.wxp.dao.user.mappers;

import com.wxp.dao.BaseMapper;
import com.wxp.dto.user.UserDto;

import java.util.List;

public interface UserDtoMapper extends BaseMapper<UserDto> {
    /**
     * 查询单个
     * @param t
     * @return
     */
    UserDto selectOne(UserDto t);
    /**
     * 依据某些条件
     * @param t
     * @return
     */
    List<UserDto> selectList(UserDto t);
}