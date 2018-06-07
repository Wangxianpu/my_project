package com.wxp.util;

import org.apache.commons.collections.map.HashedMap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/7 12:53
 * @Description :
 */
public class ObjectUtil {

    /**
     * 将对象obj转化为map存储的key-value形式
     * @param obj
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String,String> parseObj2Map(Object obj) throws IllegalAccessException {
        Map<String,String> map = new HashMap<String,String>();

        //获得所有的属性
        Field[] fields = obj.getClass().getDeclaredFields();

        for(int i = 0;i < fields.length;i++){
            String fieldName = fields[i].getName();//获得属性名
            fields[i].setAccessible(true);
            map.put(fieldName,String.valueOf(fields[i].get(obj)));
        }
        return map;
    }
}
