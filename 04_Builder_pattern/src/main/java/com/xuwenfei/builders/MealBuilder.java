package com.xuwenfei.builders;

import com.xuwenfei.drink.Coke;
import com.xuwenfei.drink.Pesi;
import com.xuwenfei.hanbao.ChickenBurger;
import com.xuwenfei.hanbao.VegBurger;
import com.xuwenfei.taocan.Meal;

import java.lang.reflect.Method;

/**
 * @author:徐文飞
 * @description 套餐建造者
 * @create 2021-03-15 13:24
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pesi());
        return meal;
    }

}