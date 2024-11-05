/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_10;
import Praktikum_10.Mahasiswa;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    
    public InputDataMahasiswa() {  
         listmahasiswa = new ArrayList();  
                }      
    public void insertData(String NIM, String Nama, String Alamat, String Matakuliah, double Nilai1, double Nilai2, double Nilai3, 
                           double Nilai4, double Nilai5) {  
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, Matakuliah, Nilai1, Nilai2, Nilai3, 
                            Nilai4, Nilai5);  
          listmahasiswa.add(mhs);  
} 
    public ArrayList<Mahasiswa> getALL() {  
        return listmahasiswa;  
} 
    public void deleteData(int index) { 
        listmahasiswa.remove(index); 
}   
}
