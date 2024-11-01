/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_8;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String [] kodeBarang = {"a001", "a002", "a003"};
        String [] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int [] hargaBarang = {3000, 4000, 5000};

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();

        String [] kodeBeli = new String[jumlahItem];
        int [] jumlahBeli = new int[jumlahItem];
        int [] jumlahBayar = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************");
        System.out.printf("%-3s %-10s %-15s %-10s %-10s %-10s%n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("================================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equalsIgnoreCase(kodeBarang[j])) {
                    System.out.printf("%-3d %-10s %-15s %-10d %-10d %-10d%n", (i + 1), kodeBeli[i], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                    totalBayar += jumlahBayar[i];
                }
            }
        }
        System.out.println("================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t\t" + totalBayar);
        input.close();
    }
}

