package com.xuwenfei;

import com.xuwemfei.factory.ShapeFactory;
import com.xuwemfei.jiekou.Shape;

/**
 * @author:徐文飞
 * @description 工厂模式测试
 * @create 2021-03-15 9:38
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //    获取circle对象 并调用draw()方法
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        //    获取RECTANGLE对象 并调用draw()方法
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        //    获取SQUARE对象 并调用draw()方法
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}