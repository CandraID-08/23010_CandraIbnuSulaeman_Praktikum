/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_6;

/**
 *
 * @author User
 */
public class BilanganPrima{
    public static void main(String[] args) {
        System.out.print("bilangan prima 1-20:  ");
        for (int i = 0; i <= 20; i++) {
            if (BilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nbilangan non prima 1-20:  ");
        for (int i = 0; i <= 20; i++) {
            if (!BilanganPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean BilanganPrima(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

