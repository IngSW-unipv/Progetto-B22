package it.unipv.controller;
import it.unipv.model.ModelloRegistrazione;
import it.unipv.view.Registrazionefrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Controllerregistrazione è il controllore che gestisce la registrazione
 * @see it.unipv.view.Registrazionefrm
 * e il modello 
 * @see it.unipv.model.ModelloRegistrazione
 *
 */

public class Controllerregistrazione {
private ModelloRegistrazione modelregistration;
private Registrazionefrm viewregistration;
ResultSet result;

/**
 * Costruttore di Controllerregistrazione che riceve i riferimenti
 * della view e della model della registrazione
 * @see it.unipv.MainRegistrazione
 * @param modelregistration che riceve il riferimento del modello della registrazione
 * @param viewregistration che riceve il riferimento della view della registrazione
 * e possiede il metodo
 * @see assegnaAscoltatoriRegistrazionefrm
 */


    public Controllerregistrazione(ModelloRegistrazione modelregistration, Registrazionefrm viewregistration) {
        this.modelregistration = modelregistration;
        this.viewregistration = viewregistration;
         assegnaAscoltatoriRegistrazionefrm();

    }

    /**
     * assegnaAscoltatoriRegistrazionefrm assoccia degli ascoltatori ai JButton 
     * della view della registrazione
     */
    
    private void assegnaAscoltatoriRegistrazionefrm() {
        
    	/**
    	 * Associa un ascoltatore alla Buttonconfermaregistrazione restituito dal metodo getButtonconfermaregistrazione della classe
    	 * @see it.unipv.view.Registrazionefrm
    	 * e poi chiama i metodi pubblici cercanomeutente, RegisterDentist del modello
    	 * @see it.unipv.model.ModelloRegistrazione
    	 * e i metodi getusername(), getdatiregistrazionefrm(), e azzeracampi()
    	 * @see it.unipv.view.Registrazionefrm
    	 * 
    	 */
    	
    	viewregistration.getButtonconfermaregistrazione().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               result= modelregistration.cercanomeutente(viewregistration.getusername());
                try {
                    if(result.next()){
                        JOptionPane.showMessageDialog(null, "USERNAME GIA' USATO,CAMBI IL USERNAME");
                    }
                    else{
                         modelregistration.RegisterDentist(viewregistration.getdatiregistrazionefrm());
                        viewregistration.azzeracampi();
                       
                        }
                     } catch (Exception ex) {
                     ex.printStackTrace();
          
                       }
            }
        });
        
    	/**
     	 * Associa un ascoltatore alla Buttontornaindietro restituito dal metodo getButtontornaindietro della classe
     	 * @see it.unipv.view.Registrazionsefrm
     	 * e poi rende la view non visibile
     	 */
    	
        viewregistration.getButtontornaindietro().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewregistration.setVisible(false);
                   // JOptionPane.showMessageDialog(null, "TORNA INDIETRO");
            }
        });
    }

    
}