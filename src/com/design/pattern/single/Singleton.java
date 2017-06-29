package com.design.pattern.single;

/**
 * Created by xqy on 2017/6/25.
 * 没有做延时加载,static的成员变量会在jvm启动时加载
 * Q1:遇到比较耗时操作时,会影响启动时间
 * Q2:如果系统中没有用到它,也会被加载
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }


    private Singleton(){
        System.out.println("Singleton is create");
    }

    public static void createString() {
        System.out.println("String is create");
    }

}
