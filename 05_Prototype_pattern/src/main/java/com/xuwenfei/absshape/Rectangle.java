package com.xuwenfei.absshape;

import com.xuwenfei.absshape.Shape;

/**
 * @author:徐文飞
 * @description Shape继承类
 * @create 2021-03-15 13:54
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}