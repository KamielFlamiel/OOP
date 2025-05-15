package ov_chipkaart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locaties[] route = {
        	    new Locaties("Amsterdam", 6.00),
        	    new Locaties("Rotterdam", 8.50),
        	    new Locaties("Utrecht", 5.00)
        	};
        
        int huidigeLocatieIndex = 0;
        
        Scanner sc = new Scanner(System.in);
        OV_Chipkaart klant = new OV_Chipkaart(false, 20.0);
        Poortje poortje = new Poortje();
        	
        	while (true) {
        	    System.out.println("Je saldo = €" + klant.getSaldo());
        	    System.out.println("Wil je inchecken, uitchecken of OV-kaart opladen?");
        	    System.out.println("1: Inchecken");
        	    System.out.println("2: Uitchecken");
        	    System.out.println("3: Opladen");

        	    int input = sc.nextInt();

        	    if (input == 1) {
        	    	if (klant.isIngecheckt()) {
        	    		System.out.println("Je bent al ingecheckt");
        	    		continue;
        	    	}
        	    	
        	    	Locaties volgendeBestemming = route[huidigeLocatieIndex];
        	    	poortje.incheck(klant, volgendeBestemming);
        	    	System.out.println("Saldo na incheck: €" + klant.getSaldo());
        	    	
        	    	huidigeLocatieIndex = (huidigeLocatieIndex + 1) % route.length;
        	    	
        	        
        	    } else if (input == 2) {
        	        poortje.uitcheck(klant);
        	        System.out.println("Saldo na uitcheck: €" + klant.getSaldo());
        	        
        	     } else if (input == 3) {
                     System.out.print("Hoeveel wil je opladen? €");
                     double bedrag = sc.nextDouble();
                     klant.setSaldo(klant.getSaldo() + bedrag);
                     System.out.println("Nieuw saldo: €" + klant.getSaldo());

                 } else {
                     System.out.println("Ongeldige keuze.");
                 }
             }
         }
     }


