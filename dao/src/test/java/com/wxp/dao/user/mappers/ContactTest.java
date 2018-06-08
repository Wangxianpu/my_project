package com.wxp.dao.user.mappers;

import com.wxp.dao.contact.mappers.ContactDtoMapper;
import com.wxp.dto.contact.ContactDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/8 11:41
 * @Description :
 */
public class ContactTest extends BaseTest {

    @Autowired
    private ContactDtoMapper contactDtoMapper;

    @Test
    public void test(){
        ContactDto contactDto = new ContactDto();
        contactDto.setId("2");
        contactDto.setContactName("cn2-1");
        contactDto.setContactMobile("1351212111");
        contactDtoMapper.updateByPrimaryKeySelective(contactDto);
    }

}
