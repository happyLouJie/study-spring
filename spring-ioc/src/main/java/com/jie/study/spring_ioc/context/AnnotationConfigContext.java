package com.jie.study.spring_ioc.context;

import com.jie.study.spring_ioc.BeanScanConfig;
import com.jie.study.spring_ioc.config.BeanTestConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationConfigContext {
    private static ApplicationContext applicationContext = null;
    public static void init() {
//        applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        applicationContext = new FileSystemXmlApplicationContext("spring-ioc/config.xml");
        applicationContext = new AnnotationConfigApplicationContext(BeanTestConfig.class);
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
