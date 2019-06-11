package com.jie.study.spring_mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @ClassName: RootConfig
 * @author: HackerLou
 * @date: 2019/6/11
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"com.jie.study.spring_mvc"}
,excludeFilters = {
        @Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig {
}
