
package it.unipv.model;

import it.unipv.DAO.ObjectRegistrazione;
import it.unipv.JAVABEAN.Datadentista;

import java.sql.ResultSet;

import javax.swing.JOptionPane;

/**
 * La classe ModelloLogin e' la classe
 * che gestisce tutta la buisness logic legato
 *alla parte della Login del software
 *e ha il metodo
 *@see RegisterDentist
 */
public class ModelloRegistrazione {
   //variabile per chiamare i metodi dell'oggetto DAO registrazione che implementa i metodi dell'interfaccia Iregistrazione
    ObjectRegistrazione res;
    /**
     * Costruttore della classe ModelloRegistrazione che 
     * istanzia un oggetto di default della classe
     * @see it.unipv.DAO.ObjectRegistrazione
     */
    public ModelloRegistrazione() {
         res = new  ObjectRegistrazione();
    }

   /**
    * 
    * @param username del dentista da usare per vedere se e' gia stato registrato nel database
    * @return ResultSet tupla visto nel database oppure una null
    */
    public ResultSet cercanomeutente(String username){
        return res.cercausername(username);
       }
        
    
    /**
     * Registra i dati del dentista in assenza di un campo vuoto nella view
     * @param data1 di tipo  Datadentista che fa riferimento all'oggetto che contiene i data del 
     * dentista che si sta registrando
     */
    public void RegisterDentist(Datadentista data1){
    if(data1.getNome().isEmpty() || data1.getCognome().isEmpty() || data1.getNomeutente().isEmpty() || data1.getPassword().isEmpty() || data1.getEmaildentista().isEmpty() || data1.getCellularedentista().isEmpty())
    {
     JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    else{
        res.InsertDatiDentista(data1);
    }
    
    }
    
}
