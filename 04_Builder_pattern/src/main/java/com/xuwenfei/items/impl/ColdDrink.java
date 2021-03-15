package com.xuwenfei.items.impl;

import com.xuwenfei.items.Item;
import com.xuwenfei.pack.Packing;
import com.xuwenfei.pack.impl.Bottle;

/**
 * @author:徐文飞
 * @description 冷饮抽象类
 * @create 2021-03-15 13:06
 * @Copyright (C), 2006-2021, XX有限公司
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
    /*@Override
    public String name() {
        return null;
    }*/


}