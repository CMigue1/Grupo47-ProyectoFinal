package Vistas;

import AccesoADatos.AfiliadoData;
import AccesoADatos.PlanData;
import Entidades.Afiliado;
import Entidades.Plan;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class VistaAfiliado extends javax.swing.JInternalFrame {

    private List<Plan> listaP;
    private PlanData planD;
    private AfiliadoData afilData;
    private DefaultTableModel modelo = new DefaultTableModel();
    private Principal principal;

    public VistaAfiliado(Principal principal) {
        this.principal = principal;
        initComponents();
        planD = new PlanData();
        listaP = planD.listarPlanes();
        afilData = new AfiliadoData();
        modelo = new DefaultTableModel();
        cargarPlanes(jCBPlan);
        cargarPlanes(jCPlan1);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTtelefono = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTApellido1 = new javax.swing.JTextField();
        jTdocumento = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jCPlan1 = new javax.swing.JComboBox<>();
        jCBPlan = new javax.swing.JComboBox<>();
        jBagregar = new javax.swing.JButton();
        jBCrearOrden = new javax.swing.JButton();
        jBcarnet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        afilActivos = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAfiliados = new javax.swing.JTable();
        jBlimpiar = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        jLfondoVista = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setInheritsPopupMenu(true);
        setMinimumSize(new java.awt.Dimension(1000, 720));
        setPreferredSize(new java.awt.Dimension(1000, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setMinimumSize(new java.awt.Dimension(1120, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1062, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Documento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, 40));

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Plan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, 40));

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Domicilio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, 40));

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nro de Celular");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, 40));

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, 40));

        jTtelefono.setBackground(new java.awt.Color(255, 255, 255));
        jTtelefono.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTtelefono.setForeground(new java.awt.Color(153, 153, 153));
        jTtelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTtelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtelefonoMouseClicked(evt);
            }
        });
        jPanel1.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 290, 30));

        jTNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTNombre.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 290, 30));

        jTApellido1.setBackground(new java.awt.Color(255, 255, 255));
        jTApellido1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTApellido1.setForeground(new java.awt.Color(153, 153, 153));
        jTApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellido1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 290, 30));

        jTdocumento.setBackground(new java.awt.Color(255, 255, 255));
        jTdocumento.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdocumento.setForeground(new java.awt.Color(153, 153, 153));
        jTdocumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jTdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 290, 30));

        jTdireccion.setBackground(new java.awt.Color(255, 255, 255));
        jTdireccion.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdireccion.setForeground(new java.awt.Color(153, 153, 153));
        jTdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTdireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdireccionMouseClicked(evt);
            }
        });
        jPanel1.add(jTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 290, 30));

        jCPlan1.setBackground(new java.awt.Color(255, 255, 255));
        jCPlan1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jCPlan1.setForeground(new java.awt.Color(153, 153, 153));
        jCPlan1.setToolTipText("Tipo de Plan");
        jCPlan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(jCPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 290, 30));

        jCBPlan.setToolTipText("");
        jCBPlan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCBPlan.setName(""); // NOI18N
        jCBPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPlanActionPerformed(evt);
            }
        });
        jPanel1.add(jCBPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 260, -1));

        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcAGREGARoff-01.png"))); // NOI18N
        jBagregar.setBorder(null);
        jBagregar.setBorderPainted(false);
        jBagregar.setContentAreaFilled(false);
        jBagregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcagregarIN-01.png"))); // NOI18N
        jBagregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcagregarIN-01.png"))); // NOI18N
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
        jPanel1.add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 70, 70));

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

        jBcarnet.setBackground(new java.awt.Color(255, 255, 255));
        jBcarnet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/bcarnetNUEVOoff-01.png"))); // NOI18N
        jBcarnet.setBorder(null);
        jBcarnet.setBorderPainted(false);
        jBcarnet.setContentAreaFilled(false);
        jBcarnet.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BcarnetNUEVOin-01.png"))); // NOI18N
        jBcarnet.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BcarnetNUEVOin-01.png"))); // NOI18N
        jBcarnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcarnetActionPerformed(evt);
            }
        });
        jPanel1.add(jBcarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 70, 80));

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione un Plan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 120, -1, 40));

        afilActivos.setBackground(new java.awt.Color(255, 255, 255));
        afilActivos.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        afilActivos.setForeground(new java.awt.Color(51, 51, 51));
        afilActivos.setText("Afiliados Activos");
        afilActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afilActivosActionPerformed(evt);
            }
        });
        jPanel1.add(afilActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 180, 30));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 170, 420, 440));

        jBlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/bLimpiarOFF-01.png"))); // NOI18N
        jBlimpiar.setBorder(null);
        jBlimpiar.setContentAreaFilled(false);
        jBlimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/limpiarIN-01.png"))); // NOI18N
        jBlimpiar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/limpiarIN-01.png"))); // NOI18N
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 358, 70, 60));

        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/textLIMPIAR-01.png"))); // NOI18N
        jPanel1.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 411, -1, 50));

        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VISTAafiliados-01.png"))); // NOI18N
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        jPanel1.add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1062, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcarnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcarnetActionPerformed
        CrearCarnet carnet = new CrearCarnet(principal);
        principal.agregarComponenteAlEscritorio(carnet);
        
        
    }//GEN-LAST:event_jBcarnetActionPerformed

    private void jBCrearOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearOrdenActionPerformed
        VistaOrden orden = new VistaOrden(principal);
        principal.agregarComponenteAlEscritorio(orden);
    }//GEN-LAST:event_jBCrearOrdenActionPerformed

    private void jCBPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPlanActionPerformed
        borrarFilaTabla();
        afilActivos.setSelected(false);
        cargarDatos();
    }//GEN-LAST:event_jCBPlanActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        // TODO add your handling code here:

        try {
            String nombre = jTNombre.getText().trim();
            String apellido = jTApellido1.getText().trim();
            int dni = validarEntero(jTdocumento.getText().trim());
            String domicilio = jTdireccion.getText().trim();
            int telefono = validarEntero(jTtelefono.getText().trim());
            Plan plan = (Plan) jCPlan1.getSelectedItem();
            if (jTdocumento.getText().isEmpty() || jTNombre.getText().isEmpty() || jTApellido1.getText().isEmpty() || jTdireccion.getText().isEmpty() || jTtelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
            Afiliado afiliado = new Afiliado(nombre, apellido, domicilio, dni, telefono, plan, true);
            afilData.altaAfilidado(afiliado);
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBagregarActionPerformed

    private void afilActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afilActivosActionPerformed
        borrarFilaTabla();

        if (afilActivos.isSelected()) {
            afilActivos.setSelected(true);
            afiliadosActivos();
        } else {
            afilActivos.setSelected(false);
            borrarFilaTabla();

        }
    }//GEN-LAST:event_afilActivosActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        // TODO add your handling code here:
        jTNombre.setText("");
        jTApellido1.setText("");
        jTdocumento.setText("");
        jTtelefono.setText("");
        jTdireccion.setText("");
        jCPlan1.setSelectedIndex(0);
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jTdireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdireccionMouseClicked
       
    }//GEN-LAST:event_jTdireccionMouseClicked

    private void jTtelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtelefonoMouseClicked

    }//GEN-LAST:event_jTtelefonoMouseClicked

    private void jTApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellido1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton afilActivos;
    private javax.swing.JButton jBCrearOrden;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBcarnet;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JComboBox<Plan> jCBPlan;
    private javax.swing.JComboBox<Plan> jCPlan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAfiliados;
    private javax.swing.JTextField jTApellido1;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        //Prestador(int idPrestador, String nombre, String apellido, String domicilio, int dni, int telefono, Especialidad especialidad, boolean activo) 

        modelo.addColumn("Matricula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Dni");
        modelo.addColumn("Telefono");
        jTAfiliados.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarPlanes(JComboBox comboBox) {
        for (Plan planes : listaP) {
            comboBox.addItem(planes);
        }
    }

    private void cargarDatos() {
        //borrarFilaTabla();
        Plan selec = (Plan) jCBPlan.getSelectedItem();
        List<Afiliado> lista = afilData.buscarAfiliadosPorPlan(selec.getIdPlan());
        for (Afiliado a : lista) {

            modelo.addRow(new Object[]{a.getIdAfiliado(), a.getNombre(), a.getApellido(), a.getDni(), a.getDomicilio(), a.getTelefono()});
        }
    }

    public int validarEntero(String texto) throws NumberFormatException {
        if (texto.matches("^-?\\d+$")) {
            return Integer.parseInt(texto);
        } else {
            throw new NumberFormatException();
        }
    }

    private void afiliadosActivos() {
        List<Afiliado> lista = afilData.listarAfiliados();
        for (Afiliado a : lista) {
            modelo.addRow(new Object[]{a.getIdAfiliado(), a.getNombre(), a.getApellido(), a.getDni(), a.getDomicilio(), a.getTelefono()});
        }
    }


}
