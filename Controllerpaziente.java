
package it.unipv.controller;

import it.unipv.model.ModelloPaziente;
import it.unipv.view.Gestionepazientefrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 * Controllerpaziente e' il controllore che gestisce la view
 * @see it.unipv.view.Gestionepazientefrm 
 * e il modello 
 * @see it.unipv.model.ModelloPaziente 
 *
 */
public class Controllerpaziente {
//variabile che riceveranno la model e la view della parte del software che gestisce il paziente
//	e serviranno  per invocare tutti i metodi pubblici nella view e nel modello del paziente
	private ModelloPaziente modelpaziente;
     private Gestionepazientefrm viewpaziente;
/**
 * Costruttore di Controllerpaziente che riceve i riferimenti della view e della model del paziente
 * @see it.unipv.MainPaziente 
 * @param modelpaziente che riceve il riferimento del modello del paziente
 * @param viewpaziente  che riceve il riferimento della view del paziente
 * e possiede il metodo
 * @see assegnaAscoltatoriPaziente
 */
    public Controllerpaziente(ModelloPaziente modelpaziente, Gestionepazientefrm viewpaziente) {
        this.modelpaziente = modelpaziente;
        this.viewpaziente = viewpaziente;
        assegnaAscoltatoriPaziente();
        stampatabella();
    }

    /**
     * assegnaAscoltatoriPaziente assoccia degli ascoltatori ai JButton 
     * della view del paziente
     */
    private void assegnaAscoltatoriPaziente() {
  
    	
    	/**
    	 * Associa un ascoltatore alla ButtonSalva restituito dal metodo getButtonSalva della classe
    	 * @see it.unipv.view.Gestionepazientefrm
    	 * e poi chiama il metodi publico registerpatient del modello
    	 * @see it.unipv.model.ModelloPaziente
    	 * e i metodi getdatiGestionepazientefrm() e azzeracampi della classe
    	 * @see it.unipv.view.Gestionepazientefrm
    	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
    	 */
        viewpaziente.getButtonSalva().addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                    modelpaziente.registerpatient(viewpaziente.getdatiGestionepazientefrm());
                    viewpaziente.azzeracampi();
                    stampatabella();
            }
        });
        
        
        /**
    	 * Associa un ascoltatore alla ButtonModifica restituito dal metodo getButtonModifica della classe
    	 * @see it.unipv.view.Gestionepazientefrm
    	 * e poi chiama il metodi publico modifypatient del modello
    	 * @see it.unipv.model.ModelloPaziente
    	 * e i metodi getdatiGestionepazientefrm() e azzeracampi della classe
    	 * @see it.unipv.view.Gestionepazientefrm
    	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
    	 */
         viewpaziente.getButtonModifica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelpaziente.modifypatient(viewpaziente.getdatiGestionepazientefrm(),viewpaziente.getID());
                viewpaziente.azzeracampi();
                stampatabella();
                }
        });
         
         /**
     	 * Associa un ascoltatore alla ButtonCancella restituito dal metodo getButtonCancella della classe
     	 * @see it.unipv.view.Gestionepazientefrm
     	 * e poi chiama il metodi publico cancelpatient del modello
     	 * @see it.unipv.model.ModelloPaziente
     	 * e i metodi getID e azzeracampi della classe
     	 * @see it.unipv.view.Gestionepazientefrm
     	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
     	 */
          viewpaziente.getButtonCancella().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    modelpaziente.cancelpatient(viewpaziente.getID());
                    viewpaziente.azzeracampi();
                    stampatabella();
            }
        });
           
         /**
      	 * Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
      	 * @see it.unipv.view.Gestionepazientefrm
      	 * e poi rende la view non visibile
      	 */
           viewpaziente.getButtonChiudi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    viewpaziente.setVisible(false);
            }
        });
           
         /**
       	 * Associa un ascoltatore alla ButtonSearch restituito dal metodo getButtonSearch della classe
       	 * @see it.unipv.view.Gestionepazientefrm
       	 * e poi chiama il metodi publico researchpatient del modello (se ID non e' vuoto)
       	 * @see it.unipv.model.ModelloPaziente
       	 * e i metodi getID e getusername e RiempiCampi della classe
       	 * @see it.unipv.view.Gestionepazientefrm
       	 * e aggiorna sulla view del paziente riempendo i rispettivi campi
       	 */
            viewpaziente.getButtonSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(viewpaziente.getID().isEmpty())
                {
                     JOptionPane.showMessageDialog(null, "SEARCH ID VUOTO");

                }
                else{
                 viewpaziente.RiempiCampi(modelpaziente.researchpatient(viewpaziente.getID(),viewpaziente.getusername()));
                }
            }
        });
    }
    /**
     * stampa la tabella dei dati di tutti i paziente del dentista d'interesse
     * invocanto i metodi stampatabellapaziente nella classe
     * @see it.unipv.model.ModelloPaziente
     */
    public void stampatabella() {
       viewpaziente.stampatabellapaziente(modelpaziente.getpatients(viewpaziente.getusername()));
   }
     
    
   
}
