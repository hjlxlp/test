package com.hjl.aop;

/**
 * 目标对象
 */
public class Target {

    private static final String name = "hjl";

    public String say(Integer age){
        System.out.println("I'm " + age + " years old");
        return "return value";
    }

    public static String getName() {
        return name;
    }

}
