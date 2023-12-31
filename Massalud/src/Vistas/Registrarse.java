/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Entidades.Administrativo;
import javax.swing.JOptionPane;
import AccesoADatos.AdministrativoData;
import java.awt.Image;
import java.awt.Toolkit;
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
        
    }
     @Override
   public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/iconoMARCA-01.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLSalirdeInterfaz2 = new javax.swing.JLabel();
        jBlogin2 = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jBregistrarme = new javax.swing.JButton();
        jTContrasena1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTUsuario1 = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSalirdeInterfaz2.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLSalirdeInterfaz2.setForeground(new java.awt.Color(255, 255, 255));
        jLSalirdeInterfaz2.setText(" X");
        jLSalirdeInterfaz2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jBlogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 120, 20));

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
        jBregistrarme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBregistrarme.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaIN-01.png"))); // NOI18N
        jBregistrarme.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaIN-01.png"))); // NOI18N
        jBregistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarmeActionPerformed(evt);
            }
        });
        getContentPane().add(jBregistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 220, 50));

        jTContrasena1.setBackground(new java.awt.Color(28, 29, 77));
        jTContrasena1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTContrasena1.setForeground(new java.awt.Color(255, 255, 255));
        jTContrasena1.setBorder(null);
        getContentPane().add(jTContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 370, 20));

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grupo47 �");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 690, -1, -1));

        jTUsuario1.setBackground(new java.awt.Color(28, 29, 77));
        jTUsuario1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jTUsuario1.setBorder(null);
        getContentPane().add(jTUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 360, 20));

        txtNombre.setBackground(new java.awt.Color(28, 28, 77));
        txtNombre.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 150, 20));

        jTApellido.setBackground(new java.awt.Color(34, 35, 81));
        jTApellido.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTApellido.setBorder(null);
        getContentPane().add(jTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 150, 20));

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/registarse-01.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1280, 740));

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

        pack();
        setLocationRelativeTo(null);
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

    private void jBregistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarmeActionPerformed
           try {
            String usuario = jTUsuario1.getText().trim();
            String contrasena = jTContrasena1.getText().trim();
            String nombre= txtNombre.getText().trim();
            String apellido= jTApellido.getText().trim();

            if (jTUsuario1.getText().isEmpty() || jTContrasena1.getText().isEmpty() || txtNombre.getText().isEmpty()|| jTApellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
            Administrativo administrativo = new Administrativo(usuario, nombre, apellido, contrasena);
            admData.altaAdministrativo(administrativo);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros v�lidos.", "Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JPasswordField jTContrasena1;
    private javax.swing.JTextField jTUsuario1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
