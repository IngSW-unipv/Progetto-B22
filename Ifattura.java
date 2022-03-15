
package it.unipv.DAO;

import java.sql.ResultSet;

/**
 * Ifattura contiene i metodi
 *@see gettablefattura
 *per per estrare le tuple nella tabella del trattamento rispetto all'username
 */
public interface Ifattura {
	/**
	 * @param username che e' il nome utente del dentista
	 * @return ResultSet che sono le tuple dei trattamenti del dentista
	 */
    public  ResultSet gettablefattura(String username);
}
