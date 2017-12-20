package it.vendulastore.dao.mysql;

import it.vendulastore.dao.interfaces.IBaseDAO;
import it.vendulastore.dbinterface.DbConnection;
import it.vendulastore.model.Cliente;
import it.vendulastore.model.Indirizzo;
import it.vendulastore.model.Metodo_pag;

import java.util.ArrayList;

public class ClienteDAO implements IBaseDAO{

    private static ClienteDAO instance;

    public static ClienteDAO getInstance() {
        if (instance == null)
            instance = new ClienteDAO();
        return instance;
    }

    public Cliente findByEmail(String email) {
    String query = "SELECT * FROM `vendula store`.cliente WHERE Utente_email= '"+email+"'";
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery(query);

        if(risultato.size() == 0) {
            return null;
        }

        Cliente c = new Cliente();
        Indirizzo i = new Indirizzo();
        Metodo_pag m = new Metodo_pag();

        String[] riga = risultato.get(0);
        c.setEmail(riga[3]);
        c.setNome(riga[0]);
        c.setCognome(riga[1]);
        c.setNum_telefono(riga[2]);

        int idIndirizzo=Integer.parseInt(riga[4]);
        ArrayList<String[]> ind = DbConnection.getInstance().eseguiQuery("SELECT * FROM indirizzo WHERE idIndirizzo="+idIndirizzo);
        String[] riga2 = ind.get(0);
        i.setVia(riga2[1]);
        i.setProvincia(riga2[2]);
        i.setCitta(riga2[3]);
        i.setNum(Integer.parseInt(riga2[4]));

        c.setIndirizzo(i);

        int metodo_pag = Integer.parseInt(riga[5]);
        ArrayList<String[]> met = DbConnection.getInstance().eseguiQuery("SELECT * FROM metodo_pagamento WHERE idMetodo_pagamento="+ metodo_pag);
        String[] riga3 = met.get(0);
        m.setNome(riga3[1]);

        c.setMetodopag(m);

        return c;

    }

    public Object findById(int id) {
        return null;
    }

    public ArrayList findAll() {
        return null;
    }

}
