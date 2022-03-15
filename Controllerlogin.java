
package it.unipv.controller;
import it.unipv.MainMenuprincipale;
import it.unipv.MainRegistrazione;
import it.unipv.model.ModelloLogin;
import it.unipv.view.Loginfrm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



/**
 * ControllerLogin e' il controllore che gestisce la view
 * @see it.unipv.view.Loginfrm 
 * e il modello 
 * @see it.unipv.model.ModelloLogin
 *
 */
 public class Controllerlogin {
 
 
private ModelloLogin modellogin;
private Loginfrm viewlogin;

//variabile per chiamare la Main della registrazione
MainRegistrazione register ;


/**
 * 
 * @param modellogin che riceve il riferimento del modello del Login
 * @param viewlogin  che riceve il riferimento della view del Login
 */
    public Controllerlogin(ModelloLogin modellogin, Loginfrm viewlogin) {
        this.modellogin = modellogin;
        this.viewlogin = viewlogin;
        register = new MainRegistrazione();
        assegnaAscoltatoriLoginfrm();
    }

    private void assegnaAscoltatoriLoginfrm() {
        viewlogin.getButtonlogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modellogin.VerificaLogin(viewlogin.getdatiloginfrm(),viewlogin.getName());
                viewlogin.azzeracampi();
                
            }
        });
        
        viewlogin.getButtonRegistrarti().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register.runRegistration();
              
            }
        });
    }
    


}
