/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1_no2;

/**
 *
 * @author rolis
 */
public class Nilai {
    String nama, NIM;
    double nilaiAbsen; 
    double nilaiTugas; 
    double nilaiUts; 
    double nilaiUas;
    double nilaiAkhir; 
    
//    method nilai()
    public Nilai(String nama, String NIM, double nilaiAbsen, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nama = nama;
        this.NIM = NIM;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        
    }
  
//  method cetakNilai()    
    void cetakNilai(){
//        Menghitung nilai akhir
        nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUts * 0.30) + (nilaiUas * 0.40);
        
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen: " + nilaiAbsen);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
