/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Miguel
 */
public class Cuidado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cuidado
     */
    public Cuidado() {
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

        FondoAlerta = new javax.swing.JPanel();
        jBsalirMENSAJE = new javax.swing.JButton();
        jLtituloAlerta = new javax.swing.JLabel();
        jLMENSAJEalerta1 = new javax.swing.JLabel();
        jLfondoalert = new javax.swing.JLabel();

        FondoAlerta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBsalirMENSAJE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerror-01.png"))); // NOI18N
        jBsalirMENSAJE.setBorder(null);
        jBsalirMENSAJE.setContentAreaFilled(false);
        jBsalirMENSAJE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        jBsalirMENSAJE.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        FondoAlerta.add(jBsalirMENSAJE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 210, 40));

        jLtituloAlerta.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        jLtituloAlerta.setText("Cuidado!");
        FondoAlerta.add(jLtituloAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 120, 20));

        jLMENSAJEalerta1.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLMENSAJEalerta1.setText("Por favor corrija los campos.");
        FondoAlerta.add(jLMENSAJEalerta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 250, 20));

        jLfondoalert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/Joptionerror-01.png"))); // NOI18N
        FondoAlerta.add(jLfondoalert, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 410, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoAlerta;
    private javax.swing.JButton jBsalirMENSAJE;
    private javax.swing.JLabel jLMENSAJEalerta1;
    private javax.swing.JLabel jLfondoalert;
    private javax.swing.JLabel jLtituloAlerta;
    // End of variables declaration//GEN-END:variables
}
