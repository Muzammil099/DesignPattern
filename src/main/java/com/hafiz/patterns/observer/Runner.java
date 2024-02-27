package com.hafiz.patterns.observer;

public class Runner {

    public static void main(String[] args){

        //Observer1
        Customer customer = new Customer();

        //Observer2
        Supplier supplier = new Supplier();

        //create store policy
        StorePolicy storePolicy = new StorePolicy();

        //add subscribers
        storePolicy.registerObserver(customer);
        storePolicy.registerObserver(supplier);

        //Update policy
        storePolicy.setPolicy("First policy");

    }
}
