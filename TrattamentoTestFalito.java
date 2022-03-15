package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Datatrattamento;
import it.unipv.model.ModelloTrattamento;

public class TrattamentoTestFalito {

	private ModelloTrattamento treat;
	private  Datatrattamento data1,result1;
	private String id;
	
	@Before
	public void inizializzaTest() {
		treat=new ModelloTrattamento();
		data1=new Datatrattamento("Flourizzazione","70","marco2023");
	   
	}
	@Test
	public void testTrattamento() {
		ArrayList<String> datiprova1trattamento = new ArrayList<>();
		datiprova1trattamento.add(data1.getNometrattamento());
		datiprova1trattamento.add(data1.getCosto());
		

		
		//test con id trattamento  che non esiste
		id="2";
		result1=treat.researchtreatment(id,data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1treatment = new ArrayList<>();
		datiresult1treatment.add(result1.getNometrattamento());
		datiresult1treatment.add(result1.getCosto());
		
		
		assertEquals(datiprova1trattamento,datiresult1treatment);
}

}
