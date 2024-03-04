package com.hafiz.patterns.decorator;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {

        System.out.println("Inside Encryption class: writeData");
        String encryptedData = encryptData(data);
        dataSource.writeData(encryptedData);
    }

    @Override
    public String readData() {

        System.out.println("Inside Encryption class: readData");
        String data = super.readData();
        String decryptedData = decryptData(data);
        return decryptedData;
    }

    private String encryptData(String data){
        //Add logic to encrypt data before returning
        return data;
    }

    private String decryptData(String data){
        //Add logic to decrypt data before returning
        return data;
    }
}
