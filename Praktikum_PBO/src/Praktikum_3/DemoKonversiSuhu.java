/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_3;

/**
 *
 * @author User
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        System.out.println("30 Celcius ke Fahrenheit: " + konversi.celciusToFahrenheit(30));
        System.out.println("30 Celcius ke Reamur: " + konversi.celciusToReamur(30));
        System.out.println("86 Fahrenheit ke Reamur: " + konversi.fahrenheitToReamur(86));
    }
}

