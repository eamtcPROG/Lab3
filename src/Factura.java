public class Factura extends User{
    private double pret;

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    public String getIDNPClient() {
        return getIdnp();
    }

    public Factura() {
        this.pret = 10000;
    }
}
