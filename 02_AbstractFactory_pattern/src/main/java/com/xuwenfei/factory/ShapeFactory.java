package com.xuwenfei.factory;

import com.xuwenfei.absfactory.AbstractFactory;
import com.xuwenfei.color.Color;
import com.xuwenfei.shape.Shape;
import com.xuwenfei.shape.impl.Circle;
import com.xuwenfei.shape.impl.Rentangle;
import com.xuwenfei.shape.impl.Square;

/**
 * @author:徐文飞
 * @description ShapeFactory实现类
 * @create 2021-03-15 10:24
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("RENTANGLE")) {
            return new Rentangle();
        }
        return null;
    }
}