package com.wxp.contact.controller;

import com.wxp.contact.api.ContactApi;
import com.wxp.dto.contact.ContactDto;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/8 14:33
 * @Description :
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactApi contactApi;

    @RequestMapping("/add.do")
    public void add(@RequestParam(value = "contactDto")ContactDto contactDto, HttpRequest request, HttpResponse response){
        contactApi.add(contactDto);
    }
}
