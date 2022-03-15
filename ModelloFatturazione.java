
package it.unipv.model;

import it.unipv.DAO.ObjectFattura;
import java.sql.ResultSet;

/**
 * Modello della fatturazione che ha il metodo
 *@see getdatitrattamento
 */
public class ModelloFatturazione {
    ObjectFattura fattura;
    /**
     * Costruttore del modello fatturazione che mi istanzia un oggetto di default della classe
     * @see it.unipv.DAO.ObjectFattura
     */
    public ModelloFatturazione() {
        fattura = new ObjectFattura();
    }
    
    /**
     * 
     * @param username del dnetista da cercare i suoi trattamenti
     * @return  le tuple dei dati dei trattamenti del dentista
     */
     public ResultSet getdatitrattamento(String username){
    return  fattura.gettablefattura(username);
    }
}
