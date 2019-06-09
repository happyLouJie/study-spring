package com.jie.study.spring_ioc.car.impl;

import com.jie.study.spring_ioc.car.CarService;
import com.jie.study.spring_ioc.context.AnnotationConfigContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

public class CarServiceImpl implements CarService, BeanNameAware, BeanFactoryAware, ApplicationContextAware
        , BeanPostProcessor, InitializingBean, DisposableBean {
    String hello = "hi";
    public void drvice(String car) {
        System.out.println(hello + " started: " + car + "is driving.");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("2:beanFactory");
    }

    public void setBeanName(String s) {
        System.out.println("1:BeanName:" + s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("3:applicationContext:" + (AnnotationConfigContext.getApplicationContext() == applicationContext));
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("4:init:" + (bean == null));
//        CarService carService = (CarService) bean;
//        carService.set("hi boys");
        return null;
    }

    public void set(String hello) {
        this.hello = hello;
    }

    public void destroy() throws Exception {
        System.out.println("6：销毁");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("5:创建完成");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
        this.set("hi body");
    }
}
