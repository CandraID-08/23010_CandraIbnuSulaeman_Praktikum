/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_10;

/**
 *
 * @author User
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, Matakuliah;
    private double Nilai1, Nilai2, Nilai3, Nilai4, Nilai5;
    
    
public Mahasiswa(String NIM, String Nama, String Alamat, String Matakuliah,
        double Nilai1, double Nilai2, double Nilai3, double Nilai4, double Nilai5) { 
       
    this.NIM = NIM; 
    this.Nama = Nama; 
    this.Alamat = Alamat;
    this.Matakuliah = Matakuliah;
    this.Nilai1 = Nilai1;
    this.Nilai2 = Nilai2;
    this.Nilai3 = Nilai3;
    this.Nilai4 = Nilai4;
    this.Nilai5 = Nilai5;

}
        
public String getNIM(){
    return NIM;
}

public String getNama(){
    return Nama;
}

public String getAlamat(){
    return Alamat;
}
public String getMatakuliah(){
    return Matakuliah;
}
public double getNilaiAkhir() {
    return (Nilai1 * 0.1) + (Nilai2 * 0.15) + (Nilai3 * 0.25) + 
    (Nilai4 * 0.15) + (Nilai5 * 0.35);
    }

}
