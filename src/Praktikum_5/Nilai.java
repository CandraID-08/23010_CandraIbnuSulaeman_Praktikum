/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_5;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Nilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan NPM: ");
        String npm = input.nextLine();
        
         System.out.print("Masukan nama Mahasiswa: ");
        String nama = input.nextLine();
        
         System.out.print("Masukan nilai Kehadiran: ");
        int nilai_kehadiran = input.nextInt();
        
         System.out.print("Masukan nilai Tugas: ");
        int nilai_tugas = input.nextInt();
        
         System.out.print("Masukan nilai Uts: ");
        int nilai_uts = input.nextInt();
        
         System.out.print("Masukan nilai Uas: ");
        int nilai_uas = input.nextInt();
        
        
        double nilai_akhir = (0.10 * nilai_kehadiran) + (0.20 * nilai_tugas) +
                     (0.30 * nilai_uts) + (0.40 * nilai_uas);
        
        String nilai;
        
        if(nilai_akhir>=76){
            nilai="A, kamu special";
        }else if(nilai_akhir>=66 ){
            nilai="B, kamu baik";
        }else if(nilai_akhir>=56){
            nilai="C,  Cukup baik";
        }else if(nilai_akhir>=46){
            nilai="D, kamu Kurang";
        }else{
            nilai="E, kamu Kurang sekali";        
        }
        
        System.out.println("=====halo=====");
        System.out.println("NPM mahasiswa: "+npm);
        System.out.println("Nama mahasiswa:"+nama);
        System.out.println("Nilai Kehadiranmu: "+nilai_kehadiran);
        System.out.println("NIlai Tugasmua: "+nilai_tugas);
        System.out.println("Nilai UTS-mu: "+nilai_uts);
        System.out.println("Nilai UAS-mu: "+nilai_uas);
        System.out.printf("Nilai Akhir: %.2f\n", nilai_akhir); 
        System.out.println("Nilai kamu adalah " + nilai);

    }
}
