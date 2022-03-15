package it.unipv.controller;

import it.unipv.model.ModelloAppuntamento;

import it.unipv.view.Gestioneappuntamentofrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 * Controllerappuntamento e' il controllore che gestisce la view
 * @see it.unipv.view.Gestioneappuntamentofrm
 * e il modello 
 * @see it.unipv.model.ModelloAppuntamento 
 * 
 *
 */


public class Controllerappuntamento {
    
     private ModelloAppuntamento modelloappuntamento;
     private Gestioneappuntamentofrm viewappuntamento;
/**
 * Costruttore di Controllerappuntamento che riceve i riferimenti della view e della model del appuntamento
 * @see it.unipv.MainAppuntamento
 * @param modelloappuntamento che riceve il riferimento del modello del appuntamento
 * @param viewappuntamento    che riceve il riferimento della view del appuntamento
 * e possiede il metodo @seeassegnaAscoltatoriAppuntamento
 */
    public Controllerappuntamento(ModelloAppuntamento modelloappuntamento, Gestioneappuntamentofrm viewappuntamento) {
        this.modelloappuntamento = modelloappuntamento;
        this.viewappuntamento = viewappuntamento;
        assegnaAscoltatoriAppuntamento();
        stampatabella();
    }
    /**
     * assegnaAscoltatoriAppuntamento assoccia degli ascoltatori ai JButton 
     * della view dell'appuntamento
     */
    private void assegnaAscoltatoriAppuntamento() {
    	  /**
    	 * Associa un ascoltatore alla ButtonSalva restituito dal metodo getButtonSalva della classe
    	 * @see it.unipv.view.Gestionepappuntamentofrm
    	 * e poi chiama il metodi publico registerappointment del modello
    	 * @see it.unipv.model.ModelloAppuntamento
    	 * e i metodi getdatiGestioneappuntamentofrm() e azzeracampi della classe
    	 * @see it.unipv.view.Gestioneappuntamentofrm
    	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
    	 */
          viewappuntamento.getButtonSalva().addActionListener(new ActionListener() {
            @Override
          
            public void actionPerformed(ActionEvent e) {
                    modelloappuntamento.verificaCampivuoti(viewappuntamento.getdatiGestioneappuntamentofrm());
                    modelloappuntamento.registerappointment(viewappuntamento.getdatiGestioneappuntamentofrm(),viewappuntamento.getCF(),viewappuntamento.getTrattamento(),viewappuntamento.getusername());
                    viewappuntamento.azzeracampi();
                    stampatabella();
            }
        });
        
         viewappuntamento.getButtonModifica().addActionListener(new ActionListener() {
            @Override
            
            /**
        	 * Associa un ascoltatore alla ButtonModifica restituito dal metodo getButtonModifica della classe
        	 * @see it.unipv.view.Gestioneappuntamentofrm
        	 * e poi chiama il metodi publico modifyappointment del modello
        	 * @see it.unipv.model.ModelloAppuntamento
        	 * e i metodi getdatiGestioneappuntamentofrm() e azzeracampi della classe
        	 * @see it.unipv.view.Gestioneappuntamentofrm
        	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
        	 */
            public void actionPerformed(ActionEvent e) {
                  modelloappuntamento.verificaCampivuoti(viewappuntamento.getdatiGestioneappuntamentofrm());
                  modelloappuntamento.modifyappointment(viewappuntamento.getdatiGestioneappuntamentofrm(),viewappuntamento.getID(),viewappuntamento.getCF(),viewappuntamento.getTrattamento(),viewappuntamento.getusername());
                 viewappuntamento.azzeracampi();
                stampatabella();
            }
        });
         /**
      	 * Associa un ascoltatore alla ButtonCancella restituito dal metodo getButtonCancella della classe
      	 * @see it.unipv.view.Gestioneappuntamentofrm
      	 * e poi chiama il metodi publico cancelappointment del modello
      	 * @see it.unipv.model.ModelloAppuntamento
      	 * e i metodi getID e azzeracampi della classe
      	 * @see it.unipv.view.Gestioneappuntamentofrm
      	 * e aggiorna sulla view le informazioni diposte nella tabella invocando il metodo stampatabella
      	 */
           viewappuntamento.getButtonCancella().addActionListener(new ActionListener() {
            @Override
          
            public void actionPerformed(ActionEvent e) {
                    modelloappuntamento.cancelappointment(viewappuntamento.getID());
                     viewappuntamento.azzeracampi();
                    stampatabella();
            }
        });
           /**
         	 * Associa un ascoltatore alla ButtonChiudi restituito dal metodo getButtonChiudi della classe
         	 * @see it.unipv.view.Gestioneappuntamentofrm
         	 * e poi rende la view non visibile
         	 */
           viewappuntamento.getButtonChiudi().addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                    viewappuntamento.setVisible(false);
            }
        });
           /**
          	 * Associa un ascoltatore alla ButtonSearch restituito dal metodo getButtonSearch della classe
          	 * @see it.unipv.view.Gestioneappuntamentofrm
          	 * e poi chiama il metodi publico researchappointment del modello (se ID non e' vuoto)
          	 * @see it.unipv.model.ModelloAppuntamento
          	 * e i metodi getID e getusername e RiempiCampi della classe
          	 * @see it.unipv.view.Gestioneappuntamentofrm
          	 * e aggiorna sulla view del paziente riempendo i rispettivi campi
          	 */
             viewappuntamento.getButtonSearch().addActionListener(new ActionListener() {
            @Override
           
            public void actionPerformed(ActionEvent e) {
                  if(viewappuntamento.getID().isEmpty())
                {
                     JOptionPane.showMessageDialog(null, "SEARCH ID VUOTO");

                }
                else{
                 viewappuntamento.RiempiCampi(modelloappuntamento.researchappointment(viewappuntamento.getID(),viewappuntamento.getusername()));
                }
            }
        });
    }
    /**
     * stampa la tabella dei dati di tutti gli appuntamenti  del dentista d'interesse
     * invocanto i metodi stampatabellaappuntamento z nella classe
     * @see it.unipv.model.ModelloAppuntamento
     */
      public void stampatabella() {
        viewappuntamento.stampatabellaappuntamento(modelloappuntamento.getappointment( viewappuntamento.getusername()));
   } 
}