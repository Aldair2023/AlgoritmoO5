/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import clase.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author amoreno15
 */
public class Principal extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Principal
     */
    
    Cuenta x;
    
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        txtIDE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdActualizar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        cmdMostar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtIngresar = new javax.swing.JTextField();
        cmdRetirar = new javax.swing.JButton();
        txtRetirar = new javax.swing.JTextField();
        cmdIngresar = new javax.swing.JButton();
        txtInt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuenta de Banco");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 190, 30));
        jPanel1.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 30));
        jPanel1.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 120, 30));
        jPanel1.add(txtIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saldo Actual");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de Cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("# De IDE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cmdActualizar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdActualizar.setText("actualizar");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 110, 40));

        cmdLimpiar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 40));

        cmdCrear.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 110, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setEditable(false);
        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 120));

        cmdMostar.setText("Mostrar");
        cmdMostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 270, 180));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 40));

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        jPanel3.add(txtRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 40));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 250, 180));
        jPanel1.add(txtInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Interes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/57E.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostarActionPerformed
        // TODO add your handling code here:
        
        String aux;
        aux = x.mostrar();
        txtMostrar.setText(aux);
        
    }//GEN-LAST:event_cmdMostarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        
        try{
        long cuenta, ide;
        double saldo;
        
        cuenta = Long.parseLong(txtInteres.getText());
        ide = Long.parseLong(txtIDE.getText());
        saldo = Double.parseDouble(txtSaldoActual.getText());

        x = new Cuenta(cuenta, ide ,saldo);
            JOptionPane.showMessageDialog(this, "Cuenta creada exitosomente");
        
            
            
        }catch(NumberFormatException k ){
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese numeros", "ERROR", JOptionPane.WARNING_MESSAGE);
        }    
        
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
        // TODO add your handling code here:
        
        int valoringresar = Integer.parseInt(txtIngresar.getText());
        
        x.ingresar(valoringresar);
        
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
        // TODO add your handling code here:
        
        int valoretirar = Integer.parseInt(txtRetirar.getText());
        
        if(valoretirar > x.getSaldo_actual()){
            JOptionPane.showMessageDialog(this, "No puedes retirar mas de lo que tienes " ,"ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
        
        x.retirar(valoretirar);
        }
    
        
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        // TODO add your handling code here:
        
        int ian = Integer.parseInt(txtInt.getText());
        
        x.actulizarSaldo(ian);
            JOptionPane.showMessageDialog(this, "saldo actualizado");
        
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:
        
       txtIDE.setText("");
       txtIngresar.setText("");
       txtInt.setText("");
       txtInteres.setText("");
       txtMostrar.setText("");
       txtRetirar.setText("");
       txtSaldoActual.setText("");
       txtIDE.requestFocusInWindow();
       
       
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIDE;
    private javax.swing.JTextField txtIngresar;
    private javax.swing.JTextField txtInt;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextField txtRetirar;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
