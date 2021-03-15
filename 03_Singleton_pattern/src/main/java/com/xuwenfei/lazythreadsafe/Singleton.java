package com.xuwenfei.lazythreadsafe;

/**
 * @author:徐文飞
 * @description 懒汉式线程安全方式
 * @create 2021-03-15 11:07
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}