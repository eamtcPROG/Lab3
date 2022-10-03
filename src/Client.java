import java.time.LocalDate;

public class Client extends User{
    private String tipAbonament;
    private LocalDate dataCreareAbonament;
    private LocalDate dataDeExpirareAbonamet;

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public LocalDate getDataCreareAbonament() {
        return dataCreareAbonament;
    }

    public void setDataCreareAbonament(LocalDate dataCreareAbonament) {
        this.dataCreareAbonament = dataCreareAbonament;
    }

    public LocalDate getDataDeExpirareAbonamet() {
        return dataDeExpirareAbonamet;
    }

    public void setDataDeExpirareAbonamet(LocalDate dataDeExpirareAbonamet) {
        this.dataDeExpirareAbonamet = dataDeExpirareAbonamet;
    }
    public String getPrenumeClient() {
        return getPrenume();
    }

    public Client() {
        this.tipAbonament = "Test";
        this.dataCreareAbonament = LocalDate.parse("2022-12-03");
        this.dataDeExpirareAbonamet = LocalDate.parse("2023-12-03");
    }
}
