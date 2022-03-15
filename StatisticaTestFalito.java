package it.unipv.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.JAVABEAN.Datastatistica;
import it.unipv.model.ModelloStatistica;

public class StatisticaTestFalito {

	private ModelloStatistica stat;
	private  Datastatistica result,data;
	
	
	@Before
	public void inizializzaTest() {
		stat=new ModelloStatistica();
		//dati sbagliati
		data=new  Datastatistica(10,1,2);
	}
	
	@Test
	public void testStatistica() {
		ArrayList<Integer> datiprova1statistica = new ArrayList<>();
		datiprova1statistica.add(data.getNumeropaziente());
		datiprova1statistica.add(data.getNumerotrattamenti());
		datiprova1statistica.add(data.getNumeroprescrizioni());
		
		result=stat.getdatastatistics("marco2023");
		ArrayList<Integer> datiresult1statistica = new ArrayList<>();
		datiresult1statistica.add(result.getNumeropaziente());
		datiresult1statistica.add(result.getNumerotrattamenti());
		datiresult1statistica.add(result.getNumeroprescrizioni());
		
		assertEquals(datiprova1statistica,datiresult1statistica);
	}

}
