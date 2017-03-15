package com.hjl.spring;

/**
 * Created by admin on 2017/3/15.
 */
public class StuThree implements Student {

    private String name;
    private String sex;
    private int age;

    public StuThree(String name, String sex, int age) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + sex);
    }
}
