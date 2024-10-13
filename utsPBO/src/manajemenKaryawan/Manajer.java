package manajemenKaryawan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author rolis
 */
public class Manajer extends Karyawan implements Pengelola, Pekerja {
    private String departemen;
    private final List<Karyawan> daftarBawahan;
    private double bonus;
    
    //konstruktor
    public Manajer(int idKaryawan, String name, String address, String noTelp, double salary, String departemen, double bonus) {
        super(idKaryawan, name, address, noTelp, salary);
        this.departemen = departemen;
        this.bonus = bonus;
        this.daftarBawahan = new ArrayList<>();
    }
    
    public String getDepartemen() {
        return departemen;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public List<Karyawan> getDaftarBawahan() {
        return daftarBawahan;
    }
    
    @Override
    public void mengelolaKaryawan() {
        System.out.println("Manajer " + getName() + " sedang meeting dengan karyawan di departemen " + departemen);
    }

    @Override
    public void bekerja() {
        System.out.println("Manajer " + getName() + " sedang memantau kinerja tim.");
    }

    public void tambahBawahan(Karyawan karyawan) {
        daftarBawahan.add(karyawan);
        System.out.println(karyawan.getName() + " ditambahkan sebagai bawahan manajer " + getName());
    }

    @Override
    public int hitungHariKerja() {
        return super.hitungHariKerja();
    }
}
