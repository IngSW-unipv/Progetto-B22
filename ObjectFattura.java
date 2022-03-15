
package it.unipv.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Classe ObjectFattura implementa il metodo
 *@see gettablefattura
 *dell'interfaccia Ifattura
 */
public class ObjectFattura implements Ifattura {

	
	/**
	 * 
	 * @param username che e' il nome utente del dentista
	 * @return ResultSet che sono le tuple dei trattamenti del dentista
	 */
    @Override
    public ResultSet gettablefattura(String username) {
         try {
//abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql= "select Trattamento,Costo from trattamento where Nomeutente=? order by Trattamento";
            PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.setString(1, username);
            ResultSet rs= pstm.executeQuery();
            return rs;
         
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
           return null; 
    }
    
}
