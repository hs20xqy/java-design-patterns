package com.design.pattern.proxy;

/**
 * Created by xqy on 2017/6/26.
 */
public class QueryDB implements IQuery {

    public QueryDB() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        System.out.println("insert data...");
    }
}
