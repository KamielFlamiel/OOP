package ov_chipkaart;

public class OV_Chipkaart {
    private double saldo;
    private boolean checkIn;
    private Locaties bestemming;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public OV_Chipkaart(boolean checkIn, double saldo) {
        this.checkIn = checkIn;
        this.saldo = saldo;
    }

    public boolean isIngecheckt() {
        return checkIn;
    }

    public void setIngecheckt(boolean checkIn) {
        this.checkIn = checkIn;
    }
    
    public Locaties getBestemming() {
        return bestemming;
    }

    public void setBestemming(Locaties bestemming) {
        this.bestemming = bestemming;
    }	
    
}
