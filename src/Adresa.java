public class Adresa extends Localitate{
    private String denumire;
    private int numar;
    private int scara;

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public int getScara() {
        return scara;
    }

    public void setScara(int scara) {
        this.scara = scara;
    }
    public String getLocaliate(){
        return super.getDenumire();
    }

    public Adresa() {
        this.denumire = "denumire";
        this.numar = 1;
        this.scara = 10;
    }
}
