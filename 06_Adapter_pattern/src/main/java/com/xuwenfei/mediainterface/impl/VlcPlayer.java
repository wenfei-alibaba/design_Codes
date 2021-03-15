package com.xuwenfei.mediainterface.impl;

import com.xuwenfei.mediainterface.AdvancedMediaPlayer;

/**
 * @author:徐文飞
 * @description AdvancedMediaPlayer 接口的实体类
 * @create 2021-03-15 14:30
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}