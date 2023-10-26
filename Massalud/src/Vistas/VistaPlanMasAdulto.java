package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class VistaPlanMasAdulto extends javax.swing.JInternalFrame {

    private Principal principal;

    public VistaPlanMasAdulto(Principal principal) {
        initComponents();
        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBGuardar = new javax.swing.JButton();
        jBeditar = new javax.swing.JButton();
        jTImporte = new javax.swing.JTextField();
        jTcantAdherentes = new javax.swing.JTextField();
        jTcirujias = new javax.swing.JTextField();
        jTlab = new javax.swing.JTextField();
        jLhospital = new javax.swing.JTextField();
        jTconsultas = new javax.swing.JTextField();
        jTimporteAdherentes = new javax.swing.JTextField();
        jTmedicamentos = new javax.swing.JTextField();
        jBsiguiente = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1000, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Bguardar-01.png"))); // NOI18N
        jBGuardar.setBorder(null);
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        jBGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        jBeditar.setBorder(null);
        jBeditar.setContentAreaFilled(false);
        jBeditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        jBeditar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        getContentPane().add(jBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 273, 80, 40));

        jTImporte.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTImporte.setForeground(new java.awt.Color(153, 153, 153));
        jTImporte.setText("Id de Plan");
        jTImporte.setBorder(null);
        getContentPane().add(jTImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 120, 20));

        jTcantAdherentes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTcantAdherentes.setForeground(new java.awt.Color(153, 153, 153));
        jTcantAdherentes.setText("Importe");
        jTcantAdherentes.setBorder(null);
        getContentPane().add(jTcantAdherentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 120, 20));

        jTcirujias.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTcirujias.setForeground(new java.awt.Color(153, 153, 153));
        jTcirujias.setText("Id de Plan");
        jTcirujias.setBorder(null);
        getContentPane().add(jTcirujias, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 120, 20));

        jTlab.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTlab.setForeground(new java.awt.Color(153, 153, 153));
        jTlab.setText("Id de Plan");
        jTlab.setBorder(null);
        getContentPane().add(jTlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 120, 20));

        jLhospital.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLhospital.setForeground(new java.awt.Color(153, 153, 153));
        jLhospital.setText("Importe");
        jLhospital.setBorder(null);
        getContentPane().add(jLhospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 120, 20));

        jTconsultas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTconsultas.setForeground(new java.awt.Color(153, 153, 153));
        jTconsultas.setText("80%");
        jTconsultas.setBorder(null);
        getContentPane().add(jTconsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 345, 120, 20));

        jTimporteAdherentes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTimporteAdherentes.setForeground(new java.awt.Color(153, 153, 153));
        jTimporteAdherentes.setText("Adherentes");
        jTimporteAdherentes.setBorder(null);
        getContentPane().add(jTimporteAdherentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 535, 110, 20));

        jTmedicamentos.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTmedicamentos.setForeground(new java.awt.Color(153, 153, 153));
        jTmedicamentos.setText("100%");
        jTmedicamentos.setBorder(null);
        getContentPane().add(jTmedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 345, 120, 20));

        jBsiguiente.setText("Siguiente");
        jBsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBsiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        jBAnterior.setText("Anterior");
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jBAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/vistaADULTOS-01.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        VistaPlanFamilia planFamilia = new VistaPlanFamilia(principal);
        principal.agregarComponenteAlEscritorio(planFamilia);
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsiguienteActionPerformed
        VistaPlanGold planGold = new VistaPlanGold(principal);
        principal.agregarComponenteAlEscritorio(planGold);
    }//GEN-LAST:event_jBsiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBsiguiente;
    private javax.swing.JTextField jLhospital;
    private javax.swing.JTextField jTImporte;
    private javax.swing.JTextField jTcantAdherentes;
    private javax.swing.JTextField jTcirujias;
    private javax.swing.JTextField jTconsultas;
    private javax.swing.JTextField jTimporteAdherentes;
    private javax.swing.JTextField jTlab;
    private javax.swing.JTextField jTmedicamentos;
    // End of variables declaration//GEN-END:variables
}
