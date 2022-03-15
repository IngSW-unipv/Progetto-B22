package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Datapaziente;
import it.unipv.model.ModelloPaziente;

public class PazienteTestSbagliato {

	private ModelloPaziente patient;
	private Datapaziente data1,result1;
	private String id;
	
	@Before
	public void inizializzaTest() {
		patient=new ModelloPaziente();
		data1=new Datapaziente("John","James","JOJA2023","Via Cardano 12","john@gmail.com","2233","marco2023");
	
	}
	//CASO DI TEST CON ID DI UN PAZIENTE CHE NON ESISTE
	@Test
	public void testFallito() {
	
		ArrayList<String> datiprovapaziente = new ArrayList<>();
		datiprovapaziente.add(data1.getNome());
		datiprovapaziente.add(data1.getCognome());
		datiprovapaziente.add(data1.getCf());
		datiprovapaziente.add(data1.getIndirizzo());
		datiprovapaziente.add(data1.getEmailpaziente());
		datiprovapaziente.add(data1.getCellularepaziente());
		id="2";
		result1=patient.researchpatient(id, data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1paziente = new ArrayList<>();
		datiresult1paziente.add(result1.getNome());
		datiresult1paziente.add(result1.getCognome());
		datiresult1paziente.add(result1.getCf());
		datiresult1paziente.add(result1.getIndirizzo());
		datiresult1paziente.add(result1.getEmailpaziente());
		datiresult1paziente.add(result1.getCellularepaziente());
	
		assertEquals(datiprovapaziente,datiresult1paziente);
}
}
