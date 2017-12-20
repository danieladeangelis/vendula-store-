package it.vendulastore.model;

public class Articolo {

    private int id_articolo;
    private String nome;
    private double prezzo;
    private String promozione;
    private String descrizione;
    private Categoria cat;
    private Reparto reparto;
    private Produttore produttore;
    private Fornitore fornitore;

    public int getId_articolo() {
        return id_articolo;
    }

    public void setId_articolo(int id_articolo) {
        this.id_articolo = id_articolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getPromozione() {
        return promozione;
    }

    public void setPromozione(String promozione) {
        this.promozione = promozione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }

    public Produttore getProduttore() {
        return produttore;
    }

    public void setProduttore(Produttore produttore) {
        this.produttore = produttore;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

}
