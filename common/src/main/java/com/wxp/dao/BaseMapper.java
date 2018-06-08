package com.wxp.dao;

import java.util.List;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/7 16:50
 * @Description :
 */
public interface BaseMapper<T> {
    /**
     * 插入到数据库
     * @param t
     * @return
     */
    int insertSelective(T t);
    /**
     * 插入到数据库
     * @param t
     * @return
     */
    int insert(T t);
    /**
     * 跟新到数据库
     * @param t
     * @return
     */
    int updateByPrimaryKeySelective(T t);
    /**
     * 跟新到数据库
     * @param t
     * @return
     */
    int updateByPrimaryKey(T t);
    /**
     * 根据id删除元素
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 根据id查询元素
     * @param id
     * @return
     */
    T selectByPrimaryKey(String id);
}
