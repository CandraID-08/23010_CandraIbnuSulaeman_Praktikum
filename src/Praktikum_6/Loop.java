/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_6;

/**
 *
 * @author User
 */
public class Loop {

    public void header() {
        for (int i = 0; i <= 4; i++) {
            if (i > 0) {
                System.out.print(i + "\t");
            } else {
                System.out.print("\t");
            }
        }
    }
    public void body() {
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= 4; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

}

