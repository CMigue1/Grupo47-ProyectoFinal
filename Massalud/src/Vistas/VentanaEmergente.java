/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Miguel
 */
public class VentanaEmergente extends javax.swing.JInternalFrame {

    private Principal principal = new Principal();

    public VentanaEmergente(Principal principal) {
        initComponents();
        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        this.setSize(400, 300);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBuscarporPRESTADOR = new javax.swing.JButton();
        jBuscarporAFILIADO1 = new javax.swing.JButton();
        jLventanaEmergente = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBuscarporPRESTADOR.setBorder(null);
        jBuscarporPRESTADOR.setContentAreaFilled(false);
        jBuscarporPRESTADOR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrdenporPrestador-01.png"))); // NOI18N
        jBuscarporPRESTADOR.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrdenporPrestador-01.png"))); // NOI18N
        getContentPane().add(jBuscarporPRESTADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, 210, 50));

        jBuscarporAFILIADO1.setBorder(null);
        jBuscarporAFILIADO1.setContentAreaFilled(false);
        jBuscarporAFILIADO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/buscarporafiliado-01.png"))); // NOI18N
        jBuscarporAFILIADO1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/buscarporafiliado-01.png"))); // NOI18N
        getContentPane().add(jBuscarporAFILIADO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 200, 50));

        jLventanaEmergente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/VENTANAemergente-01.png"))); // NOI18N
        getContentPane().add(jLventanaEmergente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 260, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarporAFILIADO1;
    private javax.swing.JButton jBuscarporPRESTADOR;
    private javax.swing.JLabel jLventanaEmergente;
    // End of variables declaration//GEN-END:variables
}
