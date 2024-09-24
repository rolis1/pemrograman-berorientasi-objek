
package tugas5_no2;

/**
 *
 * @author rolis
 */
import java.util.Scanner;
public class Diskon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total pembelian: Rp. ");
        double totalPembelian = input.nextDouble();

        double diskon;

        if (totalPembelian < 50000) {
            diskon = totalPembelian * 0.05;
        } else {
            diskon = totalPembelian * 0.20;
        }

        double jumlahBayar = totalPembelian - diskon;

        System.out.println("Total pembelian: Rp. " + totalPembelian);
        System.out.println("Besarnya potongan: Rp. " + diskon);
        System.out.println("Jumlah yang harus dibayarkan: Rp. " + jumlahBayar);
    }
}
