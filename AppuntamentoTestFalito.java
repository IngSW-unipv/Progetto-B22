package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Dataappuntamento;
import it.unipv.model.ModelloAppuntamento;

public class AppuntamentoTestFalito {

	private ModelloAppuntamento appoint;
	private Dataappuntamento data1,result1;
	private String id;
	
	@Before
	public void inizializzaTest() {
		appoint=new ModelloAppuntamento();
		data1=new Dataappuntamento("11/03/2023","JOJA2023","Flourizzazione","12-13","marco2023");
	    
	}
	@Test
	public void testAppuntamento() {
		ArrayList<String> datiprova1appuntamento = new ArrayList<>();
		datiprova1appuntamento.add(data1.getDataappuntamento());
		datiprova1appuntamento.add(data1.getCfpaziente());
		datiprova1appuntamento.add(data1.getTrattamento());
		datiprova1appuntamento.add(data1.getOrario());
		
		
		
	//test con id sbagliato
		id="2";
		result1=appoint.researchappointment(id, data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1appointment = new ArrayList<>();
		 datiresult1appointment.add(result1.getDataappuntamento());
		 datiresult1appointment.add(result1.getCfpaziente());
		 datiresult1appointment.add(result1.getTrattamento());
		 datiresult1appointment.add(result1.getOrario());
		
		
		assertEquals(datiprova1appuntamento,datiresult1appointment);

}
	
}
