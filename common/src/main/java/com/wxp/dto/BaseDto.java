package com.wxp.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/7 16:23
 * @Description :
 */
public class BaseDto implements Serializable{

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 创建人
     */
    private String createBy;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
