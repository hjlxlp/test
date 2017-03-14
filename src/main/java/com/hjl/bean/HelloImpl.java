package com.hjl.bean;

/**
 * hello接口的实现
 */
public class HelloImpl implements Hello {

    private String message;

    public HelloImpl(){

    }

    public HelloImpl(String message){
        this.message=message;
    }

    public void say() {
        System.out.println(message);
    }

}
