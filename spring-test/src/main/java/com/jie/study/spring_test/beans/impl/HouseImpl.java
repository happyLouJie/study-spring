package com.jie.study.spring_test.beans.impl;

import com.jie.study.spring_test.beans.House;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName: HouseImpl
 * @author: HackerLou
 * @date: 2019/6/9
 * @Description:
 */

@Component("house")
public class HouseImpl implements House, BeanNameAware {

    public void live(String home) {
        System.out.println("we are live in the home:"+home);
    }

    public void setBeanName(String s) {
        System.out.println("house beanName:" + s);
    }
}
