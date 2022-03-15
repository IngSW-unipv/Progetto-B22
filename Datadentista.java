
package it.unipv.JAVABEAN;

/**
 * Datadentista e' la java bean che corrisponde alla
 *rappresentazione object oriented della
 *tabella Dentista del database
 */
public class Datadentista {

    private String nome,cognome,nomeutente,password,emaildentista,cellularedentista;
/**
 * Costruttore della classe Datadentista che ha come parametri
 * @param nome del dentista
 * @param cognome del dentista
 * @param nomeutente del dentista
 * @param password del dentista
 * @param emaildentista del dentista
 * @param cellularedentista del dentista
 */
    public Datadentista(String nome, String cognome, String nomeutente, String password, String emaildentista, String cellularedentista) {
        this.nome = nome;
        this.cognome = cognome;
        this.nomeutente = nomeutente;
        this.password = password;
        this.emaildentista = emaildentista;
        this.cellularedentista = cellularedentista;
    }

    /**
     * 
     * @return nome del dentista
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @return cognome del dentista
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * 
     * @return nomeutente del dentista
     */
    public String getNomeutente() {
        return nomeutente;
    }

    /**
     * 
     * @return password del dentista 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @return emaildentista del dentista
     */
    public String getEmaildentista() {
        return emaildentista;
    }

    /**
     * 
     * @return cellularedentista del dentista
     */
    public String getCellularedentista() {
        return cellularedentista;
    }

  
    
}
