/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan48_Kalkulator;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan kalkulator
 */
public class PBO_IF2_10116414_Kalkulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Perhitungan perhitungan = new Perhitungan();
        
        System.out.print("Masukkan Value 1 : ");
        double nilai1 = scan.nextDouble();
        
        System.out.print("Masukkan Value 2 : ");
        double nilai2 = scan.nextDouble();        
        
        perhitungan.setNameProject("Project Calculator");
        perhitungan.setNoteProject("The project shown you how to manage method in java");
             
        System.out.println("Result Add is = " + perhitungan.add(nilai1, nilai2));
        System.out.println("Result Minus is = " + perhitungan.minus(nilai1, nilai2));
        System.out.println("Result Multiple is = " + perhitungan.multiplication(nilai1, nilai2));
        System.out.println("Result Division is = " + perhitungan.division(nilai1, nilai2));
    }
}
