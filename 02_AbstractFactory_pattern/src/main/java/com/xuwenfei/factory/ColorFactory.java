package com.xuwenfei.factory;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xuwenfei.absfactory.AbstractFactory;
import com.xuwenfei.color.Color;
import com.xuwenfei.color.impl.Blue;
import com.xuwenfei.color.impl.Green;
import com.xuwenfei.color.impl.Red;
import com.xuwenfei.shape.Shape;

/**
 * @author:徐文飞
 * @description ColorFactory实现类
 * @create 2021-03-15 10:28
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}