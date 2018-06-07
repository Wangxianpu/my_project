package com.wxp.dto.contact;

import com.wxp.dto.BaseDto;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/7 18:23
 * @Description :
 */
public class ContactDto extends BaseDto {
    /**
     * 联系人id
     */
    private String id;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人电话号码
     */
    private String contactMobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }
}
