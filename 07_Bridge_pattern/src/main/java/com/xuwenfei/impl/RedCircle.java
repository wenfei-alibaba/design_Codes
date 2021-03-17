package com.xuwenfei.impl;

import com.xuwenfei.DrawAPI;

/**
 * @author:徐文飞
 * @description
 * @create 2021-03-17 12:16
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}