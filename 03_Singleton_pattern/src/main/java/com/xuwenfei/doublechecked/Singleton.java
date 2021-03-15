package com.xuwenfei.doublechecked;

import java.text.SimpleDateFormat;

/**
 * @author:徐文飞
 * @description 双重锁机制线程安全实现方式
 * @create 2021-03-15 11:14
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}