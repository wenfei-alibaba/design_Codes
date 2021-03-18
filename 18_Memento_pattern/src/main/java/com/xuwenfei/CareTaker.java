package com.xuwenfei;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xuwenfei 2021-03-18
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}