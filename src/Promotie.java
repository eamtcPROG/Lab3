public class Promotie {
    private String denumire;
    private double promotie;

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPromotie() {
        return this.promotie;
    }

    public void setPromotie(double promotie) {
        this.promotie = promotie;
    }

    public Promotie() {
        this.denumire = "denumire";
        this.promotie = 1000;
    }

}
