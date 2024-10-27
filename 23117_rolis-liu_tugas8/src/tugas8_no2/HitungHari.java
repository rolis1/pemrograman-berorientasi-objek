
package tugas8_no2;

/**
 *
 * @author user
 */
public class HitungHari {
    public static int hitung(String bulan, int tahun) {
        int jumlahHari = 0;

        switch (bulan) {
            case "Januari", "Maret", "Mei", "Juli", "Agustus", "Oktober", "Desember" -> jumlahHari = 31;
            case "April", "Juni", "September", "November" -> jumlahHari = 30;
            case "Februari" -> {
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29;  // Tahun kabisat
                } else {
                    jumlahHari = 28;
                }
            }
        }
        return jumlahHari;
    }

}
