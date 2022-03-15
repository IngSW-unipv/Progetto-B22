package it.unipv.DAO;

import it.unipv.JAVABEAN.Datadentista;
import java.sql.ResultSet;
/**
 * 
 *  Iregistrazione implementa i seguenti metodi
 * @see InsertDatiDentista
 * @see cercausername
 *per gestire la operazione di registrazione dell'aplicazione
 */

public interface Iregistrazione {
	/**
	 * 
	 * @param dentist di tipo Datadentista 
	 */
    public void InsertDatiDentista(Datadentista dentist);
    /**
     * 
     * @param dentistusername che serve a identificare il dentista che entra nella aplicazione
     * @return  Resultset che sono i risultati della ricerca
     */
    public ResultSet cercausername(String dentistusername);
}