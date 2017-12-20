package it.vendulastore.dao.mysql;

import it.vendulastore.dao.interfaces.IUtenteDAO;
import it.vendulastore.dbinterface.DbConnection;
import it.vendulastore.model.Amministratore;
import it.vendulastore.model.Cliente;
import it.vendulastore.model.Gestore;
import it.vendulastore.model.Utente;

import java.util.ArrayList;

public class UtenteDAO implements IUtenteDAO {

    private static UtenteDAO instance;         //singleton design pattern: garantisce che di una determinata classe vengs creata una ed una sola istanza, e di fornire un punto di accesso globale a tale istanza
    public static UtenteDAO getInstance() {
        if(instance == null)
            instance = new UtenteDAO();
        return instance;
    }


    public Utente findUserByEmailAndPassword(String email, byte[] password) {
        Utente u = null;

        // dobbiamo avere una query sulla tabella utente. chiamo la db connection perchè lei interagisce con il db
        String query = "SELECT * FROM utente WHERE " +
                "email = '"+email+"' AND " +
                "password = '"+new String(password)+"'";
        ArrayList<String[]> ris = DbConnection.getInstance().eseguiQuery(query);

        if(ris.size() != 0) { //se nel dbms avessimo messo UQ su username sarebbe stato direttamente if(ris==1)

            String[] utente = ris.get(0); //mi restituisce la email dell'utente
            email = (utente[1]);


            //vediamo se è un cliente
            Cliente c = ClienteDAO.getInstance().findByEmail(email);
            if (c == null) {


                //allora sarà un amministratore?...
                Amministratore a = AmministratoreDAO.getInstance().findByEmail(email);
                if (a == null) {
                    //allora sarà un gestore?..
                    Gestore g = GestoreDAO.getInstance().findByEmail(email);
                    if (g != null) {
                        u = g;
                    }
                    else u = null;
                }
                else u = a;
            } else
               u = c;


        }

        return u;
    }


    public Object findById(int id) {
        return null;
    }

    public ArrayList findAll() {
        return null;
    }

    public Object findByEmail(String email) {
        return null;
    }
}

