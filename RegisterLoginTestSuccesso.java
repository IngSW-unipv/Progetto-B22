package it.unipv.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.unipv.DAO.ObjectLogin;
import it.unipv.JAVABEAN.Datadentista;
import it.unipv.JAVABEAN.Login;
import it.unipv.model.ModelloRegistrazione;
import junit.framework.Assert;

import java.sql.*;
public class RegisterLoginTestSuccesso {
	//parte 1 variabili per la test della Login e la registrazione
	private ModelloRegistrazione register;
	private ObjectLogin login;
	private Datadentista data1;
	private  Login  data2;
	private ResultSet rssuccesso;
	
	@Before
	public void inizializzaTest() {
		register= new ModelloRegistrazione();
		login  =new ObjectLogin();
		data1=new Datadentista("Marco","Facchinetti","marco2023","2023","facchinetti@gmail.com","2346");
		data2=new Login("marco2023","2023");
		
	}

	@Test
	public void testSuccesso() throws SQLException {
		//arraylist che contiene i dati di test per la registrazione e la login con dati giusti
		ArrayList<String> datiprovaregistrazione = new ArrayList<>();
		ArrayList<String> dataprovalogincorretto = new ArrayList<>();
		datiprovaregistrazione.add(data1.getNome());
		datiprovaregistrazione.add(data1.getCognome());
		datiprovaregistrazione.add(data1.getNomeutente());
		datiprovaregistrazione.add(data1.getPassword());
		datiprovaregistrazione.add(data1.getEmaildentista());
		datiprovaregistrazione.add(data1.getCellularedentista());
		
		dataprovalogincorretto.add(data2.getUsername());
		dataprovalogincorretto.add(data2.getPassword());
		
		register.RegisterDentist(data1);//manda i dati di test per poterli registrare nel database
		rssuccesso=login.cercadentista(data2);
	   if(rssuccesso.next()) {
		   assertTrue(true);
	   }
	   else {
		   assertTrue(false);
	   }
	   
	
	}
	
	

}
