package com.xuwenfei.pack.impl;

import com.xuwenfei.pack.Packing;

/**
 * @author:徐文飞
 * @description 实现打包接口
 * @create 2021-03-15 11:37
 * @Copyright (C), 2006-2021, XX有限公司
 */
//Wrapper包装盒
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}