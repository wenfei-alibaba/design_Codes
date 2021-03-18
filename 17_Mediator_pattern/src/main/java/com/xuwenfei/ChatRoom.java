package com.xuwenfei;


import java.util.Date;

/**
 * created by xuwenfei 2021-03-18
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }

}