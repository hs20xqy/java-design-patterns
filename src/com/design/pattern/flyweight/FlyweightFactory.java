package com.design.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xqy on 2017/6/29.
 */
public class FlyweightFactory {

    private static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    private FlyweightFactory() {}

    public static FlyweightFactory getInstance() {
        return FlyweightHolder.instance;
    }

    public Shape getShape(String key) {
        Shape shape = shapeMap.get(key);
        if (shape == null) {
            shape = new Circle(key);
            shapeMap.put(key, shape);
        }
        return shape;
    }

    public int getShapSize() {
        return shapeMap.size();
    }

    private static class FlyweightHolder {
        private static FlyweightFactory instance = new FlyweightFactory();
    }
}
