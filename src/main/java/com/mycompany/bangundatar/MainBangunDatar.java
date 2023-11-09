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
public class MainBangunDatar {
public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        SegiEmpat segiEmpat = new SegiEmpat();
        Kubus kubus = new Kubus();

        boolean selesai = false;

        while (!selesai) {
            System.out.println("Pilihan Jenis Bangun Datar:");
            System.out.println("1. Input Lingkaran");
            System.out.println("2. Input Segi Empat");
            System.out.println("3. Input Kubus");
            System.out.println("4. Info Lingkaran");
            System.out.println("5. Info Segi Empat");
            System.out.println("6. Info Kubus");
            System.out.println("7. Selesai");
            System.out.print("Pilihan Anda: ");
            int pilihan = inp.nextInt();
            inp.nextLine(); // Membersihkan newline dari pilihan

            switch (pilihan) {
                case 1:
                    lingkaran.nama = "Lingkaran";
                    lingkaran.setPosisi(5, 10);
                    lingkaran.setInput();
                    break;
                case 2 :
                segiEmpat.nama = "Segi Empat";
                    segiEmpat.setPosisi(3, 4);
                    segiEmpat.setInput();
                    break;
                case 3:
                    kubus.nama = "Kubus";
                    kubus.setPosisi(6, 8);
                    kubus.setInput();
                    break;
                case 4:
                    if (lingkaran.nama != null) {
                        lingkaran.infoLingkaran();
                    } else {
                        System.out.println("Data Lingkaran belum diinput.");
                    }
                    break;
                case 5:
                    if (segiEmpat.nama != null) {
                        segiEmpat.infoSegiEmpat();
                    } else {
                        System.out.println("Data Segi Empat belum diinput.");
                    }
                    break;
                case 6:
                    if (kubus.nama != null) {
                        kubus.infoKubus();
                    } else {
                        System.out.println("Data Kubus belum diinput.");
                    }
                    break;
                case 7:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Fungsi untuk mencetak informasi Lingkaran dalam bentuk tabel


    // Fungsi untuk mencetak informasi Segi Empat dalam bentuk tabel


    // Fungsi untuk mencetak informasi Kubus dalam bentuk tabel
}
