
package it.unipv;

import it.unipv.controller.Controllerfatturazione;
import it.unipv.controller.Controllerprescrizioni;
import it.unipv.model.ModelloFatturazione;
import it.unipv.model.ModelloPrescrizione;
import it.unipv.view.GestioneFattura;
import it.unipv.view.Gestioneprescrizionefrm;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see runFatturazione
 */
public class MainFatturazione {
	
	 /**il metodo ci istanziano
	 *   il controller, view
	 * e il modello della parte dell'applicazione che gestisce 
	 * la fatturazzione e rende visibile la sua view .
	 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllerappuntamento
	 * quando schiaccio sulla button della fatturazione dal menu principale.
	 * @see GestioneFattura
	 * @see ModelloFatturazione
	 * @see Controllerfatturazione
	 * 
	 */ 
    public void runFatturazione(String username) {
           ModelloFatturazione modellofatturazione = new ModelloFatturazione();
           GestioneFattura viewfatturazione = new GestioneFattura(username);
           Controllerfatturazione  controllerscatisca = new  Controllerfatturazione(modellofatturazione,viewfatturazione);
            viewfatturazione.setVisible(true);
           }
}
