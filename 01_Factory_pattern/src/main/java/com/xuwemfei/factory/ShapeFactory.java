package com.xuwemfei.factory;

import com.xuwemfei.jiekou.Shape;
import com.xuwemfei.jiekou.impl.Circle;
import com.xuwemfei.jiekou.impl.Rectangle;

/**
 * @author:徐文飞
 * @description 形状工厂
 * @create 2021-03-15 9:32
 * @Copyright (C), 2006-2021, 阿里巴巴有限公司
 */
public class ShapeFactory {
    //    使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Circle();
        }
        return null;
    }

}
