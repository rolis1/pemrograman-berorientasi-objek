/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5_no3;

/**
 *
 * @author rolis
 */
import java.util.Scanner;
public class IndeksMassaTubuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan(kg): ");
        double bb = input.nextDouble();
        
        System.out.print("Masukkan Tinggi Badan(m): ");
        double tb = input.nextDouble();
        
        double IMT = bb / (tb * tb);
        
        String kriteria;
        if(IMT >= 40) {
            kriteria = "Sangat Gemuk";
        } else if(IMT >= 30) {
            kriteria = "Gemuk";
        } else if(IMT >= 25) {
            kriteria = "Berat Badan Lebih";
        } else if(IMT >= 18.5) {
            kriteria = "Berat Badan Ideal";
        } else if(IMT < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else {
            kriteria = "Data tidak valid";
        }
        
        System.out.println("IMT-mu: " + IMT);
        System.out.println("Kriteria: " + kriteria);
    }
    
}
