package it.vendulastore.model;

import java.sql.Blob;

public class Foto {

    private String nome;
    private Blob foto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

}
