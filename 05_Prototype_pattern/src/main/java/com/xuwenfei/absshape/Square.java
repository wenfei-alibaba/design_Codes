package com.xuwenfei.absshape;

import com.xuwenfei.absshape.Shape;

/**
 * @author:徐文飞
 * @description Square继承Shape
 * @create 2021-03-15 13:57
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}