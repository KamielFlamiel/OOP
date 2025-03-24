package ov_chipkaart;

public class Check_in {
    public static void main(String[] args) {
        
        Klant klant = new Klant("Kamiel", 10.00);

        Ontvanger ovSaldo = new Ontvanger();

        ovSaldo.incheck(klant);

        System.out.println("Huidig saldo: " + klant.getSaldo());
        ovSaldo.incheck(klant);
    }
}

