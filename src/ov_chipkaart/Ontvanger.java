package ov_chipkaart;

public class Ontvanger {
    private static final double Instap_Tarief = 20.00;
    private static final double Reis_Kosten = 6.00;
    private static final double Terug_Kosten = Instap_Tarief - Reis_Kosten;

    public boolean incheck(Klant klant) {
        if (klant.getSaldo() >= Instap_Tarief) {
            klant.setSaldo(klant.getSaldo() - Instap_Tarief);
            System.out.println("Inchecken geslaagd");
            return true;
        } else {
           
            System.out.println("Saldo is onvoldoende om in te checken");
            return false;
        }
    }
    
    public boolean uitcheck(Klant klant) {
        	klant.setSaldo(klant.getSaldo() + Terug_Kosten);
            System.out.println("Uitchecken geslaagd");
            return true;
        
    }

}

