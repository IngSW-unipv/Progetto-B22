
package it.unipv.view;

import it.unipv.JAVABEAN.Datapaziente;
import javax.swing.JButton;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *Gestionepazientefrm mi permette di creare la frame del paziente 
 *e ha come metodi
 *@see initComponents
 *@see getdatiGestionepazientefrm
 *@see stampatabellapaziente
 *@see getID
 *@see getusername
 *@see getButtonSalva
 *@see getButtonModifica
 *@see getButtonCancella
 *@see getButtonChiudi
 *@see getButtonSearch
 *@see RiempiCampi
 *@see azzeracampi
 */
public class Gestionepazientefrm extends javax.swing.JFrame {
/**
 * username del dentista
 */
String username;
    /**
     * Creates new form Gestionepazientefrm e accetta come parametro
     * @param username che e' il nome del dentista 
     * e lo riceve dal Main che lo istanzia 
     * @see it.unipv.MainPaziente
     */
    public Gestionepazientefrm(String username) {
        this.username=username;
        initComponents();
        this.setTitle("GESTIONE PAZIENTE");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabellapaziente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ButtonSalva = new javax.swing.JButton();
        ButtonModifica = new javax.swing.JButton();
        ButtonCancella = new javax.swing.JButton();
        ButtonChiudi = new javax.swing.JButton();
        txtnomepaziente = new javax.swing.JTextField();
        txtcognomepaziente = new javax.swing.JTextField();
        txtcf = new javax.swing.JTextField();
        txtindirizzo = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtcellulare = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ButtonSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabellapaziente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabellapaziente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabellapaziente);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cognome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Indirizzo");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codice Fiscale");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cellulare");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATI DEI PAZIENTI");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/unipv/view/gestionepaziente.png"))); // NOI18N
        jLabel8.setText("Gestione Paziente");

        ButtonSalva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSalva.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSalva.setText("Salva");

        ButtonModifica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonModifica.setForeground(new java.awt.Color(255, 255, 255));
        ButtonModifica.setText("Modifica");

        ButtonCancella.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancella.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancella.setText("Cancella");

        ButtonChiudi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonChiudi.setForeground(new java.awt.Color(255, 255, 255));
        ButtonChiudi.setText("Chiudi");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cerca Dato Da Modificare O Cancellare");

        ButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSearch.setText("Search CF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtnomepaziente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(ButtonModifica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCancella))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcf, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcognomepaziente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtindirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtID)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnomepaziente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtcf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcognomepaziente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtindirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtcellulare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSearch)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalva)
                    .addComponent(ButtonModifica)
                    .addComponent(ButtonCancella)
                    .addComponent(ButtonChiudi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @return un riferimento di tipo Datapaziente 
     * @see it.unipv.JAVABEAN.Datapaziente
     * che fa riferimento ad un oggetto che contiene i dati estratto dalla
     * view
     */
    public Datapaziente getdatiGestionepazientefrm(){
        
 Datapaziente patient = new Datapaziente(txtnomepaziente.getText(),txtcognomepaziente.getText(),txtcf.getText(),txtindirizzo.getText(),txtemail.getText(),txtcellulare.getText(),username);
 return patient;
 }
    
    /**
     * 
     * @param result che sono i risultati da disporre ricevuto dal controllore dopo
     * che si schiaccia i button Salva,Modifica o Cancella sulla view del paziente
     */
    public void stampatabellapaziente(ResultSet result){
    tabellapaziente.setModel(DbUtils.resultSetToTableModel(result));
    }
    
    /**
     * 
     * @return id del paziente ricevuto dalla view per la modifica o la ricerca
     */
    public String getID(){
    return txtID.getText();
    }
    
    /**
     * 
     * @return username del dentista
     */
    public String getusername(){
   return username;
    }
    
    /**
     * 
     * @return il riferimento alla JButton Salva
     */
         public JButton getButtonSalva(){
 return ButtonSalva;
 }
         /**
          * 
          * @return il riferimento alla JButton Modifica
          */
      public JButton getButtonModifica(){
 return ButtonModifica;
 }
      /**
       * 
       * @return il riferimento alla JButton Cancella
       */
     public JButton getButtonCancella(){
 return ButtonCancella;
 }
     /**
      * 
      * @return il riferimento alla JButton Chiudi
      */
         public JButton getButtonChiudi(){
 return ButtonChiudi;
 }
         /**
          * 
          * @return il riferimento alla JButton Search
          */
             public JButton getButtonSearch(){
 return ButtonSearch;
 }
             /**
              * riempisce i campi della view usando il parametro 
              * @param pat che e' il riferimento all'oggetto generato dal metodo  ricercapaziente
              * @see it.unipv.DAO.ObjectPaziente
              */
             public void RiempiCampi(Datapaziente pat) 
{

txtnomepaziente.setText(pat.getNome());
txtcognomepaziente.setText(pat.getCognome());
txtcf.setText(pat.getCf());
txtindirizzo.setText(pat.getIndirizzo());
txtemail.setText(pat.getEmailpaziente());
txtcellulare.setText(pat.getCellularepaziente());


}      
             /**
              * azzera i campi della view
              */
                 public void azzeracampi(){

txtnomepaziente.setText("");
txtcognomepaziente.setText("");
txtcf.setText("");
txtID.setText("");
txtcellulare.setText("");
txtemail.setText("");
txtindirizzo.setText("");

 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
                 
    /**
    * Riferimento alla JButton Cancella
    */
    private javax.swing.JButton ButtonCancella;
    /**
     * Riferimento alla JButton Chiudi
     */
    private javax.swing.JButton ButtonChiudi;
    /**
     * Riferimento alla JButton Modifica
     */
    private javax.swing.JButton ButtonModifica;
    /**
     * Riferimento alla JButton Salva
     */
    private javax.swing.JButton ButtonSalva;
    /**
     * Riferimento alla JButton Search
     */
    private javax.swing.JButton ButtonSearch;
    
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel1;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel2;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel3;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel4;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel5;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel6;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel7;
      /**
      * Riferimento alla  JLabel sulla view
      */
    private javax.swing.JLabel jLabel8;
    /**
     * Riferimento alla  JLabel sulla view
     */
    private javax.swing.JLabel jLabel9;
    /**
     * Riferimento alla  JPanel sulla view
     */
    private javax.swing.JPanel jPanel1;
    /**
     * Riferimento alla  Jscrollpane
     */
    private javax.swing.JScrollPane jScrollPane1;
    /**
     * Riferimento alla  JTable per stampare i dati del paziente
     */
    private javax.swing.JTable tabellapaziente;
    /**
     * Riferimento alla JtextFied dell'ID del paziente
     */
    private javax.swing.JTextField txtID;
    /**
     * Riferimento alla JtextFied  del cellulare del paziente
     */
    private javax.swing.JTextField txtcellulare;
    /**
     * Riferimento alla JtextFied del codice fiscale del paziente
     */
    private javax.swing.JTextField txtcf;
    /**
     * Riferimento alla JtextFied  del cognome del paziente
     */
    private javax.swing.JTextField txtcognomepaziente;
    /**
     * Riferimento alla JtextFied dell'email del paziente
     */
    private javax.swing.JTextField txtemail;
    /**
     * Riferimento alla JtextFied dell'indirizzo del paziente
     */
    private javax.swing.JTextField txtindirizzo;
    /**
     * Riferimento alla JtextFied  del nome del paziente
     */
    private javax.swing.JTextField txtnomepaziente;
    // End of variables declaration//GEN-END:variables
}
