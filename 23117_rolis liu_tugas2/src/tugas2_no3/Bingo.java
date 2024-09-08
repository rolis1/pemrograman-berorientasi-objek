
package tugas2_no3;
/**
 *
 * @author rolis
 */
public class Bingo {
    private String[] lirik;
    private String kata;


    public Bingo(String[] lirik, String kata) {
        this.lirik = lirik;
        this.kata = kata;
    }


    public void tampilLagu() {
        for (int i = 0; i < 5; i++) {
            for (String lirik : lirik) {
                System.out.println(lirik);
            }
            tampilkanRefrain(i);
            System.out.println();
        }
    }

    private void tampilkanRefrain(int loop) {
        StringBuilder clap = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            clap.append("(clap)-");
        }
        clap.append(kata.substring(loop));
        for (int i = 0; i < 3; i++) {
            System.out.println(clap.toString());
        }
    }
}

