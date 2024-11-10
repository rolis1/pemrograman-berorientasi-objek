package tugas10_no1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    private static Connection konek;

    public static Connection konek() throws SQLException, ClassNotFoundException {
        try {
            if (konek == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase",
                "root", "");
                System.out.println("Koneksi Berhasil");
            }
            return konek;
        }   catch (SQLException e) {
            System.out.println("Eror: Koneksi tidak berhasil" + e.getMessage());
            throw e;
            }
    }
}
