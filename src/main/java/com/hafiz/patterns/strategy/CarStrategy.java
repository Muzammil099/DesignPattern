package com.hafiz.patterns.strategy;

import java.util.List;

public class CarStrategy implements Strategy {
    @Override
    public List<String> buildPath(String source, String destination) {
        System.out.println("CarStrategy execute");
        //add your implementation here
        return null;
    }
}
