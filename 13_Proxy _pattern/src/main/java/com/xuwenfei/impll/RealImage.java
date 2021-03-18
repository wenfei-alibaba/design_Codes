package com.xuwenfei.impll;

import com.xuwenfei.Image;

/**
 * created by xuwenfei 2021-03-18
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading:" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying:"+fileName);
    }
}