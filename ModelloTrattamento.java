
package it.unipv.model;


import it.unipv.DAO.ObjectTrattamento;
import it.unipv.JAVABEAN.Datatrattamento;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 * La classe ModelloTrattamento e' la classe
 * che gestisce tutta la buisness logic legato
 *alla parte del Trattamento del software
 *e ha i metodi
 *@see registertreatment
 *@see modifytreatment
 *@see canceltreatment
 *@see researchtreatment
 *@see gettreatment
 */
public class ModelloTrattamento {
      ObjectTrattamento treatment;

      /**
       * Costruttore della classe ModelloPrescrizione che istanzia
       * un oggetto di default della classe
       * @see it.unipv.DAO.ObjectTrattamento
       */
    public ModelloTrattamento() {
        treatment = new ObjectTrattamento();
    }
    
    /**
     * Verifica i campi vuoti e se non ci sono va a registrare i dati il trattamento
     * @param treat di tipo Dataprescriziobe che e' il riferimento a l'oggetto della clasee
     * @see it.unipv.JAVABEAN.Datatrattamento
     * che contiene i dati non vuoti inseriti dalla view del trattameento
     */
    public void registertreatment(Datatrattamento treat){
    if(treat.getNometrattamento().isEmpty() || treat.getCosto().isEmpty() || treat.getNomeutentedentista().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    else{
    treatment.inserttrattamento(treat);
    }
    }
    
    /**
     * Va a modificare i dati del trattamento in caso di assenza di campi vuoti
     * @param treat di ti Datatrattamento fa riferimento all'oggetto della classe 
     * @see it.unipv.JAVABEAN.Datatrattamento che contiene i dati da modificare
     * @param ID del trattamento da modificare
     */
    public void modifytreatment(Datatrattamento treat,String ID)
    {
    if(treat.getNometrattamento().isEmpty() || treat.getCosto().isEmpty() || treat.getNomeutentedentista().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    else{
    treatment.modificatrattamento(treat,ID);
    }
    }
    
    /**
     * 
     * @param ID del trattamento da cancellare
     */
    public void canceltreatment(String ID){
        if(ID.isEmpty()){
               JOptionPane.showMessageDialog(null, "CAMPO ID VUOTO");
        }
        else{
    treatment.cancellatrattamento(ID);
           }
        }
    
    /**
     * 
     * @param ID del trattamento da ricercare
     * @param username del dentista con cui facciamo a restrizione al livello del database
     * @return un riferimento di tipo Datatrattamento all'oggetto che contiene i dati del trattamento trovati 
     * nel database
     */
    public Datatrattamento researchtreatment(String ID,String username)
    {
    return treatment.ricercatrattamento(ID,username);
    }
    
    /**
     * 
     * @param username del dentista 
     * @return le tuple che sono i trattamenti del dentista d'interesse
     */
    public ResultSet gettreatment(String username){
    return treatment.gettabletrattamento(username);
    }
    
}
