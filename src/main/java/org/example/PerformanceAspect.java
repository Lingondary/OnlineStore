package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {

    @Pointcut("execution(* org.example.PaymentService.*(..)) || execution(* org.example.ReservationService.*(..))")
    public void serviceMethods() {}

    @Before("serviceMethods()")
    public void beforeServiceMethodExecution() {
        System.out.println("Before service method execution...");
    }

    @After("serviceMethods()")
    public void afterServiceMethodExecution() {
        System.out.println("After service method execution...");
    }
}
