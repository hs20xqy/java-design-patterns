package com.design.pattern.single;

/**
 * Created by xqy on 2017/6/26.
 * 用内部类来实现,较好的一种实现方式
 * 序列化和反序列化任会破坏单例,参考readResolve()
 */
public class StaticSingleton {
    private StaticSingleton() {
        System.out.println("StaticSingleton is create");
    }

    public static StaticSingleton getInstance() {
        return SingleHolder.instance;
    }

    public static void createString() {
        System.out.println("String is create");
    }

    private static class SingleHolder {
       private static StaticSingleton instance = new StaticSingleton();
    }
}
