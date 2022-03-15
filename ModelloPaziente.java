package it.unipv.model;

import it.unipv.DAO.ObjectPaziente;
import it.unipv.JAVABEAN.Datapaziente;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 * La classe ModelloPaziente e' la classe
 * che gestisce tutta la logica legato
 *alla parte dell paziente  nel software
 *e ha i metodi
 *@see registerpatient
 *@see modifypatient
 *@see cancelpatient
 *@see researchpatient
 */
public class ModelloPaziente {
    ObjectPaziente patient;
/**
 *  /**
     * Costruttore della classe ModelloPaziente che 
     * istanzia 2 oggetti di default della classe
     * @see it.unipv.DAO.ObjectPaziente
     * 
     */

    public ModelloPaziente() {
        patient = new ObjectPaziente();
    }
  
    /**
     * 
     * @param pat di tipo Datapaziente che prende i dati del paziente se non ci sono dei campi vuoti nella view
     */
    public void registerpatient(Datapaziente pat){
    if(pat.getNome().isEmpty() || pat.getCognome().isEmpty() || pat.getCf().isEmpty() || pat.getIndirizzo().isEmpty() || pat.getEmailpaziente().isEmpty() || pat.getCellularepaziente().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    else{
    patient.insertpatient(pat);
    }
    }
   
     /**
      * 
      * @param data di tipo Datapaziente che mostra i dati del paziente
      * @param ID di tipo String cerca il paziente da cui noi vogliamo i dati
      */
    public void modifypatient(Datapaziente data,String ID)
    {
    if(data.getNome().isEmpty() || data.getCognome().isEmpty() || data.getCf().isEmpty() || data.getIndirizzo().isEmpty() || data.getEmailpaziente().isEmpty() || data.getCellularepaziente().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    else{
    patient.modificapaziente(data,ID);
    }
    }
    
    /**
     * 
     * @param ID di tipo String che serve per distinguere al paziente al interno del data base per poter cancelarlo
     * se al suo interno no se si trovano dei campi vuoti
     */
    public void cancelpatient(String ID){
        if(ID.isEmpty()){
               JOptionPane.showMessageDialog(null, "CAMPO ID VUOTO");
        }
        else{
    patient.cancellapaziente(ID);
           }
        }
    /**
     * 
     * @param ID di tipo String
     * @param username d tipo String 
     * che serve per identificare al paziente appartenente al dentista
     * @return retorna i dati del paziente a cui apartiene el dentista
     */
    public Datapaziente researchpatient(String ID,String username)
    {
    return patient.ricercapaziente(ID,username);
    }
   /**
    * 
    * @param username di tipo String che serve per identificare tuttu i paziente del dentista
    * @return e retorna la tavella dei paziente
    */
    public ResultSet getpatients(String username){
    return patient.gettablepaziente(username);
    }
    
    
    
}