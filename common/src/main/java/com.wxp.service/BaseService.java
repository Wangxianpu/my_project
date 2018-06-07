package com.wxp.service;

import java.util.List;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/7 16:12
 * @Description : 公共服务接口
 */
public interface BaseService<T> {
    /**
     * 新增
     * @param t
     */
    void add(T t);

    /**
     * 删除
     * @param id
     */
    void deleteById(String id);

    /**
     * 更新
     * @param t
     */
    void update(T t);

    /**
     * 查询单个
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * 查询多个
     * @param t
     * @return
     */
    List<T> selectList(T t);
}
