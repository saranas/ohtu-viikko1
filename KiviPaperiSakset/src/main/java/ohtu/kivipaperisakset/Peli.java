package ohtu.kivipaperisakset;

import java.util.Scanner;


public abstract class Peli {
    
    //protected final String moodi;
    protected static final Scanner scanner = new Scanner(System.in);


    public Peli() {
        
    }
    
    public boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    protected abstract String vastaSiirto();
    
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        while (true) {
            
            System.out.print("Ensimmäisen pelaajan siirto: ");
            String ekanSiirto = scanner.nextLine();
            String tokanSiirto = vastaSiirto();
            
            if (!onkoOkSiirto(ekanSiirto) || !onkoOkSiirto(tokanSiirto)) break;
            
            tuomari.kirjaaTulos(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();
       
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

}
