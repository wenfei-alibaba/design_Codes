package com.xuwenfei;

/**
 * created by xuwenfei 2021-03-19
 */
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer rob = CustomerFactory.getCustomer("Rob");
        AbstractCustomer bob = CustomerFactory.getCustomer("Bob");
        AbstractCustomer julie = CustomerFactory.getCustomer("Julie");
        AbstractCustomer laura = CustomerFactory.getCustomer("Laura");
        System.out.println("Customers");
        System.out.println(rob.getName());
        System.out.println(bob.getName());
        System.out.println(julie.getName());
        System.out.println(laura.getName());
    }
}