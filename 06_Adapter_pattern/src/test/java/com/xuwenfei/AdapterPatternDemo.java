package com.xuwenfei;

import com.xuwenfei.mediainterface.impl.AudioPlayer;

/**
 * @author:徐文飞
 * @description 测试
 * @create 2021-03-15 14:53
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }

}