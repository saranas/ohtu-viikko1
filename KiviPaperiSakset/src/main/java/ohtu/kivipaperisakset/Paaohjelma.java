package ohtu.kivipaperisakset;

import java.util.Scanner;
import java.util.regex.*;

public class Paaohjelma {

    private static final String ilmo = "peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s";
    private static final String valintaruutu = "\nValitse pelataanko"
            + "\n (a) ihmistä vastaan "
            + "\n (b) tekoälyä vastaan"
            + "\n (c) parannettua tekoälyä vastaan"
            + "\nmuilla valinnoilla lopetataan";
    private static final Scanner scanner = new Scanner(System.in);
    private static Pelitehdas pelitehdas = new Pelitehdas();

    //pelimoodi, staattinen tehdasmetodi??
    public static void main(String[] args) {
        
        while (true) {
            System.out.println(valintaruutu);

            String vastaus = scanner.nextLine();
            
            if (!kelpovastaus(vastaus)) break;
        
            System.out.println(ilmo);
            Peli peli = pelitehdas.haePeli(vastaus);
            peli.pelaa();
        }
    }
    
    public static boolean kelpovastaus(String v) {
        if (v.equals("a") || v.equals("b") || v.equals("c")) return true;
        return false;
            
    }
}
