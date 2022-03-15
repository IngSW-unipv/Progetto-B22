package it.unipv.model;
/**
 * la classe ModelloMenuprincipale contiene i metodi
 * getUsername
 * e il construttore ModelloMenuprincipale
 */

public class ModelloMenuprincipale {
    String username;
/**
 * 
 * @param username che serve per identificare il dentista
 */
    public ModelloMenuprincipale(String username) {
        this.username = username;
    }
/**
 * 
 * @return username dal dentista
 */
    public String getUsername() {
        return username;
    }
    
}