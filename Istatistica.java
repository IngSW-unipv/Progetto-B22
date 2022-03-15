package it.unipv.DAO;

import it.unipv.JAVABEAN.Datastatistica;

/**
 * 
 * Istatistica contiene i metodi
 * @see numerodati
 * per gestire tutte le operazioni sul database legato alla
 * statistica
 */
public interface Istatistica {
    /**
     * @param username di tipo stringa
     * @return restituisce i dati
     */
	public Datastatistica numerodati(String username);
}