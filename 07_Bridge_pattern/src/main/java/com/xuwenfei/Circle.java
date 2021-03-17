package com.xuwenfei;

/**
 * @author:徐文飞
 * @description
 * @create 2021-03-17 12:20
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}