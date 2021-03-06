package GUI;
import Collections.*;
import Lottery.*;
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fanny Brenes
 */
public class CrearSorteo extends javax.swing.JFrame {
    private Raffle raffle;
    private Loteria loteria;
    private Lotto lotto;
    private Bingo bingo;
    private Tiempos tiempos;

    /**
     * Creates new form PedidoTicket
     *
     * @return
     */
    public Raffle getClient() {
        return raffle;
    }
    public Loteria getLoteria(){
       return loteria;
    }
    public Lotto getLotto(){
       return lotto;
    }
     public Bingo getBingo(){
       return bingo;
    }
     public Tiempos getTiempos(){
       return tiempos;
    }
    /**
     * Creates new form CrearSorteo
     */
    public CrearSorteo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        comboraffle = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtemision = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Creación de Sorteo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel2.setText("Nombre del sorteo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, -1));

        comboraffle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lotería", "Lotto", "Bingo", "Tiempos" }));
        comboraffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboraffleActionPerformed(evt);
            }
        });
        getContentPane().add(comboraffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, -1));

        jLabel3.setText("Tipo de sorteo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, -1));

        jLabel5.setText("Fecha del sorteo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, -1, -1));

        jLabel6.setText("Fecha de emision");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txtemision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.raffle= new Raffle();
    this.raffle.setName(txtname.getText());
    this.raffle.setType((String)comboraffle.getSelectedItem());
    this.raffle.setEmission(txtemision.getText());
    this.raffle.setDate(txtdate.getText());
    Random rand = new Random();
    int code = rand.nextInt(100);
    this.raffle.setCode(code);
    if (comboraffle.getSelectedIndex()==0){
    this.loteria=new Loteria();
    this.loteria.setName(txtname.getText());
    this.loteria.setEmissiondate(txtemision.getText());
    this.loteria.setLoteriadate(txtdate.getText());
    LotteryManager.getInstance().addLoteria(loteria);
    }
    if (comboraffle.getSelectedIndex()==1){
    this.lotto=new Lotto();
    this.lotto.setName(txtname.getText());
    this.lotto.setLottodate(txtdate.getText());
    this.lotto.setEmissiondate(txtemision.getText());
    LotteryManager.getInstance().addLotto(lotto);
    }
    if (comboraffle.getSelectedIndex()==2){
    this.bingo=new Bingo();
    this.bingo.setName(txtname.getText());
    this.bingo.setDatebingo(txtdate.getText());
    this.bingo.setDateemission(txtemision.getText());
    LotteryManager.getInstance().addBingo(bingo);
    }
    if (comboraffle.getSelectedIndex()==3){
    this.tiempos=new Tiempos();
    this.tiempos.setName(txtname.getText());
    this.tiempos.setDateemission(txtemision.getText());
    this.tiempos.setDatetiempos(txtdate.getText());
    LotteryManager.getInstance().addTiempos(tiempos);
    }
    LotteryManager.getInstance().addRaffle(raffle);
    Gestiónsorteos usuario= new Gestiónsorteos();
    usuario.setVisible(true);
    this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboraffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboraffleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboraffleActionPerformed

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
            java.util.logging.Logger.getLogger(CrearSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearSorteo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboraffle;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtemision;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
