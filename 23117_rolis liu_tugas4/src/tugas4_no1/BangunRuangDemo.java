
package tugas4_no1;

/**
 *
 * @author rolis
 */
public class BangunRuangDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang br1 = new BangunRuang(7);
        BangunRuang br2 = new BangunRuang(5, 3, 4);
        
        System.out.println("Menghitung volume dan luas kubus: ");
        System.out.println("Luas Kubus: " + br1.luasKubus());
        System.out.println("Volume Kubus: " + br1.volumeKubus());
        System.out.println("");
        System.out.println("Menghitung volume dan luas Balok: ");
        System.out.println("Luas Balok: " + br2.luasBalok());
        System.out.println("Volume Balok: " + br2.volumeBalok());
    }
    
}
