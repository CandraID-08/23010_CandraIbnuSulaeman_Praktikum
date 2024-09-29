/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_5;
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        double bmi = beratBadan / (tinggiBadan * tinggiBadan);
        
        String berat;
        
        if (bmi <= 18.4) {
            berat="Badan kamu Kurang";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            berat="Badan kamu Ideal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            berat="Badan kamu Lebih";
        } else if (bmi >= 30 && bmi <= 39.9) {
            berat="badan kamu Gemuk";
        } else{
            berat="Badan Kamu Sangat Gemuk";
        }

        System.out.printf("Nilai IMT anda adalah: %.1f\n", bmi);
        System.out.println("berat " +berat);

    }
}

