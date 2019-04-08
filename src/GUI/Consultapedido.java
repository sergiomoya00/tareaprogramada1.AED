package GUI;
/*
Se realizan los imports que se necesitan para instancear los objetos
 */
import Lottery.LotteryManager;
import Lottery.Order;
import Lottery.Preorder;
import Lottery.Tickets;
import javax.swing.table.DefaultTableModel;




public class Consultapedido extends javax.swing.JFrame {

    /**
     Se crean atributos de tipo Tickets,Order,Preorder para instancear objetos 
     *  e insertarlos a las diferentes estrucuras de datos
     */
    private Tickets ticket;
    private Order order;
    private Preorder preorder;
   


    /*
   Se realizan los gets de los atributos 
 */

    public Preorder getPreorder() {
        return preorder;
    }

    public Order getOrder() {
        return order;
    }

    public Tickets getTicket() {
        return ticket;
    }

    public Consultapedido() {
        initComponents();
        refresh();
    }
    /*
     Método utilizado para que se visualicen en la tabla, los elementos de la lista preOrders
     
 */
    public void refresh() {
        DefaultTableModel model = ((DefaultTableModel) Tablaticket.getModel());
        model.setRowCount(0);
        for (Preorder preorder : LotteryManager.getInstance().getpreOrders()) {
            model.addRow(new Object[]{
                preorder.getClientName(), preorder.getNumber(), preorder.getRaffleType(), preorder.getPrice()
            });

        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaticket = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Consultar pedido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        Tablaticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre cliente", "Numero o combinacion", "Tipo de sorteo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(Tablaticket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 590, 140));

        jButton1.setText("Agregar pedidos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jButton2.setText("Eliminar pedidos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jButton3.setText("Terminar pedido");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pedidocliente usuario = new Pedidocliente();
        usuario.setVisible(true);
        this.setVisible(false);
        // Botón utilizado para que el cliente pueda devolverse a la ventana Pedidocliente y agregar otro tiquete
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int size = LotteryManager.getInstance().getpreOrders().size();
        for (int i = 0; i < size; i++) { // For utilizado para insertar uno por uno, los elementos de la lista preOrder en la cola de prioridad
            this.order = new Order();
            Preorder current = LotteryManager.getInstance().getPreorder(i); // Se obtiene el elemento de la lista preOrder en la posición "i"
            String client = current.getClientName();
            String number = current.getNumber();
            int price = current.getPrice();
            String Raffletype = current.getRaffleType();
            String correo=current.getEmail();
            
            int age = current.getAge();
            this.order.setEmail(correo); // Se realizan los sets de la cola de prioridad
            this.order.setClientName(client);
            this.order.setNumber(number);
            this.order.setPrice(price);
            this.order.setRaffleType(Raffletype);
            this.order.setAge(age);
            LotteryManager.getInstance().getOrderrr().insert(order); // Se realiza la insercion en la cola de prioridad
}
        
        LotteryManager.getInstance().getpreOrders().clear();// Se limpia la lista preOrders
        LotteryManager.getInstance().getClient().clear();
        Finalpedido usuario = new Finalpedido();// Se cambia a la ventana Finalpedido
        usuario.setVisible(true);
        this.setVisible(false);        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.ticket = new Tickets(); 

        int size = LotteryManager.getInstance().getpreOrders().size();
        for (int i = 0; i < size; i++) { // For utilizado para agregar los tiquetes que el cliente ya no quiere, de nuevo en la lista de tiquetes disponibles
            Preorder current = LotteryManager.getInstance().getPreorder(Tablaticket.getSelectedRow());// Obtenemos el tiquete que el usuario no quiere y que está seleccionado en la tabla
            String transmittername = current.getTransmittername();
            String raffletype = current.getRaffleType();
            String number = current.getNumber();
            int price = current.getPrice();
            this.ticket.setNum(number); // Se realizan los sets en la clase Tickets
            this.ticket.setRaffleType(raffletype);
            this.ticket.setPrice(price);
            this.ticket.setTransmitterName(transmittername);
            LotteryManager.getInstance().removepreOrder(this.Tablaticket.getSelectedRow()); // Se elimina el tiquete seleccionado de la lista preOrder
            LotteryManager.getInstance().addTickets(ticket);// Se añade el tiquete a la clase Tickets
            refresh();// Se realiza el método refresh para que se realice la actualización en la tabla del tiquete eliminado
        }       
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
            java.util.logging.Logger.getLogger(Consultapedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultapedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultapedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultapedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultapedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablaticket;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
