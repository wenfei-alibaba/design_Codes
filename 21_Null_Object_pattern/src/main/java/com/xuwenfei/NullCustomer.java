package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-19
 */
public class NullCustomer extends AbstractCustomer{

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}