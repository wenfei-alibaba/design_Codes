package com.xuwenfei.absshape;

import com.xuwenfei.absshape.Shape;

/**
 * @author:徐文飞
 * @description Circle继承shape
 * @create 2021-03-15 13:59
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}