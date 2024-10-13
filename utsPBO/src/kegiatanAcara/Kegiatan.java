/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatanAcara;

/**
 *
 * @author rolis
 */
public class Kegiatan {
    private String namaKegiatan;
    private String tanggalKegiatan;
    private String lokasi;
    
    //konstruktor
    public Kegiatan(String namaKegiatan, String tanggalKegiatan, String lokasi) {
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
        this.lokasi = lokasi;
    }
    
    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getTanggalKegiatan() {
        return tanggalKegiatan;
    }

    public void setTanggalKegiatan(String tanggalKegiatan) {
        this.tanggalKegiatan = tanggalKegiatan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    public void tampilkanDetailKegiatan() {
    String[] kegiatanList = {"Seminar", "Meet n Greet", "LKMM"};
    for (String kegiatan : kegiatanList) {
        System.out.println("Kegiatan: " + kegiatan);
    }
}

}
