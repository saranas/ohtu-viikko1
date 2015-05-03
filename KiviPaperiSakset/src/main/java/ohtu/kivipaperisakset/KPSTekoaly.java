package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli {

    private static final Scanner scanner = new Scanner(System.in);
        public final static String PELI = "tekoaly";


    public String vastaSiirto() {
        Tekoaly tekoaly = new Tekoaly();

        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }
}