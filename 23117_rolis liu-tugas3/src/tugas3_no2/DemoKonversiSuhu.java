
package tugas3_no2;

/**
 *
 * @author rolis
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        double celcius = 30;
        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);
        double fahrenheitToReamur = konversi.fahrenheitToReamur(fahrenheit);

        System.out.println("Suhu " + celcius + "C dalam Fahrenheit: " + fahrenheit + "F");
        System.out.println("Suhu " + celcius + "C dalam Reamur: " + reamur + "R");
        System.out.println("Suhu " + fahrenheit + "F dalam Reamur: " + fahrenheitToReamur + "R");
    }
}

