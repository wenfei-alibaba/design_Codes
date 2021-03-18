package com.xuwenfei;

import com.xuwenfei.impll.ProxyImage;

/**
 * created by xuwenfei 2021-03-18
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        //    将图像在内存中加载
        image.display();
        System.out.println();
        //    图像不需要重内存中加载
        image.display();
    }

}