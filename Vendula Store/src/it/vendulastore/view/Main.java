package it.vendulastore.view;

import it.vendulastore.business.UtenteBusiness;
import it.vendulastore.dbinterface.DbConnection;
import it.vendulastore.model.Amministratore;
import it.vendulastore.model.Cliente;
import it.vendulastore.model.Gestore;
import it.vendulastore.model.Utente;

import java.util.ArrayList;

public class Main {

   public static void main(String args[]) {

        System.out.println("Ci sono!");
/*
        ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM `vendula store`.cliente JOIN `vendula store`.indirizzo on Indirizzo_idIndirizzo1=idIndirizzo");

        System.out.println("Numero di righe: " + risultato.size());

        for(int i=0;i<risultato.size();i++) {
            String[] riga = risultato.get(i);
            System.out.println("NOME: "+riga[0]);
            System.out.println("COGNOME: "+riga[1]);
            System.out.println("NUMERO CELLULARE: "+riga[2]);
            System.out.println("EMAIL: "+riga[3]);
            System.out.println("VIA: "+riga[7]);
            System.out.println("PROVINCIA: "+riga[8]);
            System.out.println("CITTA': "+riga[9]);
            System.out.println("NUMERO CIVICO: "+riga[10]);
            System.out.println("-------------------");
        }
 //ALMENO UNA COSA FUNZIONA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH.

        PROVA LOGIN
        String email = "giulia.cerfeda@studenti.unisalento.it";
        byte[] password = "gnommy".getBytes();

        Utente u = UtenteBusiness.getInstance().login(email, password);

        if (u != null) {
            System.out.println("LOGIN OK!");

            if (u instanceof Cliente) {
                //apriremo la view del cliente
                Cliente c = (Cliente) u;
                System.out.println("Benvenuto cliente " + c.getNome() + " " + c.getCognome() + "!");
            }
            if (u instanceof Amministratore) {
                //apriremo la view dell'amministratore
                System.out.println("Benvenuto amministratore !");
            }
            if (u instanceof Gestore) {
                //apriremo la view del gestore
                System.out.println("Benvenuto gestore !");
            }

        } else
            System.out.println("Il login non è andato a buon fine...");
    } */
           new LoginFrame1().setVisible(true);
    }
}