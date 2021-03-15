package com.xuwenfei;

import com.xuwenfei.absfactory.AbstractFactory;
import com.xuwenfei.facproducer.FactoryProducer;
import com.xuwenfei.shape.Shape;

/**
 * @author:徐文飞
 * @description 抽象工厂实现类
 * @create 2021-03-15 10:35
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //    1.获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        //    2.利用形状工厂获取Circle对象 并调用draw()方法
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();
        shapeFactory.getShape("RENTANGLE").draw();
        //    3.获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        //    4.利用颜色工厂生产Color对象 并调用fill()方法
        colorFactory.getColor("RED").fill();
        colorFactory.getColor("GREEN").fill();
        colorFactory.getColor("BLUE").fill();
    }

}