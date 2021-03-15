package com.xuwenfei.drink;

import com.xuwenfei.items.impl.ColdDrink;

/**
 * @author:徐文飞
 * @description 百事可乐
 * @create 2021-03-15 13:15
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Pesi extends ColdDrink {

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}