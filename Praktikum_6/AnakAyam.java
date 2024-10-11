/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_6;

/**
 *
 * @author User
 */
public class AnakAyam{
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i > 0; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu habis semua");
            }
        }
    }
}

