package com.xuwemfei.jiekou.impl;

import com.xuwemfei.jiekou.Shape;

/**
 * @author:徐文飞
 * @description Rectangle接口实现类
 * @create 2021-03-15 9:27
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}