/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = masukan.next();
        System.out.print("Masukkan NIS : ");
        int NIS = masukan.nextInt();
        System.out.print("Masukkan Tempat Lahir : ");
        String tl = masukan.next();
        System.out.print("Masukkan Tanggal Lahir : ");
        String tgl = masukan.next();
        System.out.print("Masukkan Jenis Kelamin  :");
        String jk = masukan.next();
        System.out.print("Masukkan Alamat : ");
        String almt = masukan.next();
        System.out.print("Masukkan Motto : ");
        String mh = masukan.next();
        System.out.println("=======================");
        System.out.println("Nama          = "+nama);
        System.out.println("NIS           = "+NIS);
        System.out.println("Tempat Lahir  = "+tl);
        System.out.println("Jenis Kelamin = "+jk);
        System.out.println("Alamat        = "+almt);
        System.out.println("Motto Hidup   = "+mh);
        System.out.println("=======================");
        
    }
}
