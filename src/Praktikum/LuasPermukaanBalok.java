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
public class LuasPermukaanBalok {
    public static void main(String[]args){
    Scanner inputkan = new Scanner(System.in);
    int r;
    System.out.print("Masukkan Jaring Jaring : ");
    r = inputkan.nextInt();
    System.out.print("Luas Permukaan Bola = "+((4*r*r*22/7)));
    }
}
