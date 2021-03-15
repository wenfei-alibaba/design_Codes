package com.xuwenfei.pack.impl;

import com.xuwenfei.pack.Packing;

/**
 * @author:徐文飞
 * @description 塑料瓶
 * @create 2021-03-15 11:39
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}