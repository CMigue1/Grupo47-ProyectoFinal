/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class VistaPlanes extends javax.swing.JInternalFrame {

    private Principal principal;

    public VistaPlanes(Principal principal) {
        initComponents();

        this.principal = principal;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBJoven = new javax.swing.JButton();
        jBfamilia = new javax.swing.JButton();
        jBAdultos = new javax.swing.JButton();
        jBgold = new javax.swing.JButton();
        jBplatinum = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1120, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jBJoven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlanJovenOFF-01.png"))); // NOI18N
        jBJoven.setBorder(null);
        jBJoven.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bJovenIN-01.png"))); // NOI18N
        jBJoven.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bJovenIN-01.png"))); // NOI18N
        jBJoven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJovenActionPerformed(evt);
            }
        });
        getContentPane().add(jBJoven);

        jBfamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlanFamilia-01.png"))); // NOI18N
        jBfamilia.setBorder(null);
        jBfamilia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bFamiliaIN-01.png"))); // NOI18N
        jBfamilia.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bFamiliaIN-01.png"))); // NOI18N
        jBfamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfamiliaActionPerformed(evt);
            }
        });
        getContentPane().add(jBfamilia);

        jBAdultos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlanAdultoOFF-01.png"))); // NOI18N
        jBAdultos.setBorder(null);
        jBAdultos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bAdultoIN-01.png"))); // NOI18N
        jBAdultos.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bAdultoIN-01.png"))); // NOI18N
        jBAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdultosActionPerformed(evt);
            }
        });
        getContentPane().add(jBAdultos);

        jBgold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlanGoldenOFF-01.png"))); // NOI18N
        jBgold.setBorder(null);
        jBgold.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bGoldIN-01.png"))); // NOI18N
        jBgold.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bGoldIN-01.png"))); // NOI18N
        jBgold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgoldActionPerformed(evt);
            }
        });
        getContentPane().add(jBgold);

        jBplatinum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlanPlatinumOFF-01-01.png"))); // NOI18N
        jBplatinum.setBorder(null);
        jBplatinum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlatinumIN-01.png"))); // NOI18N
        jBplatinum.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bPlatinumIN-01.png"))); // NOI18N
        jBplatinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBplatinumActionPerformed(evt);
            }
        });
        getContentPane().add(jBplatinum);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBJovenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJovenActionPerformed
        VistaPlanJoven planjoven = new VistaPlanJoven(principal);
        principal.agregarComponenteAlEscritorio(planjoven);
    }//GEN-LAST:event_jBJovenActionPerformed

    private void jBplatinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBplatinumActionPerformed
        VistaPlanPlatinum planPlatinium = new VistaPlanPlatinum(principal);
        principal.agregarComponenteAlEscritorio(planPlatinium);
    }//GEN-LAST:event_jBplatinumActionPerformed

    private void jBfamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfamiliaActionPerformed
        VistaPlanFamilia planFamilia = new VistaPlanFamilia(principal);
        principal.agregarComponenteAlEscritorio(planFamilia);
    }//GEN-LAST:event_jBfamiliaActionPerformed

    private void jBAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdultosActionPerformed
        VistaPlanMasAdulto planAdultos = new VistaPlanMasAdulto(principal);
        principal.agregarComponenteAlEscritorio(planAdultos);

    }//GEN-LAST:event_jBAdultosActionPerformed

    private void jBgoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgoldActionPerformed
        VistaPlanGold planGold = new VistaPlanGold(principal);
        principal.agregarComponenteAlEscritorio(planGold);

    }//GEN-LAST:event_jBgoldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdultos;
    private javax.swing.JButton jBJoven;
    private javax.swing.JButton jBfamilia;
    private javax.swing.JButton jBgold;
    private javax.swing.JButton jBplatinum;
    // End of variables declaration//GEN-END:variables

}
