package com.jie.study.spring_test.annotation;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface AnnotationTest {
    String value() default  "";
}
