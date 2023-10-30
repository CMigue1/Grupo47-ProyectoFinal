/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AfiliadoData;
import AccesoADatos.EspecialidadData;
import AccesoADatos.PlanData;
import AccesoADatos.PrestadorData;
import Entidades.Afiliado;
import Entidades.Especialidad;
import Entidades.Plan;
import Entidades.Prestador;
import java.awt.Color;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Miguel
 */
public class VistaConsultas extends javax.swing.JInternalFrame {

    private List<Plan> listaP;
    private List<Especialidad> listE;
    private PlanData planData;
    private EspecialidadData especialidadData;
    private AfiliadoData afilData;
    private PrestadorData presData;
    private Principal principal = new Principal();

    public VistaConsultas(Principal principal) {
        initComponents();
        this.principal = principal;
        planData = new PlanData();
        listaP = planData.listarPlanes();
        especialidadData = new EspecialidadData();
        listE = especialidadData.listarEspecialidades();
        afilData = new AfiliadoData();
        presData = new PrestadorData();
        cargarPlanes(jCPlan1);
        cargarEspecialidades(cbxEspecialidad);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        this.setSize(1062, 720);
        btnGuardadAf.setVisible(false);
        btnGuardarPr.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalirMENSAJE = new javax.swing.JButton();
        jLtituloAlerta = new javax.swing.JLabel();
        jLMENSAJEalerta1 = new javax.swing.JLabel();
        jLfondoalert = new javax.swing.JLabel();
        txtAfiliadoId = new javax.swing.JTextField();
        txtIdAfiliado = new javax.swing.JTextField();
        txtApellidoAf = new javax.swing.JTextField();
        txtTelefonoAf = new javax.swing.JTextField();
        txtDomicilioAf = new javax.swing.JTextField();
        txtNombreAf = new javax.swing.JTextField();
        txtAfiliadoDni = new javax.swing.JTextField();
        btnBuscarPrDni = new javax.swing.JButton();
        btnBuscarPrId = new javax.swing.JButton();
        txtDocumentoPr = new javax.swing.JTextField();
        txtMatriculaPrestador = new javax.swing.JTextField();
        txtMatriculaPr = new javax.swing.JTextField();
        txtTelefonoPr = new javax.swing.JTextField();
        txtDomicilioPr = new javax.swing.JTextField();
        txtNombrePr = new javax.swing.JTextField();
        txtApellidoPr = new javax.swing.JTextField();
        txtDniPr = new javax.swing.JTextField();
        btnBuscarAfDni = new javax.swing.JButton();
        btnBuscarAfId = new javax.swing.JButton();
        btnEditarPr = new javax.swing.JButton();
        btnEditarAf = new javax.swing.JButton();
        txtDniAf = new javax.swing.JTextField();
        btnGuardadAf = new javax.swing.JButton();
        btnGuardarPr = new javax.swing.JButton();
        jCPlan1 = new javax.swing.JComboBox<>();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        cbxEstadoAf = new javax.swing.JComboBox<>();
        cbxEstadoPr = new javax.swing.JComboBox<>();
        FONDO = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBsalirMENSAJE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerror-01.png"))); // NOI18N
        jBsalirMENSAJE.setBorder(null);
        jBsalirMENSAJE.setContentAreaFilled(false);
        jBsalirMENSAJE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        jBsalirMENSAJE.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/ACEPTARerrorIN-01.png"))); // NOI18N
        getContentPane().add(jBsalirMENSAJE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 210, 60));

