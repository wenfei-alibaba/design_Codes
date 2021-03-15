package com.xuwenfei.cache;

import com.xuwenfei.absshape.Circle;
import com.xuwenfei.absshape.Rectangle;
import com.xuwenfei.absshape.Shape;
import com.xuwenfei.absshape.Square;

import java.util.Hashtable;

/**
 * @author:徐文飞
 * @description 形状缓存类
 * @create 2021-03-15 14:02
 * @Copyright (C), 2006-2021, XX有限公司
 */

//创建一个类，从数据库获取实体类，并把它们存储在一个 Hashtable 中。
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);


    }
}