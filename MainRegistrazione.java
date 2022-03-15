
package it.unipv;

import it.unipv.controller.Controllerlogin;
import it.unipv.controller.Controllerregistrazione;
import it.unipv.model.ModelloLogin;
import it.unipv.model.ModelloRegistrazione;
import it.unipv.view.Loginfrm;
import it.unipv.view.Registrazionefrm;

/**
 * Classe Main per la registrazione 
 * che contiene il metodo
 *  @see runRegistration
 */
public class MainRegistrazione {
    
 /**il metodo ci istanziano
 *   il controller, view
 * e il modello della parte dell'applicazione che gestisce la
 * Registrazione e rende visibile la sua view.
 * @see Registrazionefrm
 * @see ModelloRegistrazione
 * @see Controllerregistrazione
 */
           public void runRegistration() {
           ModelloRegistrazione modelregistration = new ModelloRegistrazione();
           Registrazionefrm viewregistration = new Registrazionefrm();
           Controllerregistrazione  controllerRegister = new Controllerregistrazione(modelregistration,viewregistration);
            viewregistration.setVisible(true);
           }
        
}
