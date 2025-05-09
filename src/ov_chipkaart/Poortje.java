package ov_chipkaart;

public class Poortje {
    private static final double Instap_Tarief = 20.00;
    private static final double Reis_Kosten = 6.00;
    private static boolean Toestaan_Checkin = true;
    

    public boolean incheck(OV_Chipkaart klant, boolean toestaanCheckin) {
        if (klant.getSaldo() >= Instap_Tarief) {
            System.out.println("Inchecken geslaagd");
            klant.setSaldo(klant.getSaldo() - Instap_Tarief);
            Toestaan_Checkin = true;
            return true;
        } else {
            System.out.println("Saldo is onvoldoende om in te checken");
            Toestaan_Checkin = false;
            return false;
        }
    }
    
    public void uitcheck(OV_Chipkaart klant, boolean toestaanCheckin) {
    	if (Toestaan_Checkin = true) {
    		double terug_kosten = Instap_Tarief - Reis_Kosten;
    		klant.setSaldo(klant.getSaldo() + terug_kosten);
    		
    		if (klant.getSaldo() - terug_kosten < Instap_Tarief) {
    			System.out.println("Saldo komt onder de 20, Uitchecken is niet mogelijk");
    			Toestaan_Checkin = false;
    	        return;
    	        
    	} else {
    		
    	 System.out.println("U bent uitgechekt");
    	  return;
    	
    	}
        	
    	}
    }

  }

