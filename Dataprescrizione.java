package it.unipv.JAVABEAN;

/**
 * Dataprescrizione è la java bean che corrisponde alla
 * rappresentazione object oriented della
 * tabella Prescrizione del database
 */

public class Dataprescrizione {
//vedere come gestire id
	private String nomeprescrizione,quantita,dataprescrizione,nometrattamento,cfpaziente,nomeutentedentista;

    /**
     * Costruttore della classe Dataprescrizione che ha i seguenti parametri
     * @param nomeprescrizione della prescrizione data dal dentista
     * @param quantita della quantita del farmaco in questione
     * @param dataprescrizione della data della prescrizione
     * @param nometrattamento del trattamento
     * @param cfpaziente del paziente
     * @param nomeutentedentista del dentista
     */
    
    public Dataprescrizione( String nomeprescrizione, String quantita, String dataprescrizione, String nometrattamento, String cfpaziente, String nomeutentedentista) {
       
    	
    	this.nomeprescrizione = nomeprescrizione;
        this.quantita = quantita;
        this.dataprescrizione = dataprescrizione;
        this.nometrattamento = nometrattamento;
        this.cfpaziente = cfpaziente;
        this.nomeutentedentista = nomeutentedentista;
    }

   
    /**
     * 
     * @return nomeprescrizione nome della prescrizione
     */

    public String getNomeprescrizione() {
        return nomeprescrizione;
    }

    /**
     * 
     * @return quantita della prescrizione
     */
    public String getQuantita() {
        return quantita;
    }

    /**
     * 
     * @return dataprescrizione in cui viene effettuata la prescrizione
     */
    public String getDataprescrizione() {
        return dataprescrizione;
    }

    /**
     * 
     * @return nometrattamento del trattamento effettuato
     */
    public String getNometrattamento() {
        return nometrattamento;
    }

    /**
     * 
     * @return cfpaziente del paziente in questione
     */
    public String getCfpaziente() {
        return cfpaziente;
    }

    /**
     * 
     * @return nomeutentedentista del dentista di interesse
     */
    public String getNomeutentedentista() {
        return nomeutentedentista;
    }
}