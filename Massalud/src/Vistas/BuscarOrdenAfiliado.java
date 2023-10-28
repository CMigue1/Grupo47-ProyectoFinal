
package Vistas;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class BuscarOrdenAfiliado extends javax.swing.JInternalFrame {
    
     private DefaultTableModel modelo = new DefaultTableModel();

    private Principal principal;
    public BuscarOrdenAfiliado(Principal principal) {
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTAfiliados = new javax.swing.JTable();
        jTidAfiliado = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
        jBuscarAfiliadoporID = new javax.swing.JButton();
        jBregresarlatIzq = new javax.swing.JButton();
        jBregresarlatDer1 = new javax.swing.JButton();
        jBregresar = new javax.swing.JButton();
        jLfondoVista = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1062, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTAfiliados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTAfiliados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 400, 390));

        jTidAfiliado.setEditable(false);
        jTidAfiliado.setBackground(new java.awt.Color(247, 247, 249));
        jTidAfiliado.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTidAfiliado.setForeground(new java.awt.Color(51, 51, 51));
        jTidAfiliado.setText("4555");
        jTidAfiliado.setBorder(null);
        jTidAfiliado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTidAfiliado.setSelectionColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTidAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 120, 20));

        texto.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        texto.setForeground(new java.awt.Color(0, 0, 0));
        texto.setText("Ingrese ID de un Afiliado");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 40));

        jBuscarAfiliadoporID.setBackground(new java.awt.Color(255, 255, 255));
        jBuscarAfiliadoporID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBuscarAfiliadoporID.setBorder(null);
        jBuscarAfiliadoporID.setBorderPainted(false);
        jBuscarAfiliadoporID.setContentAreaFilled(false);
        jBuscarAfiliadoporID.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBuscarAfiliadoporID.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        jBuscarAfiliadoporID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAfiliadoporIDActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarAfiliadoporID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 30, 20));

        jBregresarlatIzq.setBorder(null);
        jBregresarlatIzq.setBorderPainted(false);
        jBregresarlatIzq.setContentAreaFilled(false);
        jBregresarlatIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarlatIzqActionPerformed(evt);
            }
        });
        getContentPane().add(jBregresarlatIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 690));

        jBregresarlatDer1.setBorder(null);
        jBregresarlatDer1.setBorderPainted(false);
        jBregresarlatDer1.setContentAreaFilled(false);
        jBregresarlatDer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarlatDer1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBregresarlatDer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 6, 300, 690));

        jBregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/BREGRESARoff-01.png"))); // NOI18N
        jBregresar.setBorder(null);
        jBregresar.setBorderPainted(false);
        jBregresar.setContentAreaFilled(false);
        jBregresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/BREGRESARin-01.png"))); // NOI18N
        jBregresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/BREGRESARin-01.png"))); // NOI18N
        jBregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregresarActionPerformed(evt);
            }
        });
        getContentPane().add(jBregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, 50, 40));

        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/vistabuscarOrdenAfiliado-01.png"))); // NOI18N
        jLfondoVista.setMaximumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setMinimumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        getContentPane().add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarAfiliadoporIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoporIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarAfiliadoporIDActionPerformed

    private void jBregresarlatIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarlatIzqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBregresarlatIzqActionPerformed

    private void jBregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarActionPerformed
     
    }//GEN-LAST:event_jBregresarActionPerformed

    private void jBregresarlatDer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregresarlatDer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBregresarlatDer1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBregresar;
    private javax.swing.JButton jBregresarlatDer1;
    private javax.swing.JButton jBregresarlatIzq;
    private javax.swing.JButton jBuscarAfiliadoporID;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAfiliados;
    private javax.swing.JTextField jTidAfiliado;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables


  private void armarCabecera() {
        //Orden(LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador) 
        modelo.addColumn("Orden Nro");
        modelo.addColumn("Fecha");
        modelo.addColumn("Forma de Pago");
        modelo.addColumn("Importe");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        jTAfiliados.setModel(modelo);
    }
}
