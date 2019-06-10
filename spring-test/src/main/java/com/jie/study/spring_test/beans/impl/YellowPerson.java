package com.jie.study.spring_test.beans.impl;

import com.jie.study.spring_test.annotation.AnnotationTest;
import com.jie.study.spring_test.beans.Person;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName: YellowPerson
 * @author: HackerLou
 * @date: 2019/6/9
 * @Description:
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Profile("dev")
public class YellowPerson implements Person, BeanNameAware {

    @AnnotationTest("jiege")
    public void say(String words) {
        System.out.println("please say chinese:" + words);
    }

    public void setBeanName(String s) {
        System.out.println("beanName is: " + s);
    }

    public void walk(String walk) {
        System.out.println("person walk:" + walk);
    }

    public void say(int count) {
        System.out.println("say count:" + count);
    }
}
