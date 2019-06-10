package com.jie.study.spring_test;

import org.springframework.context.annotation.*;

/**
 * @ClassName: ConfigBeans
 * @author: HackerLou
 * @date: 2019/6/9
 * @Description:
 */
@Configuration
@ComponentScan
@PropertySource("application.yml")
@EnableAspectJAutoProxy
public class ConfigBeans {

}
