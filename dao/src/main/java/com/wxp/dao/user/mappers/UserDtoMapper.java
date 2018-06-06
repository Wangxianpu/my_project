package com.wxp.dao.user.mappers;

import com.wxp.dto.user.UserDto;

public interface UserDtoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDto record);

    int insertSelective(UserDto record);

    UserDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDto record);

    int updateByPrimaryKey(UserDto record);
}