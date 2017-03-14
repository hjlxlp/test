package com.hjl.bean;

/**
 * 实例工厂类
 */
public class HelloFactoryTwo {

    public Hello newInstance(String message){
        return new HelloImpl(message);
    }

}
