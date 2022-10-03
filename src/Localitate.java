public class Localitate extends Raion{
    private String denumire;

    @Override
    public String getDenumire() {
        return this.denumire;
    }
    @Override
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public String getRaion(){
        return super.getDenumire();
    }

    public Localitate() {
        this.denumire = "Sunt apelat din clasa Adresa prin super find metoda a clasei localiate";
    }


}
