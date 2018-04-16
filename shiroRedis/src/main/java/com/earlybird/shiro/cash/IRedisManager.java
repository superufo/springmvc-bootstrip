package com.earlybird.shiro.cash;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * redisManager interface
 *
 **/

public interface IRedisManager {

    /**
     * get value from redis
     * @param key
     * @return
     */
    byte[] get(byte[] key);

    /**
     * set
     * @param key
     * @param value
     * @return
     */
    byte[] set(byte[] key, byte[] value, int expire);

    /**
     * del
     * @param key
     * @return 
     */
    long del(byte[] key);

    /**
     * size
     */
    Long dbSize();

    /**
     * keys
     * @param pattern
     * @return
     */
    Set<byte[]> keys(byte[] pattern);
    
    byte[] hset(byte[] key, byte[] value,  byte[] field, int exipreTime);
    
    byte[] hget(byte[] key,byte[] field);
    
    Map<byte[], byte[]> hgetAll(byte[] key);

	String hset(String key, String field, String value, int exipreTime);

	String hget(String key, String field);

	Map<String, String> hgetAll(String key);

	long del(String key);
    
    

}
