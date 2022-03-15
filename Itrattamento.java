
package it.unipv.DAO;

import it.unipv.JAVABEAN.Datatrattamento;
import java.sql.ResultSet;

/**
 * 
 * Itrattamento contiene i metodi
 *@see inserttrattamento
 *@see modificatrattamento
 *@see cancellatrattamento
 *@see ricercatrattamento
 *@see gettabletrattamento
 *per gestire tutte le operazioni sul database legato al trattamento
 */
public interface Itrattamento {
  
	/**
	 * 
	 * @param treatment per i dati della prescrizione
	 */
  public  void inserttrattamento(Datatrattamento treatment);
  
  /**
   * 
   * @param data per i dati del trattamento
   * @param id  del trattamento da modificare
   */
  public void modificatrattamento(Datatrattamento data,String id);
  
  /**
   * 
   * @param id del trattamento da cancellare
   */
  public void cancellatrattamento(String id);
  
 
  /**
   * 
   * @param id del trattamento da  modificare
   * @param username del dentista
   * @return Datatrattamento che e' il riferimento alla java bean che contiene i risultati della query eseguito
   * per la ricerca dei dati di un trattamento
   */
  public  Datatrattamento ricercatrattamento(String id,String username);
  
  /**
   * 
   * @param username del dentista
   * @return ResultSet che sono i risultati dei dati della ricerca dei trattamenti del dentista
   */
  public  ResultSet gettabletrattamento(String username);
}
