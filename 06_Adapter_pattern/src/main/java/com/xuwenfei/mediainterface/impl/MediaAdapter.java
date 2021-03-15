package com.xuwenfei.mediainterface.impl;

import com.xuwenfei.mediainterface.AdvancedMediaPlayer;
import com.xuwenfei.mediainterface.MediaPlayer;

/**
 * @author:徐文飞
 * @description 媒体对象实现
 * @create 2021-03-15 14:36
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audiaType, String fileName) {
        if (audiaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audiaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}