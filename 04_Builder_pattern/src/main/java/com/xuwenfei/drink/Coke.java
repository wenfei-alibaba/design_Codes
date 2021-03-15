package com.xuwenfei.drink;

import com.xuwenfei.items.impl.ColdDrink;

/**
 * @author:徐文飞
 * @description 可乐
 * @create 2021-03-15 13:14
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}