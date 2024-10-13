
package tugas6_no1d;
import java.util.Scanner;
/**
 *
 * @author rolis
 */
public class Lagu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah anak ayam: "); // Jumlah awal ayam turun
            int n = scanner.nextInt();
            
            System.out.println("Tekotek kotek kotek anak ayam turun berkotek");
            System.out.println("Tekotek kotek kotek anak ayam turun berkotek");
            
            // Lirik sampai turun ke 0
            for (int i = n; i > 0; i--) {
                if (i == 1) {
                    System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
                } else {
                    System.out.println("Anak ayam turun " + i + ", mati satu tinggallah " + (i - 1));
                }
            }
            
            // Lirik ketika perulangan sudah selessai
            System.out.println("Anak ayam turun 0, semuanya sudah mati.");
        }
    }
}

