package com.hjl.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016/12/21.
 */
public class Main {

    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:ioc.xml");
        //HelloWord
        HelloWord helloWord = (HelloWord)beanFactory.getBean("hello");
        System.out.println(helloWord.getInfo());
        System.out.println(helloWord);
        //stuOne 构造注入
        StuOne stuOne=(StuOne)beanFactory.getBean("stuOne");
        stuOne.printInfo();
        //stuOne 属性注入
        StuTwo stuTwo=(StuTwo)beanFactory.getBean("stuTwo");
        stuTwo.printInfo();
        //静态工厂注入
        StuThree stuThree=(StuThree)beanFactory.getBean("stuThree");
        stuThree.printInfo();
        //实例工厂注入
        StuThree stuThree2=(StuThree)beanFactory.getBean("stuThree2");
        stuThree2.printInfo();
        //list,set,map
        School school=(School)beanFactory.getBean("school");
        school.printSchool();

    }

}
