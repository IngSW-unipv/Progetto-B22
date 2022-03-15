package it.unipv.DAO;

import it.unipv.JAVABEAN.Datapaziente;

import java.sql.ResultSet;
/**
 * 
 * Ipaziente contiene i metodi
 *@see insertpatient
 *@see ricercapaziente
 *@see cancellapaziente
 *@see modificapaziente
 *@see gettablepaziente
 *per gestire tutte le operazioni sul database legato al
 *paziente
 */



public interface Ipaziente {

	/**
	 * 
	 * @param patient per i dati del paziente che prende i dati dal paziente da inserire nel data base
	 */
  public  void insertpatient(Datapaziente patient);
  /**
   * 
   * @param id della prescrizione
   * @param username del dentista
   * @return Dataprescription che e' il riferimento alla java bean che contiene i risultati della query eseguito
   * per la ricerca dei dati di un paziente
   */
  public  Datapaziente ricercapaziente(String id,String username);
  /**
   * 
   * @param id della prescrizione per cancellare i paziente con quel id e lo cancella del data base
   */
  public void cancellapaziente(String id);
  
  
  /**
   * 
   * @param data per vedere i dati del paziente
   * @param id  per fare la ricerca del paziente rispetto al id 
   */
  public void modificapaziente(Datapaziente data,String id);
  
  /**
   * 
   * @param username del dentista
   * @return Resultset che sono i resultati della ricerca
   */
  
  
  public  ResultSet gettablepaziente(String username);
}