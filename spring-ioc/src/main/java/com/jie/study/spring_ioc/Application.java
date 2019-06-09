package com.jie.study.spring_ioc;

import com.jie.study.spring_ioc.car.CarService;
import com.jie.study.spring_ioc.context.AnnotationConfigContext;
import org.springframework.context.ApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigContext.init();
        ApplicationContext applicationContext = AnnotationConfigContext.getApplicationContext();
        CarService carService = applicationContext.getBean("car", CarService.class);
        if (carService == null) {
            System.out.println("获取bean失败");
            return;
        }
        carService.drvice("BMW");
    }
}
