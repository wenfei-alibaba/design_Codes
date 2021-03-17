package com.xuwenfei;

import com.xuwenfei.DrawAPI;

/**
 * @author:徐文飞
 * @description
 * @create 2021-03-17 12:18
 * @Copyright (C), 2006-2021, XX有限公司
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}