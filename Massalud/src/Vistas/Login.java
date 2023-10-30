
package Vistas;

import AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    Principal principal = new Principal();
    int xMouse, yMouse;
    public Login() {
        initComponents();
        this.principal= principal;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLSalirdeInterfaz2 = new javax.swing.JLabel();
        jBregistrase2 = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jTUsuario = new javax.swing.JTextField();
        jTContrasena = new javax.swing.JPasswordField();
        jBregistrarme = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BarraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
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

        jBregistrase2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jBregistrase2.setBorder(null);
        jBregistrase2.setContentAreaFilled(false);
        getContentPane().add(jBregistrase2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 380, 80, 30));

        jBLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/loginOFF-01.png"))); // NOI18N
        jBLogin.setBorder(null);
        jBLogin.setContentAreaFilled(false);
        jBLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/loginIN-01.png"))); // NOI18N
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 220, 60));

        jTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 340, -1));
        getContentPane().add(jTContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 340, -1));

        jBregistrarme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaSECUNDARIO-01.png"))); // NOI18N
        jBregistrarme.setBorder(null);
        jBregistrarme.setContentAreaFilled(false);
        jBregistrarme.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/CrearcuentaOFF-01.png"))); // NOI18N
        jBregistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregistrarmeActionPerformed(evt);
            }
        });
        getContentPane().add(jBregistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 220, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/iniciarSesion-01.png"))); // NOI18N
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

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
       
        String usuario = jTUsuario.getText().trim();
        String contrasena = jTContrasena.getText().trim();
        if (!usuario.equals("") && !contrasena.equals("")) {

            Connection cn = Conexion.getConexion();
            try {
                PreparedStatement ps = cn.prepareStatement("SELECT  * FROM administrativo WHERE usuario = ? and  contrasena = ?");
                ps.setString(1, usuario);
                ps.setString(2, contrasena);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    principal.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    jTUsuario.setText("Usuario");
                    jTContrasena.setText("Contrase�a");
                }
            } catch (SQLException ex) {
                System.err.println("Error en el boton acceder " + ex);
                JOptionPane.showMessageDialog(null, "�Error al iniciar sesi�n!, conectate con el Administrador");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos...");
        }
                   
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jTUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseClicked

    }//GEN-LAST:event_jTUsuarioMouseClicked

    private void jBregistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregistrarmeActionPerformed
        Registrarse registrarse = new Registrarse();
        registrarse.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBregistrarmeActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jBregistrarme;
    private javax.swing.JButton jBregistrase2;
    private javax.swing.JLabel jLSalirdeInterfaz2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField jTContrasena;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
