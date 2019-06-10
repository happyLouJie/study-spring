package com.jie.study.spring_test;

import com.jie.study.spring_test.beans.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: TestBeans
 * @author: HackerLou
 * @date: 2019/6/9
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigBeans.class)
//@ActiveProfiles("dev")
public class TestBeans {

    @Autowired
    Person person;

    @Autowired
    Environment environment;

    @Test
    public void say () {

        person.say(4);

//        person.walk("jie");
    }

    @Test
    public void environment() {
//        System.out.println(environment.getActiveProfiles()[0]);
        System.out.println(environment.getProperty("spring.profiles.active"));
    }
}
