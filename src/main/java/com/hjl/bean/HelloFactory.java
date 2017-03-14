package com.hjl.bean;

/**
 * 静态工厂类
 */
public class HelloFactory {

    public static Hello newInstance(String message){
        return new HelloImpl(message);
    }

}
