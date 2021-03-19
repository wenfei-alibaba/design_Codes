package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-19
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in strat state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}