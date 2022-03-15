
package it.unipv.JAVABEAN;

/**
 * Classe Login che mi permette
 * di creare un oggetto con 2 attributi di tipo
 * stringa che sono username e password
 *
 */
public class Login {
    private String username,password;

    /**
     * Costruttore della classe Login che ha come parametri
     * @param username del dentista
     * @param password del dentista
     */
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
/**
 * 
 * @return username del dentista
 */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @return password del dentista
     */
    public String getPassword() {
        return password;
    }
    
    
}
