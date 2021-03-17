package com.xuwenfei.impl;

import com.xuwenfei.DrawAPI;

/**
 * @author:徐文飞
 * @description
 * @create 2021-03-17 12:17
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}