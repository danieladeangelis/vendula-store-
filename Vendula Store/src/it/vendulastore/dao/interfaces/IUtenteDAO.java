package it.vendulastore.dao.interfaces;

import it.vendulastore.model.Utente;

public interface IUtenteDAO extends IBaseDAO {
    Utente findUserByEmailAndPassword(String email, byte[] password);
}

