
package tugas6_no1a;

/**
 *
 * @author rolis
 */
public class BilanganPrima {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Menentukan Bilangan prima dan bukan dari angka 0-20");
        System.out.print("\nBilangan Prima: ");
        for (int i = 2; i <= 20; i++) { // Bilangan Prima
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }

        // Bukan Prima
        System.out.println("\nBilangan Bukan Prima: ");
        for (int i = 0; i <= 20; i++) {
            boolean prima = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (!prima || i < 2) {
                System.out.print(i + " ");
            }
        }
    }
}