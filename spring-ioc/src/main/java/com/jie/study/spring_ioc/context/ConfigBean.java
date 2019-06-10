package com.jie.study.spring_ioc.context;

import com.jie.study.spring_ioc.car.CarService;
import com.jie.study.spring_ioc.car.impl.CarServiceImpl;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBean {
    @Bean
    @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
    public CarService car() {
        return new CarServiceImpl();
    }
}
