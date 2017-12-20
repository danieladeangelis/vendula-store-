package it.vendulastore.business;

import it.vendulastore.dao.mysql.UtenteDAO;
import it.vendulastore.model.Utente;


public class UtenteBusiness {

    private static UtenteBusiness instance;

    public static UtenteBusiness getInstance() {
        if(instance == null)
            instance = new UtenteBusiness();
        return instance;
    }

    public Utente login(String email, byte[] password) {

        Utente u1 = UtenteDAO.getInstance().findUserByEmailAndPassword(email, password);

        return u1;
    }
}
