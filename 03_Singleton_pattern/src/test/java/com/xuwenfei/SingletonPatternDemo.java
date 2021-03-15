package com.xuwenfei;

import com.xuwenfei.singleton.SingleObject;

/**
 * @author:徐文飞
 * @description 单例模式测试
 * @create 2021-03-15 10:55
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
    //    获取唯一可用的对象
        SingleObject instance = SingleObject.getInstance();
    //    显示对象
        instance.getMessage();
    }
}