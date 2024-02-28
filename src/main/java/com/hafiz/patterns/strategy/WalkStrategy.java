package com.hafiz.patterns.strategy;

import java.util.List;

public class WalkStrategy implements Strategy {
    @Override
    public List<String> buildPath(String source, String destination) {

        System.out.println("WalkStrategy execute");
        //add your implementation here
        return null;
    }
}
