package com.xuwenfei.mediainterface.impl;

import com.xuwenfei.mediainterface.AdvancedMediaPlayer;

/**
 * @author:徐文飞
 * @description 高级媒体播放器 接口实现类
 * @create 2021-03-15 14:32
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}