
package it.unipv;

import it.unipv.controller.Controllerprescrizioni;
import it.unipv.controller.Controllerstatistica;
import it.unipv.model.ModelloPrescrizione;
import it.unipv.model.ModelloStatistica;
import it.unipv.view.Gestioneprescrizionefrm;
import it.unipv.view.Statistica;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see  runStatistica
 */
public class MainStatistica {
	
	 /**il metodo ci istanziano
	 *   il controller, view
	 * e il modello della parte dell'applicazione che gestisce 
	 * la statistica e rende visibile la sua view .
	 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllerappuntamento
	 * quando schiaccio sulla button della statistica dal menu principale.
	 * @see Statistica
	 * @see ModelloStatistica
	 * @see Controllerstatistica
	 * 
	 */ 
     public void runStatistica(String username) {
           ModelloStatistica modellostatistica = new ModelloStatistica();
           Statistica viewstatistica = new Statistica(username);
           Controllerstatistica  controllerstatisca = new  Controllerstatistica(modellostatistica,viewstatistica);
            viewstatistica.setVisible(true);
           }
}
