package com.cht.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库配置，druid
 *
 * @author chenhantao
 * @since 2019/6/6
 */
@Configuration
public class DruidDataSourceConfig {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    @Primary
    public DruidDataSource masterDateSource() {
        return null;
    }


}
