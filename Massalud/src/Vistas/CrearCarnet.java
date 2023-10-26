
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class CrearCarnet extends javax.swing.JInternalFrame {
    
     private DefaultTableModel modelo = new DefaultTableModel();

    private Principal principal;
    public CrearCarnet(Principal principal) {
        
        initComponents();
        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VENCIMIENTO = new javax.swing.JLabel();
        Plan = new javax.swing.JLabel();
        nombreCompleto1 = new javax.swing.JLabel();
        nroAfiliado1 = new javax.swing.JLabel();
        jBguardarCarnet = new javax.swing.JButton();
        jBregresar = new javax.swing.JButton();
        jLfondoVista = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1062, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VENCIMIENTO.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        VENCIMIENTO.setForeground(new java.awt.Color(255, 255, 255));
        VENCIMIENTO.setText("31/12/23");
        getContentPane().add(VENCIMIENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 70, 40));

        Plan.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        Plan.setForeground(new java.awt.Color(255, 255, 255));
        Plan.setText("MAS JOVEN");
        getContentPane().add(Plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 100, 40));

        nombreCompleto1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        nombreCompleto1.setForeground(new java.awt.Color(255, 255, 255));
        nombreCompleto1.setText("MA VALENTINA MARQUEZ");
        getContentPane().add(nombreCompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 210, 40));

        nroAfiliado1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 24)); // NOI18N
        nroAfiliado1.setForeground(new java.awt.Color(255, 255, 255));
        nroAfiliado1.setText("00 3742 596 40");
        getContentPane().add(nroAfiliado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 310, 210, 40));

        jBguardarCarnet.setBackground(new java.awt.Color(255, 255, 255));
        jBguardarCarnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Bguardar-01.png"))); // NOI18N
        jBguardarCarnet.setBorder(null);
        jBguardarCarnet.setBorderPainted(false);
        jBguardarCarnet.setContentAreaFilled(false);
        jBguardarCarnet.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        jBguardarCarnet.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        jBguardarCarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCarnetActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardarCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 150, 60));

        jBregresar.setText("regresar");
        jBregresar.setBorder(null);
        jBregresar.setBorderPainted(false);
        jBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, -1, -1));

        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/vistaCrearTarjeta-01.png"))); // NOI18N
        jLfondoVista.setMaximumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setMinimumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        getContentPane().add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBguardarCarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCarnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarCarnetActionPerformed

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBregresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Plan;
    private javax.swing.JLabel VENCIMIENTO;
    private javax.swing.JButton jBguardarCarnet;
    private javax.swing.JButton jBregresar;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JLabel nombreCompleto1;
    private javax.swing.JLabel nroAfiliado1;
    // End of variables declaration//GEN-END:variables



}
