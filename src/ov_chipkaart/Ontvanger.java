package ov_chipkaart;

public class Ontvanger {
    private static final double INSTAP_TARIEF = 4.00; // 

    public boolean incheck(Klant klant) {
        if (klant.getSaldo() >= INSTAP_TARIEF) {
            
            klant.setSaldo(klant.getSaldo() - INSTAP_TARIEF);
            System.out.println("Inchecken geslaagd! Instaptarief is afgeschreven.");
            return true;
        } else {
           
            System.out.println("Saldo is onvoldoende om in te checken.");
            return false;
        }
    }

}

