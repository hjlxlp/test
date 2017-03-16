package com.hjl.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面
 */
@Aspect
public class BeforeAdvice {

    //定义前置增强并定位切点,定义到test.aop包下的Target对象的public域以String为返回值类型，入参为Integer的speak方法。
    @Before("execution(public String com.hjl.aop.Target.say(Integer))")
    public void before(JoinPoint joinPoint) throws Throwable {//切点入参
        System.out.println("前置日志记录："
                + ((Target) joinPoint.getTarget()).getName() + "调用了"
                + joinPoint.getSignature().getName() + "方法,传入参数为："
                + joinPoint.getArgs()[0]);
    }

}
