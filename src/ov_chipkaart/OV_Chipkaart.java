package ov_chipkaart;

public class OV_Chipkaart {
    public static void main(String[] args) {
        
        Saldo_Systeem klant = new Saldo_Systeem(20.00);

        Poortje ovSaldo = new Poortje();

        ovSaldo.incheck(klant);

        System.out.println("Huidig saldo na inchecken: " + klant.getSaldo());
        
        ovSaldo.uitcheck(klant);
        
        System.out.println("Huidig saldo na uitchecken: " + klant.getSaldo());
        
        
    }
}


