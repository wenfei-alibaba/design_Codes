package com.xuwenfei.facproducer;

import com.xuwenfei.absfactory.AbstractFactory;
import com.xuwenfei.factory.ColorFactory;
import com.xuwenfei.factory.ShapeFactory;

/**
 * @author:徐文飞
 * @description FactoryProducer工厂生成器
 * @create 2021-03-15 10:31
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

}