package com.xuwenfei.mediainterface.impl;

import com.xuwenfei.mediainterface.MediaPlayer;

/**
 * @author:徐文飞
 * @description AudioPlayer 实现类
 * @create 2021-03-15 14:43
 * @Copyright (C), 2006-2021, alibaba有限公司
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audiaType, String fileName) {
        //播放MP3文件的内置支持
        if (audiaType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audiaType.equalsIgnoreCase("vlc")
                || audiaType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audiaType);
            mediaAdapter.play(audiaType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audiaType + " format not supported");
        }
    }
}