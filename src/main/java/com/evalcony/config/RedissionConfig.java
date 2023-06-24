package com.evalcony.config;

import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;
import org.redisson.api.RedissonClient;
import org.redisson.solon.RedissonSupplier;

@Configuration
public class RedissionConfig {

//    @Bean(value = "redisDs", typed = true)
    public RedissonClient demo1(@Inject("${redis.ds}") RedissonSupplier supplier) {
        return supplier.get();
    }

}
