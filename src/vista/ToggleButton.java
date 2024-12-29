/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Carlos
 */
public class ToggleButton extends javax.swing.JFrame {

    /**
     * Creates new form ToggleButton
     */
    public ToggleButton() {
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
        lblAlimentacion = new javax.swing.JLabel();
        txtAlimentacion = new javax.swing.JTextField();
        lblAgua = new javax.swing.JLabel();
        lblLuz = new javax.swing.JLabel();
        lblRenta = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        tglTotal = new javax.swing.JToggleButton();
        tglAgua = new javax.swing.JToggleButton();
        tglLuz = new javax.swing.JToggleButton();
        tglRenta = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("CONSUMO DEL MES");

        lblAlimentacion.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblAlimentacion.setText("Alimentación");

        lblAgua.setText("10");

        lblLuz.setText("7.50");

        lblRenta.setText("120");

        tglTotal.setBackground(new java.awt.Color(153, 0, 153));
        tglTotal.setForeground(new java.awt.Color(255, 255, 255));
        tglTotal.setText("Total");
        tglTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglTotalActionPerformed(evt);
            }
        });

        tglAgua.setBackground(new java.awt.Color(102, 204, 255));
        tglAgua.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        tglAgua.setForeground(new java.awt.Color(255, 255, 255));
        tglAgua.setText("Agua");
        tglAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglAguaActionPerformed(evt);
            }
        });

        tglLuz.setBackground(new java.awt.Color(255, 255, 0));
        tglLuz.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        tglLuz.setText("Luz");
        tglLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglLuzActionPerformed(evt);
            }
        });

        tglRenta.setBackground(new java.awt.Color(204, 204, 255));
        tglRenta.setText("Renta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAlimentacion)
                                .addComponent(tglAgua, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblLuz)
                                        .addComponent(lblAgua)
                                        .addComponent(lblRenta)))))
                        .addComponent(tglRenta)
                        .addComponent(tglLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tglTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlimentacion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblAgua)
                        .addGap(29, 29, 29)
                        .addComponent(lblLuz)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRenta)
                            .addComponent(tglRenta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tglAgua)
                        .addGap(18, 18, 18)
                        .addComponent(tglLuz)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tglTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglTotalActionPerformed
        // TODO add your handling code here:
        
        double alimentacion,luz,agua,renta;
        
        alimentacion = Double.parseDouble(txtAlimentacion.getText());
        agua = Double.parseDouble(lblAgua.getText());
        luz = Double.parseDouble(lblLuz.getText());
        renta = Double.parseDouble(lblRenta.getText());
        
        double valorTotal;
        
        valorTotal = alimentacion;
        
        if (tglAgua.isSelected()) {
            valorTotal = valorTotal+agua;
        }
        
        if (tglLuz.isSelected()) {
            valorTotal = valorTotal+luz;
        }
        
        if (tglRenta.isSelected()) {
            valorTotal = valorTotal+renta;
        }
        
        txtTotal.setText(valorTotal+"");
    }//GEN-LAST:event_tglTotalActionPerformed

    private void tglAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglAguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglAguaActionPerformed

    private void tglLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglLuzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglLuzActionPerformed

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
            java.util.logging.Logger.getLogger(ToggleButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToggleButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToggleButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToggleButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToggleButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblAlimentacion;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblRenta;
    private javax.swing.JToggleButton tglAgua;
    private javax.swing.JToggleButton tglLuz;
    private javax.swing.JToggleButton tglRenta;
    private javax.swing.JToggleButton tglTotal;
    private javax.swing.JTextField txtAlimentacion;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
