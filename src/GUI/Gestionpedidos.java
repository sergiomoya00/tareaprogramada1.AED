
package GUI;
//Se realizan los imports necesarios
import Lottery.Client;
import Lottery.LotteryManager;
import Lottery.Order;
import Lottery.Preorder;
import Lottery.Tickets;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Gestionpedidos extends javax.swing.JFrame {
    //Se crean atributos de tipo Client y Order para instancear objetos
    
    private Order order;
    private Client client;
    //Se crea el método get, para cada atributo creado
    public Order getOrder() {
        return order;
    }
    
    public Client getClient(){
        return client;
    }
    
    public Gestionpedidos() {
        initComponents();
        refreshorder();
    }
    //Método pra que se visualicen en la tabla los pedidos que han realizado los diferentes clientes
    public void refreshorder() {
        DefaultTableModel model = ((DefaultTableModel) tablaconsultar.getModel());
        model.setRowCount(0);

        int size = LotteryManager.getInstance().getOrderrr().size();
        for (int i = 0; i < size; i++) {
            Order order = LotteryManager.getInstance().getOrderrss(i);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Gestionjps usuario= new Gestionjps();
    usuario.setVisible(true);
    this.setVisible(false);                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String host="smtp.gmail.com";
    final String user="bibliotecaati2018@gmail.com";
    final String password="dropbox123";
    
    String to="jabrenega@gmail.com";

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
    message.setText("hola");
    
    Transport.send(message);
    JOptionPane.showMessageDialog(null, "correo enviado");
    
    }   catch (MessagingException e) {
        e.printStackTrace();
        }
    // Botón para enviarle el correo al usuario con sus pedidos
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaconsultar;
    // End of variables declaration//GEN-END:variables
}
