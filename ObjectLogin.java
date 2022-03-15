
package it.unipv.DAO;

import it.unipv.JAVABEAN.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Classe ObjectLogin implementa il metodo
 *@see cercadentista 
 *dell'interfaccia Ilogin
 */

public class ObjectLogin implements Ilogin {
    private ResultSet  rs;
    
   
    
 /**
  * cercadentista accetta come
 *@param dentist di tipo Login per poter 
 *chiamare i metodi della java bean della login
 *@see it.unipv.JAVABEAN.Login
 *e da quel punto posso avere i dati inseriti dalla frame 
 *e estratti dal metodo che sta nella classe 
 *@see it.unipv.view.Loginfrm 
 *che ha il metodo getdatiloginfrm
 *@return ResultSet che potrebbe essere vuota o e'la tupla
 *che abbiamo trovato nel database facendo il confronto
 *tra username e la password
 */
@Override
    public ResultSet cercadentista(Login dentist) {
	 
                try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
           String sql="select * from dentista where Nomeutente=? and PasswordDentista=?"; 
              
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dentist.getUsername());
            pstm.setString(2, dentist.getPassword());
            rs =  pstm.executeQuery();
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
   return rs;
    }

}
