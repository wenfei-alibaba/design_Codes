package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-18
 */
public class BuyStock implements Order {
    private Stock absStock;

    public BuyStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}