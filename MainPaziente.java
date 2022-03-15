
package it.unipv;

import it.unipv.controller.Controllermenuprincipale;
import it.unipv.controller.Controllerpaziente;
import it.unipv.model.ModelloMenuprincipale;
import it.unipv.model.ModelloPaziente;
import it.unipv.view.Gestionepazientefrm;
import it.unipv.view.Menuprincipale;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see runMenuPaziente
 */
public class MainPaziente {
	
	 /**il metodo ci istanziano
		 *   il controller, view
		 * e il modello della parte dell'applicazione che gestisce 
		 * il paziente e rende visibile la sua view .
		 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllermenuprincipale
		 * quando schiaccio sulla button del paziente dal menu principale.
		 * @see Gestionepazientefrm
		 * @see ModelloPaziente
		 * @see Controllerpaziente
		 * 
		 */ 
   public void runMenuPaziente(String username) {
           ModelloPaziente modelpaziente = new ModelloPaziente();
           Gestionepazientefrm viewpaziente = new Gestionepazientefrm(username);
           Controllerpaziente  controllerpatient = new  Controllerpaziente(modelpaziente,viewpaziente);
            viewpaziente.setVisible(true);
           }  
}
