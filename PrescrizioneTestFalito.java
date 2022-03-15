package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Dataprescrizione;
import it.unipv.model.ModelloPrescrizione;

public class PrescrizioneTestFalito {

	private ModelloPrescrizione presc;
	private  Dataprescrizione data1,result1;
	private String id;
	
	@Before
	public void inizializzaTest() {
		presc=new ModelloPrescrizione();
		data1=new  Dataprescrizione("Tacchipirina","20mg","12/03/2023","Flourizzazione","JOJA2023","marco2023");
	  
	}
	
	@Test
	public void testPrescrizione() {
		ArrayList<String> datiprova1prescrizione = new ArrayList<>();
		datiprova1prescrizione.add(data1.getNomeprescrizione());
		datiprova1prescrizione.add(data1.getQuantita());
		datiprova1prescrizione.add(data1.getDataprescrizione());
		datiprova1prescrizione.add(data1.getNometrattamento());
		datiprova1prescrizione.add(data1.getCfpaziente());
	
		
		//id sbagliato della prescrizione
		id="2";
		result1=presc.researchprescription(id,data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1prescription = new ArrayList<>();
		datiresult1prescription.add(result1.getNomeprescrizione());
		datiresult1prescription.add(result1.getQuantita());
		datiresult1prescription.add(result1.getDataprescrizione());
		datiresult1prescription.add(result1.getNometrattamento());
		datiresult1prescription.add(result1.getCfpaziente());
		
		
		
		assertEquals(datiprova1prescrizione,datiresult1prescription);
	}

}
