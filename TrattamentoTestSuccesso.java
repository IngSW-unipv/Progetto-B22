package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Datatrattamento;
import it.unipv.model.ModelloTrattamento;



public class TrattamentoTestSuccesso {
	private ModelloTrattamento treat;
	private  Datatrattamento data1,data2,result1,result2;
	private String id;
	
	@Before
	public void inizializzaTest() {
		treat=new ModelloTrattamento();
		data1=new Datatrattamento("Flourizzazione","70","marco2023");
	    data2=new Datatrattamento("","","");
	}
	@Test
	public void testTrattamento() {
		ArrayList<String> datiprova1trattamento = new ArrayList<>();
		datiprova1trattamento.add(data1.getNometrattamento());
		datiprova1trattamento.add(data1.getCosto());
		

		treat.registertreatment(data1);
		id="1";
		result1=treat.researchtreatment(id,data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1treatment = new ArrayList<>();
		datiresult1treatment.add(result1.getNometrattamento());
		datiresult1treatment.add(result1.getCosto());
		
		
		assertEquals(datiprova1trattamento,datiresult1treatment);
		
		//per testare la cancellazione di un dato
		/*treat.canceltreatment(id);
		result2=treat.researchtreatment(id,data1.getNomeutentedentista());
		ArrayList<String> datiresult2treatment = new ArrayList<>();
		datiresult2treatment.add(result2.getNometrattamento());
		datiresult2treatment.add(result2.getCosto());
		datiresult2treatment.add(result2.getNomeutentedentista());
		 
		ArrayList<String> datiprova2trattamento = new ArrayList<>();
		datiprova2trattamento.add(data2.getNometrattamento());
		datiprova2trattamento.add(data2.getCosto());
		datiprova2trattamento.add(data2.getNomeutentedentista());
		assertEquals(datiprova2trattamento,datiresult2treatment);*/
		
	}

}
