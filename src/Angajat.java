import java.time.LocalDate;

public class Angajat extends User{
    private double salariu;
    private String functie;
    private LocalDate dataAngajare;
    private LocalDate dataConcediere;

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public LocalDate getDataAngajare() {
        return dataAngajare;
    }

    public void setDataAngajare(LocalDate dataAngajare) {
        this.dataAngajare = dataAngajare;
    }

    public LocalDate getDataConcediere() {
        return dataConcediere;
    }

    public void setDataConcediere(LocalDate dataConcediere) {
        this.dataConcediere = dataConcediere;
    }

    public String getNumeAngajat() {
        return getNume();
    }

    public Angajat() {
        this.salariu = 10000;
        this.functie = "functie";
        this.dataAngajare = LocalDate.parse("2022-12-03");
        this.dataConcediere = null;
    }
}
