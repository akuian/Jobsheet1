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
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner inputkan = new Scanner (System.in);
        float celsius = 78;
        System.out.println("Suhu Celsius = "+celsius);
        System.out.print("Silahkan pilih Konversi Suhu 1 = F, 2 = R , 3 = K : ");
        int konversi = inputkan.nextInt();
        switch(konversi){
            case 1 : System.out.println("Farenheit = "+((1.8*celsius)+32));
            break;
            case 2 : System.out.println("Reamur = "+((0.8f * celsius)));
            break;
            case 3 : System.out.println("Kelvin = "+((celsius + 273.15)));
       }}
}
