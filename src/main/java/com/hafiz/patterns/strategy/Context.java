package com.hafiz.patterns.strategy;

import java.util.List;

public class Context {
    public Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public List<String> execute(String source, String destination){
        return strategy.buildPath(source, destination);
    }
}
