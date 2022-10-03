import java.time.LocalDate;
public class Abonament {
    private int code;
    private String denumire;
    private LocalDate inceput;
    private LocalDate sfarsit;
    private boolean activ;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public LocalDate getInceput() {
        return this.inceput;
    }

    public void setInceput(LocalDate inceput) {
        this.inceput = inceput;
    }

    public LocalDate getSfarsit() {
        return this.sfarsit;
    }

    public void setSfarsit(LocalDate sfarsit) {
        this.sfarsit = sfarsit;
    }

    public boolean isActiv() {
        return this.activ;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }

    public Abonament() {
        this.code = 0;
        this.denumire = "denumire";
        this.inceput =  LocalDate.parse("2022-12-03");
        this.sfarsit =  LocalDate.parse("2023-12-03");
        this.activ = true;
    }
}
