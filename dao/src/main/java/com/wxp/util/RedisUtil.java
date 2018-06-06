package com.wxp.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ZSetOperations;

/**
 * @Author : shampoowang
 * @Date:Created : 2018/6/6 17:38
 * @Description :
 */
public class RedisUtil {

    private RedisTemplate<String, String> redisTemplate;

    /**
     * 用于spring注入.
     * @param redisTemplate
     */
    public void setRedisTemplate(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 获取模板redis对象.
     * @return
     */
    public RedisTemplate<String, String> getRedisTemplate() {
        return redisTemplate;
    }


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
     *
     */
}
