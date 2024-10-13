/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kegiatanAcara;

/**
 *
 * @author rolis
 */
public class Koordinator extends Kegiatan implements PengelolaKegiatan, PelaksanaKegiatan {
    private String namaKoordinator;

    //konstruktor
    public Koordinator(String namaKegiatan, String tanggalKegiatan, String lokasi, String namaKoordinator) {
        super(namaKegiatan, tanggalKegiatan, lokasi);
        this.namaKoordinator = namaKoordinator;
    }

    @Override
    public void mengelolaKegiatan() {
        System.out.println(namaKoordinator + " sedang mengelola kegiatan: " + getNamaKegiatan());
    }

    @Override
    public void melaksanakanKegiatan() {
        System.out.println(namaKoordinator + " sedang melaksanakan kegiatan: " + getNamaKegiatan());
    }
}

