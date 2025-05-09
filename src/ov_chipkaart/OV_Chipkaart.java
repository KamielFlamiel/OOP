package ov_chipkaart;

public class OV_Chipkaart {
    private double saldo;
    private boolean checkIn;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public OV_Chipkaart(boolean checkIn, double saldo) {
        this.checkIn = checkIn;
    }

    public boolean getPermission() {
        return checkIn;
    }

    public void setPermission(boolean checkIn) {
        this.checkIn = checkIn;
    }
}
