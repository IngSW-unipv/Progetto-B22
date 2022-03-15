
package it.unipv.DAO;

import it.unipv.JAVABEAN.Datatrattamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 * Classe ObjectTrattamento implementa i metodi
 *@see inserttrattamento
 *@see modificatrattamento
 *@see cancellatrattamento
 *@see ricercatrattamento
 *@see gettabletrattamento
 *dell'interfaccia Iprescrizione
 */
public class ObjectTrattamento implements Itrattamento {
   
	 /**
	  * inserttrattamento accetta come parametro
	 *@param treatment di tipo Datatrattamento per poter 
	 *chiamare i metodi della java bean 
	 *@see it.unipv.JAVABEAN.Datatrattamento
	 *e da quel punto posso avere i dati inseriti dalla frame 
	 *e estratti dal metodo che sta nella classe 
	 *@see it.unipv.view.Gestionetrattamentofrm
	 *che ha il metodo getdatiGestionetrattamentofrm
	 *per poi inserirli nel database
	 */
    @Override
    public void inserttrattamento(Datatrattamento treatment) {
              try {
                 
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            PreparedStatement pstm = conn.prepareStatement("insert into trattamento values(?,?,?,?)");
            pstm.setInt(1, 0);
            pstm.setString(2, treatment.getNometrattamento());
            pstm.setString(3, treatment.getCosto());
            pstm.setString(4, treatment.getNomeutentedentista());
            
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "TRATTAMENTO REGISTRATO CON SUCCESSO");
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    /**
     * modificatrattamento accetta come parametri
    *@param data di tipo Datatrattamento per poter 
    *chiamare i metodi della java bean 
    *@see it.unipv.JAVABEAN.Datatrattamento
    *e da quel punto posso avere i dati inseriti dalla frame 
    *e estratti dal metodo che sta nella classe 
    *@see it.unipv.view.Gestionetrattamentofrm
    *che ha il metodo getdatiGestionetrattamentofrm e
    *@param id di tipo stringa per modificare i dati nel database rispetto a
    *id inserito sull'interfaccia grafica
    */
    @Override
    public void modificatrattamento(Datatrattamento data, String id) {
      try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
           
             PreparedStatement pstm = conn.prepareStatement("update  trattamento set Trattamento ='"+data.getNometrattamento()+"',Costo ='"+data.getCosto()+"' where IdTrattamento=?");
              pstm.setString(1, id);
             pstm.executeUpdate();
             JOptionPane.showMessageDialog(null, "TRATTAMENTO MODIFICATO CON SUCCESSO");
            
       
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
    }

    
    /**
     * cancellatrattamento accetta come parametro
    *@param id di tipo stringa per cancellare i dati del trattamento del trattamento rispetto a
    *id inserito sull'interfaccia grafica
    */
  
    @Override
    public void cancellatrattamento(String id) {
         try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql = "delete from trattamento where IdTrattamento=?";
             PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
             JOptionPane.showMessageDialog(null, "TRATTAMENTO CANCELLATO CON SUCCESSO");
            
       
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
    }

    
    /**
     * ricercatrattamento accetta come parametro
    *@param id di tipo stringa e
    *@param username di tipo stringa
    *per ricercare i dati del trattamento nel data base rispetto a
    *id inserito sull'interfaccia grafica e username
    *del dentista d'interesse
    */
    @Override
    public Datatrattamento ricercatrattamento(String id, String username) {
       try {
            //abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql = "select * from trattamento where IdTrattamento=? and Nomeutente=?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
             pstm.setString(2, username);
            ResultSet rs= pstm.executeQuery();
            if(rs.next() == true){
            Datatrattamento data = new Datatrattamento(rs.getString(2),rs.getString(3),"");
            return data;
            }
            else {
            JOptionPane.showMessageDialog(null, "ID TRATTAMENTO NON TROVATO");
            JOptionPane.showMessageDialog(null, "RINSERISCI ID  DEL TRATTAMENTO");
            Datatrattamento data1 = new Datatrattamento("","","");
                return data1;
            }
          
        } catch (Exception ex) {
           ex.printStackTrace();
          
        }
        return null;
    }

    

/**
 * gettabletrattamento accetta come parametro
 * @param username di tipo stringa
 * per selezionare una sequenza di tuple che hanno come username il dentista d'interesse
 * e me lo restituisce 
 * @return ResultSet che sono i risultati da presentare su forma grafica
 * al livello dell'interfaccia grafica
 */
    @Override
    public ResultSet gettabletrattamento(String username) {
           try {
//abilitating my driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //collegamento con lo schema
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/dentistmanager","root","Csc27alpha2022*" );
            //creazione delle preparedstatement per scrivere e eseguire le query
            String sql= "select IdTrattamento,Trattamento,Costo from trattamento where Nomeutente=? order by Trattamento";
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
