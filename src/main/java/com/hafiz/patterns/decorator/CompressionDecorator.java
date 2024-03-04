package com.hafiz.patterns.decorator;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {

        System.out.println("Inside Compression class: writeData");
        String encryptedData = compressData(data);
        dataSource.writeData(encryptedData);
    }

    @Override
    public String readData() {

        System.out.println("Inside Compression class: readData");
        String data = super.readData();
        String decryptedData = decompressData(data);
        return decryptedData;
    }

    private String compressData(String data){
        //Add logic to compress data before returning
        return data;
    }

    private String decompressData(String data){
        //Add logic to decompress data before returning
        return data;
    }
}
