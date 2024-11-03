package tugas9_no1;

public class HitungNilai {
    private static final double BOBOT_NILAI1 = 0.1;
    private static final double BOBOT_NILAI2 = 0.15;
    private static final double BOBOT_NILAI3 = 0.25;
    private static final double BOBOT_NILAI4 = 0.15;
    private static final double BOBOT_NILAI5 = 0.35;

    public double nilaiAkhir(int n1, int n2, int n3, int n4, int n5) {
        return (n1 * BOBOT_NILAI1) + (n2 * BOBOT_NILAI2) + (n3 * BOBOT_NILAI3) 
                + (n4 * BOBOT_NILAI4) + (n5 * BOBOT_NILAI5);
    }
}
