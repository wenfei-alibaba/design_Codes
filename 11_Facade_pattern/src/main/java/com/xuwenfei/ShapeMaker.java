package com.xuwenfei;

import com.xuwenfei.impl.Circle;
import com.xuwenfei.impl.Rectangle;
import com.xuwenfei.impl.Square;

/**
 * created by xuwenfei 2021-03-17
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}