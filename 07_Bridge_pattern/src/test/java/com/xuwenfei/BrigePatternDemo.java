package com.xuwenfei;

import com.xuwenfei.impl.GreenCircle;
import com.xuwenfei.impl.RedCircle;

/**
 * @author:徐文飞
 * @description
 * @create 2021-03-17 12:23
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class BrigePatternDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(100, 100, 10, new RedCircle());
        Circle greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }

}