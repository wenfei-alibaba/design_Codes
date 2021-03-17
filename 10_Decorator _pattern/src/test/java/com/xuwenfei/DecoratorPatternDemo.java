package com.xuwenfei;

import com.xuwenfei.impl.Circle;
import com.xuwenfei.impl.Rectangle;
import com.xuwenfei.impl.RedShapeDecorator;
import com.xuwenfei.impl.ShapeDecorator;

/**
 * created by xuwenfei 2021-03-17
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}