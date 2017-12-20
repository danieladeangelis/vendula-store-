package it.vendulastore.dao.mysql;

import it.vendulastore.dao.interfaces.IBaseDAO;
import it.vendulastore.dbinterface.DbConnection;
import it.vendulastore.model.Gestore;

import java.util.ArrayList;

public class GestoreDAO implements IBaseDAO {
    private static GestoreDAO instance;

        public static GestoreDAO getInstance() {
        if(instance == null)
            instance = new GestoreDAO();
        return instance;
    }

    public Gestore findByEmail(String email) {
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM gestore WHERE Utente_email='"+email+"'");

        if(risultato.size() == 0) return null;

        Gestore g = new Gestore();

        String[] riga = risultato.get(0);
        g.setEmail(riga[0]);
        return g;
    }


    public Object findById(int id) {
        return null;
    }

    public ArrayList findAll() {
        return null;
    }

}