        jLtituloAlerta.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        jLtituloAlerta.setText("Cuidado!");
        getContentPane().add(jLtituloAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 40));

        jLMENSAJEalerta1.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLMENSAJEalerta1.setText("Por favor corrija los campos.");
        getContentPane().add(jLMENSAJEalerta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 250, 40));

        jLfondoalert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/Joptionerror-01.png"))); // NOI18N
        getContentPane().add(jLfondoalert, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 410, 440));

        txtAfiliadoId.setBackground(new java.awt.Color(247, 247, 249));
        txtAfiliadoId.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtAfiliadoId.setForeground(new java.awt.Color(51, 51, 51));
        txtAfiliadoId.setText("Ingrese ID Afiliado");
        txtAfiliadoId.setBorder(null);
        txtAfiliadoId.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAfiliadoId.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtAfiliadoId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAfiliadoIdMouseClicked(evt);
            }
        });
        txtAfiliadoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfiliadoIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtAfiliadoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, -1));

        txtIdAfiliado.setEditable(false);
        txtIdAfiliado.setBackground(new java.awt.Color(247, 247, 249));
        txtIdAfiliado.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtIdAfiliado.setForeground(new java.awt.Color(153, 153, 153));
        txtIdAfiliado.setText("2");
        txtIdAfiliado.setBorder(null);
        txtIdAfiliado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtIdAfiliado.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtIdAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 20));

        txtApellidoAf.setEditable(false);
        txtApellidoAf.setBackground(new java.awt.Color(247, 247, 249));
        txtApellidoAf.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtApellidoAf.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoAf.setText("Perez");
        txtApellidoAf.setBorder(null);
        txtApellidoAf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtApellidoAf.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtApellidoAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAfActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 20));

        txtTelefonoAf.setEditable(false);
        txtTelefonoAf.setBackground(new java.awt.Color(247, 247, 249));
        txtTelefonoAf.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtTelefonoAf.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoAf.setText("2392 689523");
        txtTelefonoAf.setBorder(null);
        txtTelefonoAf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTelefonoAf.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtTelefonoAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoAfActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 20));

        txtDomicilioAf.setEditable(false);
        txtDomicilioAf.setBackground(new java.awt.Color(247, 247, 249));
        txtDomicilioAf.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtDomicilioAf.setForeground(new java.awt.Color(153, 153, 153));
        txtDomicilioAf.setText("Lisandro de la Torre, Nro 2046 , Trenque Lauquen, Bs As.");
        txtDomicilioAf.setBorder(null);
        txtDomicilioAf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDomicilioAf.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtDomicilioAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioAfActionPerformed(evt);
            }
        });
        getContentPane().add(txtDomicilioAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 270, 20));

        txtNombreAf.setEditable(false);
        txtNombreAf.setBackground(new java.awt.Color(247, 247, 249));
        txtNombreAf.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtNombreAf.setForeground(new java.awt.Color(153, 153, 153));
        txtNombreAf.setText("Juan");
        txtNombreAf.setBorder(null);
        txtNombreAf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNombreAf.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtNombreAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAfActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 20));

        txtAfiliadoDni.setBackground(new java.awt.Color(247, 247, 249));
        txtAfiliadoDni.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtAfiliadoDni.setForeground(new java.awt.Color(51, 51, 51));
        txtAfiliadoDni.setText("Ingrese el Dni");
        txtAfiliadoDni.setBorder(null);
        txtAfiliadoDni.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAfiliadoDni.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtAfiliadoDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAfiliadoDniMouseClicked(evt);
            }
        });
        txtAfiliadoDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAfiliadoDniActionPerformed(evt);
            }
        });
        getContentPane().add(txtAfiliadoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, -1));

        btnBuscarPrDni.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPrDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        btnBuscarPrDni.setBorder(null);
        btnBuscarPrDni.setBorderPainted(false);
        btnBuscarPrDni.setContentAreaFilled(false);
        btnBuscarPrDni.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        btnBuscarPrDni.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        btnBuscarPrDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrDniActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPrDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 30, 30));

        btnBuscarPrId.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarPrId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        btnBuscarPrId.setBorder(null);
        btnBuscarPrId.setBorderPainted(false);
        btnBuscarPrId.setContentAreaFilled(false);
        btnBuscarPrId.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        btnBuscarPrId.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        btnBuscarPrId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrIdActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 30, 30));

        txtDocumentoPr.setBackground(new java.awt.Color(247, 247, 249));
        txtDocumentoPr.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtDocumentoPr.setForeground(new java.awt.Color(51, 51, 51));
        txtDocumentoPr.setText("Ingrese el Dni");
        txtDocumentoPr.setBorder(null);
        txtDocumentoPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDocumentoPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtDocumentoPr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDocumentoPrMouseClicked(evt);
            }
        });
        getContentPane().add(txtDocumentoPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 120, -1));

        txtMatriculaPrestador.setBackground(new java.awt.Color(247, 247, 249));
        txtMatriculaPrestador.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        txtMatriculaPrestador.setForeground(new java.awt.Color(51, 51, 51));
        txtMatriculaPrestador.setText("Ingrese Matricula");
        txtMatriculaPrestador.setBorder(null);
        txtMatriculaPrestador.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMatriculaPrestador.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtMatriculaPrestador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatriculaPrestadorMouseClicked(evt);
            }
        });
        txtMatriculaPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatriculaPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 120, -1));

        txtMatriculaPr.setEditable(false);
        txtMatriculaPr.setBackground(new java.awt.Color(247, 247, 249));
        txtMatriculaPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtMatriculaPr.setForeground(new java.awt.Color(153, 153, 153));
        txtMatriculaPr.setText("1");
        txtMatriculaPr.setBorder(null);
        txtMatriculaPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtMatriculaPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtMatriculaPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaPrActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatriculaPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 20));

        txtTelefonoPr.setEditable(false);
        txtTelefonoPr.setBackground(new java.awt.Color(247, 247, 249));
        txtTelefonoPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtTelefonoPr.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefonoPr.setText("2392 689523");
        txtTelefonoPr.setBorder(null);
        txtTelefonoPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtTelefonoPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtTelefonoPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoPrActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonoPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 140, 20));

        txtDomicilioPr.setEditable(false);
        txtDomicilioPr.setBackground(new java.awt.Color(247, 247, 249));
        txtDomicilioPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtDomicilioPr.setForeground(new java.awt.Color(153, 153, 153));
        txtDomicilioPr.setText("Lisandro de la Torre, Nro 2046 , TL, Bs As.");
        txtDomicilioPr.setBorder(null);
        txtDomicilioPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDomicilioPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtDomicilioPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioPrActionPerformed(evt);
            }
        });
        getContentPane().add(txtDomicilioPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 240, 20));

        txtNombrePr.setEditable(false);
        txtNombrePr.setBackground(new java.awt.Color(247, 247, 249));
        txtNombrePr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtNombrePr.setForeground(new java.awt.Color(153, 153, 153));
        txtNombrePr.setText("Juan");
        txtNombrePr.setBorder(null);
        txtNombrePr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtNombrePr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtNombrePr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePrActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePr, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 140, 20));

        txtApellidoPr.setEditable(false);
        txtApellidoPr.setBackground(new java.awt.Color(247, 247, 249));
        txtApellidoPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtApellidoPr.setForeground(new java.awt.Color(153, 153, 153));
        txtApellidoPr.setText("Perez");
        txtApellidoPr.setBorder(null);
        txtApellidoPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtApellidoPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtApellidoPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPrActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 190, 20));

        txtDniPr.setEditable(false);
        txtDniPr.setBackground(new java.awt.Color(247, 247, 249));
        txtDniPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtDniPr.setForeground(new java.awt.Color(153, 153, 153));
        txtDniPr.setText("37425968");
        txtDniPr.setBorder(null);
        txtDniPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDniPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtDniPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPrActionPerformed(evt);
            }
        });
        getContentPane().add(txtDniPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 150, 20));

        btnBuscarAfDni.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAfDni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        btnBuscarAfDni.setBorder(null);
        btnBuscarAfDni.setBorderPainted(false);
        btnBuscarAfDni.setContentAreaFilled(false);
        btnBuscarAfDni.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        btnBuscarAfDni.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        btnBuscarAfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAfDniActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarAfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 30, 30));

        btnBuscarAfId.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarAfId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        btnBuscarAfId.setBorder(null);
        btnBuscarAfId.setBorderPainted(false);
        btnBuscarAfId.setContentAreaFilled(false);
        btnBuscarAfId.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        btnBuscarAfId.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        btnBuscarAfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAfIdActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarAfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 30, 30));

        btnEditarPr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        btnEditarPr.setBorder(null);
        btnEditarPr.setContentAreaFilled(false);
        btnEditarPr.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        btnEditarPr.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        btnEditarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPrActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 70, 30));

        btnEditarAf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        btnEditarAf.setBorder(null);
        btnEditarAf.setContentAreaFilled(false);
        btnEditarAf.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        btnEditarAf.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        btnEditarAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAfActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, 30));

        txtDniAf.setEditable(false);
        txtDniAf.setBackground(new java.awt.Color(247, 247, 249));
        txtDniAf.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        txtDniAf.setForeground(new java.awt.Color(153, 153, 153));
        txtDniAf.setText("37425968");
        txtDniAf.setBorder(null);
        txtDniAf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtDniAf.setSelectionColor(new java.awt.Color(153, 153, 153));
        txtDniAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniAfActionPerformed(evt);
            }
        });
        getContentPane().add(txtDniAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 150, 20));

        btnGuardadAf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaOFF-01.png"))); // NOI18N
        btnGuardadAf.setBorder(null);
        btnGuardadAf.setContentAreaFilled(false);
        btnGuardadAf.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaIN-01.png"))); // NOI18N
        btnGuardadAf.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaIN-01.png"))); // NOI18N
        btnGuardadAf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadAfActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardadAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 128, 70, -1));

        btnGuardarPr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaOFF-01.png"))); // NOI18N
        btnGuardarPr.setBorder(null);
        btnGuardarPr.setContentAreaFilled(false);
        btnGuardarPr.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaIN-01.png"))); // NOI18N
        btnGuardarPr.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Imagenes/GUARDARconsultaIN-01.png"))); // NOI18N
        btnGuardarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 420, -1, 60));

        jCPlan1.setBackground(new java.awt.Color(255, 255, 255));
        jCPlan1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jCPlan1.setForeground(new java.awt.Color(153, 153, 153));
        jCPlan1.setToolTipText("Tipo de Plan");
        jCPlan1.setBorder(null);
        jCPlan1.setEnabled(false);
        jCPlan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPlan1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 110, 30));

        cbxEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        cbxEspecialidad.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        cbxEspecialidad.setForeground(new java.awt.Color(153, 153, 153));
        cbxEspecialidad.setToolTipText("Tipo de Plan");
        cbxEspecialidad.setBorder(null);
        cbxEspecialidad.setEnabled(false);
        cbxEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 160, 30));

        cbxEstadoAf.setBackground(new java.awt.Color(255, 255, 255));
        cbxEstadoAf.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cbxEstadoAf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbxEstadoAf.setBorder(null);
        cbxEstadoAf.setEnabled(false);
        getContentPane().add(cbxEstadoAf, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 120, 30));

        cbxEstadoPr.setBackground(new java.awt.Color(255, 255, 255));
        cbxEstadoPr.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cbxEstadoPr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbxEstadoPr.setBorder(null);
        cbxEstadoPr.setEnabled(false);
        getContentPane().add(cbxEstadoPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 120, 30));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/CONSULTAvista-01.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAfActionPerformed

    private void txtDomicilioAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioAfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioAfActionPerformed

    private void txtTelefonoAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoAfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoAfActionPerformed

    private void txtApellidoAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAfActionPerformed

    private void txtIdAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAfiliadoActionPerformed

    private void btnBuscarPrIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrIdActionPerformed
        try {
            int matricula = Integer.parseInt(txtMatriculaPrestador.getText());

            Prestador prestador = new Prestador();
            prestador = presData.buscarPrestador(matricula);

            if (prestador != null) {
                txtMatriculaPr.setText(String.valueOf(prestador.getIdPrestador()));
                txtNombrePr.setText(prestador.getNombre());
                txtApellidoPr.setText(prestador.getApellido());
                txtDomicilioPr.setText(prestador.getDomicilio());
                txtDniPr.setText(String.valueOf(prestador.getDni()));
                txtTelefonoPr.setText(String.valueOf(prestador.getTelefono()));
                int id = prestador.getEspecialidad().getIdEspecialidad() - 1;
                cbxEspecialidad.setSelectedIndex(id);
                if (prestador.isActivo()) {
                    cbxEstadoPr.setSelectedIndex(0);
                } else {
                    cbxEstadoPr.setSelectedIndex(1);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese una matricula");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error en: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarPrIdActionPerformed

    private void txtMatriculaPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaPrActionPerformed

    private void txtTelefonoPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoPrActionPerformed

    private void txtDomicilioPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioPrActionPerformed

    private void txtNombrePrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePrActionPerformed

    private void txtApellidoPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoPrActionPerformed

    private void txtDniPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPrActionPerformed

    private void txtMatriculaPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaPrestadorActionPerformed

    private void btnBuscarAfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAfIdActionPerformed
        try {
            int idAfiliado = Integer.parseInt(txtAfiliadoId.getText());

            Afiliado afiliado = new Afiliado();
            afiliado = afilData.buscarAfiliado(idAfiliado);

            if (afiliado != null) {
                txtIdAfiliado.setText(String.valueOf(afiliado.getIdAfiliado()));
                txtNombreAf.setText(afiliado.getNombre());
                txtApellidoAf.setText(afiliado.getApellido());
                txtDomicilioAf.setText(afiliado.getDomicilio());
                txtDniAf.setText(String.valueOf(afiliado.getDni()));
                txtTelefonoAf.setText(String.valueOf(afiliado.getTelefono()));
                int id = afiliado.getPlan().getIdPlan() - 1;
                jCPlan1.setSelectedIndex(id);
                if (afiliado.isActivo()) {
                    cbxEstadoAf.setSelectedIndex(0);
                } else {
                    cbxEstadoAf.setSelectedIndex(1);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese el numero del afiliado");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error en: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarAfIdActionPerformed

    private void txtDniAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniAfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniAfActionPerformed

    private void btnBuscarAfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAfDniActionPerformed
        try {
            int dni = Integer.parseInt(txtAfiliadoDni.getText());

            Afiliado afiliado = new Afiliado();
            afiliado = afilData.buscarAfiliadoPorDni(dni);

            if (afiliado != null) {
                txtIdAfiliado.setText(String.valueOf(afiliado.getIdAfiliado()));
                txtNombreAf.setText(afiliado.getNombre());
                txtApellidoAf.setText(afiliado.getApellido());
                txtDniAf.setText(String.valueOf(afiliado.getDni()));
                txtDomicilioAf.setText(afiliado.getDomicilio());
                txtTelefonoAf.setText(String.valueOf(afiliado.getTelefono()));
                int id = afiliado.getPlan().getIdPlan() - 1;
                jCPlan1.setSelectedIndex(id);

                if (afiliado.isActivo()) {
                    cbxEstadoAf.setSelectedIndex(0);
                } else {
                    cbxEstadoAf.setSelectedIndex(1);
                }
//              
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de Documento");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error en: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarAfDniActionPerformed

    private void btnBuscarPrDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrDniActionPerformed
        try {
            int dni = Integer.parseInt(txtDocumentoPr.getText());

            Prestador prestador = new Prestador();
            prestador = presData.buscarPrestadorPorDni(dni);

            if (prestador != null) {
                txtMatriculaPr.setText(String.valueOf(prestador.getIdPrestador()));
                txtNombrePr.setText(prestador.getNombre());
                txtApellidoPr.setText(prestador.getApellido());
                txtDomicilioPr.setText(prestador.getDomicilio());
                txtDniPr.setText(String.valueOf(prestador.getDni()));
                txtTelefonoPr.setText(String.valueOf(prestador.getTelefono()));
                int id = prestador.getEspecialidad().getIdEspecialidad() - 1;
                cbxEspecialidad.setSelectedIndex(id);
                if (prestador.isActivo()) {
                    cbxEstadoPr.setSelectedIndex(0);
                } else {
                    cbxEstadoPr.setSelectedIndex(1);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de Documento");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error en: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarPrDniActionPerformed

    private void txtAfiliadoIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAfiliadoIdMouseClicked
        if (txtAfiliadoId.getText().equals("Ingrese ID Afiliado")) {

            txtAfiliadoId.setText("");
            txtAfiliadoId.setForeground(Color.black);
        }
        if (txtAfiliadoDni.getText().isEmpty()) {
            txtAfiliadoDni.setText("Ingrese Nro DNI");
            txtAfiliadoDni.setForeground(Color.gray);
        }
        if (txtMatriculaPrestador.getText().isEmpty()) {
            txtMatriculaPrestador.setText("Ingrese Matricula");
            txtMatriculaPrestador.setForeground(Color.gray);
        }
        if (txtDocumentoPr.getText().isEmpty()) {
            txtDocumentoPr.setText("Ingrese el Dni");
            txtDocumentoPr.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtAfiliadoIdMouseClicked

    private void txtAfiliadoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfiliadoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfiliadoIdActionPerformed

    private void txtAfiliadoDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAfiliadoDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfiliadoDniActionPerformed

    private void txtAfiliadoDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAfiliadoDniMouseClicked
        if (txtAfiliadoDni.getText().equals("Ingrese el Dni")) {
            txtAfiliadoDni.setText("");
            txtAfiliadoDni.setForeground(Color.black);
        }
        if (txtAfiliadoId.getText().isEmpty()) {
            txtAfiliadoId.setText("Ingrese ID Afiliado");
            txtAfiliadoId.setForeground(Color.gray);
        }
        if (txtMatriculaPrestador.getText().isEmpty()) {
            txtMatriculaPrestador.setText("Ingrese Matricula");
            txtMatriculaPrestador.setForeground(Color.gray);
        }
        if (txtDocumentoPr.getText().isEmpty()) {
            txtDocumentoPr.setText("Ingrese el Dni");
            txtDocumentoPr.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtAfiliadoDniMouseClicked

    private void txtMatriculaPrestadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatriculaPrestadorMouseClicked
        if (txtMatriculaPrestador.getText().equals("Ingrese Matricula")) {
            txtMatriculaPrestador.setText("");
            txtMatriculaPrestador.setForeground(Color.black);
        }
        if (txtDocumentoPr.getText().isEmpty()) {
            txtDocumentoPr.setText("Ingrese el Dni");
            txtDocumentoPr.setForeground(Color.gray);
        }
        if (txtAfiliadoId.getText().isEmpty()) {
            txtAfiliadoId.setText("Ingrese ID Afiliado");
            txtAfiliadoId.setForeground(Color.gray);
        }
        if (txtAfiliadoDni.getText().isEmpty()) {
            txtAfiliadoDni.setText("Ingrese el Dni");
            txtAfiliadoDni.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtMatriculaPrestadorMouseClicked

    private void txtDocumentoPrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocumentoPrMouseClicked
        if (txtDocumentoPr.getText().equals("Ingrese el Dni")) {
            txtDocumentoPr.setText("");
            txtDocumentoPr.setForeground(Color.black);
        }
        if (txtMatriculaPrestador.getText().isEmpty()) {
            txtMatriculaPrestador.setText("Ingrese Matricula");
            txtMatriculaPrestador.setForeground(Color.gray);
        }
        if (txtAfiliadoId.getText().isEmpty()) {
            txtAfiliadoId.setText("Ingrese ID Afiliado");
            txtAfiliadoId.setForeground(Color.gray);
        }
        if (txtAfiliadoDni.getText().isEmpty()) {
            txtAfiliadoDni.setText("Ingrese el Dni");
            txtAfiliadoDni.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDocumentoPrMouseClicked

    private void btnEditarAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAfActionPerformed
        btnGuardadAf.setVisible(true);
        btnEditarAf.setVisible(false);
        txtIdAfiliado.setEditable(true);
        txtNombreAf.setEditable(true);
        txtApellidoAf.setEditable(true);
        txtDniAf.setEditable(true);
        txtTelefonoAf.setEditable(true);
        txtDomicilioAf.setEditable(true);
        jCPlan1.setEnabled(true);
        cbxEstadoAf.setEnabled(true);

    }//GEN-LAST:event_btnEditarAfActionPerformed

    private void btnEditarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPrActionPerformed
        // TODO add your handling code here:
        btnGuardarPr.setVisible(true);
        btnEditarPr.setVisible(false);
        txtMatriculaPr.setEditable(true);
        txtNombrePr.setEditable(true);
        txtApellidoPr.setEditable(true);
        txtDniPr.setEditable(true);
        txtDomicilioPr.setEditable(true);
        cbxEspecialidad.setEnabled(true);
        cbxEstadoPr.setEnabled(true);
    }//GEN-LAST:event_btnEditarPrActionPerformed

    private void btnGuardadAfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadAfActionPerformed
        btnEditarAf.setVisible(true);
        btnGuardadAf.setVisible(false);
        try {
            boolean estado = false;
            int idAfiliado = validarEntero(txtIdAfiliado.getText().trim());
            String nombre = txtNombreAf.getText().trim();
            String apellido = txtApellidoAf.getText().trim();
            int dni = validarEntero(txtDniAf.getText().trim());
            String domicilio = txtDomicilioAf.getText().trim();
            int telefono = validarEntero(txtTelefonoAf.getText().trim());

            Plan plan = (Plan) jCPlan1.getSelectedItem();
            if (txtIdAfiliado.getText().isEmpty() || txtDniAf.getText().isEmpty() || txtNombreAf.getText().isEmpty() || txtApellidoAf.getText().isEmpty() || txtDomicilioAf.getText().isEmpty() || txtTelefonoAf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
            String activo = String.valueOf(cbxEstadoAf.getSelectedItem());
            if ("Activo".equalsIgnoreCase(activo)) {
                estado = true;
            } else {
                estado = false;
            }
            Afiliado afiliado = new Afiliado(idAfiliado, nombre, apellido, domicilio, dni, telefono, plan, estado);
            afilData.modificarAfiliado(afiliado);
            txtIdAfiliado.setEditable(false);
            txtNombreAf.setEditable(false);
            txtApellidoAf.setEditable(false);
            txtDniAf.setEditable(false);
            txtTelefonoAf.setEditable(false);
            txtDomicilioAf.setEditable(false);
            jCPlan1.setEnabled(false);
            cbxEstadoAf.setEnabled(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardadAfActionPerformed

    private void jCPlan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPlan1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCPlan1ActionPerformed

    private void cbxEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEspecialidadActionPerformed

    private void btnGuardarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrActionPerformed
        btnEditarPr.setVisible(true);
        btnGuardarPr.setVisible(false);
        try {
            boolean estado = false;
            int idPrestador = validarEntero(txtMatriculaPr.getText().trim());
            String nombre = txtNombrePr.getText().trim();
            String apellido = txtApellidoPr.getText().trim();
            int dni = validarEntero(txtDniPr.getText().trim());
            String domicilio = txtDomicilioPr.getText().trim();
            int telefono = validarEntero(txtTelefonoPr.getText().trim());

            Especialidad especialidad = (Especialidad) cbxEspecialidad.getSelectedItem();
            if (txtIdAfiliado.getText().isEmpty() || txtDniAf.getText().isEmpty() || txtNombreAf.getText().isEmpty() || txtApellidoAf.getText().isEmpty() || txtDomicilioAf.getText().isEmpty() || txtTelefonoAf.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
                return;
            }
            String activo = String.valueOf(cbxEstadoAf.getSelectedItem());
            if ("Activo".equalsIgnoreCase(activo)) {
                estado = true;
            } else {
                estado = false;
            }
            Prestador prestador = new Prestador(idPrestador, nombre, apellido, domicilio, dni, telefono, especialidad, estado);
            presData.modificarPrestador(prestador);
            txtMatriculaPr.setEditable(false);
            txtNombrePr.setEditable(false);
            txtApellidoPr.setEditable(false);
            txtDniPr.setEditable(false);
            txtDomicilioPr.setEditable(false);
            cbxEspecialidad.setEnabled(false);
            cbxEstadoPr.setEnabled(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores enteros válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarPrActionPerformed
    public int validarEntero(String texto) throws NumberFormatException {
        if (texto.matches("^-?\\d+$")) {
            return Integer.parseInt(texto);
        } else {
            throw new NumberFormatException();
        }
    }

    private void cargarPlanes(JComboBox comboBox) {
        for (Plan planes : listaP) {
            comboBox.addItem(planes);
        }
    }

    private void cargarEspecialidades(JComboBox comboBox) {
        for (Especialidad especialidad : listE) {
            comboBox.addItem(especialidad);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnBuscarAfDni;
    private javax.swing.JButton btnBuscarAfId;
    private javax.swing.JButton btnBuscarPrDni;
    private javax.swing.JButton btnBuscarPrId;
    private javax.swing.JButton btnEditarAf;
    private javax.swing.JButton btnEditarPr;
    private javax.swing.JButton btnGuardadAf;
    private javax.swing.JButton btnGuardarPr;
    private javax.swing.JComboBox<Especialidad> cbxEspecialidad;
    private javax.swing.JComboBox<String> cbxEstadoAf;
    private javax.swing.JComboBox<String> cbxEstadoPr;
    private javax.swing.JButton jBsalirMENSAJE;
    private javax.swing.JComboBox<Plan> jCPlan1;
    private javax.swing.JLabel jLMENSAJEalerta1;
    private javax.swing.JLabel jLfondoalert;
    private javax.swing.JLabel jLtituloAlerta;
    private javax.swing.JTextField txtAfiliadoDni;
    private javax.swing.JTextField txtAfiliadoId;
    private javax.swing.JTextField txtApellidoAf;
    private javax.swing.JTextField txtApellidoPr;
    private javax.swing.JTextField txtDniAf;
    private javax.swing.JTextField txtDniPr;
    private javax.swing.JTextField txtDocumentoPr;
    private javax.swing.JTextField txtDomicilioAf;
    private javax.swing.JTextField txtDomicilioPr;
    private javax.swing.JTextField txtIdAfiliado;
    private javax.swing.JTextField txtMatriculaPr;
    private javax.swing.JTextField txtMatriculaPrestador;
    private javax.swing.JTextField txtNombreAf;
    private javax.swing.JTextField txtNombrePr;
    private javax.swing.JTextField txtTelefonoAf;
    private javax.swing.JTextField txtTelefonoPr;
    // End of variables declaration//GEN-END:variables

}
