package ohtu.kivipaperisakset;


import java.util.HashMap;
import java.util.Scanner;


public class Pelitehdas {
    private final HashMap<String, Peli> pelit;
        private static final Scanner scanner = new Scanner(System.in);


    public Pelitehdas() {
        this.pelit = new HashMap<String, Peli>();
        luoKomennot();
    }
    
    private void luoKomennot() {
        pelit.put("a", new KPSPelaajaVsPelaaja());
        pelit.put("b", new KPSTekoaly());
        pelit.put("c", new KPSParempiTekoaly());
        
    }
    
    public boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    public Peli haePeli(String syote) {
        String operaatio = syote.toLowerCase().trim();
        Peli peli = pelit.get(operaatio);

//        if (peli == null) {
//            return ;
//        }

        return peli;
    }
    
    

}
