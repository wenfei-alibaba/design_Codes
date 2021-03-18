package com.xuwenfei;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xuwenfei 2021-03-18
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}