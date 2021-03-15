package com.xuwenfei.hanbao;

import com.xuwenfei.items.impl.Burger;

/**
 * @author:徐文飞
 * @description 鸡肉汉堡
 * @create 2021-03-15 13:12
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}