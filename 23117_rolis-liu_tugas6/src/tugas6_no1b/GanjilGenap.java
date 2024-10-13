
package tugas6_no1b;

/**
 *
 * @author rolis
 */
public class GanjilGenap {
    public static void main(String[] args) {
        System.out.print("Bilangan Ganjil dan Genap dari Angka 0-20");
        System.out.print("\nBilangan Ganjil: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Bilangan Genap: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}


