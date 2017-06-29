package com.design.pattern.flyweight;

/**
 * Created by xqy on 2017/6/29.
 */
public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw a " + color + " Circle.");
    }
}
