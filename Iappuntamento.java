package it.unipv.DAO;

import it.unipv.JAVABEAN.Dataappuntamento;
import java.sql.ResultSet;

/**
 * Iappuntamento contiene i metodi
 * @see insertappuntamento
 * @see modificappuntamento
 * @see cancellappuntamento
 * @see gettableappuntamento
 * @see ricercaappuntamento
 * @see cercacfTrattamento
 * per gestire tutte le operazioni sul database legato alla
 * prescrizione
 */

public interface Iappuntamento {
  
	/**
	 * @param appointment per i dati dell'appuntamento
	 */
  public  void insertappuntamento(Dataappuntamento appointment);
  
  /** 
   * @param data per i dati dell'appuntamento
   * @param id  della prescrizione
   */
 
  public void modificappuntamento(Dataappuntamento data,String id);
  
  /**
   * @param id dell'appuntamento
   */
  
  public void cancellappuntamento(String id);
  
  /**
   * @param username del dentista
   * @return ResultSet che sono i risultati dei dati della ricerca degli appuntamenti del dentista
   */
  
  public  ResultSet gettableappuntamento(String username);
  
  /**
   * @param id dell'appuntamento
   * @param username del dentista
   * @return Dataappuntamento che è il riferimento alla java bean che contiene i risultati della query eseguito
   * per la ricerca dei dati di un appuntamento
   */
  
  public  Dataappuntamento ricercaappuntamento(String id,String username);
  
  /**
   * @param cf del paziente
   * @param treatment fornito dal dentista
   * @param username del dentista
   * @return Resultset che sono i risultati della ricerca
   */
  
  public ResultSet cercacfTrattamento(String cf,String treatment,String username);
}