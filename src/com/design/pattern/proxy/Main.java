package com.design.pattern.proxy;

import com.design.pattern.proxy.dynamic.DynamicQueryDB;

import java.lang.reflect.Proxy;

/**
 * Created by xqy on 2017/6/26.
 */
public class Main {
    public static void main(String[] args) {
        IQuery queryDBProxy = new QueryDBProxy();
        queryDBProxy.insert();

        IQuery query = (IQuery) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {IQuery.class}, new DynamicQueryDB());
        query.insert();
    }
}
