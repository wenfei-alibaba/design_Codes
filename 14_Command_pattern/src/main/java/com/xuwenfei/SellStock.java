package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-18
 */
public class SellStock implements Order {
    private Stock absStock;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.sell();
    }
}