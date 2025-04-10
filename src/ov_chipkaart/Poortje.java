package ov_chipkaart;

public class Poortje {
    private static final double Instap_Tarief = 20.00;
    private static final double Reis_Kosten = 6.00;
    private static boolean Toestaan_Checkin = true;
    

    public boolean incheck(Saldo_Systeem klant, Saldo_Systeem toestaanCheckin) {
        if (klant.getSaldo() >= Instap_Tarief) {
            System.out.println("Inchecken geslaagd");
            klant.setSaldo(klant.getSaldo() - Instap_Tarief);
            toestaanCheckin.setPermission(Toestaan_Checkin = true);
            return true;
        } else {
            System.out.println("Saldo is onvoldoende om in te checken");
            toestaanCheckin.setPermission(Toestaan_Checkin = false);
            return false;
        }
    }
    
    public boolean uitcheck(Saldo_Systeem klant, Saldo_Systeem toestaanCheckin) {
    	if (Toestaan_Checkin = true) {
    		double terug_kosten = Instap_Tarief - Reis_Kosten;
        	klant.setSaldo(terug_kosten - klant.getSaldo());
            System.out.println("Uitchecken geslaagd");
            return true;
    	} else {
    		System.out.println("U bent niet ingecheckt");
    		return false;
    	}
    	    
        
    }

}

