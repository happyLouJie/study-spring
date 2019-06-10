package com.jie.study.spring_test.aspectj;

import com.jie.study.spring_test.annotation.AnnotationTest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AspectjTest
 * @author: HackerLou
 * @date: 2019/6/10
 * @Description:
 */

@Aspect
@Component
public class AspectjTest implements BeanNameAware {

    @Pointcut("execution(* com.jie.study.spring_test.beans..*.say(..))")
    public void sayPoint() {

    }

    @Pointcut("execution(* com.jie.study.spring_test.beans..*.walk(..))")
    public void walkPoint() {

    }


    @Before("sayPoint() && @annotation(annotationTest)")
    public void beforSay(AnnotationTest annotationTest) {
        System.out.println("befor aspect say:" + annotationTest.value());
    }


    @After("sayPoint() && args(say)")
    public void afterSay(String say) {
        System.out.println("after say:"+say);
    }

    @AfterReturning("sayPoint()")
    public void afterReturnSay() {
        System.out.println("after return say");
    }

    @AfterThrowing("sayPoint()")
    public void afterThrowSay() {
        System.out.println("after throw say");
    }

    @Around("walkPoint() || sayPoint()")
    public void aroundSay(ProceedingJoinPoint joinPoint) {
        try {
            Object[] args = joinPoint.getArgs();
            System.out.println("请求参数");
            for (Object arg : args) {
                System.out.println(arg);
            }
            String className = joinPoint.getTarget().getClass().getSimpleName();
            System.out.println("class name:"+className);
//            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    public void setBeanName(String s) {
        System.out.println("aspectj name:"+s);
    }
}
