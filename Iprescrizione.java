
package it.unipv.DAO;

import it.unipv.JAVABEAN.Dataprescrizione;
import java.sql.ResultSet;

/**
 * 
 * Iprescrizione contiene i metodi
 *@see insertprescription
 *@see modificaprescrizione
 *@see cancellaprescrizione
 *@see ricercaprescrizione
 *@see gettableprescrizione
 *@see cercacfTrattamento
 *per gestire tutte le operazioni sul database legato alla
 *prescrizione
 */
public interface Iprescrizione {
   
	/**
	 * 
	 * @param prescription per i dati della prescrizione da inserire
	 */
  public  void insertprescription(Dataprescrizione prescription);
  /**
   * 
   * @param id della prescrizione
   * @param username del dentista
   * @return Dataprescription che e' il riferimento alla java bean che contiene i risultati della query eseguito
   * per la ricerca dei dati di una prescrizione
   */
  public  Dataprescrizione ricercaprescrizione(String id,String username);
  /**
   * 
   * @param id della prescrizione da cancellare
   */
  public void cancellaprescrizione(String id);
  /**
   * 
   * @param data per i dati della prescrizione di modifica
   * @param id  della precrizione da modificare
   */
  public void modificaprescrizione(Dataprescrizione data,String id);
  /**
   * 
   * @param username del dentista
   * @return ResultSet che sono i risultati dei dati della ricerca delle prescrizioni del dentista
   */
  public  ResultSet gettableprescrizione(String username);
  /**
   * 
   * @param cf del paziente
   * @param treatment fornito dal dentista
   * @param username del dentista
   * @return Resultset che sono i risultati della ricerca
   */
  public ResultSet cercacfTrattamento(String cf,String treatment,String username);
}
