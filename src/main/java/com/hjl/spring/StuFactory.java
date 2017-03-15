package com.hjl.spring;

/**
 * Created by admin on 2017/3/15.
 */
public class StuFactory {

    public static Student newInstance(){
        return new StuThree("静态","男",20);
    }

    public Student newInstanceTwo(){
        return new StuThree("实例","女",20);
    }

}
