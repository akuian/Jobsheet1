/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class ContohBufferReader {
     public static void main(String[] args) throws IOException {
        String nama;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        //mengisi variabel nama dengan bufferreader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        //tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah "+nama);
        
        
    }
}
