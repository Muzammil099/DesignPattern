package com.hafiz.patterns.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
