package com.cht.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 数据库配置，druid
 *
 * @author chenhantao
 * @since 2019/6/6
 */
@Configuration
public class DruidConfig {
    @Bean
    public ServletRegistrationBean startViewServlet() {
        //todo
        return null;
    }
}
