package it.unipv.DAO;

import it.unipv.JAVABEAN.Dataappuntamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 * Classe ObjectAppuntamento implementa il metodo
 *@see insertappuntamento
 *@see modificappuntamento
 *@see cancellappuntamento
 *@see ricercaappuntamento
 *@see gettableappuntamento
 *@see cercacfTrattamento
 *dell'interfaccia Iprescrizione
 */
public class ObjectAppuntamento implements Iappuntamento {
   private ResultSet  rs;
    
   /**
    * insertappuntamento accetta come parametro
    * @param appointment di tipo Dataappuntamento per poter 
    * chiamare i metodi della java bean 
    * @see it.unipv.JAVABEAN.Dataappuntamento
    * e da quel punto posso avere i dati inseriti dalla frame 
    * e estratti dal metodo che sta nella classe 
    * @see it.unipv.view.Gestioneappuntamentofrm
    * che ha il metodo getdatiGestioneappuntamentofrm
    * per poi inserirli nel database
   */
   
   @Override
    public void insertappuntamento(Dataappuntamento appointment) {
       try {
                 
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            PreparedStatement pstm = conn.prepareStatement("insert into appuntamento values(?,?,?,?,?,?)");
            pstm.setInt(1, 0);
            pstm.setString(2, appointment.getDataappuntamento());
            pstm.setString(3, appointment.getCfpaziente());
            pstm.setString(4, appointment.getTrattamento());
            pstm.setString(5, appointment.getOrario());
            pstm.setString(6, appointment.getNomeutentedentista());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "APPUNTAMENTO REGISTRATO CON SUCCESSO");
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
   /**
    * modificappuntamento accetta come parametri
    * @param data di tipo Dataappuntamento per poter 
    * chiamare i metodi della java bean 
    * @param id di tipo stringa per modificare i dati nel database rispetto a
    * id inserito sull'interfaccia grafica
    * @see it.unipv.JAVABEAN.Dataappuntamento
    * e da quel punto posso avere i dati inseriti dalla frame 
    * e estratti dal metodo che sta nella classe 
    * @see it.unipv.view.Gestioneappuntamentofrm
    * che ha il metodo getdatiGestioneappuntamentofrm
    * per poi inserirli nel database
    */
     
    @Override
    public void modificappuntamento(Dataappuntamento data, String id) {
        try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
           
             PreparedStatement pstm = conn.prepareStatement("update  appuntamento set DataAppuntamento ='"+data.getDataappuntamento()+"',CF ='"+data.getCfpaziente()+"',Trattamento ='"+data.getTrattamento()+"',Orario ='"+data.getOrario()+"' where IdAppuntamento=?");
              pstm.setString(1, id);
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(null, "APPUNTAMENTO MODIFICATO CON SUCCESSO");
            
       
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
    }
    
    /**
     * cancellappuntamento accetta come parametro
     * @param id di tipo stringa per cancellare i dati rispetto a
     * un id inserito sull'interfaccia grafica
     */
    
    @Override
    public void cancellappuntamento(String id) {
        try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql = "delete from appuntamento where IdAppuntamento=?";
             PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
             JOptionPane.showMessageDialog(null, "APPUNTAMENTO CANCELLATO CON SUCCESSO");
            
       
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
    }

    /**
     * ricercaappuntamento accetta come parametro
     * @param id di tipo stringa e
     * @param username di tipo stringa
     * per ricercare i dati nel database rispetto a
     * un id inserito sull'interfaccia grafica e username
     * del dentista d'interesse
     */
    
    @Override
    public Dataappuntamento ricercaappuntamento(String id, String username) {
      try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql = "select * from appuntamento where IdAppuntamento=? and Nomeutente=?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
             pstm.setString(2, username);
            ResultSet rs= pstm.executeQuery();
            if(rs.next() == true){
            Dataappuntamento data = new Dataappuntamento(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),"");
            return data;
            }
            else {
            JOptionPane.showMessageDialog(null, "ID APPUNTAMENTO NON TROVATO");
            JOptionPane.showMessageDialog(null, "RINSERISCI ID  DELL'APPUNTAMENTO");
            Dataappuntamento data1 = new Dataappuntamento("","","","","");
                return data1;
            }
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
        return null;
    }

    /**
     * gettableappuntamento accetta come parametro
     * @param username di tipo stringa
     * per selezionare una sequenza di tuple che hanno come username il dentista d'interesse
     * e me lo restituisce 
     * @return ResultSet che sono i risultati da presentare su forma grafica
     * al livello dell'interfaccia grafica
     */
    
    @Override
    public ResultSet gettableappuntamento(String username) {
       try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql= "select IdAppuntamento,DataAppuntamento,CF,Trattamento,Orario from appuntamento where Nomeutente=? order by DataAppuntamento";
            PreparedStatement pstm = conn.prepareStatement(sql);
             pstm.setString(1, username);
            ResultSet rs= pstm.executeQuery();
            return rs;
         
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
           return null; 
    }

    /**
     * cercacfTrattamento accetta come parametro
     * @param cf di tipo stringa ,
     * @param treatment di tipo stringa e
     * @param username di tipo stringa
     * per verificare esistenza del paziente e del trattamento nel database
     * @return ResultSet per verificare se esistono  oppure no
     */
    
    @Override
    public ResultSet cercacfTrattamento(String cf,String treatment,String username) {
            try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
           String sql="select * from paziente natural join trattamento where CF=? and Trattamento=? and Nomeutente=? "; 
              
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, cf);
            pstm.setString(2, treatment);
            pstm.setString(3, username);
            
            rs =  pstm.executeQuery();
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
   return rs;
    }

    
}