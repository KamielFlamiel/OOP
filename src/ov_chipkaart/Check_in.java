package ov_chipkaart;

public class Check_in {
    public static void main(String[] args) {
        
        Klant klant = new Klant(20.00);

        Ontvanger ovSaldo = new Ontvanger();

        ovSaldo.incheck(klant);

        System.out.println("Huidig saldo na inchecken: " + klant.getSaldo());
        
        ovSaldo.uitcheck(klant);
        
        System.out.println("Huidig saldo na uitchecken: " + klant.getSaldo());
        
        
    }
}

