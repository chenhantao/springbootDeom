package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cht.CompactDisc;
import cht.Impl.SgtPeppers;

/**
 * TODO
 *
 * @author chenhantao
 * @since 2019/3/22
 */
@Configuration
//@ComponentScan(basePackages = "cht")
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
}
