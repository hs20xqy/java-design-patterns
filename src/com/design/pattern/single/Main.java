package com.design.pattern.single;

import com.design.pattern.single.LazySingleton;
import com.design.pattern.single.Singleton;
import com.design.pattern.single.StaticSingleton;

/**
 * Created by xqy on 2017/6/25.
 */
public class Main {
    public static void main(String[] args) {
        Singleton.createString();

        LazySingleton.createString();

        StaticSingleton.createString();

        StaticSingleton.getInstance().createString();

    }
}
