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
public class PotonganPembelian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        System.out.print("Uang Pembeli: ");
        int uang = input.nextInt();
        

        int diskon=0;
        
        if(uang< 50000){
            diskon = uang/20;
        }else{
            diskon = uang/5;
        }
        
        
        
        System.out.println("Total Pembelian: "+uang);
        System.out.println("Besar potongan: "+diskon);
        System.out.println("Jumlah yang harus di bayar : "+(uang-diskon));
    }
}
