package ov_chipkaart;

public class Ontvanger {
    private static final double Instap_Tarief = 20.00;
    private static final double Reis_Kosten = 6.00;
    private static final double Terug_Kosten = 20.00 - Reis_Kosten;

    public boolean incheck(Klant klant) {
        if (klant.getSaldo() >= Instap_Tarief) {
            klant.setSaldo(klant.getSaldo() - Instap_Tarief);
            System.out.println("Inchecken geslaagd! Instaptarief is afgeschreven.");
            return true;
        } else {
           
            System.out.println("Saldo is onvoldoende om in te checken.");
            return false;
        }
    }
    
    public boolean uitcheck(Klant klant) {
        if (klant.getSaldo() <= Reis_Kosten) {
        	klant.setSaldo(klant.getSaldo() + Terug_Kosten);
            System.out.println("Uitchecken geslaagd!");
            return true;
        }
        return false;
    }

}

