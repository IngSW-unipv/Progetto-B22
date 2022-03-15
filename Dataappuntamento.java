
package it.unipv.JAVABEAN;

/**
 * Dataappuntamento e' la java bean che corrisponde alla
 *rappresentazione object oriented della
 *tabella Appuntamento del database
 */
public class Dataappuntamento {
    private String dataappuntamento,cfpaziente,trattamento,orario,nomeutentedentista;
/**
 * Costruttore della classe Dataappuntamento
 * @param dataappuntamento dell'appuntamento
 * @param cfpaziente dell'appuntamento
 * @param trattamento dell'appuntamento
 * @param orario dell'appuntamento
 * @param nomeutentedentista del dentista
 */
    public Dataappuntamento( String dataappuntamento, String cfpaziente, String trattamento, String orario, String nomeutentedentista) {
        
        this.dataappuntamento = dataappuntamento;
        this.cfpaziente = cfpaziente;
        this.trattamento = trattamento;
        this.orario = orario;
        this.nomeutentedentista = nomeutentedentista;
    }

    
/**
 * 
 * @return dataappuntamento dell'appuntamento
 */
    public String getDataappuntamento() {
        return dataappuntamento;
    }

    /**
     * 
     * @return cfpaziente del paziente
     */
    public String getCfpaziente() {
        return cfpaziente;
    }

    /**
     * 
     * @return trattamento da effettuare durante l'appuntamento
     */
    public String getTrattamento() {
        return trattamento;
    }

    /**
     * 
     * @return orario dell'appuntamento
     */
    public String getOrario() {
        return orario;
    }

    /**
     * 
     * @return nomeutentedentista del dentista
     */
    public String getNomeutentedentista() {
        return nomeutentedentista;
    }

   
    
    
}
