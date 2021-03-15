package com.xuwenfei;

import com.xuwenfei.builders.MealBuilder;
import com.xuwenfei.taocan.Meal;

/**
 * @author:徐文飞
 * @description 建造者类测试
 * @create 2021-03-15 13:27
 * @Copyright (C), 2006-2021, XX有限公司
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareChickenMeal();
        System.out.println("\n\nChicken Meal");
        chickenMeal.showItems();
        System.out.println("Toral Cost:"+chickenMeal.getCost());

    }

}