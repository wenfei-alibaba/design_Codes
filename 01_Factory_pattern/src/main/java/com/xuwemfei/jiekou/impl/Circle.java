package com.xuwemfei.jiekou.impl;

import com.xuwemfei.jiekou.Shape;

/**
 * @author:徐文飞
 * @description Circle接口实现类
 * @create 2021-03-15 9:29
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}