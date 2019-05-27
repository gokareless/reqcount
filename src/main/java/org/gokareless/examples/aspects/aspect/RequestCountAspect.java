package org.gokareless.examples.aspects.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.gokareless.examples.aspects.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(ApplicationConfiguration.class)
@Aspect
@Configuration
public class RequestCountAspect {

    @Autowired
    Counter counter;

    @After("execution(* org.gokareless.examples.aspects.rest.*.*(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("!!!YEAH!!! I'm in RequestCountAspect");
        counter.increment();
    }

}
