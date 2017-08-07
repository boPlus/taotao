package com.taotao.order.dao.impl;

import com.taotao.order.dao.JedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class JedisClientSingle implements JedisClient {

    @Autowired
    private JedisPool jedisPool;

    @Override
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String string = jedis.get(key);
        jedis.close();
        return string;
    }

    @Override
    public String set(String key, String value) {
        return null;
    }

    @Override
    public String hget(String hkey, String key) {
        return null;
    }

    @Override
    public long hset(String hkey, String key, String value) {
        return 0;
    }

    @Override
    public long incr(String key) {
        return 0;
    }

    @Override
    public long expire(String key, int second) {
        return 0;
    }

    @Override
    public long ttl(String key) {
        return 0;
    }

    @Override
    public long del(String key) {
        return 0;
    }

    @Override
    public long hdel(String hkey, String key) {
        return 0;
    }
}
