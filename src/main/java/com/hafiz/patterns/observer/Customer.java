package com.hafiz.patterns.observer;

public class Customer implements Observer{
    @Override
    public void update(String policy) {
        System.out.println("Inside Customer");
        //Add your logic after update receive
    }
}
