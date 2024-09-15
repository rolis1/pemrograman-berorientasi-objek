
package tugas3_no1;

/**
 *
 * @author rolis
 */
public class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagi tidak bisa 0");
        }
        return a % b;
    }
}

