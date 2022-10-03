public class User {
    private String nume;
    private String prenume;
    private int varsta;
    private String idnp;
    private String username;
    private String password;

    private String codDeAcces;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCodDeAcces() {
        return codDeAcces;
    }

    public void setCodDeAcces(String codDeAcces) {
        this.codDeAcces = codDeAcces;
    }

    public User() {
        this.nume = "nume";
        this.prenume = "prenume";
        this.varsta = 20;
        this.idnp = "idnp";
        this.username = "username";
        this.password = "password";
        this.codDeAcces = "codDeAcces";
    }
}
