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
public class Kubus extends SegiEmpat {
    double tinggi;

    void setDataKubus(String nama, double p, double l, double t) {
        this.nama = nama;
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    void setInput() {
        super.setInput();
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan tinggi " + nama + ": ");
        tinggi = inp.nextDouble();
    }

    double volumeKubus() {
        return panjang * lebar * tinggi;
    }

    void infoKubus() {
//        System.out.println("=====================================================");
//        System.out.println("|                    Informasi Kubus                 |");
//        System.out.println("=====================================================");
//        System.out.println(String.format("| Nama: %-45s |", nama));
//        System.out.println(String.format("| Posisi X: %-42d |", posisiX));
//        System.out.println(String.format("| Posisi Y: %-42d |", posisiY));
//        System.out.println(String.format("| Panjang: %-43.2f |", panjang));
//        System.out.println(String.format("| Lebar: %-45.2f |", lebar));
//        System.out.println(String.format("| Tinggi: %-44.2f |", tinggi));
//        System.out.println(String.format("| Volume Kubus: %-38.2f |", volumeKubus()));
//        System.out.println("=====================================================");
        System.out.println("Kordinat (10, 10)");
        System.out.println("=========================================================================");
        System.out.println("|                          Informasi Kubus                              |");
        System.out.println("=========================================================================");
        System.out.println("| Nama | Posisi X | Posisi Y | Panjang | Lebar  | Tinggi | Volume Kubus |");
        System.out.println("=========================================================================");
        System.out.printf("| %-15s | %-8d | %-8d | %-7.2f | %-6.2f | %-6.2f | %-12.2f |%n",
        nama, posisiX, posisiY, panjang, lebar, tinggi, volumeKubus());
        System.out.println("=========================================================================");
    }
}
