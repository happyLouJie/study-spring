package com.jie.study.spring_ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.jie.study.spring_ioc.car", "com.jie.study.spring_ioc.context"})
public class BeanTestConfig {
}
