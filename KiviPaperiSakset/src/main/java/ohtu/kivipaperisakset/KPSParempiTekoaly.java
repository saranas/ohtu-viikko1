package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends Peli {

    private static final Scanner scanner = new Scanner(System.in);
    public final static String PELI = "parempitekoaly";

    public String vastaSiirto() {
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);

        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

}
