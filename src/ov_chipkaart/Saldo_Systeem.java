package ov_chipkaart;

public class Saldo_Systeem {
    private double saldo;
    private boolean checkIn;

    public Saldo_Systeem(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Saldo_Systeem(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean getPermission() {
        return checkIn;
    }

    public void setPermission(boolean checkIn) {
        this.checkIn = checkIn;
    }
}
