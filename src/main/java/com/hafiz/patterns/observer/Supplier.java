package com.hafiz.patterns.observer;

public class Supplier implements Observer{
    @Override
    public void update(String policy) {
        System.out.println("Inside Supplier");
        //Add your logic after update receive
    }
}
