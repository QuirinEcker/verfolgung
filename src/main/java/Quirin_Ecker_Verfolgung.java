/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   11
 * Übungstitel: Verfolgung
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       27.10.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Wndergruppen Verfolgung
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Durch Berechnungen ausrechnen wann sich dir Gruppen wieder treffen.
 *
 * ----------------------------------------------------------
*/
import java.util.Scanner;

public class Quirin_Ecker_Verfolgung {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double geschwindigkeit01;
        double geschwindigkeit02;
        double verspaetung;
        double wiedersehen;
        double stunden;
        double minuten;
        String ausgabe01;
        String ausgabe02;

        System.out.print("Geschwindigkeit der Gruppe 1: ");
        geschwindigkeit01 = scanner.nextDouble();
        System.out.print("Geschwindigkeit der Gruppe 2: ");
        geschwindigkeit02 = scanner.nextDouble();
        System.out.print("Verspätung der Gruppe 2: ");
        verspaetung = scanner.nextDouble();


        if (geschwindigkeit01 < geschwindigkeit02) {
            System.out.println();

            wiedersehen = geschwindigkeit02 * verspaetung / (geschwindigkeit02 - geschwindigkeit01) / 60;
            ausgabe01 = "Die beiden Gruppen sehen sich nach " + wiedersehen + " Stunden wieder.";

            stunden = Math.floor(wiedersehen);
            minuten = (wiedersehen - stunden) * 60;
            ausgabe02 = "Das sind " + stunden + " Stunden und " + minuten + " Minuten";

            System.out.println(ausgabe01);
            System.out.println(ausgabe02);
        }

        else  {
            System.out.println("Das Einholden der Gruppe 1 ist unmöglich");
        }
    }
}
