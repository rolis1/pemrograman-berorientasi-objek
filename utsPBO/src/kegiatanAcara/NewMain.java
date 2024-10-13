/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kegiatanAcara;

/**
 *
 * @author rolis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinator koordinator1 = new Koordinator("Seminar Lingkungan", "10 Oktober 2024", "Auditorium", "Surya");

        koordinator1.tampilkanDetailKegiatan();

        koordinator1.mengelolaKegiatan();
        koordinator1.melaksanakanKegiatan();
    }
    
    
}
