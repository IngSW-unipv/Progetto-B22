
package it.unipv.model;

import it.unipv.DAO.ObjectLogin;
import it.unipv.JAVABEAN.Login;
import it.unipv.MainMenuprincipale;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * La classe ModelloLogin e' la classe
 * che gestisce tutta la buisness logic legato
 *alla parte della Login del software
 *e ha il metodo
 *@see VerificaLogin
 */
public class ModelloLogin {
    //variabile per chiamare i metodi dell'oggetto DAO per la Login che implementa i metodi dell'interfaccia Iregistrazione
    ObjectLogin result;
    MainMenuprincipale menu;
    ResultSet rs1;

    /**
     * Costruttore della classe ModelloLogin che 
     * istanzia 2 oggetti di default della classe
     * @see it.unipv.DAO.ObjectLogin 
     * e
     * @see it.unipv.MainMenuprincipale
     * 
     */
    public ModelloLogin() {
        result = new  ObjectLogin();
        menu = new MainMenuprincipale();
    }
    
    
    /**
     * VerificaLogin riceve come parametri
     * @param log di tipo Login per invocare i metodi della classe
     * @see it.unipv.JAVABEAN.Login 
     * e verifica se i dati sono vuoti(presenza di campi vuoti nella view)oppure se ha un valore
     * per poi invocare il metodo cercadentista della classe 
     * @see it.unipv.DAO.ObjectLogin
     * @param name che e' il nomeutente del dentista che riceve dal
     * @see it.unipv.controller.Controllerlogin
     */
    public void VerificaLogin(Login log,String name){
     if(log.getUsername().isEmpty() || log.getPassword().isEmpty()){
      
     JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
   
     }
     else {
      rs1 = result.cercadentista(log);
        try {
            if(rs1.next())
            {
                JOptionPane.showMessageDialog(null, "LOGIN CON SUCCESSO");
                 //call menu principale frame
                menu.runMenuPrincipale(name);
            } 
        
            else{
              JOptionPane.showMessageDialog(null, "DATI SBAGLIATO RIPROVA LOGIN");
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
     
     }
}
    
}
