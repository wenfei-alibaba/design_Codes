package com.xuwenfei.items;

import com.xuwenfei.pack.Packing;

/**
 * @author:徐文飞
 * @description 食物条目接口
 * @create 2021-03-15 11:35
 * @Copyright (C), 2006-2021, XX有限公司
 */
public interface Item {
    public Packing packing();

    public String name();

    public float price();
}