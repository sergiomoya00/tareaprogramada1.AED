/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Lottery.Bingo;
import Lottery.Loteria;
import Lottery.LotteryManager;
import Lottery.Lotto;
import Lottery.Tickets;
import Lottery.Tiempos;

/**
 *
 * @author samoy
 */
public class TicketWindow extends javax.swing.JFrame {

    private Tickets ticket;
    private Loteria loteria;
    private Lotto lotto;
    private Bingo bingo;
    private Tiempos tiempos;
    
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
    public Tickets getTickets(){
        return ticket;
    }

    /**
     * Creates new form TicketWindow
     */
    public TicketWindow() {
        initComponents();

        this.typeTxt.addItem("Tipos de rifas");
        for (RaffleType topic : RaffleType.values()) {
            typeTxt.addItem(topic.name());
        }
    }

    public void refreshT() {
        
        String topicName = (String) typeTxt.getSelectedItem();
        if (typeTxt.getSelectedIndex() == 0) {
            topicName = null;
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        trasmitterName = new javax.swing.JTextField();
        txtnum1 = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        combotype = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtnum2 = new javax.swing.JTextField();
        txtnum3 = new javax.swing.JTextField();
        txtnum4 = new javax.swing.JTextField();
        txtnum5 = new javax.swing.JTextField();
        txtnum6 = new javax.swing.JTextField();
        txtnum7 = new javax.swing.JTextField();
        txtnum8 = new javax.swing.JTextField();
        txtnum9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Crear ticket");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel2.setText("Nombre del trasmisor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 96, -1, -1));

        jLabel3.setText("Tipos de rifa:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 159, -1, -1));

        jLabel4.setText("Número o combinación:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        trasmitterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasmitterNameActionPerformed(evt);
            }
        });
        getContentPane().add(trasmitterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 238, -1));

        txtnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 40, -1));
        getContentPane().add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 70, -1));

        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loteria", "Lotto", "Bingo", "Tiempos" }));
        getContentPane().add(combotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 238, -1));

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));
        getContentPane().add(txtnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 40, -1));

        txtnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 40, -1));
        getContentPane().add(txtnum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 40, -1));
        getContentPane().add(txtnum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 40, -1));
        getContentPane().add(txtnum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 40, -1));
        getContentPane().add(txtnum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 40, -1));

        txtnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum8ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 40, -1));

        txtnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum9ActionPerformed(evt);
            }
        });
        getContentPane().add(txtnum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 40, -1));

        jLabel7.setText("Lotto");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 20));

        jLabel8.setText("Bingo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jLabel9.setText("Tiempos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel10.setText("Loteria");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trasmitterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasmitterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trasmitterNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String type = (String) this.combotype.getSelectedItem();
        this.ticket = new Tickets();
        
        if (combotype.getSelectedIndex()==0){
        this.ticket.setTransmitterName(trasmitterName.getText());
        this.ticket.setRaffleType(type);
        int num1 = Integer.parseInt(txtnum1.getText());
        int prices = Integer.parseInt(priceTxt.getText());
        this.ticket.setNumber1(num1);
        this.ticket.setPrice(prices);
        
        
        }
        if (combotype.getSelectedIndex()==1){
        this.ticket.setTransmitterName(trasmitterName.getText());
        this.ticket.setRaffleType(type);
        int num1 = Integer.parseInt(txtnum1.getText());
        int num2 = Integer.parseInt(txtnum2.getText());
        int num3 = Integer.parseInt(txtnum3.getText());
        int num4 = Integer.parseInt(txtnum4.getText());
        int num5 = Integer.parseInt(txtnum5.getText());
        int num6 = Integer.parseInt(txtnum6.getText());
        int num7 = Integer.parseInt(txtnum7.getText());
        int prices = Integer.parseInt(priceTxt.getText());
        this.ticket.setNumber1(num1);
        this.ticket.setNumber2(num2);
        this.ticket.setNumber3(num3);
        this.ticket.setNumber4(num4);
        this.ticket.setNumber5(num5);
        this.ticket.setNumber6(num6);
        this.ticket.setNumber7(num7);
        this.ticket.setPrice(prices);
        
        }
        if (combotype.getSelectedIndex()==2){
        this.ticket.setTransmitterName(trasmitterName.getText());
        this.ticket.setRaffleType(type);
        int num1 = Integer.parseInt(txtnum1.getText());
        int num2 = Integer.parseInt(txtnum2.getText());
        int num3 = Integer.parseInt(txtnum3.getText());
        int num4 = Integer.parseInt(txtnum4.getText());
        int num5 = Integer.parseInt(txtnum5.getText());
        int num6 = Integer.parseInt(txtnum6.getText());
        int num7 = Integer.parseInt(txtnum7.getText());
        int num8 = Integer.parseInt(txtnum8.getText());
        int num9 = Integer.parseInt(txtnum9.getText());
        int prices = Integer.parseInt(priceTxt.getText());
        this.ticket.setNumber1(num1);
        this.ticket.setNumber2(num2);
        this.ticket.setNumber3(num3);
        this.ticket.setNumber4(num4);
        this.ticket.setNumber5(num5);
        this.ticket.setNumber6(num6);
        this.ticket.setNumber7(num7);
        this.ticket.setNumber8(num8);
        this.ticket.setNumber9(num9);
        this.ticket.setPrice(prices);
        
        }
        if (combotype.getSelectedIndex()==3){
        this.ticket.setTransmitterName(trasmitterName.getText());
        this.ticket.setRaffleType(type);
        int num1 = Integer.parseInt(txtnum1.getText());
        int num2 = Integer.parseInt(txtnum2.getText());
        int prices = Integer.parseInt(priceTxt.getText());
        this.ticket.setNumber1(num1);
        this.ticket.setNumber2(num2);
        this.ticket.setPrice(prices);
       
        }
        
        LotteryManager.getInstance().addTickets(ticket);
        GestionTickets usuario = new GestionTickets();
        usuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum3ActionPerformed

    private void txtnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum1ActionPerformed

    private void txtnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum8ActionPerformed

    private void txtnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField trasmitterName;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtnum3;
    private javax.swing.JTextField txtnum4;
    private javax.swing.JTextField txtnum5;
    private javax.swing.JTextField txtnum6;
    private javax.swing.JTextField txtnum7;
    private javax.swing.JTextField txtnum8;
    private javax.swing.JTextField txtnum9;
    // End of variables declaration//GEN-END:variables
}
