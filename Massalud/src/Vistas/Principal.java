package Vistas;

import javax.swing.JInternalFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Principal() {
        initComponents();
        establecerFondoEscritorio();
        deshabilitarBotones();
        // ... Resto del código ...

        // Cargar la imagen para el clic del botón
//        ImageIcon clicIcon = new ImageIcon(getClass().getResource("/img/prestadoresIN-01.png"));
//
//        // Asociar la imagen al botón
//        jBPrestadores.setPressedIcon(clicIcon);
//
//         //Agregar un ActionListener al botón
//        jBPrestadores.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            // Aquí puedes realizar acciones al hacer clic en el botón
//        // Cambiar la imagen si es necesario
//        // Por ejemplo:
////         ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/img/nueva_imagen.png"));
////         jBPrestadores.setIcon(nuevaImagen);
//        }
//    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        BarraIzquierda = new javax.swing.JPanel();
        jBAfiliado = new javax.swing.JButton();
        jBPrestadores = new javax.swing.JButton();
        jBOrden = new javax.swing.JButton();
        jBPlanes = new javax.swing.JButton();
        jBCerrarSesion = new javax.swing.JButton();
        jBCerrar = new javax.swing.JButton();
        jBIniciarSesion = new javax.swing.JButton();
        jBConsultas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        BarraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1130, 560));

        jPanel4.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel4.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraIzquierda.setBackground(new java.awt.Color(0, 0, 56));
        BarraIzquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBAfiliado.setBorder(null);
        jBAfiliado.setBorderPainted(false);
        jBAfiliado.setContentAreaFilled(false);
        jBAfiliado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBAfiliado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/afiliadosPASARCURSOR-01.png"))); // NOI18N
        jBAfiliado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/afiliadosIN-01.png"))); // NOI18N
        jBAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAfiliadoMouseClicked(evt);
            }
        });
        BarraIzquierda.add(jBAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        jBPrestadores.setBorder(null);
        jBPrestadores.setBorderPainted(false);
        jBPrestadores.setContentAreaFilled(false);
        jBPrestadores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBPrestadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestadoresCURSOR-01.png"))); // NOI18N
        jBPrestadores.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestadoresIN-01.png"))); // NOI18N
        jBPrestadores.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestadoresIN-01.png"))); // NOI18N
        jBPrestadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPrestadoresMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBPrestadoresMousePressed(evt);
            }
        });
        jBPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPrestadoresActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBPrestadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 60));

        jBOrden.setBorder(null);
        jBOrden.setBorderPainted(false);
        jBOrden.setContentAreaFilled(false);
        jBOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBOrden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ordenesCURSOR-01.png"))); // NOI18N
        jBOrden.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ordenesIN-01.png"))); // NOI18N
        jBOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBOrdenMouseClicked(evt);
            }
        });
        BarraIzquierda.add(jBOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 60));

        jBPlanes.setBorder(null);
        jBPlanes.setBorderPainted(false);
        jBPlanes.setContentAreaFilled(false);
        jBPlanes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBPlanes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/planesPASARCURSOR-01.png"))); // NOI18N
        jBPlanes.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/planesIN-01.png"))); // NOI18N
        jBPlanes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPlanesMouseClicked(evt);
            }
        });
        jBPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlanesActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 60));

        jBCerrarSesion.setBorder(null);
        jBCerrarSesion.setBorderPainted(false);
        jBCerrarSesion.setContentAreaFilled(false);
        jBCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsesionCURSOR-01.png"))); // NOI18N
        jBCerrarSesion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarsesionIN-01.png"))); // NOI18N
        jBCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCerrarSesionMouseClicked(evt);
            }
        });
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 220, 60));

        jBCerrar.setBorder(null);
        jBCerrar.setBorderPainted(false);
        jBCerrar.setContentAreaFilled(false);
        jBCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarCURSOR-01.png"))); // NOI18N
        jBCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirIN-01.png"))); // NOI18N
        jBCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBCerrarMouseClicked(evt);
            }
        });
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 220, 50));

        jBIniciarSesion.setText("Iniciar Sesion");
        jBIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarSesionActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 470, 160, 30));

        jBConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/conButton-01.png"))); // NOI18N
        jBConsultas.setBorder(null);
        jBConsultas.setContentAreaFilled(false);
        jBConsultas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/conButtonCursor-01.png"))); // NOI18N
        jBConsultas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/conButtonIN-01.png"))); // NOI18N
        jBConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultasActionPerformed(evt);
            }
        });
        BarraIzquierda.add(jBConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 372, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra izquierda-01.png"))); // NOI18N
        BarraIzquierda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jPanel4.add(BarraIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 720));

        Pantalla.setPreferredSize(new java.awt.Dimension(870, 500));
        Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Escritorio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        Pantalla.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1062, 720));

        jPanel4.add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1120, 720));

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
        jPanel4.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBPlanesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPlanesMouseClicked
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaPlanes planes = new VistaPlanes(this);
        planes.setVisible(true);
        Escritorio.add(planes);
        Escritorio.moveToFront(planes);
    }//GEN-LAST:event_jBPlanesMouseClicked

    private void jBAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAfiliadoMouseClicked
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaAfiliado afiliado = new VistaAfiliado(this);
        afiliado.setVisible(true);
        Escritorio.add(afiliado);
        Escritorio.moveToFront(afiliado);
    }//GEN-LAST:event_jBAfiliadoMouseClicked

    private void jBOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOrdenMouseClicked
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaOrden ordenes = new VistaOrden(this);
        ordenes.setVisible(true);
        Escritorio.add(ordenes);
        Escritorio.moveToFront(ordenes);
    }//GEN-LAST:event_jBOrdenMouseClicked

    private void jBPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlanesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPlanesActionPerformed

    private void jBPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPrestadoresActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaPrestador prestador = new VistaPrestador(this);
        prestador.setVisible(true);
        Escritorio.add(prestador);
        Escritorio.moveToFront(prestador);
    }//GEN-LAST:event_jBPrestadoresActionPerformed

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        System.exit(0);
        //establecerFondoEscritorio();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jBCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jBCerrarMouseClicked

    private void jBCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBCerrarSesionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCerrarSesionMouseClicked

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void jBPrestadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrestadoresMousePressed

    }//GEN-LAST:event_jBPrestadoresMousePressed

    private void jBPrestadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPrestadoresMouseClicked
        // Cargar la imagen para el clic del botón
        ImageIcon clicIcon = new ImageIcon(getClass().getResource("/img/prestadoresIN-01.png"));

        // Asociar la imagen al botón
        jBPrestadores.setRolloverSelectedIcon(clicIcon);
    }//GEN-LAST:event_jBPrestadoresMouseClicked

    private void jBConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaConsultas consulta = new VistaConsultas(this);
        consulta.setVisible(true);
        Escritorio.add(consulta);
        Escritorio.moveToFront(consulta);
    }//GEN-LAST:event_jBConsultasActionPerformed

    private void jBIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraIzquierda;
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JButton jBAfiliado;
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBConsultas;
    private javax.swing.JButton jBIniciarSesion;
    private javax.swing.JButton jBOrden;
    private javax.swing.JButton jBPlanes;
    private javax.swing.JButton jBPrestadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    public void agregarComponenteAlEscritorio(JInternalFrame componente) {
        establecerFondoEscritorio();
        Escritorio.add(componente);
        Escritorio.repaint();
        componente.setVisible(true);
    }

    public void establecerFondoEscritorio() {
        try {
            ImageIcon fondoImg = new ImageIcon(getClass().getResource("/img/fondo 1120x720-01.png"));
            Image imagenEscalada = fondoImg.getImage().getScaledInstance(Escritorio.getWidth(), Escritorio.getHeight(), Image.SCALE_SMOOTH);
            fondoImg = new ImageIcon(imagenEscalada);

            JLabel backgroundLabel = new JLabel(fondoImg);
            backgroundLabel.setBounds(0, 0, Escritorio.getWidth(), Escritorio.getHeight());

            Escritorio.add(backgroundLabel);
            Escritorio.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deshabilitarBotones() {
        jBPlanes.setEnabled(false);
        jBAfiliado.setEnabled(false);
        jBPrestadores.setEnabled(false);
        jBOrden.setEnabled(false);
        jBConsultas.setEnabled(false);
        jBCerrarSesion.setEnabled(false);

    }

    public void habilitarBotones() {
        jBPlanes.setEnabled(true);
        jBAfiliado.setEnabled(true);
        jBPrestadores.setEnabled(true);
        jBOrden.setEnabled(true);
        jBConsultas.setEnabled(true);
        jBIniciarSesion.setEnabled(false);
        jBCerrarSesion.setEnabled(true);

    }
}
