package com.xuwenfei.shape.impl;

import com.xuwenfei.shape.Shape;

/**
 * @author:徐文飞
 * @description Circle实现类
 * @create 2021-03-15 10:17
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Insdie Circle::draw() method.");
    }
}