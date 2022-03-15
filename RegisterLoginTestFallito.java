package it.unipv.test;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.DAO.ObjectLogin;
import it.unipv.JAVABEAN.Login;


public class RegisterLoginTestFallito {
	//parte 1 variabili per la test della Login con dati sbagliati
	
	private ObjectLogin login;
	private  Login  data2;
	private ResultSet rsfallito;
	
	@Before
	public void inizializzaTest() {
	
		login  =new ObjectLogin();
		data2=new Login("marco2021","2023");
	}

	@Test
	public void testFallito() throws SQLException {
		   ArrayList<String> dataprovaloginsbagliato = new ArrayList<>();
			dataprovaloginsbagliato.add(data2.getUsername());
			dataprovaloginsbagliato.add(data2.getPassword());
			
			rsfallito=login.cercadentista(data2);
			
		
			   if(rsfallito.next()) {
				   assertTrue(true);
			   }
			   else {
				   assertTrue(false);
			   }
				
	}

}
