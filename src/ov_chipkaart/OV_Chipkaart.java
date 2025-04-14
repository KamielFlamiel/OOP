package ov_chipkaart;

import java.util.Scanner;

public class OV_Chipkaart {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        Saldo_Systeem klant = new Saldo_Systeem(20.0);
        Poortje ovSaldo = new Poortje();
        boolean toestaanCheckin = true;
        
        
        while(true) {
        	
        	System.out.println("Je saldo = " + klant.getSaldo());
        	System.out.println("Wil je inchecken/uitchecken of OV-kaart opladen?");
            System.out.println("1 voor inchecken/uitchecken, 2 voor OV-kaart opladen");
            
            int input = sc.nextInt();
            
            if (input != 1 && input != 2) {
            	System.out.println("Verkeerde input");
            }

            if (input == 1) {
            	ovSaldo.incheck(klant, toestaanCheckin);

                System.out.println("Huidig saldo na inchecken: " + klant.getSaldo());
                
                ovSaldo.uitcheck(klant, toestaanCheckin);
                
                System.out.println("Huidig saldo na uitchecken: " + klant.getSaldo());
            } else if (input == 2) {
            	System.out.println("Hoeveel wil je opladen?");
            	int saldo = sc.nextInt();
            	klant.setSaldo(saldo);
            	
            	System.out.println("Nieuw saldo: €" + klant.getSaldo());
            }
            
        }
        
        
        
        
        
    }
}


