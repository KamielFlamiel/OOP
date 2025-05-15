package ov_chipkaart;

public class Locaties {
    private String naam;
    private double reisKosten;

    public Locaties(String naam, double reisKosten) {
        this.naam = naam;
        this.reisKosten = reisKosten;
    }

    public String getNaam() {
        return naam;
    }

    public double getReisKosten() {
        return reisKosten;
    }

    @Override
    public String toString() {
        return naam + " (€" + reisKosten + ")";
    }
}
