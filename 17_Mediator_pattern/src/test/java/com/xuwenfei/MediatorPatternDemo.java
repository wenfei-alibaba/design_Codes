package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-18
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john  = new User("John");
        robert.sendMessage("Hi John!");
        john.sendMessage("Hello robert!");
    }

}