package it.vendulastore.model;

public class Album {

    private Foto foto;
    private int id_articolo;

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public int getId_articolo() {
        return id_articolo;
    }

    public void setId_articolo(int id_articolo) {
        this.id_articolo = id_articolo;
    }

}
