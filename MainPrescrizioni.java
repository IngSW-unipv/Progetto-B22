
package it.unipv;

import it.unipv.controller.Controllerprescrizioni;
import it.unipv.controller.Controllertrattamento;
import it.unipv.model.ModelloPrescrizione;
import it.unipv.model.ModelloTrattamento;
import it.unipv.view.Gestioneprescrizionefrm;
import it.unipv.view.Gestionetrattamentofrm;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see runPrescrizione
 */
public class MainPrescrizioni {
	
	 /**il metodo ci istanziano
	 *   il controller, view
	 * e il modello della parte dell'applicazione che gestisce 
	 * la prescrizione e rende visibile la sua view .
	 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllerappuntamento
	 * quando schiaccio sulla button della prescrizione dal menu principale.
	 * @see Gestioneprescrizionefrm
	 * @see ModelloPrescrizione
	 * @see Controllerprescrizioni
	 * 
	 */ 
      public void runPrescrizione(String username) {
            ModelloPrescrizione modelloprescrizione = new ModelloPrescrizione();
            Gestioneprescrizionefrm viewprescrizione = new Gestioneprescrizionefrm(username);
            Controllerprescrizioni  controllerprescription = new Controllerprescrizioni(modelloprescrizione,viewprescrizione);
            viewprescrizione.setVisible(true);
            }
}
