package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Dataprescrizione;
import it.unipv.model.ModelloPrescrizione;



public class PrescrizioneTestSuccesso {

	private ModelloPrescrizione presc;
	private  Dataprescrizione data1,data2,result1,result2;
	private String id;
	
	@Before
	public void inizializzaTest() {
		presc=new ModelloPrescrizione();
		data1=new  Dataprescrizione("Tacchipirina","20mg","12/03/2023","Flourizzazione","JOJA2023","marco2023");
	    data2=new  Dataprescrizione("","","","","","");
	}
	
	@Test
	public void testPrescrizione() {
		ArrayList<String> datiprova1prescrizione = new ArrayList<>();
		datiprova1prescrizione.add(data1.getNomeprescrizione());
		datiprova1prescrizione.add(data1.getQuantita());
		datiprova1prescrizione.add(data1.getDataprescrizione());
		datiprova1prescrizione.add(data1.getNometrattamento());
		datiprova1prescrizione.add(data1.getCfpaziente());
	
		
		presc.registerprescription(data1,data1.getCfpaziente(),data1.getNometrattamento(),data1.getNomeutentedentista());
		id="1";
		result1=presc.researchprescription(id,data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1prescription = new ArrayList<>();
		datiresult1prescription.add(result1.getNomeprescrizione());
		datiresult1prescription.add(result1.getQuantita());
		datiresult1prescription.add(result1.getDataprescrizione());
		datiresult1prescription.add(result1.getNometrattamento());
		datiresult1prescription.add(result1.getCfpaziente());
		
		
		
		assertEquals(datiprova1prescrizione,datiresult1prescription);
		
		//per testare la cancellazione di un dato
		/*presc.cancelprescription(id);
		result2=presc.researchprescription(id,data1.getNomeutentedentista());
		
		ArrayList<String> datiresult2prescription = new ArrayList<>();
		datiresult2prescription.add(data1.getNomeprescrizione());
		datiresult2prescription.add(data1.getQuantita());
		datiresult2prescription.add(data1.getDataprescrizione());
		datiresult2prescription.add(data1.getCfpaziente());
		datiresult2prescription.add(data1.getNomeutentedentista());

		 
		ArrayList<String> datiprova2prescrizione = new ArrayList<>();
		datiprova2prescrizione.add(data1.getNomeprescrizione());
		datiprova2prescrizione.add(data1.getQuantita());
		datiprova2prescrizione.add(data1.getDataprescrizione());
		datiprova2prescrizione.add(data1.getNometrattamento());
		datiprova2prescrizione.add(data1.getCfpaziente());
		datiprova2prescrizione.add(data1.getNomeutentedentista());
		assertEquals(datiprova2prescrizione,datiresult2prescription);*/
	}

}
