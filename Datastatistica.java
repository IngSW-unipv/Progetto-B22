package it.unipv.JAVABEAN;
/**
 * 
 * /**
 * Datadentista e' la java bean che corrisponde alla
 *rappresentazione object oriented della
 *tabella Dentista del database
 */
 

public class Datastatistica {
	
	
private int numeropaziente,numerotrattamenti,numeroprescrizioni; 
/**
 * 
 * @param numeropaziente ci indica i numeri dei paziente registrati
 * @param numerotrattamenti mostra i numeri dei trattamenti asseganti ai paziente
 * @param numeroprescrizioni mostra i numeri delle prescrizione asseganti ai paziente
 */
    public Datastatistica(int numeropaziente, int numerotrattamenti, int numeroprescrizioni) {
        this.numeropaziente = numeropaziente;
        this.numerotrattamenti = numerotrattamenti;
        this.numeroprescrizioni = numeroprescrizioni;
    }
/**
 * 
 * @return numeropaziente del dentista
 */
    public int getNumeropaziente() {
        return numeropaziente;
    }
/**
 * 
 * @return numerotrattamenti deel dentista
 */
    public int getNumerotrattamenti() {
        return numerotrattamenti;
    }
/**
 * 
 * @return numeroprescrizioni del dentista
 */
    public int getNumeroprescrizioni() {
        return numeroprescrizioni;
    }
    
}