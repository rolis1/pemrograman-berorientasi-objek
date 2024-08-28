package tugas1_no1;

public class Mahasiswa {

    String nama;

    void membaca() {
        System.out.println(nama + " sedang membaca buku di  perpustakaan.");
    }

    void nyontek() {
        System.out.println(nama + " menyontek saat ujian.");
    }

//    Dengan parameter
    void modifikasi(String nama) {
        System.out.println(nama + " tidak pernah merokok.");
    }

}
