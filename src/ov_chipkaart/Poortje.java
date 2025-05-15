package ov_chipkaart;

public class Poortje {
    private static final double Instap_Tarief = 20.00;
 
    public boolean incheck(OV_Chipkaart klant, Locaties bestemming) {
    	
    	if (klant.isIngecheckt()) {
            System.out.println("Je bent al ingecheckt.");
            return false;
        }

        if (klant.getSaldo() >= Instap_Tarief) {
            klant.setSaldo(klant.getSaldo() - Instap_Tarief);
            klant.setIngecheckt(true);
            klant.setBestemming(bestemming);
            System.out.println("Ingecheckt voor bestemming: " + bestemming.getNaam());
            return true;     
        } else {
            System.out.println("Saldo is onvoldoende om in te checken.");
            return false;
        }
    }
    
    public void uitcheck(OV_Chipkaart klant) {
    	
    	if (!klant.isIngecheckt()) {
    	        System.out.println("Je bent nog niet ingecheckt.");
    	        return;
    	    }
    	
    	Locaties bestemming = klant.getBestemming();
    	if (bestemming == null) {
    		System.out.println("Geen bestemming ingesteld");
    		return;
    	}

    	double terug_kosten = Instap_Tarief - bestemming.getReisKosten();
    	klant.setSaldo(klant.getSaldo() + terug_kosten);
    	klant.setIngecheckt(false);
    	klant.setBestemming(null);
    	System.out.println("Uitgecheckt bij " + bestemming.getNaam() + ". Reiskosten €" + bestemming.getReisKosten());
    	
        	
    }
    
    
   }

  

