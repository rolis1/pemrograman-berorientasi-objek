
package tugas3_no1;

/**
 *
 * @author rolis
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        System.out.println("Hasil Penjumlahan: " + mtk.tambah(25, 5));
        System.out.println("Hasil Pengurangan: " + mtk.kurang(25, 5));
        System.out.println("Hasil Perkalian: " + mtk.kali(25, 5));
        System.out.println("Hasil Pembagian: " + mtk.bagi(25, 5));

        System.out.println("Hasil Modulus: " + mtk.modulus(19, 5));
    }
}

