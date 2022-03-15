package it.unipv.controller;

import it.unipv.model.ModelloTrattamento;

import it.unipv.view.Gestionetrattamentofrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 * Controllertrattamento e' il controllore che gestisce la view
 * @see it.unipv.view.Gestionetrattamentofrm 
 * e il modello 
 * @see it.unipv.model.ModelloTrattamento 
 *
 */


public class Controllertrattamento {
      private ModelloTrattamento modellotrattamento;
     private Gestionetrattamentofrm viewtrattamento;
     /**
      * Costruttore di Controllerpaziente che riceve i riferimenti della view e della model del trattamento
      * @see it.unipv.MainTrattamento
      * @param modellotrattamento che riceve il riferimento del modello del trattamento
      * @param viewtrattamento  che riceve il riferimento della view del trattamento
      * e possiede il metodo
      * @see assegnaAscoltatoriTrattamento
      */
    public Controllertrattamento(ModelloTrattamento modellotrattamento, Gestionetrattamentofrm viewtrattamento) {
        this.modellotrattamento = modellotrattamento;
        this.viewtrattamento = viewtrattamento;
        assegnaAscoltatoriTrattamento();
        stampatabella();
        
    }

    /**
     * assegnaAscoltatoriTrattamento assoccia degli ascoltatori ai JButton 
     * della view del trattamento
     */
    private void assegnaAscoltatoriTrattamento() {
       
         viewtrattamento.getButtonSalva().addActionListener(new ActionListener() {
            @Override
        	
        	/**
        	 * Associa un ascoltatore alla ButtonSalva restituito dal metodo getButtonSalva della classe
        	 * @see it.unipv.view.Gestionetrattamentofrm
        	 * e poi chiama il metodi publico registertreatment del modello
        	 * @see it.unipv.model.ModelloTrattamento
        	 * e i metodi getdatiGestionetrattamentofrm() e azzeracampi della classe
        	 * @see it.unipv.view.Gestionetrattamentofrm
        	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
        	 */
            public void actionPerformed(ActionEvent e) {
                    modellotrattamento.registertreatment(viewtrattamento.getdatiGestionetrattamentofrm());
                    viewtrattamento.azzeracampi();
                     stampatabella();
            }
        });
         /**
     	 * Associa un ascoltatore alla ButtonModifica restituito dal metodo getButtonModifica della classe
     	 * @see it.unipv.view.Gestionetrattamentofrm
     	 * e poi chiama il metodi publico modifytreatment del modello
     	 * @see it.unipv.model.ModelloTrattamento
     	 * e i metodi getdatiGestionetrattamentofrm() e azzeracampi della classe
     	 * @see it.unipv.view.Gestionetrattamentofrm
     	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
     	 */
         viewtrattamento.getButtonModifica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                     modellotrattamento.modifytreatment(viewtrattamento.getdatiGestionetrattamentofrm(),viewtrattamento.getID());
                     viewtrattamento.azzeracampi();
                      stampatabella();
            }
        });
         /**
      	 * Associa un ascoltatore alla ButtonCancella restituito dal metodo getButtonCancella della classe
      	 * @see it.unipv.view.Gestionetrattamentofrm
      	 * e poi chiama il metodi publico canceltreatment del modello
      	 * @see it.unipv.model.ModelloTrattamento
      	 * e i metodi getID e azzeracampi della classe
      	 * @see it.unipv.view.Gestionetrattamentofrm
      	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
      	 */
           viewtrattamento.getButtonCancella().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   modellotrattamento.canceltreatment(viewtrattamento.getID());
                viewtrattamento.azzeracampi();
                 stampatabella();
            }
        });
           /**
         	 * Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
         	 * @see it.unipv.view.Gestionetrattamentofrm
         	 * e poi rende la view non visibile
         	 */
         viewtrattamento.getButtonChiudi().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    viewtrattamento.setVisible(false);
            }
        });
         /**
        	 * Associa un ascoltatore alla ButtonSearch restituito dal metodo getButtonSearch della classe
        	 * @see it.unipv.view.Gestionetrattamentofrm
        	 * e poi chiama il metodi publico researchtreatment del modello (se ID non e' vuoto)
        	 * @see it.unipv.model.ModelloTrattamento
        	 * e i metodi getID e getusername e RiempiCampi della classe
        	 * @see it.unipv.view.Gestionetrattamentofrm
        	 * e aggiorna sulla view del paziente riempendo i rispettivi campi
        	 */
             viewtrattamento.getButtonSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                     if(viewtrattamento.getID().isEmpty())
                {
                     JOptionPane.showMessageDialog(null, "SEARCH ID VUOTO");

                }
                else{
                 viewtrattamento.RiempiCampi(modellotrattamento.researchtreatment(viewtrattamento.getID(),viewtrattamento.getusername()));
                }
                     stampatabella();
            }
        });
            
    }
    /**
     * stampa la tabella dei dati di tutti i trattamento del dentista d'interesse
     * invocanto i metodi stampatabellatrattamenti nella classe
     * @see it.unipv.model.ModelloTrattamento
     */
    private void stampatabella(){
       viewtrattamento.stampatabellatrattamento(modellotrattamento.gettreatment(viewtrattamento.getusername()));
    }
     
 }