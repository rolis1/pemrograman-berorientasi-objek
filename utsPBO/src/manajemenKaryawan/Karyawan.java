/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenKaryawan;

/**
 *
 * @author rolis
 */
public class Karyawan {
    private int idKaryawan;
    private String name;
    private String address;
    private String noTelp;
    private double salary;
    
    //konstruktor
    public Karyawan(int idKaryawan, String name, String address, String noTelp, double salary) {
        this.idKaryawan = idKaryawan;
        this.name = name;
        this.address = address;
        this.noTelp = noTelp;
        this.salary = salary;
    }
    //konsep enkapsulasi
    public int getKaryawan() {
        return idKaryawan;
    }
    
    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //metode hitungHariKerja().
    public int hitungHariKerja() {
        int hariKerja = 0;
        
        for(int i = 1; i <= 30; i++) {
            if (i % 7 != 0 && (i + 1) % 7 != 0) {
                hariKerja++;
            }
        }
        return hariKerja;
        }
    }

