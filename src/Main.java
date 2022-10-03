
public class Main {
    public static void main(String[] args) {

        System.out.println("Sala sportiva!");
        Abonament abonament = new Abonament();
        System.out.println(abonament.getCode());
        Angajat angajat = new Angajat();
        System.out.println(angajat.getSalariu());
        Antrenament antrenament = new Antrenament();
        System.out.println(antrenament.getTipAntrenament());
        Client client = new Client();
        System.out.println(client.getIdnp());
        Factura factura = new Factura();
        System.out.println(factura.getPret());
        InventarCuratenie invenarPentruCuratenie = new InventarCuratenie();
        System.out.println(invenarPentruCuratenie.getNrInvantar());
        InvetarPaza inventarPaza = new InvetarPaza();
        System.out.println(inventarPaza.getDataInstalare());
        InvetarPaza invetarSportiv = new InvetarPaza();
        System.out.println(invetarSportiv.getDenumire());
        Localitate localiate = new Localitate();
        System.out.println(localiate.getDenumire());
        Promotie promotie = new Promotie();
        System.out.println(promotie.getPromotie());
        Raion raion = new Raion();
        System.out.println(raion.getDenumire());
        Adresa adresa = new Adresa();
        System.out.println(adresa.getNumar());
        User user = new User();
        System.out.println(user.getNume());
        System.out.println(adresa.getLocaliate());
    }
}