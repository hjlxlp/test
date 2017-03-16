package com.hjl.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试
 */
public class Test {

    public static void main(String[] args){
        ApplicationContext cts = new ClassPathXmlApplicationContext("aop.xml");
        Target target = (Target) cts.getBean("target");
        target.say(22);

    }

}
