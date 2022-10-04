import java.time.LocalDate;

public class Inventar extends Filiala{
    private int nrInvantar;
    private LocalDate dataInstalare;
    private LocalDate dataDemontare;

    public int getNrInvantar() {
        return nrInvantar;
    }

    public void setNrInvantar(int nrInvantar) {
        this.nrInvantar = nrInvantar;
    }

    public LocalDate getDataInstalare() {
        return dataInstalare;
    }

    public void setDataInstalare(LocalDate dataInstalare) {
        this.dataInstalare = dataInstalare;
    }

    public LocalDate getDataDemontare() {
        return dataDemontare;
    }

    public void setDataDemontare(LocalDate dataDemontare) {
        this.dataDemontare = dataDemontare;
    }

    public Inventar() {
        this.nrInvantar = 1;
        this.dataInstalare = LocalDate.parse("2022-12-03");
        this.dataDemontare = null;
    }
}
