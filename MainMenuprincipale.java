
package it.unipv;

import it.unipv.controller.Controllermenuprincipale;
import it.unipv.controller.Controllerregistrazione;
import it.unipv.model.ModelloMenuprincipale;
import it.unipv.model.ModelloRegistrazione;
import it.unipv.view.Menuprincipale;
import it.unipv.view.Registrazionefrm;


/**
 * Classe Main per il menu principale
 * che contiene il metodo
 *  @see runMenuPrincipale
 */
public class MainMenuprincipale {
    
	 /**il metodo ci istanziano
	 *   il controller, view
	 * e il modello della parte dell'applicazione che gestisce 
	 * il menuprincipale e rende visibile la sua view .
	 * @param name che e' il nomeutente del dentista ricevuto nella classe del Controllerlogin
	 * quando schiaccio su login e abbiamo un evento di login con successo
	 * @see Menuprincipale
	 * @see ModelloMenuprincipale
	 * @see Controllermenuprincipale
	 * 
	 */ 
    
   
     public void runMenuPrincipale(String name) {
           ModelloMenuprincipale modelmenu = new ModelloMenuprincipale(name);
           Menuprincipale viewmenu = new Menuprincipale();
            Controllermenuprincipale  controllermenu = new  Controllermenuprincipale(modelmenu,viewmenu);
            viewmenu.setVisible(true);
           }
}
