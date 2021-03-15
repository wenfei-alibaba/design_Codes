package com.xuwenfei.hanbao;

import com.xuwenfei.items.impl.Burger;

/**
 * @author:徐文飞
 * @description 素食汉堡
 * @create 2021-03-15 13:11
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}