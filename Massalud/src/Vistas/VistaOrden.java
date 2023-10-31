package Vistas;

import AccesoADatos.AfiliadoData;
import AccesoADatos.OrdenData;
import AccesoADatos.PrestadorData;
import Entidades.Afiliado;
import Entidades.Orden;
import Entidades.Prestador;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class VistaOrden extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    private Principal principal;
    private boolean botonesVisibles = false;
    private Afiliado afiliado;
    private AfiliadoData afilData;
    private Prestador prestador;
    private PrestadorData presData;
    private Orden orden;
    private OrdenData ordenData;

    public VistaOrden() {
    }

    public VistaOrden(Principal principal) {

        initComponents();
        armarCabecera();
        this.principal = principal;
        afiliado = new Afiliado();
        prestador = new Prestador();
        orden = new Orden();
        presData = new PrestadorData();
        afilData = new AfiliadoData();
        ordenData = new OrdenData();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);

        jBuscarporAFILIADO1.setVisible(false);
        jBuscarporPRESTADOR.setVisible(false);
        jLventanaEmergente.setVisible(false);

        jLMENSAJEexitoso.setVisible(false);
        jLfondoalert.setVisible(false);
        jBsalirMENSAJE.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalirMENSAJE = new javax.swing.JButton();
        jLMENSAJEexitoso = new javax.swing.JLabel();
        jLfondoalert = new javax.swing.JLabel();
        jBuscarporPRESTADOR = new javax.swing.JButton();
        jBuscarporAFILIADO1 = new javax.swing.JButton();
        jLventanaEmergente = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        txtNroAfiliado = new javax.swing.JTextField();
        txtMatriculaPrestador = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jBbuscarporFecha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBmiperfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrden = new javax.swing.JTable();
        dcFechaTabla = new com.toedter.calendar.JDateChooser();
        cdFecha = new com.toedter.calendar.JDateChooser();
        cbxFormaPago = new javax.swing.JComboBox<>();
        jLfondoVista = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1062, 720));
        setPreferredSize(new java.awt.Dimension(1062, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBsalirMENSAJE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerror-01.png"))); // NOI18N
        jBsalirMENSAJE.setBorder(null);
        jBsalirMENSAJE.setContentAreaFilled(false);
        jBsalirMENSAJE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        jBsalirMENSAJE.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        jBsalirMENSAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirMENSAJEActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalirMENSAJE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 210, 60));

        jLMENSAJEexitoso.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLMENSAJEexitoso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMENSAJEexitoso.setText("Orden creada con exito!");
        getContentPane().add(jLMENSAJEexitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 220, 40));

        jLfondoalert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/Joption-01.png"))); // NOI18N
        getContentPane().add(jLfondoalert, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 410, 440));

        jBuscarporPRESTADOR.setBorder(null);
        jBuscarporPRESTADOR.setContentAreaFilled(false);
        jBuscarporPRESTADOR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrdenporPrestador-01.png"))); // NOI18N
        jBuscarporPRESTADOR.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrdenporPrestador-01.png"))); // NOI18N
        jBuscarporPRESTADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarporPRESTADORActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarporPRESTADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 210, 40));

        jBuscarporAFILIADO1.setBorder(null);
        jBuscarporAFILIADO1.setContentAreaFilled(false);
        jBuscarporAFILIADO1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/buscarporafiliado-01.png"))); // NOI18N
        jBuscarporAFILIADO1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/buscarporafiliado-01.png"))); // NOI18N
        jBuscarporAFILIADO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarporAFILIADO1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarporAFILIADO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 200, 40));

        jLventanaEmergente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/VENTANAemergente-01.png"))); // NOI18N
        getContentPane().add(jLventanaEmergente, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 260, 90));

        txtImporte.setBackground(new java.awt.Color(246, 246, 248));
        txtImporte.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtImporte.setForeground(new java.awt.Color(0, 0, 0));
        txtImporte.setText("     Importe");
        txtImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtImporte.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtImporte.setSelectionColor(new java.awt.Color(0, 0, 56));
        getContentPane().add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 300, 40));

        txtNroAfiliado.setBackground(new java.awt.Color(246, 246, 248));
        txtNroAfiliado.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtNroAfiliado.setForeground(new java.awt.Color(0, 0, 0));
        txtNroAfiliado.setText("      Nro de Afiliado");
        txtNroAfiliado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtNroAfiliado.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNroAfiliado.setSelectionColor(new java.awt.Color(0, 0, 56));
        getContentPane().add(txtNroAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 300, 40));

        txtMatriculaPrestador.setBackground(new java.awt.Color(246, 246, 248));
        txtMatriculaPrestador.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtMatriculaPrestador.setForeground(new java.awt.Color(0, 0, 0));
        txtMatriculaPrestador.setText("      Matricula de Prestador");
        txtMatriculaPrestador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtMatriculaPrestador.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtMatriculaPrestador.setSelectionColor(new java.awt.Color(0, 0, 56));
        getContentPane().add(txtMatriculaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 300, 40));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenOFF-01.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenIN-01.png"))); // NOI18N
        btnCrear.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonCrearordenIN-01.png"))); // NOI18N
        btnCrear.setSelected(true);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 200, 60));

        jBbuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/bBuscarOrdenOFF-01.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setBorderPainted(false);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrden-01.png"))); // NOI18N
        jBbuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BbuscarOrden-01.png"))); // NOI18N
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 70, 60));

        jBbuscarporFecha.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscarporFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBbuscarporFecha.setBorder(null);
        jBbuscarporFecha.setBorderPainted(false);
        jBbuscarporFecha.setContentAreaFilled(false);
        jBbuscarporFecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBbuscarporFecha.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBbuscarporFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarporFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscarporFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/textBuscar-01.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 300, 80, 30));

        jBmiperfil.setBackground(new java.awt.Color(255, 255, 255));
        jBmiperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcUSER-01.png"))); // NOI18N
        jBmiperfil.setBorder(null);
        jBmiperfil.setBorderPainted(false);
        jBmiperfil.setContentAreaFilled(false);
        jBmiperfil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcCARNETin-01.png"))); // NOI18N
        jBmiperfil.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BcCARNETin-01.png"))); // NOI18N
        getContentPane().add(jBmiperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 70, 80));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese fecha de Orden");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 180, 40));

        tbOrden.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 420, 440));

        dcFechaTabla.setDateFormatString("dd MM yyyy");
        getContentPane().add(dcFechaTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 240, 40));

        cdFecha.setDateFormatString("dd MM yyyy");
        getContentPane().add(cdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 300, 40));

        cbxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Débito" }));
        cbxFormaPago.setSelectedIndex(-1);
        getContentPane().add(cbxFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 252, 300, 40));

        jLfondoVista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/VISTAordenes-01.png"))); // NOI18N
        jLfondoVista.setMaximumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setMinimumSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setPreferredSize(new java.awt.Dimension(1062, 720));
        jLfondoVista.setRequestFocusEnabled(false);
        getContentPane().add(jLfondoVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1062, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        if (botonesVisibles) {
            ocultarBotones();
        } else {
            mostrarBotones();
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBbuscarporFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarporFechaActionPerformed
        java.util.Date selectedDate = dcFechaTabla.getDate();
        System.out.println(selectedDate);
        if (selectedDate != null) {
            java.sql.Date fecha = new java.sql.Date(selectedDate.getTime());
            System.out.println(fecha);
            // Llama al método listarOrdenPorFecha con la fecha seleccionada (ahora es de tipo java.sql.Date)            
            List<Orden> ordenes = ordenData.listarOrdenPorFecha(fecha);            
            modelo.setRowCount(0);            
            // Agrega las órdenes a la tabla
            for (Orden orden : ordenes) {
                modelo.addRow(new Object[]{orden.getIdOrden(), orden.getFormaPago(), orden.getImporte(), (orden.getAfiliado().getNombre() + " " + orden.getAfiliado().getApellido()), (orden.getPrestador().getNombre() + " " + orden.getPrestador().getApellido())});
            }
            
        } else { 
            // Manejar el caso en que no se seleccionó una fecha
            JOptionPane.showMessageDialog(this, "Selecciona una fecha válida.");
        }

    }//GEN-LAST:event_jBbuscarporFechaActionPerformed

    private void jBuscarporPRESTADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarporPRESTADORActionPerformed
        BuscarOrdenPrestador bPrestador = new BuscarOrdenPrestador(principal);
        principal.agregarComponenteAlEscritorio(bPrestador);


    }//GEN-LAST:event_jBuscarporPRESTADORActionPerformed

    private void jBuscarporAFILIADO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarporAFILIADO1ActionPerformed
        BuscarOrdenAfiliado bAfiliado = new BuscarOrdenAfiliado(principal);
        principal.agregarComponenteAlEscritorio(bAfiliado);
    }//GEN-LAST:event_jBuscarporAFILIADO1ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            LocalDate fechaNacimiento = null;
            if (cdFecha.getDate() != null) {
                fechaNacimiento = cdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }
            String formaPago = String.valueOf(cbxFormaPago.getSelectedItem());
            Double importe = Double.parseDouble(txtImporte.getText().trim());
            afiliado = afilData.buscarAfiliado(validarEntero(txtNroAfiliado.getText().trim()));
            prestador = presData.buscarPrestador(validarEntero(txtMatriculaPrestador.getText().trim()));            
            orden = new Orden(fechaNacimiento, formaPago, importe, afiliado, prestador);
            ordenData.altaOrden(orden);
            jLMENSAJEexitoso.setVisible(true);
            jLfondoalert.setVisible(true);
            jBsalirMENSAJE.setVisible(true);
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jBsalirMENSAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirMENSAJEActionPerformed
        jLMENSAJEexitoso.setVisible(false);
        jLfondoalert.setVisible(false);
        jBsalirMENSAJE.setVisible(false);
        cbxFormaPago.setSelectedIndex(-1);
        txtImporte.setText("");
        txtMatriculaPrestador.setText("");
        txtNroAfiliado.setText("");
        cdFecha.setDate(null);
    }//GEN-LAST:event_jBsalirMENSAJEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cbxFormaPago;
    private com.toedter.calendar.JDateChooser cdFecha;
    private com.toedter.calendar.JDateChooser dcFechaTabla;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBbuscarporFecha;
    private javax.swing.JButton jBmiperfil;
    private javax.swing.JButton jBsalirMENSAJE;
    private javax.swing.JButton jBuscarporAFILIADO1;
    private javax.swing.JButton jBuscarporPRESTADOR;
    private javax.swing.JLabel jLMENSAJEexitoso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLfondoVista;
    private javax.swing.JLabel jLfondoalert;
    private javax.swing.JLabel jLventanaEmergente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbOrden;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtMatriculaPrestador;
    private javax.swing.JTextField txtNroAfiliado;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        //Orden(LocalDate fecha, String formaPago, double importe, Afiliado afiliado, Prestador prestador) 
        modelo.addColumn("Orden Nro");
        modelo.addColumn("Forma de Pago");
        modelo.addColumn("Importe");
        modelo.addColumn("Afiliado");
        modelo.addColumn("Prestador");
        tbOrden.setModel(modelo);
    }

    private void mostrarBotones() {
        botonesVisibles = true;
        jBuscarporAFILIADO1.setVisible(true);
        jBuscarporPRESTADOR.setVisible(true);
        jLventanaEmergente.setVisible(true);

    }

    private void ocultarBotones() {
        botonesVisibles = false;
        jBuscarporAFILIADO1.setVisible(false);
        jBuscarporPRESTADOR.setVisible(false);
        jLventanaEmergente.setVisible(false);
    }

    public int validarEntero(String texto) throws NumberFormatException {
        if (texto.matches("^-?\\d+$")) {
            return Integer.parseInt(texto);
        } else {
            throw new NumberFormatException();
        }
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarDatos() {
        //borrarFilaTabla();
        LocalDate fechaOrden = null;
        if (cdFecha.getDate() != null) {
            fechaOrden = cdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        List<Orden> lista = ordenData.listarOrdenPorFecha(Date.valueOf(fechaOrden));
        for (Orden a : lista) {

            modelo.addRow(new Object[]{a.getIdOrden(), a.getFormaPago(), a.getImporte(), a.getAfiliado().getIdAfiliado(), a.getPrestador().getIdPrestador()});
        }
    }
}
