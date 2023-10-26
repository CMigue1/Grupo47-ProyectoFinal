/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AfiliadoData;
import Entidades.Afiliado;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Miguel
 */
public class VistaConsultas extends javax.swing.JInternalFrame {

   private AfiliadoData afilData;
   private Principal principal=new Principal();
   
    public VistaConsultas(Principal principal) {
        initComponents();
        this.principal=principal;
        afilData = new AfiliadoData();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        this.setSize(1062, 720);
    }

  

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTIdAfiliado = new javax.swing.JTextField();
        jTApellidoAF = new javax.swing.JTextField();
        jTestadoPr = new javax.swing.JTextField();
        jTtelefonoAF = new javax.swing.JTextField();
        jTdomicilioAF = new javax.swing.JTextField();
        jTNombreAF = new javax.swing.JTextField();
        jTdocumento = new javax.swing.JTextField();
        jBuscarDniPrestador = new javax.swing.JButton();
        jBuscarPrestadorMatricula = new javax.swing.JButton();
        jTbuscarDNIprestador = new javax.swing.JTextField();
        jTmatricula = new javax.swing.JTextField();
        jTMatricula = new javax.swing.JTextField();
        jTtelefonoPR = new javax.swing.JTextField();
        jTdomicilioPR = new javax.swing.JTextField();
        jTNombrePR = new javax.swing.JTextField();
        jTApellidoPR = new javax.swing.JTextField();
        jTdocumentoPR = new javax.swing.JTextField();
        jBuscarporNroAfiliado1 = new javax.swing.JButton();
        jBuscarAfiliadoDNI1 = new javax.swing.JButton();
        jBeditarPrestador = new javax.swing.JButton();
        jBeditarAfiliado = new javax.swing.JButton();
        jTestadoAF1 = new javax.swing.JTextField();
        jTplanAF1 = new javax.swing.JTextField();
        jTdocumentoAF1 = new javax.swing.JTextField();
        jBguardarcambiosAfiliado = new javax.swing.JButton();
        jBguardarcambiosPrestador = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(247, 247, 249));
        jTextField1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("Ingrese ID Afiliado");
        jTextField1.setBorder(null);
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 120, -1));

        jTIdAfiliado.setBackground(new java.awt.Color(247, 247, 249));
        jTIdAfiliado.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTIdAfiliado.setForeground(new java.awt.Color(153, 153, 153));
        jTIdAfiliado.setText("2");
        jTIdAfiliado.setBorder(null);
        jTIdAfiliado.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTIdAfiliado.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTIdAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdAfiliadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTIdAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 140, 20));

        jTApellidoAF.setBackground(new java.awt.Color(247, 247, 249));
        jTApellidoAF.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTApellidoAF.setForeground(new java.awt.Color(153, 153, 153));
        jTApellidoAF.setText("Perez");
        jTApellidoAF.setBorder(null);
        jTApellidoAF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTApellidoAF.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTApellidoAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoAFActionPerformed(evt);
            }
        });
        getContentPane().add(jTApellidoAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 20));

        jTestadoPr.setBackground(new java.awt.Color(247, 247, 249));
        jTestadoPr.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTestadoPr.setForeground(new java.awt.Color(153, 153, 153));
        jTestadoPr.setText("Activo");
        jTestadoPr.setBorder(null);
        jTestadoPr.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTestadoPr.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTestadoPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTestadoPrActionPerformed(evt);
            }
        });
        getContentPane().add(jTestadoPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 100, 20));

        jTtelefonoAF.setBackground(new java.awt.Color(247, 247, 249));
        jTtelefonoAF.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTtelefonoAF.setForeground(new java.awt.Color(153, 153, 153));
        jTtelefonoAF.setText("2392 689523");
        jTtelefonoAF.setBorder(null);
        jTtelefonoAF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTtelefonoAF.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTtelefonoAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoAFActionPerformed(evt);
            }
        });
        getContentPane().add(jTtelefonoAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 140, 20));

        jTdomicilioAF.setBackground(new java.awt.Color(247, 247, 249));
        jTdomicilioAF.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdomicilioAF.setForeground(new java.awt.Color(153, 153, 153));
        jTdomicilioAF.setText("Lisandro de la Torre, Nro 2046 , Trenque Lauquen, Bs As.");
        jTdomicilioAF.setBorder(null);
        jTdomicilioAF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTdomicilioAF.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTdomicilioAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdomicilioAFActionPerformed(evt);
            }
        });
        getContentPane().add(jTdomicilioAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 270, 20));

        jTNombreAF.setBackground(new java.awt.Color(247, 247, 249));
        jTNombreAF.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTNombreAF.setForeground(new java.awt.Color(153, 153, 153));
        jTNombreAF.setText("Juan");
        jTNombreAF.setBorder(null);
        jTNombreAF.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTNombreAF.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTNombreAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreAFActionPerformed(evt);
            }
        });
        getContentPane().add(jTNombreAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 20));

        jTdocumento.setEditable(false);
        jTdocumento.setBackground(new java.awt.Color(247, 247, 249));
        jTdocumento.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTdocumento.setForeground(new java.awt.Color(51, 51, 51));
        jTdocumento.setText("Ingrese Nro DNI");
        jTdocumento.setBorder(null);
        jTdocumento.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTdocumento.setSelectionColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, -1));

        jBuscarDniPrestador.setBackground(new java.awt.Color(255, 255, 255));
        jBuscarDniPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBuscarDniPrestador.setBorder(null);
        jBuscarDniPrestador.setBorderPainted(false);
        jBuscarDniPrestador.setContentAreaFilled(false);
        jBuscarDniPrestador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBuscarDniPrestador.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        getContentPane().add(jBuscarDniPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 30, 30));

        jBuscarPrestadorMatricula.setBackground(new java.awt.Color(255, 255, 255));
        jBuscarPrestadorMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBuscarPrestadorMatricula.setBorder(null);
        jBuscarPrestadorMatricula.setBorderPainted(false);
        jBuscarPrestadorMatricula.setContentAreaFilled(false);
        jBuscarPrestadorMatricula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBuscarPrestadorMatricula.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        jBuscarPrestadorMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPrestadorMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarPrestadorMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 30, 30));

        jTbuscarDNIprestador.setEditable(false);
        jTbuscarDNIprestador.setBackground(new java.awt.Color(247, 247, 249));
        jTbuscarDNIprestador.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTbuscarDNIprestador.setForeground(new java.awt.Color(51, 51, 51));
        jTbuscarDNIprestador.setText("Ingrese Nro DNI");
        jTbuscarDNIprestador.setBorder(null);
        jTbuscarDNIprestador.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTbuscarDNIprestador.setSelectionColor(new java.awt.Color(153, 153, 153));
        getContentPane().add(jTbuscarDNIprestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 120, -1));

        jTmatricula.setEditable(false);
        jTmatricula.setBackground(new java.awt.Color(247, 247, 249));
        jTmatricula.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTmatricula.setForeground(new java.awt.Color(51, 51, 51));
        jTmatricula.setText("Ingrese Matricula");
        jTmatricula.setBorder(null);
        jTmatricula.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTmatricula.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTmatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 120, -1));

        jTMatricula.setBackground(new java.awt.Color(247, 247, 249));
        jTMatricula.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTMatricula.setForeground(new java.awt.Color(153, 153, 153));
        jTMatricula.setText("1");
        jTMatricula.setBorder(null);
        jTMatricula.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTMatricula.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 20));

        jTtelefonoPR.setBackground(new java.awt.Color(247, 247, 249));
        jTtelefonoPR.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTtelefonoPR.setForeground(new java.awt.Color(153, 153, 153));
        jTtelefonoPR.setText("2392 689523");
        jTtelefonoPR.setBorder(null);
        jTtelefonoPR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTtelefonoPR.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTtelefonoPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTtelefonoPRActionPerformed(evt);
            }
        });
        getContentPane().add(jTtelefonoPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 140, 20));

        jTdomicilioPR.setBackground(new java.awt.Color(247, 247, 249));
        jTdomicilioPR.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdomicilioPR.setForeground(new java.awt.Color(153, 153, 153));
        jTdomicilioPR.setText("Lisandro de la Torre, Nro 2046 , TL, Bs As.");
        jTdomicilioPR.setBorder(null);
        jTdomicilioPR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTdomicilioPR.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTdomicilioPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdomicilioPRActionPerformed(evt);
            }
        });
        getContentPane().add(jTdomicilioPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 240, 20));

        jTNombrePR.setBackground(new java.awt.Color(247, 247, 249));
        jTNombrePR.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTNombrePR.setForeground(new java.awt.Color(153, 153, 153));
        jTNombrePR.setText("Juan");
        jTNombrePR.setBorder(null);
        jTNombrePR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTNombrePR.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTNombrePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombrePRActionPerformed(evt);
            }
        });
        getContentPane().add(jTNombrePR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 140, 20));

        jTApellidoPR.setBackground(new java.awt.Color(247, 247, 249));
        jTApellidoPR.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTApellidoPR.setForeground(new java.awt.Color(153, 153, 153));
        jTApellidoPR.setText("Perez");
        jTApellidoPR.setBorder(null);
        jTApellidoPR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTApellidoPR.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTApellidoPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoPRActionPerformed(evt);
            }
        });
        getContentPane().add(jTApellidoPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 190, 20));

        jTdocumentoPR.setBackground(new java.awt.Color(247, 247, 249));
        jTdocumentoPR.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdocumentoPR.setForeground(new java.awt.Color(153, 153, 153));
        jTdocumentoPR.setText("37425968");
        jTdocumentoPR.setBorder(null);
        jTdocumentoPR.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTdocumentoPR.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTdocumentoPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdocumentoPRActionPerformed(evt);
            }
        });
        getContentPane().add(jTdocumentoPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 150, 20));

        jBuscarporNroAfiliado1.setBackground(new java.awt.Color(255, 255, 255));
        jBuscarporNroAfiliado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBuscarporNroAfiliado1.setBorder(null);
        jBuscarporNroAfiliado1.setBorderPainted(false);
        jBuscarporNroAfiliado1.setContentAreaFilled(false);
        jBuscarporNroAfiliado1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBuscarporNroAfiliado1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        getContentPane().add(jBuscarporNroAfiliado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 30, 30));

        jBuscarAfiliadoDNI1.setBackground(new java.awt.Color(255, 255, 255));
        jBuscarAfiliadoDNI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaOFF-01.png"))); // NOI18N
        jBuscarAfiliadoDNI1.setBorder(null);
        jBuscarAfiliadoDNI1.setBorderPainted(false);
        jBuscarAfiliadoDNI1.setContentAreaFilled(false);
        jBuscarAfiliadoDNI1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01_1.png"))); // NOI18N
        jBuscarAfiliadoDNI1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupaIN-01.png"))); // NOI18N
        jBuscarAfiliadoDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAfiliadoDNI1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBuscarAfiliadoDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 30, 30));

        jBeditarPrestador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        jBeditarPrestador.setBorder(null);
        jBeditarPrestador.setContentAreaFilled(false);
        jBeditarPrestador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        jBeditarPrestador.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        getContentPane().add(jBeditarPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 70, 30));

        jBeditarAfiliado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/Beditar-01.png"))); // NOI18N
        jBeditarAfiliado.setBorder(null);
        jBeditarAfiliado.setContentAreaFilled(false);
        jBeditarAfiliado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        jBeditarAfiliado.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/BEditarIN-01.png"))); // NOI18N
        getContentPane().add(jBeditarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, 30));

        jTestadoAF1.setBackground(new java.awt.Color(247, 247, 249));
        jTestadoAF1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTestadoAF1.setForeground(new java.awt.Color(153, 153, 153));
        jTestadoAF1.setText("Activo");
        jTestadoAF1.setBorder(null);
        jTestadoAF1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTestadoAF1.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTestadoAF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTestadoAF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTestadoAF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 100, 20));

        jTplanAF1.setBackground(new java.awt.Color(247, 247, 249));
        jTplanAF1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTplanAF1.setForeground(new java.awt.Color(153, 153, 153));
        jTplanAF1.setText("Mas Joven");
        jTplanAF1.setBorder(null);
        jTplanAF1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTplanAF1.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTplanAF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTplanAF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTplanAF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 100, 20));

        jTdocumentoAF1.setBackground(new java.awt.Color(247, 247, 249));
        jTdocumentoAF1.setFont(new java.awt.Font("Montserrat Medium", 0, 10)); // NOI18N
        jTdocumentoAF1.setForeground(new java.awt.Color(153, 153, 153));
        jTdocumentoAF1.setText("37425968");
        jTdocumentoAF1.setBorder(null);
        jTdocumentoAF1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTdocumentoAF1.setSelectionColor(new java.awt.Color(153, 153, 153));
        jTdocumentoAF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdocumentoAF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTdocumentoAF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 150, 20));

        jBguardarcambiosAfiliado.setText("guardar");
        jBguardarcambiosAfiliado.setBorder(null);
        jBguardarcambiosAfiliado.setContentAreaFilled(false);
        getContentPane().add(jBguardarcambiosAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 50, -1));

        jBguardarcambiosPrestador.setText("guardar");
        jBguardarcambiosPrestador.setBorder(null);
        jBguardarcambiosPrestador.setContentAreaFilled(false);
        getContentPane().add(jBguardarcambiosPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 50, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMAGENES/CONSULTAvista-01.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTNombreAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreAFActionPerformed

    private void jTdomicilioAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdomicilioAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdomicilioAFActionPerformed

    private void jTtelefonoAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoAFActionPerformed

    private void jTestadoPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTestadoPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTestadoPrActionPerformed

    private void jTApellidoAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoAFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoAFActionPerformed

    private void jTIdAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdAfiliadoActionPerformed

    private void jBuscarPrestadorMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPrestadorMatriculaActionPerformed
        try {
            int dni = Integer.parseInt(jTdocumento.getText());

            Afiliado afiliado = new Afiliado();
            afiliado = afilData.buscarAfiliadoPorDni(dni);

            if (afiliado != null) {
                jTNombreAF.setText(afiliado.getNombre());
                jTApellidoAF.setText(afiliado.getApellido());
                jTdomicilioAF.setText(afiliado.getDomicilio());
                jTtelefonoAF.setText(String.valueOf(afiliado.getTelefono()));
//                if(afiliado.isActivo()){
//                    ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/img/ButtonActivo-01.png"));
//                    jBactivo.setIcon(nuevaImagen);
//                }else{
//                    ImageIcon nuevaImagen = new ImageIcon(getClass().getResource("/img/ButtonInactivo-01.png"));
//                    jBactivo.setIcon(nuevaImagen);
//                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero de Documento");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Error en: " + e.getMessage());
        }
    }//GEN-LAST:event_jBuscarPrestadorMatriculaActionPerformed

    private void jTMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMatriculaActionPerformed

    private void jTtelefonoPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTtelefonoPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTtelefonoPRActionPerformed

    private void jTdomicilioPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdomicilioPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdomicilioPRActionPerformed

    private void jTNombrePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombrePRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombrePRActionPerformed

    private void jTApellidoPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoPRActionPerformed

    private void jTdocumentoPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdocumentoPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdocumentoPRActionPerformed

    private void jTmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmatriculaActionPerformed

    private void jBuscarAfiliadoDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarAfiliadoDNI1ActionPerformed

    private void jTdocumentoAF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdocumentoAF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdocumentoAF1ActionPerformed

    private void jTplanAF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTplanAF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTplanAF1ActionPerformed

    private void jTestadoAF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTestadoAF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTestadoAF1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton jBeditarAfiliado;
    private javax.swing.JButton jBeditarPrestador;
    private javax.swing.JButton jBguardarcambiosAfiliado;
    private javax.swing.JButton jBguardarcambiosPrestador;
    private javax.swing.JButton jBuscarAfiliadoDNI1;
    private javax.swing.JButton jBuscarDniPrestador;
    private javax.swing.JButton jBuscarPrestadorMatricula;
    private javax.swing.JButton jBuscarporNroAfiliado1;
    private javax.swing.JTextField jTApellidoAF;
    private javax.swing.JTextField jTApellidoPR;
    private javax.swing.JTextField jTIdAfiliado;
    private javax.swing.JTextField jTMatricula;
    private javax.swing.JTextField jTNombreAF;
    private javax.swing.JTextField jTNombrePR;
    private javax.swing.JTextField jTbuscarDNIprestador;
    private javax.swing.JTextField jTdocumento;
    private javax.swing.JTextField jTdocumentoAF1;
    private javax.swing.JTextField jTdocumentoPR;
    private javax.swing.JTextField jTdomicilioAF;
    private javax.swing.JTextField jTdomicilioPR;
    private javax.swing.JTextField jTestadoAF1;
    private javax.swing.JTextField jTestadoPr;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTmatricula;
    private javax.swing.JTextField jTplanAF1;
    private javax.swing.JTextField jTtelefonoAF;
    private javax.swing.JTextField jTtelefonoPR;
    // End of variables declaration//GEN-END:variables
}
