/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Lottery.Client;
import Lottery.LotteryManager;
import Lottery.Order;
import Lottery.Tickets;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fanny Brenes
 */
public class Gestionpedidos extends javax.swing.JFrame {

    private Order order;
    private Client client;
    
    public Order getOrder() {
        return order;
    }
    
    public Client getClient(){
        return client;
    }
    
    /**
     * Creates new form Gestionpedidos
     */
    public Gestionpedidos() {
        initComponents();
        refreshorder();
    }

    public void refreshorder() {
        DefaultTableModel model = ((DefaultTableModel) tablaconsultar.getModel());
        model.setRowCount(0);

        for (Order order : LotteryManager.getInstance().getOrder()) {
            model.addRow(new Object[]{
                order.getClientName(), order.getRaffleType(), order.getAge(), order.getPrice(), order.getNumber(),order.getEmail()
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaconsultar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtmessage = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaconsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre del cliente", "Tipo de rifa", "Edad", "Precio", "Numero o combinacion", "Email"
            }
        ));
        jScrollPane1.setViewportView(tablaconsultar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, 550, 270));

        jLabel1.setText("Atender pedidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jButton1.setText("Atender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        txtmessage.setText("jTextField1");
        getContentPane().add(txtmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        txtcorreo.setText("jTextField2");
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    NoticeClient noticed = new NoticeClient();
    noticed.setVisible(true);
    LotteryManager.getInstance().removeOrder();
        refreshorder();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String host="smtp.gmail.com";
    final String user="bibliotecaati2018@gmail.com";
    final String password="dropbox123";
    
    String to=txtcorreo.getText();

    Properties props=new Properties();
    props.put("mail.smtp.host",host);
    props.put("mail.smtp.auth", "true");  
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.socketFactory.port", 465);
    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.socketFactory.fallback", "false");
    
    Session session=Session.getDefaultInstance(props,new javax.mail.Authenticator(){
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(user,password);
    }
    });
    
    try{
    MimeMessage message=new MimeMessage(session);
    message.setFrom(new InternetAddress(user));
    message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    message.setSubject("Solicitud recibida");
    message.setText(txtmessage.getText());
    
    Transport.send(message);
    JOptionPane.showMessageDialog(null, "correo enviado");
    
    }   catch (MessagingException e) {
        e.printStackTrace();
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Gestionpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestionpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestionpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestionpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestionpedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaconsultar;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtmessage;
    // End of variables declaration//GEN-END:variables
}
