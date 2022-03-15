package it.unipv.controller;

import it.unipv.model.ModelloFatturazione;
import it.unipv.view.GestioneFattura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Controllerfatturazione è il controllore che gestisce la fatturazione
 * @see it.unipv.view.GestioneFattura 
 * e il modello 
 * @see it.unipv.model.ModelloFatturazione
 *
 */

public class Controllerfatturazione {
     private ModelloFatturazione modellofatturazione;
     private GestioneFattura viewfatturazione;
     
     /**
      * Costruttore di Controllerfatturazione che riceve i riferimenti
      * della view e della model della fatturazione
      * @see it.unipv.MainFatturazione
      * @param modellofatturazione che riceve il riferimento del modello della fatturazione
      * @param viewfatturazione che riceve il riferimento della view della fatturazione
      * e possiede il metodo
      * @see assegnaAscoltatoriFatturazione
      */

    public Controllerfatturazione(ModelloFatturazione modellofatturazione, GestioneFattura viewfatturazione) {
        this.modellofatturazione = modellofatturazione;
        this.viewfatturazione = viewfatturazione;
        assegnaAscoltatoriFatturazione();
        gettablefatturazione();
    }

    /**
     * assegnaAscoltatoriFatturazione assoccia degli ascoltatori ai JButton 
     * della view della fatturazione
     */
    
    private void assegnaAscoltatoriFatturazione() {
        
    	/**
    	 * Associa un ascoltatore alla ButtonStampa restituito dal metodo getButtonStampa della classe
    	 * @see it.unipv.view.GestioneFattura
    	 * e invoca i metodi stamapa e azzeracampi da
    	 * @see it.unipv.view.GestioneFattura
    	 * 
    	 */
    	
            viewfatturazione.getButtonStampa().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    viewfatturazione.stampa();
                    viewfatturazione.azzeracampi();
            }
        });
            
            /**
         	 * Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
         	 * @see it.unipv.view.GestioneFattura
         	 * e poi rende la view non visibile
         	 */
            
            viewfatturazione.getButtonChiudi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    viewfatturazione.setVisible(false);
            }
        });
                
        }
     
    /**
     * stampa la tabella dei dati di tutte le prescrizione del dentista d'interesse
     * invocanto i metodi stampatabellafattura nella classe
     * @see it.unipv.model.ModelloFatturazione
     * e metodo getdatitrattamento
     * @see it.unipv.model.ModelloFatturazione
     * e metodo getusername
     * @see it.unipv.view.GestioneFattura
     */
    
   private void  gettablefatturazione(){
     viewfatturazione.stampatabellafattura(modellofatturazione.getdatitrattamento( viewfatturazione.getusername()));
   }
}