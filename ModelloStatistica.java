package it.unipv.model;

import it.unipv.DAO.ObjectStatistica;
import it.unipv.JAVABEAN.Datastatistica;

/**
 * La classe ModelloStatistica è la classe
 * che gestisce tutta la business logic legato
 * alla parte della statistica del software
 * e ha i metodi
 * @see getdatastatistics
 */

public class ModelloStatistica {
     ObjectStatistica statistics;

     /**
      * Costruttore della classe ModelloStatistica che istanzia
      * un oggetto di default della classe
      * @see it.unipv.DAO.ObjectStatistica
      */
     
    public ModelloStatistica() {
        statistics = new ObjectStatistica();
    }
    
    /**
     * 
     * @param username del dentista in questione
     * @return restituisce i dati riguardanti il numero di pazienti, di trattamenti e delle prescrizione
     * in base al dentista che ha effettuato il login
     */
    public Datastatistica getdatastatistics(String username){
    return statistics.numerodati(username);
    }
}