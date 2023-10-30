/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Administrativo;
import javax.swing.JOptionPane;
import AccesoADatos.AdministrativoData;
/**
 *
 * @author pauli
 */
public class Registrarse extends javax.swing.JFrame {

    int xMouse, yMouse;
    AdministrativoData admData; 
            
    public Registrarse() {
        initComponents();
        admData = new AdministrativoData();
        jBLogin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLSalirdeInterfaz2 = new javax.swing.JLabel();
        jBlogin2 = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jBregistrarme = new javax.swing.JButton();
        jTContrasena1 = new javax.swing.JPasswordField();
        jTUsuario1 = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BarraSuperior = new javax.swing.JPanel();
        jTUsuario = new javax.swing.JTextField();
        jTContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSalirdeInterfaz2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLSalirdeInterfaz2.setForeground(new java.awt.Color(255, 255, 255));
        jLSalirdeInterfaz2.setText(" X");
        jLSalirdeInterfaz2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSalirdeInterfaz2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSalirdeInterfaz2MouseClicked(evt);
            }
        });
        getContentPane().add(jLSalirdeInterfaz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 50));

        jBlogin2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jBlogin2.setBorder(null);
        jBlogin2.setContentAreaFilled(false);
        jBlogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBlogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 310, 120, 20));

        jBLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/loginSECUNDARIO-01.png"))); // NOI18N
        jBLogin.setBorder(null);
        jBLogin.setContentAreaFilled(false);
        jBLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/loginOFF-01.png"))); // NOI18N
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 220, 60));

        jBregistrarme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaOFF-01.png"))); // NOI18N
        jBregistrarme.setBorder(null);
        jBregistrarme.setContentAreaFilled(false);
        jBregistrarme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBregistrarme.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaIN-01.png"))); // NOI18N
        jBregistrarme.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaIN-01.png"))); // NOI18N
        jBregistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarmeActionPerformed(evt);
            }
        });
        getContentPane().add(jBregistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 220, 50));
        getContentPane().add(jTContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 260, -1));

        jTUsuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuario1MouseClicked(evt);
            }
        });
        getContentPane().add(jTUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 260, -1));
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 150, -1));
        getContentPane().add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 150, -1));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/registarse-01.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 740));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 433, 420, 50));

        BarraSuperior.setPreferredSize(new java.awt.Dimension(1030, 50));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });
        BarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        jTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, -1));
        getContentPane().add(jTContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLSalirdeInterfaz2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirdeInterfaz2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLSalirdeInterfaz2MouseClicked

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseClicked

    }//GEN-LAST:event_jTUsuarioMouseClicked

    private void jTUsuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuario1MouseClicked

    private void jBregistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarmeActionPerformed
           try {
            String usuario = jTUsuario.getText().trim();
            String contrasena = jTContrasena.getText().trim();
            String nombre= jTNombre.getText().trim();
            String apellido= jTApellido.getText().trim();

            if (jTUsuario.getText().isEmpty() || jTContrasena.getText().isEmpty() || jTNombre.getText().isEmpty()|| jTApellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                jBLogin.setVisible(true);
                return;
            }
            Administrativo administrativo = new Administrativo(usuario, nombre, apellido, contrasena);
            admData.altaAdministrativo(administrativo);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBregistrarmeActionPerformed

    private void jBlogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlogin2ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBlogin2ActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
         Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBlogin2;
    private javax.swing.JButton jBregistrarme;
    private javax.swing.JLabel jLSalirdeInterfaz2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JPasswordField jTContrasena;
    private javax.swing.JPasswordField jTContrasena1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTextField jTUsuario1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
