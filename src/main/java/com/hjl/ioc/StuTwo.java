package com.hjl.ioc;

/**
 * Created by admin on 2016/12/21.
 */
public class StuTwo implements Student {

    private String name;
    private String sex;
    private int age;

    public void printInfo() {
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
