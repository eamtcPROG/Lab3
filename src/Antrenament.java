public class Antrenament extends Angajat{
    private int numarAntrenamente;
    private String tipAntrenament;
    private String antrenor;

    public int getNumarAntrenamente() {
        return numarAntrenamente;
    }

    public void setNumarAntrenamente(int numarAntrenamente) {
        this.numarAntrenamente = numarAntrenamente;
    }

    public String getTipAntrenament() {
        return tipAntrenament;
    }

    public void setTipAntrenament(String tipAntrenament) {
        this.tipAntrenament = tipAntrenament;
    }

    public String getAntrenor() {
        return antrenor;
    }

    public void setAntrenor() {
        this.antrenor = getNumeAngajat();
    }

    public Antrenament() {
        this.numarAntrenamente = 10;
        this.tipAntrenament = "tipAntrenament";
    }
}
