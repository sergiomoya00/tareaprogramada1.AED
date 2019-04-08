
package GUI;
//Se realizan imports necesarios
import Lottery.LotteryManager;
import Lottery.Raffle;
import  Lottery.Bingo;
import  Lottery.Loteria;
import Lottery.Lotto;
import  Lottery.Tiempos;
import javax.swing.table.DefaultTableModel;


public class Realizarsorteos extends javax.swing.JFrame {
    //Se crean atributos de tipo Raffle,Lotto,Loteria,Bingo,Tiempos para instancear objetos
    private Raffle raffle;
     private Lotto lotto;
     private Loteria loteria;
     private Bingo bingo;
     private Tiempos tiempos;
    //Se realiza el método get, para cada uno de los atributos
     public Lotto getLotto() {
        return lotto;
    }
      public Raffle getRaffle() {
        return raffle;
    }
       public Loteria getLoteria() {
        return loteria;
    }
        public Tiempos getTiempos() {
        return tiempos;
    }
    public Bingo getBingo() {
        return bingo;
    }
    /**
     * Creates new form Realizarsorteos
     */
    public Realizarsorteos() {
        initComponents();
         refreshSearch();
    }
     //Método para visualizar en la tabla, los diferentes numeros ganadores de los diferentes sorteos
     private void refreshSearch() {
     DefaultTableModel model = ((DefaultTableModel) raffletable.getModel());
        model.setRowCount(0);
        
        
        for (Raffle raffle : LotteryManager.getInstance().getRaffles()) { //For utlizado para insertar tiquetes de tipo Loteria con el numero ganador
              if (combotype.getSelectedIndex()==0){
                if (raffle.getType()=="Loteria"){
                this.loteria=new Loteria();
                
                
                
            model.addRow(new Object[]{
                 raffle.getName(),raffle.getDate(), raffle.getEmission(),this.loteria.getWinner()
            });}}
              if (combotype.getSelectedIndex()==1){ //For utlizado para insertar tiquetes de tipo Lotto con el numero ganador
                this.lotto=new Lotto();
                this.lotto.lottowinner();
                if (raffle.getType()=="Lotto"){
            model.addRow(new Object[]{
                 raffle.getName(),raffle.getDate(), raffle.getEmission(),this.lotto.getWinnernumb()
            });}}
              if (combotype.getSelectedIndex()==2){//For utlizado para insertar tiquetes de tipo Bingo con el numero ganador
                if (raffle.getType()=="Bingo"){
                this.bingo=new Bingo();
                this.bingo.Bingowinner();
            model.addRow(new Object[]{
                 raffle.getName(),raffle.getDate(), raffle.getEmission(),this.bingo.getWinnernumb()
            });}}
              if (combotype.getSelectedIndex()==3){ //For utlizado para insertar tiquetes de tipo Tiempos con el numero ganador
                if (raffle.getType()=="Tiempos"){
                this.tiempos=new Tiempos();
                this.tiempos.Tiemposwinner();
            model.addRow(new Object[]{
                 raffle.getName(),raffle.getDate(), raffle.getEmission(),this.tiempos.getWinner()
            });}}
     }}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combotype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        raffletable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Realizar sorteo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loteria", "Lotto", "Bingo", "Tiempos" }));
        getContentPane().add(combotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 180, -1));

        raffletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre del sorteo", "Fecha del sorteo", "Tipo de sorteo", "Numero o combinación ganadora"
            }
        ));
        jScrollPane1.setViewportView(raffletable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 140));

        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Gestionjps usuario= new Gestionjps();
    usuario.setVisible(true);
    this.setVisible(false);          // Botón para acceder a la Gestion de la junta
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    refreshSearch();        // Método para actualizar la tabla
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Realizarsorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Realizarsorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Realizarsorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Realizarsorteos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Realizarsorteos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable raffletable;
    // End of variables declaration//GEN-END:variables
}
