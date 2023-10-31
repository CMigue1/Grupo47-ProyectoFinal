package Vistas;

import AccesoADatos.EspecialidadData;
import AccesoADatos.PrestadorData;
import Entidades.Especialidad;
import Entidades.Prestador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class VistaPrestador extends javax.swing.JInternalFrame {

    private Especialidad especialidad = new Especialidad();
    private List<Especialidad> listaE;
    private PrestadorData prestaData;
    private EspecialidadData espeData;
    private DefaultTableModel modelo = new DefaultTableModel();
    private Principal principal;

    public VistaPrestador(Principal principal) {
        this.principal = principal;
        initComponents();

        espeData = new EspecialidadData();
        listaE = espeData.listarEspecialidades();
        prestaData = new PrestadorData();
        modelo = new DefaultTableModel();
        cargarEspecialidades();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        this.setSize(1062, 720);
        armarCabecera();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCmostrarEspecialidades = new javax.swing.JComboBox<>();
        jTtelefono1 = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido1 = new javax.swing.JTextField();
        jTdocumento1 = new javax.swing.JTextField();
        jTdireccion2 = new javax.swing.JTextField();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jBagregarPrestador = new javax.swing.JButton();
        jBCrearOrden = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBmiPerfil = new javax.swing.JButton();
        jRPrestadoresActivos = new javax.swing.JRadioButton();
        jLespecialidad = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrestadores = new javax.swing.JTable();
        jLfondoVista = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPrestadores1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1062, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Apellido");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, 40));

        jLabel13.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Documento");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, 40));

        jLabel14.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Especialidad");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, 40));

        jLabel15.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Domicilio");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, 40));

        jLabel16.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Nro de Celular");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, 40));

        jLabel17.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Nombre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 40));

        jCmostrarEspecialidades.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jCmostrarEspecialidades.setToolTipText("Tipo de Plan");
        jCmostrarEspecialidades.setAlignmentY(9.0F);
        jCmostrarEspecialidades.setBorder(null);
        jCmostrarEspecialidades.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCmostrarEspecialidades.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jCmostrarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmostrarEspecialidadesActionPerformed(evt);
            }
        });
        jPanel1.add(jCmostrarEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 210, -1));

        jTtelefono1.setBackground(new java.awt.Color(246, 246, 248));
        jTtelefono1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTtelefono1.setForeground(new java.awt.Color(153, 153, 153));
        jTtelefono1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTtelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 290, 30));

        jTNombre.setBackground(new java.awt.Color(246, 246, 248));
        jTNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 290, 30));

        jTApellido1.setBackground(new java.awt.Color(246, 246, 248));
        jTApellido1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTApellido1.setForeground(new java.awt.Color(153, 153, 153));
        jTApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 290, 30));

        jTdocumento1.setBackground(new java.awt.Color(246, 246, 248));
        jTdocumento1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdocumento1.setForeground(new java.awt.Color(153, 153, 153));
        jTdocumento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTdocumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 290, 30));

        jTdireccion2.setBackground(new java.awt.Color(246, 246, 248));
        jTdireccion2.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdireccion2.setForeground(new java.awt.Color(153, 153, 153));
        jTdireccion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTdireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 290, 30));

        jCEspecialidad.setBackground(new java.awt.Color(246, 246, 248));
        jCEspecialidad.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jCEspecialidad.setForeground(new java.awt.Color(153, 153, 153));
        jCEspecialidad.setToolTipText("");
        jCEspecialidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jCEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 290, 30));

        jBagregarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcAGREGARoff-01.png"))); // NOI18N
        jBagregarPrestador.setBorder(null);
        jBagregarPrestador.setBorderPainted(false);
        jBagregarPrestador.setContentAreaFilled(false);
        jBagregarPrestador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcagregarIN-01.png"))); // NOI18N
        jBagregarPrestador.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcagregarIN-01.png"))); // NOI18N
        jBagregarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarPrestadorActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 70, 80));

        jBCrearOrden.setBackground(new java.awt.Color(255, 255, 255));
        jBCrearOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcORDENNUEVA-01.png"))); // NOI18N
        jBCrearOrden.setBorder(null);
        jBCrearOrden.setBorderPainted(false);
        jBCrearOrden.setContentAreaFilled(false);
        jBCrearOrden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcORDENin-01.png"))); // NOI18N
        jBCrearOrden.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcORDENin-01.png"))); // NOI18N
        jBCrearOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearOrdenActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrearOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 60, 80));

        jBLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/bLimpiarOFF-01.png"))); // NOI18N
        jBLimpiar.setBorder(null);
        jBLimpiar.setBorderPainted(false);
        jBLimpiar.setContentAreaFilled(false);
        jBLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/limpiarIN-01.png"))); // NOI18N
        jBLimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/limpiarIN-01.png"))); // NOI18N
        jBLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLimpiarMouseClicked(evt);
            }
        });
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 70, 120));

        jBmiPerfil.setBackground(new java.awt.Color(255, 255, 255));
        jBmiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcUSER-01.png"))); // NOI18N
        jBmiPerfil.setBorder(null);
        jBmiPerfil.setBorderPainted(false);
        jBmiPerfil.setContentAreaFilled(false);
        jBmiPerfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/USERin-01.png"))); // NOI18N
        jBmiPerfil.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/USERin-01.png"))); // NOI18N
        jPanel1.add(jBmiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 70, 90));

        jRPrestadoresActivos.setBackground(new java.awt.Color(255, 255, 255));
        jRPrestadoresActivos.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jRPrestadoresActivos.setForeground(new java.awt.Color(51, 51, 51));
        jRPrestadoresActivos.setText("Prestadores Activos");
        jRPrestadoresActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRPrestadoresActivosActionPerformed(evt);
            }
        });
        jPanel1.add(jRPrestadoresActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 180, 30));

        jLespecialidad.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLespecialidad.setForeground(new java.awt.Color(51, 51, 51));
        jLespecialidad.setText("Seleccione una Especialidad");
        jPanel1.add(jLespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 200, 40));

        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/textLIMPIAR-01.png"))); // NOI18N
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 411, -1, 50));

        jTPrestadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTPrestadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 420, 440));

        jLfondoVista.setBackground(new java.awt.Color(246, 246, 248));
        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VISTAprestadores-01.png"))); // NOI18N
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        jPanel1.add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1062, 740));

        jTPrestadores1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTPrestadores1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 420, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearOrdenActionPerformed

        VistaOrden vistaOrden = new VistaOrden(principal);
        principal.agregarComponenteAlEscritorio(vistaOrden);

    }//GEN-LAST:event_jBCrearOrdenActionPerformed

    private void jCmostrarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmostrarEspecialidadesActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
       
        cargarDatos();
    }//GEN-LAST:event_jCmostrarEspecialidadesActionPerformed

    private void jBagregarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarPrestadorActionPerformed
        try {
            String nombre = jTNombre.getText().trim();
            String apellido = jTApellido1.getText().trim();
            int dni = validarEntero(jTdocumento1.getText().trim());
            String domicilio = jTdireccion2.getText().trim();
            int telefono = validarEntero(jTtelefono1.getText().trim());
            Especialidad especialid = (Especialidad) jCEspecialidad.getSelectedItem();
            if (jTdocumento1.getText().isEmpty() || jTNombre.getText().isEmpty() || jTApellido1.getText().isEmpty() || jTdireccion2.getText().isEmpty() || jTtelefono1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }

            Prestador prest = new Prestador(nombre, apellido, domicilio, dni, telefono, especialid, true);
            prestaData.altaPrestador(prest);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTNombre.setText("   Nombre");
        jTApellido1.setText("  Apellido");
        jTdocumento1.setText("   Nro de Documento");
        jTtelefono1.setText("   Telefono");
        jTdireccion2.setText("   Domicilio");
        jCEspecialidad.setSelectedIndex(0);

    }//GEN-LAST:event_jBagregarPrestadorActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jTNombre.setText("");
        jTApellido1.setText("");
        jTdocumento1.setText("");
        jTtelefono1.setText("");
        jTdireccion2.setText("");
        jCEspecialidad.setSelectedIndex(0);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jRPrestadoresActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRPrestadoresActivosActionPerformed
            borrarFilaTabla();        
        if (jRPrestadoresActivos.isSelected()) {
            jRPrestadoresActivos.setSelected(true);
            prestadoresActivos();    
        } else {
            jRPrestadoresActivos.setSelected(false);
            borrarFilaTabla();            
        }
    }//GEN-LAST:event_jRPrestadoresActivosActionPerformed

    private void jBLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimpiarMouseClicked
        borrarFilaTabla();
        
        if (jRPrestadoresActivos.isSelected()) {
            jRPrestadoresActivos.setSelected(true);
            prestadoresActivos();    
        } else {
            jRPrestadoresActivos.setSelected(false);
            borrarFilaTabla();
            
        }
    }//GEN-LAST:event_jBLimpiarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrearOrden;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBagregarPrestador;
    private javax.swing.JButton jBmiPerfil;
    private javax.swing.JComboBox<Especialidad> jCEspecialidad;
    private javax.swing.JComboBox<Especialidad> jCmostrarEspecialidades;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLespecialidad;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRPrestadoresActivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTApellido1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTable jTPrestadores;
    private javax.swing.JTable jTPrestadores1;
    private javax.swing.JTextField jTdireccion2;
    private javax.swing.JTextField jTdocumento1;
    private javax.swing.JTextField jTtelefono1;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        //Prestador(int idPrestador, String nombre, String apellido, String domicilio, int dni, int telefono, Especialidad especialidad, boolean activo) 

        modelo.addColumn("Matricula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Documento");
        modelo.addColumn("Dirección");
        modelo.addColumn("Telefono");
        jTPrestadores.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int imdice = modelo.getRowCount() - 1;

        for (int i = imdice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarEspecialidades() {
        for (Especialidad especialidades : listaE) {
            jCmostrarEspecialidades.addItem(especialidades);
            jCEspecialidad.addItem(especialidades);
            //  jComboEspecialidad.addItem(especialidades);}
        }

    }

    private void cargarDatos() {
        //borrarFilaTabla();
        Especialidad selec = (Especialidad) jCmostrarEspecialidades.getSelectedItem();
        List<Prestador> lista = prestaData.buscarPrestadorPorEspecialidad(selec.getIdEspecialidad());
        for (Prestador a : lista) {

            modelo.addRow(new Object[]{a.getIdPrestador(), a.getNombre(), a.getApellido(), a.getDni(), a.getDomicilio(), a.getTelefono()});
        }
    }

    public int validarEntero(String texto) throws NumberFormatException {
        if (texto.matches("^-?\\d+$")) {
            return Integer.parseInt(texto);
        } else {
            throw new NumberFormatException();
        }
    }
private void prestadoresActivos() {
         //Prestador(int idPrestador, String nombre, String apellido, String domicilio, int dni, int telefono, Especialidad especialidad, boolean activo) 
        List<Prestador> lista = prestaData.listarPrestadores();
        for (Prestador a : lista) {
            modelo.addRow(new Object[]{a.getIdPrestador(), a.getNombre(), a.getApellido(), a.getDni(), a.getDomicilio(), a.getTelefono()});
        }
    }
}
