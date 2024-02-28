package com.hafiz.patterns.strategy;

import java.util.List;

public interface Strategy {
    public List<String> buildPath(String source, String destination);
}
