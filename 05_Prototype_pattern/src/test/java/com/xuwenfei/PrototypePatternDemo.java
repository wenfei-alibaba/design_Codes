package com.xuwenfei;

import com.xuwenfei.absshape.Shape;
import com.xuwenfei.cache.ShapeCache;

/**
 * @author:徐文飞
 * @description 原型模式测试
 * @create 2021-03-15 14:13
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape circleShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + circleShape.getType());

        Shape squareShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + squareShape.getType());

        Shape rectangleShape = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + rectangleShape.getType());
    }

}