/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk balok
        System.out.println("Masukkan panjang, lebar, dan tinggi balok:");
        double panjang = scanner.nextDouble();
        double lebar = scanner.nextDouble();
        double tinggi = scanner.nextDouble();
        Balok balok = new Balok(panjang, lebar, tinggi);

        // Output hasil balok
        System.out.println("Volume balok: " + balok.hitungVolume());
        System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());

        // Input untuk kubus
        System.out.println("Masukkan panjang sisi kubus:");
        double sisi = scanner.nextDouble();
        Kubus kubus = new Kubus(sisi);

        // Output hasil kubus
        System.out.println("Volume kubus: " + kubus.hitungVolume());
        System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());

        scanner.close();
    }
}

