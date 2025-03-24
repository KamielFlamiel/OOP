package ov_chipkaart;

public class Ontvanger {
    private static final double Instap_Tarief = 4.00; 
    private static final double ReisPrijs = 3.00;
    

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
    
    public boolean uitchecken(Klant klant) {
        if (klant.getSaldo() >= ReisPrijs) {
            klant.setSaldo(klant.getSaldo() - ReisPrijs);
            System.out.println("Uitchecken geslaagd! Reisprijs is afgeschreven.");
            return true;
        }
        return false;
    }

}

