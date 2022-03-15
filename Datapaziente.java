package it.unipv.JAVABEAN;
/**
 * Datapaziente e' la java bean che corrisponde alla
 *rappresentazione object oriented della
 *tabella Paziente del database
 */

public class Datapaziente {
        private String nome,cognome,cf,indirizzo,emailpaziente,cellularepaziente,nomeutentedentista;
/**
 * Costruttore della classe Datapaziente che ha come parametri
 * @param nome del paziente
 * @param cognome del paziente
 * @param cf del paziente
 * @param indirizzo del paziente
 * @param emailpaziente del paziente
 * @param cellularepaziente del paziente
 * @param nomeutentedentista del paziente
 * 
 */
    public Datapaziente( String nome, String cognome, String cf, String indirizzo, String emailpaziente, String cellularepaziente, String nomeutentedentista) {
        
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.indirizzo = indirizzo;
        this.emailpaziente = emailpaziente;
        this.cellularepaziente = cellularepaziente;
        this.nomeutentedentista = nomeutentedentista;
    }


   

  /**
   * 
   * @return nome del paziente
  */

    public String getNome() {
        return nome;
    }
/**
 * 
 * @return cognome del paziente
 */
    public String getCognome() {
        return cognome;
    }
/**
 * 
 * @return codice fiscale del paziente
 */
    public String getCf() {
        return cf;
    }
/**
 * 
 * @return il indirizzo del pazziente
 */
    public String getIndirizzo() {
        return indirizzo;
    }
/**
 * 
 * @return la mail del paziente
 */
    public String getEmailpaziente() {
        return emailpaziente;
    }
/**
 * 
 * @return il cellulare del paziente
 */
    public String getCellularepaziente() {
        return cellularepaziente;
    }
/**
 * 
 * @return nome utente del dentista
 */
    public String getNomeutentedentista() {
        return nomeutentedentista;
    }

    
    
}