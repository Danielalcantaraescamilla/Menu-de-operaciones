/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionnumeros;

import javax.swing.JOptionPane;


public class FrmPrincipal extends javax.swing.JFrame {

    /*generamos el modulo para cerar unicamente este frame*/
    
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
private void cerrar(){
        String botones[]={"Cerrar ", "Cancelar "};
        int respuesta = JOptionPane.showOptionDialog(this,"Deseas cerrar la ventana",  "Confirmacion", 0, 0, null, botones, this);
        if(respuesta==JOptionPane.YES_OPTION){
            this.dispose();
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

        JLabel = new javax.swing.JLabel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JLabel.setBackground(new java.awt.Color(255, 51, 51));
        JLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        JLabel.setText("Menu");
        JLabel.setToolTipText("");

        btnSuma.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(153, 153, 255));
        btnSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/mas.png"))); // NOI18N
        btnSuma.setText("Suma");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnResta.setForeground(new java.awt.Color(51, 51, 255));
        btnResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/menos.png"))); // NOI18N
        btnResta.setText("Resta");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 153, 153));
        btnDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/dividir.png"))); // NOI18N
        btnDivision.setText("Division");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplica.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnMultiplica.setForeground(new java.awt.Color(204, 0, 255));
        btnMultiplica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/multiplicar.png"))); // NOI18N
        btnMultiplica.setText("Multiplicacion");
        btnMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnResta)
                .addGap(50, 50, 50)
                .addComponent(btnDivision)
                .addGap(55, 55, 55)
                .addComponent(btnMultiplica)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        FrmSuma frmSuma = new FrmSuma();
        frmSuma.setVisible(true);
        
        
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        // TODO add your handling code here:
        FrmResta frmResta = new FrmResta();
        frmResta.setVisible(true);
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        FrmDivision frmDivision = new FrmDivision();
        frmDivision.setVisible(true);
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaActionPerformed
        // TODO add your handling code here:
        FrmMultiplicacion frmMultiplicacion = new FrmMultiplicacion();
        frmMultiplicacion.setVisible(true);
    }//GEN-LAST:event_btnMultiplicaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      cerrar();  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    // End of variables declaration//GEN-END:variables

    private Object getclass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOpaque(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
