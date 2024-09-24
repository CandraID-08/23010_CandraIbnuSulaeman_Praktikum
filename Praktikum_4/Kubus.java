/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_4;

public class Kubus extends BangunRuang {
    private double sisi;

    // Constructor untuk inisialisasi sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Override method untuk menghitung volume kubus
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    // Override method untuk menghitung luas permukaan kubus
    @Override
    public double hitungLuasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
