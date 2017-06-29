package com.design.pattern.proxy.dynamic;

import com.design.pattern.proxy.IQuery;
import com.design.pattern.proxy.QueryDB;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xqy on 2017/6/26.
 */
public class DynamicQueryDB implements InvocationHandler {

    private QueryDB queryDB = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (queryDB == null) {
            queryDB = new QueryDB();
        }
        System.out.println("method before");
        method.invoke(queryDB, args);
        System.out.println("method after");

        return null;
    }
}
