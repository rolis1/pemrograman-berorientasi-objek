/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas7_no1;
import java.util.Scanner;
/**
 *
 * @author rolis
 */
public class Toserba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] kodeBarang = {"a001", "a002", "a003"};
        String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
        int[] hargaBarang = {3000, 4000, 5000};

        Scanner input = new Scanner(System.in);

        // Input jumlah item barang
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        System.out.println("**************************");

        // Array untuk menyimpan kode dan jumlah barang
        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int totalBayar = 0;

        // input data barang yang dibeli
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodeBeli[i] = input.next();
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();
        }

        // Output
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("=============================================================");

        // Tampilkan data barang yang dibeli dan hitung total bayar
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    int jumlahBayar = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar;

                    // Cetak baris tabel
                    System.out.printf("%-4d %-12s %-12s %-6d %-11d %-12d\n", 
                        (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar);
                }
            }
        }
        System.out.println("=============================================================");
        System.out.println("Total Bayar\t\t\t\t\t" + totalBayar);
    }
}