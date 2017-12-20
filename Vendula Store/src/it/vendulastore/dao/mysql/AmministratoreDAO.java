package it.vendulastore.dao.mysql;

import it.vendulastore.dao.interfaces.IBaseDAO;
import it.vendulastore.dao.interfaces.IUtenteDAO;
import it.vendulastore.dbinterface.DbConnection;
import it.vendulastore.model.Amministratore;
import it.vendulastore.model.Utente;

import java.util.ArrayList;

public class AmministratoreDAO implements IBaseDAO {

    private static AmministratoreDAO instance;

    public static AmministratoreDAO getInstance() {
        if (instance == null)
            instance = new AmministratoreDAO();
        return instance;
    }


    public Amministratore findByEmail(String email) {
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM amministratore WHERE Utente_email='"+email+"'");

        if(risultato.size() == 0) return null;

        Amministratore a = new Amministratore();

        String[] riga = risultato.get(0);
        a.setEmail(riga[0]);
        return a;
    }

    public Object findById(int id) {
        return null;
    }

    public ArrayList findAll() {
        return null;
    }
}
