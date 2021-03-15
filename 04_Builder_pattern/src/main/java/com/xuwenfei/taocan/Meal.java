package com.xuwenfei.taocan;

import com.xuwenfei.items.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:徐文飞
 * @description 套餐类
 * @create 2021-03-15 13:17
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.println("item : "+item.name());
            System.out.println(",Packing : "+item.packing().pack());
            System.out.println("，Price : "+item.price());
        }
    }


}