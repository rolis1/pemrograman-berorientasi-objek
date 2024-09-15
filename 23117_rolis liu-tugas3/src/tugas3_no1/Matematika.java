
package tugas3_no1;

/**
 *
 * @author rolis
 */
public class Matematika {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public int bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagi tidak bisa 0");
        }
        return a / b;
    }
}

