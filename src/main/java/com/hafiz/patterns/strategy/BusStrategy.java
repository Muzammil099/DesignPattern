package com.hafiz.patterns.strategy;

import java.util.List;

public class BusStrategy implements Strategy {
    @Override
    public List<String> buildPath(String source, String destination) {
        System.out.println("BusStrategy execute");
        //add your implementation here
        return null;
    }
}
