
package tugas6_no1c;

/**
 *
 * @author rolis
 */
public class Huruf {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char abc = 'Z'; 
        do { // Menggunakan looping do-while
            System.out.print(abc + " ");
            abc--;
        } while (abc >= 'A');
    }
}
