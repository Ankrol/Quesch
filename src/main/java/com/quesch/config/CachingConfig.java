package com.quesch.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

@EnableCaching
@Configuration
public class CachingConfig {
    public RedisCacheManager redisCacheManager(RedisConnectionFactory connectionFactory){
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.lockingRedisCacheWriter(connectionFactory);
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig();
        redisCacheConfiguration = redisCacheConfiguration.entryTtl(Duration.ofSeconds(30));
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter,redisCacheConfiguration);
        return redisCacheManager;
    }
}
