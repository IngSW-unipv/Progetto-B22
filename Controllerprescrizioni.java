package it.unipv.controller;

import it.unipv.model.ModelloPrescrizione;
import it.unipv.view.Gestioneprescrizionefrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 * Controllerprescrizioni è il controllore che gestisce la view
 * @see it.unipv.view.Gestioneprescrizionefrm 
 * e il modello 
 * @see it.unipv.model.ModelloPrescrizione
 *
 */

public class Controllerprescrizioni {
    private ModelloPrescrizione modelloprescrizione;
    private Gestioneprescrizionefrm viewprescrizione;

    /**
     * Costruttore di Controllerprescrizioni che riceve i riferimenti
     * della view e della model del paziente
     * @see it.unipv.MainPrescrizioni
     * @param modelloprescrizione che riceve il riferimento del modello della prescrizione
     * @param viewprescrizione che riceve il riferimento della view del paziente
     * e possiede il metodo
     * @see assegnaAscoltatoriPrescrizioni
     */
    public Controllerprescrizioni(ModelloPrescrizione modelloprescrizione, Gestioneprescrizionefrm viewprescrizione) {
        this.modelloprescrizione = modelloprescrizione;
        this.viewprescrizione = viewprescrizione;
        assegnaAscoltatoriPrescrizioni();
        stampatabella();
    }

    /**
     * assegnaAscoltatoriPrescrizioni assoccia degli ascoltatori ai JButton 
     * della view della prescrizione
     */
    private void assegnaAscoltatoriPrescrizioni() {
    	
    	/**
    	 * Associa un ascoltatore alla ButtonSalva restituito dal metodo getButtonSalva della classe
    	 * @see it.unipv.view.Gestioneprescrizionefrm
    	 * e poi chiama il metodi publico registerprescription del modello
    	 * @see it.unipv.model.ModelloPrescrizione
    	 * e i metodi getdatiGestioneprescrizionefrm() e azzeracampi della classe
    	 * @see it.unipv.view.Gestioneprescrizionefrm
    	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
    	 */
    	viewprescrizione.getButtonSalva().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    modelloprescrizione.verificaCampivuoti(viewprescrizione.getdatiGestioneprescrizionefrm());
                    modelloprescrizione.registerprescription(viewprescrizione.getdatiGestioneprescrizionefrm(),viewprescrizione.getCF(),viewprescrizione.getTrattamento(),viewprescrizione.getusername());
                    viewprescrizione.azzeracampi();
                     stampatabella();
            }
        });
        
    	 /**
    	 * Associa un ascoltatore alla ButtonModifica restituito dal metodo getButtonModifica della classe
    	 * @see it.unipv.view.Gestioneprescrizionefrm
    	 * e poi chiama il metodi publico modifyprescription del modello
    	 * @see it.unipv.model.ModelloPrescrizione
    	 * e i metodi getdatiGestioneprescrizionefrm() e azzeracampi della classe
    	 * @see it.unipv.view.Gestioneprescrizionefrm
    	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
    	 */
    	
         viewprescrizione.getButtonModifica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    modelloprescrizione.verificaCampivuoti(viewprescrizione.getdatiGestioneprescrizionefrm());
                    modelloprescrizione.modifyprescription(viewprescrizione.getdatiGestioneprescrizionefrm(),viewprescrizione.getID(),viewprescrizione.getCF(),viewprescrizione.getTrattamento(),viewprescrizione.getusername());
                viewprescrizione.azzeracampi();
                 stampatabella();
            }
        });
         
         /**
      	 * Associa un ascoltatore alla ButtonCancella restituito dal metodo getButtonCancella della classe
      	 * @see it.unipv.view.Gestioneprescrizionefrm
      	 * e poi chiama il metodi publico cancelprescription del modello
      	 * @see it.unipv.model.ModelloPrescrizione
      	 * e i metodi getID e azzeracampi della classe
      	 * @see it.unipv.view.Gestioneprescrizionefrm
      	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
      	 */
         
           viewprescrizione.getButtonCancella().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                     modelloprescrizione.cancelprescription(viewprescrizione.getID());
                      viewprescrizione.azzeracampi();
                      stampatabella();
            }
        });
          
           /**
         	 * Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
         	 * @see it.unipv.view.Gestioneprescrizionefrm
         	 * e poi rende la view non visibile
         	 */
              
           
           viewprescrizione.getButtonChiudi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   viewprescrizione.setVisible(false);
            }
        });
           
           /**
          	 * Associa un ascoltatore alla ButtonSearch restituito dal metodo getButtonSearch della classe
          	 * @see it.unipv.view.Gestioneprescrizionefrm
          	 * e poi chiama il metodi publico researchprescription del modello (se ID non e' vuoto)
          	 * @see it.unipv.model.ModelloPrescrizione
          	 * e i metodi getID e getusername e RiempiCampi della classe
          	 * @see it.unipv.view.Gestioneprescrizionefrm
          	 * e aggiorna sulla view della prescrizione riempendo i rispettivi campi
          	 */
           
           viewprescrizione.getButtonSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(viewprescrizione.getID().isEmpty())
                {
                     JOptionPane.showMessageDialog(null, "SEARCH ID VUOTO");

                }
                else{
                 viewprescrizione.RiempiCampi(modelloprescrizione.researchprescription(viewprescrizione.getID(),viewprescrizione.getusername()));
                }
                     stampatabella();
            }
        });
    }
     
    /**
     * stampa la tabella dei dati di tutte le prescrizione del dentista d'interesse
     * invocanto i metodi stampatabellapaziente nella classe
     * @see it.unipv.model.ModelloPrescrizione
     */
    
     public void stampatabella() {
        viewprescrizione.stampatabellapaziente(modelloprescrizione.getprescription( viewprescrizione.getusername()));
   } 
}