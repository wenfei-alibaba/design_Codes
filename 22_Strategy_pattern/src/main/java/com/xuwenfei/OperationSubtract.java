package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-19
 */
public class OperationSubtract implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}