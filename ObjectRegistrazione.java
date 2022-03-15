package it.unipv.DAO;

import it.unipv.JAVABEAN.Datadentista;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Classe ObjectRegistrazione implementa i seguenti metodi
 * @see InsertDatiDentista
 * @see ResultSet cercausername
 *
 */

public class ObjectRegistrazione implements Iregistrazione {
ResultSet rs;
    @Override
    /**
     * InsertDatiDentista accetta come parametro 
     * @param dentis del tipo Datadentista che permite la registrazione del paziente 
     */
    public void InsertDatiDentista(Datadentista dentist) {
        try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","" );
            //creazione delle preparedstatement per scrivere e eseguire le query]
            PreparedStatement pstm = conn.prepareStatement("insert into dentista values(?,?,?,?,?,?)");
            pstm.setString(1, dentist.getNomeutente());
            pstm.setString(2, dentist.getPassword());
            pstm.setString(3, dentist.getNome());
            pstm.setString(4, dentist.getCognome());
            pstm.setString(5, dentist.getEmaildentista());
            pstm.setString(6, dentist.getCellularedentista());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ti sei registrato con successo");
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    @Override
    /**
     * cercausername acceta come parametro 
     * @param dentisusername di tipo String 
     * e @return Resultset che sono i risultati della ricerca
     */
    public ResultSet cercausername(String dentistusername) {
        try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","" );
            //creazione delle preparedstatement per scrivere e eseguire le query
           String sql="select * from paziente natural join trattamento where Nomeutente=?"; 
              
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, dentistusername);
            
            
            rs =  pstm.executeQuery();
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
   return rs;
    }
    
}