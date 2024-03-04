package com.hafiz.patterns.decorator;

public class Runner {
    public static void main(String[] args) {

        //In this example we set up file datasource and decorate it with encryption and compression both
        String data = "My test data";

        DataSource fileDataSource = new FileDataSource();

        DataSourceDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        encryptionDecorator.readData();
        encryptionDecorator.writeData(data);

        DataSourceDecorator compressionDecorator = new CompressionDecorator(fileDataSource);
        compressionDecorator.readData();
        compressionDecorator.writeData(data);





    }
}
