package com.jie.study.spring_ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev")
@ComponentScan(basePackages = {"com.jie.study.spring_ioc.car", "com.jie.study.spring_ioc.context"})
public class BeanTestConfig {
}
