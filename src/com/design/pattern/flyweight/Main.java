package com.design.pattern.flyweight;

/**
 * Created by xqy on 2017/6/29.
 */
public class Main {

    public static void main(String[] args) {
        Shape shape = FlyweightFactory.getInstance().getShape("red");
        shape.draw();
        Shape shape2 = FlyweightFactory.getInstance().getShape("blue");
        shape2.draw();
        Shape shape3 = FlyweightFactory.getInstance().getShape("green");
        shape3.draw();
        Shape shape4 = FlyweightFactory.getInstance().getShape("red");
        shape4.draw();
        System.out.println(FlyweightFactory.getInstance().getShapSize());
    }
}
