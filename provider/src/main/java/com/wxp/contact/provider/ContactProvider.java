package com.wxp.contact.provider;

import com.wxp.contact.api.ContactApi;
import com.wxp.contact.service.ContactService;
import com.wxp.dto.contact.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/8 14:25
 * @Description :
 */
@Component
public class ContactProvider implements ContactApi {

    @Autowired
    private ContactService contactService;

    public void add(ContactDto contactDto) {
        contactService.add(contactDto);
    }

    public void deleteById(String id) {
        contactService.deleteById(id);
    }

    public void update(ContactDto contactDto) {
        contactService.update(contactDto);
    }

    public ContactDto selectOne(ContactDto contactDto) {
        return contactService.selectOne(contactDto);
    }

    public List<ContactDto> selectList(ContactDto contactDto) {
        return contactService.selectList(contactDto);
    }
}
