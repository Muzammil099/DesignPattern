package com.hafiz.patterns.decorator;

public class FileDataSource implements DataSource {
    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        //read data from file source
        return "";
    }
}
