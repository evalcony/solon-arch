package com.evalcony.config;

import org.noear.redisx.RedisClient;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

@Configuration
public class RedisConfig {
    @Bean
    public RedisClient redisClient(@Inject("${redis.rd}") RedisClient client) {
        return client;
    }
}
