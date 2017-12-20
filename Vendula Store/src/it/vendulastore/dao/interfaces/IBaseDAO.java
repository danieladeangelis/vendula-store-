package it.vendulastore.dao.interfaces;

import java.util.ArrayList;

public interface IBaseDAO <T> {

    //findById
        T findById(int id);

    //findAll
        ArrayList<T> findAll();

    //findByEmail
    T findByEmail(String email);
    }

