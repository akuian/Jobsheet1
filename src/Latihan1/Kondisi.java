/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class Kondisi {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai akhir PBO :");
        nilai = masukan.nextInt();
        if(nilai < 70)
        System.out.println("Siswa tidak lulus");
        else if(nilai > 70)
        System.out.println("Siswa lulus");
    }
}
