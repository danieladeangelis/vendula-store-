package it.vendulastore.model;

public class Indirizzo {

    private String via;
    private String provincia;
    private String citta;
    private int num;

    private int id_indirizzo;

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId_indirizzo() {
        return id_indirizzo;
    }

}
