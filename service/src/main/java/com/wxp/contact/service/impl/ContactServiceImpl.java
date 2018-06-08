package com.wxp.contact.service.impl;

import com.wxp.contact.service.ContactService;
import com.wxp.dao.contact.mappers.ContactDtoMapper;
import com.wxp.dto.contact.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/8 14:21
 * @Description :
 */
@Component
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactDtoMapper contactDtoMapper;

    public void add(ContactDto contactDto) {
        contactDtoMapper.insertSelective(contactDto);
    }

    public void deleteById(String id) {
        contactDtoMapper.deleteByPrimaryKey(id);
    }

    public void update(ContactDto contactDto) {
        contactDtoMapper.updateByPrimaryKeySelective(contactDto);
    }

    public ContactDto selectOne(ContactDto contactDto) {
        return null;
    }

    public List<ContactDto> selectList(ContactDto contactDto) {
        return null;
    }
}
