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
public class SegiEmpat extends BangunDatar {
    protected double panjang;
    protected double lebar;

        void setData(String nama, double p, double l) {
        this.nama = nama;
        panjang = p;
        lebar = l;
    }

    void setInput() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan panjang " + nama + ": ");
        panjang = inp.nextDouble();
        System.out.print("Masukkan lebar " + nama + ": ");
        lebar = inp.nextDouble();
    }

    public double LuasSegiEmpat() {
        return panjang * lebar;
    }

    public double kelilingSegiEmpat() {
        return 2 * (panjang + lebar);
    }

    public void infoSegiEmpat() {
        System.out.println("Kordinat (10, 10)");
        
        
        System.out.println("=========================================================================");
        System.out.println("|                          Informasi Kubus                              |");
        System.out.println("=========================================================================");
        System.out.println("| Nama | Posisi X | Posisi Y | Panjang | Lebar  | Luas | Keliling |");
        System.out.println("=========================================================================");
        System.out.printf("| %-15s | %-8d | %-8d | %-7.2f | %-6.2f | %-6.2f | %-12.2f |%n",
        nama, posisiX, posisiY, panjang, lebar, LuasSegiEmpat(), kelilingSegiEmpat());
        System.out.println("=========================================================================");
    }
}

