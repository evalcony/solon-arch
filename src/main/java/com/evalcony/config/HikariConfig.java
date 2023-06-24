package com.evalcony.config;

import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

import javax.sql.DataSource;

@Configuration
public class HikariConfig {
    // 同时支持 name 和 类型 两种方式注入（注入时没有name，即为按类型注入）
    @Bean(value = "db", typed = true)
    public DataSource dataSource(@Inject("${database.db}") HikariDataSource ds){
        return ds;
    }

}
