/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.decorators;
import com.mycompany.decorators.Decorators.*;
/**
 *
 * @author foxy
 */
public class Decorators {
    public static void main(String[] args   ) {
        String recordFile = "Nama : Budi Anwar\nGaji : 8000000\nNama : Yanto Pratama\nGaji : 5000000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("result/resultDecorators.txt")));
        encoded.writeData(recordFile);
        DataSource fileDirection = new FileDataSource("result/resultDecorators.txt");

        System.out.println("--------------Input Data--------------");
        System.out.println(recordFile);
        System.out.println("--------------Encoded Data--------------");
        System.out.println(fileDirection.readDataFile());
        System.out.println("--------------Decoded Data--------------");
        System.out.println(encoded.readDataFile());
    }
}
