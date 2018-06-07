package com.wxp.dao.user.mappers;

import com.wxp.dao.BaseMapper;
import com.wxp.dto.user.UserDto;

public interface UserDtoMapper extends BaseMapper<UserDto> {
    /**
     * 根据id删除元素
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 根据id查询元素
     * @param id
     * @return
     */
    UserDto selectByPrimaryKey(Integer id);
}