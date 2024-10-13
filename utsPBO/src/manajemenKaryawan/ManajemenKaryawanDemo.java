/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manajemenKaryawan;

/**
 *
 * @author rolis
 */
public class ManajemenKaryawanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan karyawan1 = new Karyawan(111, "Rolis", "Tambun", "089635766626", 10000000);
        Karyawan karyawan2 = new Karyawan(112, "Sapiq", "Galuh Mas", "0888128128", 7000000);

        Manajer manajer1 = new Manajer(113, "Kamal", "Bekasi", "08123456789", 11000000 ,"Design", 500000);

        manajer1.tambahBawahan(karyawan1);
        manajer1.tambahBawahan(karyawan2);

        manajer1.mengelolaKaryawan();
        manajer1.bekerja();

        System.out.println("Jumlah hari kerja karyawan1: " + karyawan1.hitungHariKerja());
        System.out.println("Jumlah hari kerja manajer1: " + manajer1.hitungHariKerja());
        }
    }

