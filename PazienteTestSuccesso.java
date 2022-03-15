package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import it.unipv.JAVABEAN.Datapaziente;
import it.unipv.model.ModelloPaziente;


public class PazienteTestSuccesso {
	
	private ModelloPaziente patient;
	private Datapaziente data1,data2,result1,result2;
	private String id;
	
	@Before
	public void inizializzaTest() {
		patient=new ModelloPaziente();
		data1=new Datapaziente("John","James","JOJA2023","Via Cardano 12","john@gmail.com","2233","marco2023");
	    data2=new Datapaziente("","","","","","","");
	}
	@Test
	public void testSuccesso() {
		ArrayList<String> datiprovapaziente = new ArrayList<>();
		datiprovapaziente.add(data1.getNome());
		datiprovapaziente.add(data1.getCognome());
		datiprovapaziente.add(data1.getCf());
		datiprovapaziente.add(data1.getIndirizzo());
		datiprovapaziente.add(data1.getEmailpaziente());
		datiprovapaziente.add(data1.getCellularepaziente());
	
		
		patient.registerpatient(data1);
		id="1";
		result1=patient.researchpatient(id, data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1paziente = new ArrayList<>();
		datiresult1paziente.add(result1.getNome());
		datiresult1paziente.add(result1.getCognome());
		datiresult1paziente.add(result1.getCf());
		datiresult1paziente.add(result1.getIndirizzo());
		datiresult1paziente.add(result1.getEmailpaziente());
		datiresult1paziente.add(result1.getCellularepaziente());
	
		assertEquals(datiprovapaziente,datiresult1paziente);
		
		//per testare la cancellazione di un dato
	/*	patient.cancelpatient(id);
		result2=patient.researchpatient(id, data1.getNomeutentedentista());
		ArrayList<String> datiresult2paziente = new ArrayList<>();
		datiresult2paziente.add(result2.getNome());
		datiresult2paziente.add(result2.getCognome());
		datiresult2paziente.add(result2.getCf());
		datiresult2paziente.add(result2.getIndirizzo());
		datiresult2paziente.add(result2.getEmailpaziente());
		datiresult2paziente.add(result2.getCellularepaziente());
		datiresult2paziente.add(result2.getNomeutentedentista());
		
		ArrayList<String> datiprova2paziente = new ArrayList<>();
		datiprova2paziente.add(data1.getNome());
		datiprova2paziente.add(data1.getCognome());
		datiprova2paziente.add(data1.getCf());
		datiprova2paziente.add(data1.getIndirizzo());
		datiprova2paziente.add(data1.getEmailpaziente());
		datiprova2paziente.add(data1.getCellularepaziente());
		datiprova2paziente.add(data1.getNomeutentedentista());
		assertEquals(datiprova2paziente,datiresult2paziente);*/
		
		
	}

}
