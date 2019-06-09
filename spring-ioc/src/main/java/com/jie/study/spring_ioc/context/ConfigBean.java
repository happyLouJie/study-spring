package com.jie.study.spring_ioc.context;

import com.jie.study.spring_ioc.car.CarService;
import com.jie.study.spring_ioc.car.impl.CarServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public CarService car() {
        return new CarServiceImpl();
    }
}
