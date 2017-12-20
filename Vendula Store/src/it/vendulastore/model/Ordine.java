package it.vendulastore.model;

public class Ordine {

    private int id_ordine;
    private boolean stato_ordine;  //Ordine aperto o chiuso
    private String data;
    private int importo_tot;
    private int conferma_ordine; //1 confermato, 2 in attesa, 3 negato

    public int getId_ordine() {
        return id_ordine;
    }

    public void setId_ordine(int id_ordine) {
        this.id_ordine = id_ordine;
    }

    public boolean isStato_ordine() {
        return stato_ordine;
    }

    public void setStato_ordine(boolean stato_ordine) {
        this.stato_ordine = stato_ordine;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImporto_tot() {
        return importo_tot;
    }

    public void setImporto_tot(int importo_tot) {
        this.importo_tot = importo_tot;
    }

    public int getConferma_ordine() {
        return conferma_ordine;
    }

    public void setConferma_ordine(int conferma_ordine) {
        this.conferma_ordine = conferma_ordine;
    }


}
