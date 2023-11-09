/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Lingkaran extends BangunDatar {
    private final double PI = 3.14159265;
    private double radius;

    Scanner inp = new Scanner(System.in);

    void setInput() {
        System.out.print("Masukkan radius lingkaran " + nama + ": ");
        radius = inp.nextDouble();
    }

    double LuasLingkaran() {
        return PI * Math.pow(radius, 2);
    }

    double kelLingkaran() {
        return 2 * PI * radius;
    }

    void infoLingkaran() {
        System.out.println("Kordinat (10, 10)");
        
//        System.out.println("=====================================================");
//        System.out.println("|                    Informasi Lingkaran             |");
//        System.out.println("=====================================================");
//        System.out.println(String.format("| Nama: %-45s |", nama));
//        System.out.println(String.format("| Posisi X: %-42d |", posisiX));
//        System.out.println(String.format("| Posisi Y: %-42d |", posisiY));
//        System.out.println(String.format("| Radius: %-45.2f |", radius));
//        System.out.println(String.format("| Luas Lingkaran: %-36.2f |", LuasLingkaran()));
//        System.out.println(String.format("| Keliling Lingkaran: %-32.2f |", kelLingkaran()));
//        System.out.println("=====================================================");
        
        System.out.println("=========================================================================");
        System.out.println("|                          Informasi Kubus                              |");
        System.out.println("=========================================================================");
        System.out.println("| Nama     | Posisi X | Posisi Y | Radius | Luas  | Keliling |");
        System.out.println("=========================================================================");
        System.out.printf("| %-15s | %-8d | %-8d | %-7.2f | %-6.2f | %-6.2f |%n",
        nama, posisiX, posisiY, radius, LuasLingkaran(), kelLingkaran());
        System.out.println("=========================================================================");
    }
}
