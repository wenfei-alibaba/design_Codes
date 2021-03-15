package com.xuwemfei.jiekou.impl;

import com.xuwemfei.jiekou.Shape;

/**
 * @author:徐文飞
 * @description Square接口实现类
 * @create 2021-03-15 9:28
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}