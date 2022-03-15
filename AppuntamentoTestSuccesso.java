package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Dataappuntamento;
import it.unipv.model.ModelloAppuntamento;

public class AppuntamentoTestSuccesso {
	private ModelloAppuntamento appoint;
	private Dataappuntamento data1,data2,result1,result2;
	private String id;
	
	@Before
	public void inizializzaTest() {
		appoint=new ModelloAppuntamento();
		data1=new Dataappuntamento("11/03/2023","JOJA2023","Flourizzazione","12-13","marco2023");
	    data2=new Dataappuntamento("","","","","");
	}
	@Test
	public void testAppuntamento() {
		ArrayList<String> datiprova1appuntamento = new ArrayList<>();
		datiprova1appuntamento.add(data1.getDataappuntamento());
		datiprova1appuntamento.add(data1.getCfpaziente());
		datiprova1appuntamento.add(data1.getTrattamento());
		datiprova1appuntamento.add(data1.getOrario());
		
		
		
		appoint.registerappointment(data1,data1.getCfpaziente(),data1.getTrattamento(),data1.getNomeutentedentista());
		id="1";
		result1=appoint.researchappointment(id, data1.getNomeutentedentista());
		
		ArrayList<String> datiresult1appointment = new ArrayList<>();
		 datiresult1appointment.add(result1.getDataappuntamento());
		 datiresult1appointment.add(result1.getCfpaziente());
		 datiresult1appointment.add(result1.getTrattamento());
		 datiresult1appointment.add(result1.getOrario());
		
		
		assertEquals(datiprova1appuntamento,datiresult1appointment);
		
		//per testare la cancellazione di un dato
	/*	appoint.cancelappointment(id);
		result2=appoint.researchappointment(id, data1.getNomeutentedentista());
		ArrayList<String> datiresult2appointment = new ArrayList<>();
		 datiresult2appointment.add(data1.getDataappuntamento());
		 datiresult2appointment.add(data1.getCfpaziente());
		 datiresult2appointment.add(data1.getTrattamento());
		 datiresult2appointment.add(data1.getOrario());
		 datiresult2appointment.add(data1.getNomeutentedentista());
		 
		ArrayList<String> datiprova2appuntamento = new ArrayList<>();
		datiprova2appuntamento.add(data1.getDataappuntamento());
		datiprova2appuntamento.add(data1.getCfpaziente());
		datiprova2appuntamento.add(data1.getTrattamento());
		datiprova2appuntamento.add(data1.getOrario());
		datiprova2appuntamento.add(data1.getNomeutentedentista());
		assertEquals(datiprova2appuntamento,datiresult2appointment);*/
	}

}
