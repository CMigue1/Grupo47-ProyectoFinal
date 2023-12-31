/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;


public class VistaPlanFamilia extends javax.swing.JInternalFrame {

    private Principal principal;
    
    public VistaPlanFamilia(Principal principal) {
        initComponents();
        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBeditar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jTImporte = new javax.swing.JTextField();
        jTcantAdherentes = new javax.swing.JTextField();
        jTcirujias = new javax.swing.JTextField();
        jTlab = new javax.swing.JTextField();
        jLhospital = new javax.swing.JTextField();
        jTconsultas = new javax.swing.JTextField();
        jTimporteAdherentes = new javax.swing.JTextField();
        jTmedicamentos = new javax.swing.JTextField();
        jBSiguiente = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        imgbotonsig = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1120, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        jBeditar.setBorder(null);
        jBeditar.setContentAreaFilled(false);
        jBeditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        jBeditar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        getContentPane().add(jBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 273, 80, 40));

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Bguardar-01.png"))); // NOI18N
        jBGuardar.setBorder(null);
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        jBGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BGuardarIN-01.png"))); // NOI18N
        getContentPane().add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, -1, -1));

        jTImporte.setBackground(new java.awt.Color(247, 247, 249));
        jTImporte.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTImporte.setForeground(new java.awt.Color(153, 153, 153));
        jTImporte.setText("50%");
        jTImporte.setBorder(null);
        getContentPane().add(jTImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 120, 20));

        jTcantAdherentes.setBackground(new java.awt.Color(247, 247, 249));
        jTcantAdherentes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTcantAdherentes.setForeground(new java.awt.Color(153, 153, 153));
        jTcantAdherentes.setText("50%");
        jTcantAdherentes.setBorder(null);
        getContentPane().add(jTcantAdherentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 120, 20));

        jTcirujias.setBackground(new java.awt.Color(247, 247, 249));
        jTcirujias.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTcirujias.setForeground(new java.awt.Color(153, 153, 153));
        jTcirujias.setText("50%");
        jTcirujias.setBorder(null);
        getContentPane().add(jTcirujias, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 120, 20));

        jTlab.setBackground(new java.awt.Color(247, 247, 249));
        jTlab.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTlab.setForeground(new java.awt.Color(153, 153, 153));
        jTlab.setText("50%");
        jTlab.setBorder(null);
        getContentPane().add(jTlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 120, 20));

        jLhospital.setBackground(new java.awt.Color(247, 247, 249));
        jLhospital.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLhospital.setForeground(new java.awt.Color(153, 153, 153));
        jLhospital.setText("50%");
        jLhospital.setBorder(null);
        getContentPane().add(jLhospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, 120, 20));

        jTconsultas.setBackground(new java.awt.Color(247, 247, 249));
        jTconsultas.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTconsultas.setForeground(new java.awt.Color(153, 153, 153));
        jTconsultas.setText("80%");
        jTconsultas.setBorder(null);
        getContentPane().add(jTconsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 345, 120, 20));

        jTimporteAdherentes.setBackground(new java.awt.Color(247, 247, 249));
        jTimporteAdherentes.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTimporteAdherentes.setForeground(new java.awt.Color(153, 153, 153));
        jTimporteAdherentes.setText("50%");
        jTimporteAdherentes.setBorder(null);
        getContentPane().add(jTimporteAdherentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 535, 110, 20));

        jTmedicamentos.setBackground(new java.awt.Color(247, 247, 249));
        jTmedicamentos.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTmedicamentos.setForeground(new java.awt.Color(153, 153, 153));
        jTmedicamentos.setText("100%");
        jTmedicamentos.setBorder(null);
        getContentPane().add(jTmedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 345, 120, 20));

        jBSiguiente.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jBSiguiente.setBorder(null);
        jBSiguiente.setBorderPainted(false);
        jBSiguiente.setContentAreaFilled(false);
        jBSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 40, 20));

        jBAnterior.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jBAnterior.setBorder(null);
        jBAnterior.setBorderPainted(false);
        jBAnterior.setContentAreaFilled(false);
        jBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jBAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 20, 40));

        imgbotonsig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/2-01.png"))); // NOI18N
        getContentPane().add(imgbotonsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/vistaFAMILIA-01.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnteriorActionPerformed
        VistaPlanJoven planjoven = new VistaPlanJoven(principal);
        principal.agregarComponenteAlEscritorio(planjoven);
    }//GEN-LAST:event_jBAnteriorActionPerformed

    private void jBSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiguienteActionPerformed
        VistaPlanMasAdulto planAdultos = new VistaPlanMasAdulto(principal);
        principal.agregarComponenteAlEscritorio(planAdultos);
    }//GEN-LAST:event_jBSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel imgbotonsig;
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JButton jBeditar;
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
