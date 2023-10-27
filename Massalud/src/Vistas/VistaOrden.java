
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;



public class VistaOrden extends javax.swing.JInternalFrame {
    
     private DefaultTableModel modelo = new DefaultTableModel();

    private Principal principal= new Principal ();
    public VistaOrden(Principal principal) {
        
        initComponents();
        armarCabecera();
        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTnroOrden = new javax.swing.JTextField();
        jTImporte = new javax.swing.JTextField();
        jTAfiliado = new javax.swing.JTextField();
        jTidPrestador = new javax.swing.JTextField();
        jTformadePago1 = new javax.swing.JTextField();
        jBcrearOrden = new javax.swing.JButton();
        jBmiPerfil = new javax.swing.JButton();
        jBbuscarporFecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBbuscar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaOrden = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLfondoVista = new javax.swing.JLabel();
        jLventanaEmergente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1062, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTnroOrden.setBackground(new java.awt.Color(246, 246, 248));
        jTnroOrden.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTnroOrden.setForeground(new java.awt.Color(0, 0, 0));
        jTnroOrden.setText("     Nro de Orden");
        jTnroOrden.setToolTipText("");
        jTnroOrden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTnroOrden.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jTnroOrden.setEnabled(false);
        jTnroOrden.setSelectionColor(new java.awt.Color(0, 0, 56));
        jTnroOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnroOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(jTnroOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 300, 40));

        jTImporte.setBackground(new java.awt.Color(246, 246, 248));
        jTImporte.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTImporte.setForeground(new java.awt.Color(0, 0, 0));
        jTImporte.setText("     Importe");
        jTImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTImporte.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTImporte.setEnabled(false);
        jTImporte.setSelectionColor(new java.awt.Color(0, 0, 56));
        jTImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTImporteActionPerformed(evt);
            }
        });
        getContentPane().add(jTImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 300, 40));

        jTAfiliado.setBackground(new java.awt.Color(246, 246, 248));
        jTAfiliado.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTAfiliado.setForeground(new java.awt.Color(0, 0, 0));
        jTAfiliado.setText("      Nro de Afiliado");
        jTAfiliado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTAfiliado.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTAfiliado.setEnabled(false);
        jTAfiliado.setSelectionColor(new java.awt.Color(0, 0, 56));
        jTAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 300, 40));

        jTidPrestador.setBackground(new java.awt.Color(246, 246, 248));
        jTidPrestador.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTidPrestador.setForeground(new java.awt.Color(0, 0, 0));
        jTidPrestador.setText("      Matricula de Prestador");
        jTidPrestador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTidPrestador.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTidPrestador.setEnabled(false);
        jTidPrestador.setSelectionColor(new java.awt.Color(0, 0, 56));
        jTidPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(jTidPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 300, 40));

        jTformadePago1.setBackground(new java.awt.Color(246, 246, 248));
        jTformadePago1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTformadePago1.setForeground(new java.awt.Color(0, 0, 0));
        jTformadePago1.setText("     Forma de Pago");
        jTformadePago1.setToolTipText("");
        jTformadePago1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTformadePago1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jTformadePago1.setEnabled(false);
        jTformadePago1.setSelectionColor(new java.awt.Color(0, 0, 56));
        jTformadePago1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTformadePago1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTformadePago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 300, 40));

        jBcrearOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenOFF-01.png"))); // NOI18N
        jBcrearOrden.setBorder(null);
        jBcrearOrden.setBorderPainted(false);
        jBcrearOrden.setContentAreaFilled(false);
        jBcrearOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBcrearOrden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenIN-01.png"))); // NOI18N
        jBcrearOrden.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenIN-01.png"))); // NOI18N
        jBcrearOrden.setSelected(true);
        getContentPane().add(jBcrearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 200, 60));

        jBmiPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jBmiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/bBuscarOrdenOFF-01.png"))); // NOI18N
        jBmiPerfil.setBorder(null);
        jBmiPerfil.setBorderPainted(false);
        jBmiPerfil.setContentAreaFilled(false);
        jBmiPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrden-01.png"))); // NOI18N
        jBmiPerfil.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrden-01.png"))); // NOI18N
        jBmiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmiPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jBmiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 70, 60));

        jBbuscarporFecha.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscarporFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBbuscarporFecha.setBorder(null);
        jBbuscarporFecha.setBorderPainted(false);
        jBbuscarporFecha.setContentAreaFilled(false);
        jBbuscarporFecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBbuscarporFecha.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBbuscarporFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarporFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscarporFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/textBuscar-01.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 300, 80, 30));

        jBbuscar1.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcUSER-01.png"))); // NOI18N
        jBbuscar1.setBorder(null);
        jBbuscar1.setBorderPainted(false);
        jBbuscar1.setContentAreaFilled(false);
        jBbuscar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcCARNETin-01.png"))); // NOI18N
        jBbuscar1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcCARNETin-01.png"))); // NOI18N
        jBbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 70, 80));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese fecha de Orden");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 180, 40));

        jTablaOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablaOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 420, 440));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 240, 40));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 300, 40));

        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VISTAordenes-01.png"))); // NOI18N
        jLfondoVista.setMaximumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setMinimumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        getContentPane().add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));

        jLventanaEmergente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/VENTANAemergente-01.png"))); // NOI18N
        getContentPane().add(jLventanaEmergente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTnroOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnroOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnroOrdenActionPerformed

    private void jTImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTImporteActionPerformed

    private void jTAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAfiliadoActionPerformed

    private void jTidPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidPrestadorActionPerformed

    private void jBmiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmiPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmiPerfilActionPerformed

    private void jTformadePago1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTformadePago1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTformadePago1ActionPerformed

    private void jBbuscarporFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarporFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarporFechaActionPerformed

    private void jBbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscar1ActionPerformed
       VentanaEmergente desgloce = new VentanaEmergente(principal);
        principal.agregarComponenteAlEscritorio(desgloce);
    }//GEN-LAST:event_jBbuscar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar1;
    private javax.swing.JButton jBbuscarporFecha;
    private javax.swing.JButton jBcrearOrden;
    private javax.swing.JButton jBmiPerfil;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JLabel jLventanaEmergente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAfiliado;
    private javax.swing.JTextField jTImporte;
    private javax.swing.JTable jTablaOrden;
    private javax.swing.JTextField jTformadePago1;
    private javax.swing.JTextField jTidPrestador;
    private javax.swing.JTextField jTnroOrden;
    // End of variables declaration//GEN-END:variables


  private void armarCabecera() {
        //Orden(LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador) 
        modelo.addColumn("Orden Nro");
        modelo.addColumn("Fecha");
        modelo.addColumn("Forma de Pago");
        modelo.addColumn("Importe");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        jTablaOrden.setModel(modelo);
    }
}
