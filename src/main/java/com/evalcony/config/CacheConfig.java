package com.evalcony.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

import java.util.concurrent.TimeUnit;

@Configuration
public class CacheConfig {

    @Inject("${caffine.init_capacity}")
    Integer initcapacity;
    @Inject("${caffine.max_size}")
    Integer maxSize;
    @Inject("${caffine.duration}")
    Integer duration;

    @Bean
    public Cache<String, Object> caffineCache() {

        return Caffeine.newBuilder()
                .initialCapacity(initcapacity)
                // 超出时淘汰
                .maximumSize(maxSize)
                //设置写缓存后n秒钟过期
                .expireAfterWrite(duration, TimeUnit.SECONDS)
                //设置读写缓存后n秒钟过期,实际很少用到,类似于expireAfterWrite
                //.expireAfterAccess(17, TimeUnit.SECONDS)
                .build();
    }
}
