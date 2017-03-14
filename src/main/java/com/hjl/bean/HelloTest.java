package com.hjl.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class HelloTest {

    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Hello hello1 = beanFactory.getBean("one",HelloImpl.class);
        hello1.say();
        Hello hello2 = beanFactory.getBean("two",HelloImpl.class);
        hello2.say();
        Hello hello3 = beanFactory.getBean("three",HelloImpl.class);
        hello3.say();
        Hello hello4 = beanFactory.getBean("four",HelloImpl.class);
        hello4.say();
    }

}
