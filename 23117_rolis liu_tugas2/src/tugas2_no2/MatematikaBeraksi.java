
package tugas2_no2;
/**
 *
 * @author rolis
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        InterfaceMatematika mtk = new Matematika();
        
        int hasilTambah = mtk.pertambahan(20, 10);
        int hasilKurang = mtk.pengurangan(10, 5);
        int hasilKali = mtk.perkalian(10, 3);
        int hasilBagi = mtk.pembagian(21, 2);
        
        System.out.println("Pertambahan : 20 + 10 = " + hasilTambah);
        System.out.println("Pengurangan : 10 - 5 = " + hasilKurang);
        System.out.println("Perkalian : 19 * 3 = " + hasilKali);
        System.out.println("Pembagian : 21 / 2 = " + hasilBagi);
    }
    
}
