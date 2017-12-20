package it.vendulastore.actionlisteners;

import it.vendulastore.business.UtenteBusiness;
import it.vendulastore.model.Amministratore;
import it.vendulastore.model.Cliente;
import it.vendulastore.model.Gestore;
import it.vendulastore.model.Utente;
import it.vendulastore.view.LoginFrame1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

     public class LoginListener implements ActionListener {

         private LoginFrame1 finestra;

         public LoginListener(LoginFrame1 finestra) {
             this.finestra = finestra;
         }

         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println("Evento catturato!");

             if ("RANDOM_MENU_ITEM".equals(e.getActionCommand())) {
                 JOptionPane.showMessageDialog(null, "Hai premuto la voce di menu random");
             }
             if (e.getSource() instanceof JButton
                     || e.getSource() instanceof JTextField
                     || e.getSource() instanceof JPasswordField) {


                 String email = finestra.getTxtEmail().getText();
                 byte[] password = new String(finestra.getTxtPassword().getPassword()).getBytes();

                 Utente u = UtenteBusiness.getInstance().login(email, password);

                 if (u != null) {
                     System.out.println("LOGIN OK!");

                     if (u instanceof Cliente) {
                         //apriremo la view del cliente
                         Cliente c = (Cliente) u;
                         System.out.println("Benvenuto cliente " + c.getNome() + " " + c.getCognome() + "!");
                         JOptionPane.showMessageDialog(null, "Benvenuto cliente " + c.getNome() + " " + c.getCognome() + "!");
                     }
                     if (u instanceof Amministratore) {
                         //apriremo la view dell'amministratore
                         System.out.println("Benvenuto amministratore !");
                         JOptionPane.showMessageDialog(null, "Benvenuto amministratore!");
                     }
                     if (u instanceof Gestore) {
                         //apriremo la view del gestore
                         System.out.println("Benvenuto gestore !");
                         JOptionPane.showMessageDialog(null, "Benvenuto gestore!");
                     }

                 } else {
                     System.out.println("Il login non è andato a buon fine...");
                     JOptionPane.showMessageDialog(null, "Il login non è andato a buon fine...");
                 }
             }
         }
     }
