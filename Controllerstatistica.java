package it.unipv.controller;

import it.unipv.model.ModelloStatistica;

import it.unipv.view.Statistica;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Controllerstatistica e' il controllore che gestisce la view
 * @see it.unipv.view.Statistica
 * e il modello 
 * @see it.unipv.model.ModelloStatistica
 * 
 *
 */


public class Controllerstatistica {
    
     private final ModelloStatistica modellostatistica;
     private final Statistica viewstatistica;
/**
 * Costruttore di Controllerstatistica che riceve i riferimenti della view e della model della statistica
 * @see it.unipv.MainStatistica
 * @param modellostatistica che riceve il riferimento del modello della statistica
 * @param viewstatistica  che riceve il riferimento della view della statistica
 */
    public Controllerstatistica(ModelloStatistica modellostatistica, Statistica viewstatistica) {
        this.modellostatistica = modellostatistica;
        this.viewstatistica = viewstatistica;
        assegnaAscoltatoriStatistica();
        fillstatistics();
    }
    /**
     *  assegnaAscoltatoriStatistica assoccia degli ascoltatori ai JButton 
     * della view della statistica
     */
    private void assegnaAscoltatoriStatistica() {
       /**
        *  
      	* Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
      	* @see it.unipv.view.Statistica
      	* e poi rende la view non visibile
      	*/
        
         viewstatistica.getButtonChiudi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  viewstatistica.setVisible(false);
            }
        });
       }
    /**
     * invoca il metodo RiempiCampi e getusername della classe 
     * @see it.unipv.view.Statistica 
     * e metodo getdatastatistics della classe
     * @see it.unipv.model.ModelloStatistica 
     */
      private void fillstatistics()
      {
      viewstatistica.RiempiCampi(modellostatistica.getdatastatistics(viewstatistica.getusername()));
      }
     
}