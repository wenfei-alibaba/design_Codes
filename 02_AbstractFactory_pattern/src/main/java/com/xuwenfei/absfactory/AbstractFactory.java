package com.xuwenfei.absfactory;

import com.xuwenfei.color.Color;
import com.xuwenfei.shape.Shape;

/**
 * @author:徐文飞
 * @description 抽象类工厂
 * @create 2021-03-15 10:22
 * @Copyright (C), 2006-2021, XX有限公司
 */
public abstract class AbstractFactory {
    //颜色类抽象工厂
    public abstract Color getColor(String color);
    //形状类抽象工厂
    public abstract Shape getShape(String shape);
}