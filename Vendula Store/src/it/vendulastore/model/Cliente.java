package it.vendulastore.model;

import javax.print.DocFlavor;

public class Cliente extends Utente {

    private String nome;
    private String cognome;
    private String num_telefono;
    private Indirizzo indirizzo;
    private Metodo_pag metodopag;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Metodo_pag getMetodopag() {
        return metodopag;
    }

    public void setMetodopag(Metodo_pag metodopag) {
        this.metodopag = metodopag;
    }

}
