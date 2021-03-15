package com.xuwenfei.singleton;

/**
 * @author:徐文飞
 * @description 单利模式
 * @create 2021-03-15 10:51
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class SingleObject {
    //    1.创建SingleObject对象
    private static SingleObject instance = new SingleObject();

    //        2.设置构造行数为私有 这样就不会被实例化
    private SingleObject() {
    }

    //    3.获取唯一可用对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void getMessage() {
        System.out.println("Hello World");
    }

}