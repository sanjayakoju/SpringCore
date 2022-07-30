package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectLogger {

    Logger logger;

    public AspectLogger(){}

    public AspectLogger(Logger logger) {
        this.logger = logger;
    }

    @Before("execution(* aop.EmailService.*())")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }

    @After("execution(* aop.EmailService.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After : "+joinPoint.getSignature().getDeclaringTypeName()+" : "+joinPoint.getSignature().getName());
    }

    @Pointcut("execution(* aop.EmailService.sendEmail(..))")
    public void emailSend(){

    }

}
