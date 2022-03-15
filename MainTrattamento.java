
package it.unipv;

import it.unipv.controller.Controllerappuntamento;
import it.unipv.controller.Controllertrattamento;
import it.unipv.model.ModelloAppuntamento;
import it.unipv.model.ModelloTrattamento;
import it.unipv.view.Gestioneappuntamentofrm;
import it.unipv.view.Gestionetrattamentofrm;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see runTrattamento
 */
public class MainTrattamento {
	
	 /**il metodo ci istanziano
		 *   il controller, view
		 * e il modello della parte dell'applicazione che gestisce 
		 * il trattamento e rende visibile la sua view .
		 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllerappuntamento
		 * quando schiaccio sulla button del trattamento dal menu principale.
		 * @see Gestionetrattamentofrm
		 * @see ModelloTrattamento
		 * @see Controllertrattamento
		 * 
		 */ 
     public void runTrattamento(String username) {
             ModelloTrattamento modellotrattamento = new  ModelloTrattamento();
            Gestionetrattamentofrm viewtrattamento = new Gestionetrattamentofrm(username);

            Controllertrattamento  controllertreatment = new Controllertrattamento(modellotrattamento,viewtrattamento);
            viewtrattamento.setVisible(true);
            }
}
