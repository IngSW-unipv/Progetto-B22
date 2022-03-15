package it.unipv.view;

import it.unipv.JAVABEAN.Datatrattamento;

import java.sql.ResultSet;
import javax.swing.JButton;
import net.proteanit.sql.DbUtils;

/**
 *Gestionetrattamentofrm mi permette di creare la frame dell'appuntamento
 *e ha come metodi
 *@see initComponents
 *@see getdatiGestionetrattamentofrm
 *@see stampatabellatrattamento
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
public class Gestionetrattamentofrm extends javax.swing.JFrame {
	/**
	 * username dentista
	 */
String username;
/**
 * Creates new form Gestionetrattamentofrm e accetta come parametro
 * @param username che e' il nome del dentista 
 * e lo riceve dal Main che lo istanzia 
 * @see it.unipv.MainTrattamento
 */
    public Gestionetrattamentofrm(String username) {
        this.username=username;
        initComponents();
        this.setTitle("GESTIONE PRESCRIZIONI");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellatrattamento = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        ButtonSalva = new javax.swing.JButton();
        ButtonModifica = new javax.swing.JButton();
        ButtonCancella = new javax.swing.JButton();
        ButtonChiudi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ButtonSearch = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txttrattamento = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tabellatrattamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabellatrattamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabellatrattamento);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/unipv/view/trattamenti.png"))); // NOI18N
        jLabel8.setText("Gestione Trattamenti");

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DATI DEGLI TRATTAMENTI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome Trattamento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cerca Trattamento Da Modifiicare o Cancellare");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Costo");

        ButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSearch.setText("Search ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(ButtonModifica)
                                .addGap(104, 104, 104)
                                .addComponent(ButtonCancella)))))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcosto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(txttrattamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonChiudi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonSearch)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txttrattamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalva)
                    .addComponent(ButtonModifica)
                    .addComponent(ButtonCancella)
                    .addComponent(ButtonChiudi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @return un riferimento di tipo Datatrattamento
     * @see it.unipv.JAVABEAN.Datatrattamento
     * che fa riferimento ad un oggetto che contiene i dati estratto dalla
     * view
     */
    public Datatrattamento getdatiGestionetrattamentofrm(){
         //completa parte nome utente dentista
 Datatrattamento treatment = new Datatrattamento(txttrattamento.getText(),txtcosto.getText(),username);
 return treatment;
 }/**
     * 
     * @param result che sono i risultati da disporre ricevuto dal controllore dopo
     * che si schiaccia i button Salva,Modifica o Cancella sulla view del trattamento
     */
    public void stampatabellatrattamento(ResultSet result){
    tabellatrattamento.setModel(DbUtils.resultSetToTableModel(result));
    }
    /**
     * 
     * @return username dal dentista
     */
    public String getusername(){
   return username;
    }
    /**
     * 
     * @return id del trattamento ricevuto dalla view per la modifica o la ricerca
     */
         public String getID(){
    return txtID.getText();
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
         * @param treat che e' il riferimento all'oggetto generato dal metodo  ricercaappuntamento
         * @see it.unipv.DAO.ObjectTrattamento
         */       
   public void RiempiCampi(Datatrattamento treat) 
{

txttrattamento.setText(treat.getNometrattamento());
txtcosto.setText(treat.getCosto());


}
   
   /**
    * azzera i campi della view
    */
    
         public void azzeracampi(){

txttrattamento.setText("");
txtcosto.setText("");
txtID.setText("");

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

/**
* Riferimento alla  JLabel sulla view
*/
private javax.swing.JLabel jLabel3;
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
* Riferimento alla  JLabel sulla view
*/
private javax.swing.JPanel jPanel1;
/**
* Riferimento alla  JScrollpane sulla view
*/
private javax.swing.JScrollPane jScrollPane1;
/**
 * Riferimento alla JTable della tabella del trattamento per stampare i dati del trattamento
 */
private javax.swing.JTable tabellatrattamento;

/**
* Riferimento alla JtextFied del trattamento effettuato
*/
private javax.swing.JTextField txttrattamento;
/**
* Riferimento alla JtextFied del ID del trattamento
*/
private javax.swing.JTextField txtID;
/**
* Riferimento alla JtextFied del costo del trattamento 
* 
*/
private javax.swing.JTextField txtcosto;
// End of variables declaration//GEN-END:variables
    // End of variables declaration//GEN-END:variables
}