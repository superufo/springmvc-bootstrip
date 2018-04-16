package com.earlybird.shiro.cash;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Abstract class of RedisManager.
 */
public abstract class BaseRedisManager implements IRedisManager {

    /**
     * We are going to operate redis by acquiring Jedis object.
     * The subclass should realizes the way to get Jedis objects by implement the getJedis().
     * @return Jedis
     */
    protected abstract Jedis getJedis();

    /**
     * Expire time in seconds.
     */
    protected static final int DEFAULT_EXPIRE = -1;

    /**
     * Setting different expire times by using {@link org.crazycake.shiro.RedisCacheManager#setExpire(int)}
     * or {@link org.crazycake.shiro.RedisSessionDAO#setExpire(int)}
     * instead of setting a global expire time for all redis cache.
     */
    @Deprecated
    private int expire = DEFAULT_EXPIRE;

    /**
     * Default value of count.
     */
    protected static final int DEFAULT_COUNT = 100;

    /**
     * The number of elements returned at every iteration.
     */
    private int count = DEFAULT_COUNT;

    /**
     * JedisPoolConfig used to initialize JedisPool.
     */
    private JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();

    /**
     * get value from redis
     * @param key
     * @return value
     */
    @Override
    public byte[] get(byte[] key) {
        if (key == null) {
            return null;
        }
        byte[] value = null;
        Jedis jedis = getJedis();
        try {
            value = jedis.get(key);
        } finally {
            jedis.close();
        }
        return value;
    }

    /**
     * set
     * @param key
     * @param value
     * @param exipreTime
     * @return value
     */
    @Override
    public byte[] set(byte[] key, byte[] value, int exipreTime) {
        if (key == null) {
            return null;
        }
        Jedis jedis = getJedis();
        try {
            jedis.set(key, value);
            if (exipreTime >= 0) {
                jedis.expire(key, exipreTime);
            } else if (this.expire >= 0) {
                jedis.expire(key, this.expire);
            }
         } finally {
            jedis.close();
        }
        return value;
    }

    /**
     * set
     * @param key
     * @param value
     * @param exipreTime
     * @return value
     */
    @Override
    public String hset(String key, String field, String value,int exipreTime) {
        if (key == null) {
            return null;
        }
        Jedis jedis = getJedis();
        try {
            jedis.hset(key, field, value);
            if (exipreTime >= 0) {
                jedis.expire(key, exipreTime);
            } else if (this.expire >= 0) {
                jedis.expire(key, this.expire);
            }
         } finally {
            jedis.close();
        }
        return value;
    }
    
    @Override
    public String hget(String key, String field) {
        if (key == null) {
            return null;
        }
        String value = null;
        Jedis jedis = getJedis();
        try {
        	value = jedis.hget(key, field);
         } finally {
            jedis.close();
        }
        return value;
    }
    
    @Override
	public Map<String,String> hgetAll(String key){
    	 if (key == null) {
             return null;
         }
         Map<String, String> value = null;
         Jedis jedis = getJedis();
         
         try {
         	value = jedis.hgetAll (key);
          } finally {
             jedis.close();
         }
         return value;
    }
    
    
    @Override
	public Long sadd(String key,String... members){
    	 if (key == null) {
             return null;
         }
    	 
    	 Long value = null;
         Jedis jedis = getJedis();
         try {
         	value = jedis.sadd(key,members);
          } finally {
             jedis.close();
         }
         return value;
    }
    
    @Override
	public Set<String> smembers(String key){
    	 if (key == null) {
             return null;
         }
    	 
    	 Set<String> value = null;
         Jedis jedis = getJedis();
         try {
         	value = jedis.smembers(key);
          } finally {
             jedis.close();
         }
         return value;
    }
    
    
    /**
     * Delete a key-value pair.
     * @param key
     * @return 
     */
	@Override
    public long del(String key) {
        if (key == null) {
            return -1L;
        }
        
        long res = 0;
        Jedis jedis = getJedis();
        try {
        	res =   jedis.del(key);
        } finally {
            jedis.close();
        }
        return res;
    }
    
    
    /**
     * Delete a key-value pair.
     * @param key
     * @return 
     */
	@Override
    public long del(byte[] key) {
        if (key == null) {
            return -1;
        }
        
        long res = 0;
        Jedis jedis = getJedis();
        try {
        	res =   jedis.del(key);
        } finally {
            jedis.close();
        }
        return res;
    }

    /**
     * Return the size of redis db.
     */
    @Override
    public Long dbSize() {
        Long dbSize = 0L;
        Jedis jedis = getJedis();
        try {
            dbSize = jedis.dbSize();
        } finally {
            jedis.close();
        }
        return dbSize;
    }

    /**
     * Return all the keys of Redis db. Filtered by pattern.
     *
     * @param pattern
     * @return
     */
    public Set<byte[]> keys(byte[] pattern) {
        Set<byte[]> keys = null;
        Jedis jedis = getJedis();

        try {
            keys = new HashSet<byte[]>();
            ScanParams params = new ScanParams();
            params.count(count);
            params.match(pattern);
            byte[] cursor = ScanParams.SCAN_POINTER_START_BINARY;
            ScanResult<byte[]> scanResult;
            do {
                scanResult = jedis.scan(cursor, params);
                keys.addAll(scanResult.getResult());
                cursor = scanResult.getCursorAsBytes();
            } while (scanResult.getStringCursor().compareTo(ScanParams.SCAN_POINTER_START) > 0);
        } finally {
            jedis.close();
        }
        return keys;

    }

    @Deprecated
    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JedisPoolConfig getJedisPoolConfig() {
        return jedisPoolConfig;
    }

    public void setJedisPoolConfig(JedisPoolConfig jedisPoolConfig) {
        this.jedisPoolConfig = jedisPoolConfig;
    }
}
