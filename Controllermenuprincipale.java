package it.unipv.controller;

import it.unipv.MainAppuntamento;

import it.unipv.MainFatturazione;
import it.unipv.MainPaziente;
import it.unipv.MainPrescrizioni;
import it.unipv.MainStatistica;
import it.unipv.MainTrattamento;
import it.unipv.model.ModelloMenuprincipale;
import it.unipv.view.Menuprincipale;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 * Controllermenuprincipale e' il controllore che gestisce la view
 * @see it.unipv.view.Menuprincipale
 * e il modello 
 * @see it.unipv.model.ModelloMenuprincipale
 *
 */

public class Controllermenuprincipale {
     private ModelloMenuprincipale modelmenu;
     private Menuprincipale viewmenu;
     
     //variabili per chiamare le altre form rispetto alla scelta
     
     MainPaziente patient;
     MainAppuntamento appointment;
     MainTrattamento treatment;
     MainPrescrizioni prescription;
     MainStatistica statistic;
     MainFatturazione fattura;
     /**
      * Costruttore di Controllermenuprincipale che riceve i riferimenti della view e della model del menu principale
      * @see it.unipv.MainMenuprincipale
      * @param modelmenu che riceve il riferimento del modello del menu principale
      * @param viewmenu  che riceve il riferimento della view del menu principale
      * e possiede il metodo
      */
    public Controllermenuprincipale(ModelloMenuprincipale modelmenu, Menuprincipale viewmenu) {
        this.modelmenu = modelmenu;
        this.viewmenu = viewmenu;
        patient = new   MainPaziente();
        appointment= new MainAppuntamento();
        treatment = new MainTrattamento();
        prescription = new MainPrescrizioni();
        statistic= new  MainStatistica();
        fattura= new MainFatturazione();
        assegnaAscoltatoreMenuprincipale();
    }
    /**
     * assegnaAscoltatoriMenuprincipale assoccia degli ascoltatori ai JButton 
     * della view del menu principale
     */
    private void assegnaAscoltatoreMenuprincipale() {
       viewmenu.getButtongestionepaziente().addActionListener(new ActionListener() {
            @Override
            /**
        	 * Associa un ascoltatore alla Buttongestionepaziente restituito dal metodo getButtongestionepaziente della classe
        	 * @see it.unipv.view.Menuprincipalefrm
        	 * e poi chiama il metodi publico runMenuprincipale della classe
        	 * @see it.unipv.MainPaziente
        	 */
            public void actionPerformed(ActionEvent e) {
                    patient.runMenuPaziente(modelmenu.getUsername());
            }
        });
       /**
   	 * Associa un ascoltatore alla Buttongestioappuntamenti restituito dal metodo getButtonappuntamenti della classe
   	 * @see it.unipv.view.Menuprincipalefrm
   	 * e poi chiama il metodi publico runMenuprincipale della classe
   	 * @see it.unipv.MainAppuntamento
   	 */
        viewmenu.getButtongestioneappuntamenti().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   appointment.runAppuntamento(modelmenu.getUsername());
            }
        });
        /**
    	 * Associa un ascoltatore alla Buttongestionetrattamento restituito dal metodo getButtontrattamento della classe
    	 * @see it.unipv.view.Menuprincipalefrm
    	 * e poi chiama il metodi publico runMenuprincipale della classe
    	 * @see it.unipv.MainTrattamento
    	 */
         viewmenu.getButtongestionetrattamenti().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   treatment.runTrattamento(modelmenu.getUsername());
            }
        });
         /**
     	 * Associa un ascoltatore alla Buttongestioneprescrizione restituito dal metodo getButtongestioneprescrizione della classe
     	 * @see it.unipv.view.Menuprincipalefrm
     	 * e poi chiama il metodi publico runMenuprincipale della classe
     	 * @see it.unipv.MainPrescrizione
     	 */
          viewmenu.getButtongestioneprescrizioni().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    prescription.runPrescrizione(modelmenu.getUsername());
            }
        });
         
          /**
      	 * Associa un ascoltatore alla Buttongestionefattura restituito dal metodo getButtongestionefattura della classe
      	 * @see it.unipv.view.Menuprincipalefrm
      	 * e poi chiama il metodi publico runMenuprincipale della classe
      	 * @see it.unipv.MainFatturazione
      	 */
           viewmenu.getButtongestionefattura().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    fattura.runFatturazione(modelmenu.getUsername());
            }
        });
          /**
       	 * Associa un ascoltatore alla Buttongestionestatistica restituito dal metodo getButtongestionestatistica della classe
       	 * @see it.unipv.view.Menuprincipalefrm
       	 * e poi chiama il metodi publico runMenuprincipale della classe
       	 * @see it.unipv.MainStatistica
       	 */
            viewmenu.getButtongestionestatistica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    statistic.runStatistica(modelmenu.getUsername());
            }
        });
            /**
        	 * Associa un ascoltatore alla Buttontornaindietro restituito dal metodo getButtontornaindietro della classe
        	 * @see it.unipv.view.Menuprincipalefrm
        	 * e poi chiama il metodi publico runMenuprincipale della classe
        	 * @see it.unipv.controller.ControllerMenuprincipale e torna a la schermata di prima
        	 */
             viewmenu.getButtontornaindietro1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    viewmenu.setVisible(false);
            }
        });
         
         
    }
     
     
}