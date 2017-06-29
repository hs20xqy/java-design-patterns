package com.design.pattern.proxy;

/**
 * Created by xqy on 2017/6/26.
 * 代理类,可以进行延迟加载
 */
public class QueryDBProxy implements IQuery {

    private QueryDB queryDB = null;

    public void insert() {
        System.out.println("insert before");
        if (queryDB == null) {
            queryDB = new QueryDB();
        }
        queryDB.insert();
        System.out.println("insert after");

    }
}
