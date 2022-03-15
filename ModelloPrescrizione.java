
package it.unipv.model;

import it.unipv.DAO.ObjectPrescrizione;
import it.unipv.JAVABEAN.Dataprescrizione;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * La classe ModelloPrescrizioni e' la classe
 * che gestisce tutta la buisness logic legato
 *alla parte della prescrizione del software
 *e ha i metodi
 *@see verificaCampivuoti
 *@see registerprescription
 *@see modifyprescription
 *@see cancelprescription
 *@see researchprescription
 *@see getprescription
 */
public class ModelloPrescrizione {
        ObjectPrescrizione prescription;
        private ResultSet rs1;
        
        /**
         * Costruttore della classe ModelloPrescrizione che istanzia
         * un oggetto di default della classe
         * @see it.unipv.DAO.ObjectPrescrizione
         */
    public ModelloPrescrizione() {
        prescription = new ObjectPrescrizione();
    }
    
    /**
     * 
     * @param presc di tipo Dataprescrizione per verificare se i campi della view della prescrizione sono vuoti
     */
     public void verificaCampivuoti(Dataprescrizione presc){
    if(presc.getCfpaziente().isEmpty() || presc.getNometrattamento().isEmpty() || presc.getDataprescrizione().isEmpty() || presc.getNomeprescrizione().isEmpty() || presc.getQuantita().isEmpty())
    {
    JOptionPane.showMessageDialog(null, "PRESENZA DI CAMPI VUOTI");
    }
    }
    
    /**
     * Va a registrare i dati della prescrizione inseriti dalla view in caso di assenza di campi vuoti
     * @param presc di tipo  Dataprescrizione che fa riferimento all'oggetto che contiene i data inseriti dalla view non vuoti
     * @param cf del paziente  
     * @param treatment del trattamento della prescrizione
     * @param username del dentista per identificare la prescrizione fornito dal dentista
     */
    public void registerprescription(Dataprescrizione presc,String cf,String treatment,String username){
         rs1=prescription.cercacfTrattamento(cf,treatment,username);
        try {
            if(rs1.next()){
                  prescription.insertprescription(presc);
                  
                }

            else{
              JOptionPane.showMessageDialog(null, "CF O TRATTAMENTO SBAGLIATO");
            }
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
  
    }
    
    /**
     * Va a modificare i dati della prescrizione inseriti dalla view in caso di assenza di campi vuoti
     * @param presc di tipo  Dataprescrizione che fa riferimento all'oggetto che contiene i data con cui
     * vogliamo fare la modifica, inseriti dalla view non vuoti
     * @param ID della prescrizione da modificare
     * @param cf del paziente per verificare la sua esistenza
     * @param treatment della prescrizione
     * @param username del dentista
     */
    public void modifyprescription(Dataprescrizione presc,String ID,String cf,String treatment,String username)
    {
    	//cerca se il cf e il trattamento inseriti esistono nel database
  rs1=prescription.cercacfTrattamento(cf,treatment,username);
        try {
            if(rs1.next()){
               prescription.modificaprescrizione(presc, ID);
                  
                }

            else{
              JOptionPane.showMessageDialog(null, "CF O TRATTAMENTO SBAGLIATO");
            }
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }

     
      
    }
    
    /**
     * Va a cancellare i dati della prescrizione rispetto al parametro
     * @param ID della prescrizione da cancella nel database
     */
    public void cancelprescription(String ID){
        if(ID.isEmpty()){
               JOptionPane.showMessageDialog(null, "CAMPO ID VUOTO");
        }
        else{
    prescription.cancellaprescrizione(ID);
           }
        }
    
    /**
     * Va a ricercare i dati della prescrizione risperto a id
     * @param ID della prescrizione da ricercare
     * @param username del dentista
     * @return riferimento che punta a l'oggetto di tipo Dataprescrizione che contiene 
     * i data trovati ne database rispetto al ID della prescrizione,al metodo  assegnaAscoltatoriPrescrizioni della classe
     * @see it.unipv.controller.Controllerprescrizioni
     */
    public Dataprescrizione researchprescription(String ID,String username)
    {
    return prescription.ricercaprescrizione(ID, username);
    }
    /**
     * va a ricercare le tuple nella tabella Prescrizione nel data base che ha username pari al parametro
     * @param username del dentista da usare per selezionare i dati delle prescrizioni 
     * fornito dal dentista
     * @return Resultset che sono le tuple trovate al metodo  assegnaAscoltatoriPrescrizioni della classe
     * @see it.unipv.controller.Controllerprescrizioni
     */
    public ResultSet getprescription(String username){
    return prescription.gettableprescrizione(username);
    }
    
    
    
}
