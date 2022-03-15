package it.unipv.model;
import it.unipv.DAO.ObjectAppuntamento;
import it.unipv.JAVABEAN.Dataappuntamento;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 * La classe ModelloAppuntamento è la classe
 * che gestisce tutta la business logic legata
 * alla parte dell'appuntamento del software
 * ha i metodi
 * @see verificaCampivuoti
 * @see registerappointment
 * @see modifyappointment
 * @see cancelappointment
 * @see researchappointment
 * @see getappointment
 */
public class ModelloAppuntamento {
    ObjectAppuntamento appointment;
    private ResultSet rs1;
    
    /**
     * Costruttore della classe Modelloappuntamento che 
     * istanzia 2 oggetti di default della classe
     * @see it.unipv.DAO.ObjectAppuntamento
     * 
     */
    public ModelloAppuntamento() {
        appointment = new ObjectAppuntamento();
    }
    
    /**
     * verificaCampivuoti riceve come parametro
     * @param appoint verifica se ci sono dei campi vuoti 
     */
    public void verificaCampivuoti(Dataappuntamento appoint){
    if(appoint.getCfpaziente().isEmpty() || appoint.getTrattamento().isEmpty() || appoint.getDataappuntamento().isEmpty() || appoint.getOrario().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    }
    
    /**
     * 
     * @param appoint data in cui si è fissato l'appuntamento
     * @param cf codice fiscale del paziente
     * @param treatment trattamento che vuole eseguire
     * @param username del dentista in questione
     */
    public void registerappointment(Dataappuntamento appoint,String cf,String treatment,String username){
    
    rs1=appointment.cercacfTrattamento(cf,treatment,username);
        try {
            if(rs1.next()){
                  appointment.insertappuntamento(appoint);
              
                }

            else{
              JOptionPane.showMessageDialog(null, "CF O TRATTAMENTO SBAGLIATO");
            }
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
    }
     
    /**
     *  
     * @param appoint data dell'appuntamento
     * @param ID creato dal sistema dell'appuntamento
     * @param cf codice fiscale del paziente
     * @param treatment trattamento scelto dal paziente
     * @param username del dentista in questione
     */
    
    public void modifyappointment(Dataappuntamento appoint,String ID,String cf,String treatment,String username)
    {
 rs1=appointment.cercacfTrattamento(cf,treatment,username);
        try {
            if(rs1.next()){
                  appointment.modificappuntamento(appoint, ID);
              
                }

            else{
              JOptionPane.showMessageDialog(null, "CF O TRATTAMENTO SBAGLIATO");
            }
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
   
   
    
    }
     
    /**
     *   
     * @param ID dell'appuntamento necessario per cancellarlo
     */
    
    public void cancelappointment(String ID){
        if(ID.isEmpty()){
               JOptionPane.showMessageDialog(null, "CAMPO ID VUOTO");
        }
        else{
    appointment.cancellappuntamento(ID);
           }
        }
      
    /**
     * 
     * @param ID dell'appuntamento
     * @param username del dentista in questione
     * @return ricercaappuntamento. riferimento che punta all'oggetto di tipo
     * Dataappuntamento che contiene i dati trovati nel database rispetto all'ID dell'appuntamento,
     * al metodo  assegnaAscoltatoriAppuntamento della classe
     * @see it.unipv.controller.Controllerappuntamento
     */
    public Dataappuntamento researchappointment(String ID,String username)
    {
    return appointment.ricercaappuntamento(ID,username);
    }
    
    /**
     * 
     * @param username del dentista da usare per selezionari i dati
     * degli appuntamenti
     * @return Resultset che sono le tuple trovate al metodo 
     * assegnaAscoltatoriAppuntamento della classe
     * @see it.unipv.controller.Controllerappuntamento
     */
    public ResultSet getappointment(String username){
    return appointment.gettableappuntamento(username);
    }
    
}