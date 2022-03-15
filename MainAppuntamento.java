
package it.unipv;
import it.unipv.controller.Controllerappuntamento;
import it.unipv.controller.Controllerpaziente;
import it.unipv.model.ModelloAppuntamento;
import it.unipv.model.ModelloPaziente;
import it.unipv.view.Gestioneappuntamentofrm;
import it.unipv.view.Gestionepazientefrm;

/**
 * Classe Main per il la gestione del paziente
 * che contiene il metodo
 *  @see runAppuntamento
 */
public class MainAppuntamento {
	
	 /**il metodo ci istanziano
	 *   il controller, view
	 * e il modello della parte dell'applicazione che gestisce 
	 * l'appuntamento e rende visibile la sua view .
	 * @param username che e' il nomeutente del dentista ricevuto nella classe del Controllerappuntamento
	 * quando schiaccio sulla button dell'appuntamento dal menu principale.
	 * @see Gestioneappuntamentofrm
	 * @see ModelloAppuntamento
	 * @see Controllerappuntamento
	 * 
	 */ 
    public void runAppuntamento(String username) {
            ModelloAppuntamento modelloappuntamento = new ModelloAppuntamento();
            Gestioneappuntamentofrm viewappuntamento = new Gestioneappuntamentofrm(username);
            Controllerappuntamento  controllerappointment = new Controllerappuntamento(modelloappuntamento,viewappuntamento);
            viewappuntamento.setVisible(true);
            }
}
