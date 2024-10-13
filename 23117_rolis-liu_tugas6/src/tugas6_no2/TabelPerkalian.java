
package tugas6_no2;
import java.util.Scanner;
/**
 *
 * @author rolis
 */
public class TabelPerkalian {
    public static void cetakTabelPerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");  // Format output tab
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan nilai n (1-10): ");
        int n = scanner.nextInt();
        
        // Memastikan nilai n dalam rentang 1-10
        if (n >= 1 && n <= 10) {
            cetakTabelPerkalian(n);  // Panggil fungsi untuk mencetak tabel perkalian
        } else {
            System.out.println("Nilai n harus antara 1 dan 10.");
        }
    }
}
