package com.wxp.common;

import com.wxp.util.ObjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ZSetOperations;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 17:38
 * @Description :
 */
public class RedisUtilService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * zSet有序集合，默认按照score升序排列，存储格式K(1)==V(n)，V(1)=S(1)(K=key,V=value,S=score)
     * @param key
     *          键
     * @param value
     *          值
     * @return
     */
    public  Boolean zSet(String key, String value, Integer score) {
        Boolean result;
        ZSetOperations<String, String> zSet = redisTemplate.opsForZSet();
        result = zSet.add(key, value, score);
        if (result) {
            System.out.println("zset存储成功");
        }else {
            System.out.println("zset存储失败");
        }
        return result;
    }

    /**
     * 无序集合，add的顺序不是存储顺序
     * @param key
     * @param values
     * @return
     */
    public Long set(String key, String... values) {
        Long result;
        SetOperations<String, String> set = redisTemplate.opsForSet();
        result = set.add(key, values);
        if (result != null) {
            System.out.println("set存储成功");
        }else {
            System.out.println("set存储失败");
        }
        return result;
    }

    /**
     * map
     */
    public void set(String key, Map<String,String> map){
        redisTemplate.opsForHash().putAll(key,map);
    }

    /**
     * 将对象存入map
     * @param key
     * @param obj
     */
    public void set(String key ,Object obj){
        //如果已经存在可该key值，则将其删除，然后在保存新的
        List<Object> list = redisTemplate.opsForHash().values(key);
        if( list ==null || list.size() == 0){
            redisTemplate.opsForHash().delete(key);
        }
        try {
            Map<String,String> map = ObjectUtil.parseObj2Map(obj);
            set(key,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据对应的key 来获取整个对象的map
     */
    public Map<Object, Object> getMap(String key){
         return redisTemplate.opsForHash().entries(key);
    }

    /**
     * 根据key 获取对应的value
     */
    public String getString(String key){
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 将value存入redis中,并设置超时时间
     * @param key
     * @param value
     * @param days 超时时间
     */
    public void set(String key , String value,Integer days){
        redisTemplate.opsForValue().set(key,value,7, TimeUnit.DAYS);
    }

    /**
     * 删除对应的 key
     * @param key
     */
    public void deleteKey(String key){
        redisTemplate.delete(key);
    }

    /**
     * 设置过期时间
     * 单位：日
     */
    public boolean setExpire(String key ,Integer days){
        return redisTemplate.expire(key,days,TimeUnit.DAYS);
    }


}
