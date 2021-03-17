package com.xuwenfei.impl;

import com.xuwenfei.Shape;

/**
 * created by xuwenfei 2021-03-17
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}