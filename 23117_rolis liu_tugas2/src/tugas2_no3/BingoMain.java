
package tugas2_no3;
/**
 *
 * @author rolis
 */
public class BingoMain {
    public static void main(String[] args) {
        String[] lirik = {
            "There was a farmer who had a dog,",
            "And Bingo was his name-o."
        };
        
        String kata = "BINGO";

        Bingo lagu = new Bingo(lirik, kata);
        lagu.tampilLagu();
    }
}

