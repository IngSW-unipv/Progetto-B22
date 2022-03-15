
package it.unipv.JAVABEAN;

/**
 * Datatrattamento e' la java bean che corrisponde alla
 *rappresentazione object oriented della
 *tabella Trattamento del database
 */
public class Datatrattamento {
        private String nometrattamento,costo,nomeutentedentista;

        /**
         * Costruttore della classe Datatrattamento
         * @param nometrattamento del trattamento
         * @param costo del trattamento
         * @param nomeutentedentista del dentista
         */
    public Datatrattamento( String nometrattamento, String costo, String nomeutentedentista) {
       
        this.nometrattamento = nometrattamento;
        this.costo = costo;
        this.nomeutentedentista = nomeutentedentista;
    }

    

/**
 * 
 * @return nometrattamento del trattamento
 */
    public String getNometrattamento() {
        return nometrattamento;
    }

    /**
     * 
     * @return costo del trattamento
     */
    public String getCosto() {
        return costo;
    }

    /**
     * 
     * @return nomeutentedentista del dentista
     */
    public String getNomeutentedentista() {
        return nomeutentedentista;
    }
    
}
