package com.design.pattern.single;

/**
 * Created by xqy on 2017/6/25.
 * 做了延时加载,用synchronized关键字,保证了唯一化
 * Q1:用synchronized性能不好
 */
public class LazySingleton {

    private LazySingleton() {
        System.out.println("LazySingleton is create");
    }

    private static LazySingleton instance = null;

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void createString() {
        System.out.println("String is create");
    }
}
