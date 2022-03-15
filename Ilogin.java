
package it.unipv.DAO;

import it.unipv.JAVABEAN.Login;
import java.sql.*;
/**
 * 
 *Ilogin contiene il metodo
 *@see cercadentista
 */
public interface Ilogin {
	/**
	 * 
	 * @param dentist che e' il riferimento all'oggetto di tipo Login 
	 * @see it.unipv.JAVABEAN.Login
	 * @return ResultSet che potrebbe essere nullo oppure avere la tupla trovato
	 */
    public ResultSet cercadentista(Login dentist);
}
