package vistas;

import entidades.Conexion;
import entidades.Materias;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.sql.Connection;
import javax.swing.SwingUtilities;
import persistencia.MateriaData;

public class VentanaDeInicio extends javax.swing.JFrame {

    int xMouse, yMouse;
    int x, y;
    MateriaData materiaData;

    Materias materia = new Materias("Matematica 1 ", 1, false);
    Materias materia2 = new Materias("Ingles 1 ", 1, false);
    Materias materia3 = new Materias("Programacion 1 ", 1, false);
    Materias materia4 = new Materias("Laboratorio de Programacion 1 ", 1, true);
    Materias materia5 = new Materias("Desarrollo Web ", 1, true);
    Materias materia6 = new Materias("Administracion de Bases de Datos ", 1, true);
    Materias materia7 = new Materias("EDA", 1, false);

    public VentanaDeInicio() {
        initComponents();
        Connection con = Conexion.getConexion();
        this.setLocationRelativeTo(null);
        pnlIngresoAlumnos.setVisible(false);
        pnlIngresoInsc.setVisible(false);
        pnlIngresoMaterias.setVisible(false);
        btnSistemaAlumnos.setVisible(false);
        btnSistemaMaterias.setVisible(false);
        btnSistemaInscripciones.setVisible(false);
        lblDoubleclick.setText("BIENVENIDO");
        materiaData = new MateriaData(con);

        materiaData.guardarMateria(materia);
        materiaData.guardarMateria(materia2);
        materiaData.guardarMateria(materia3);
        materiaData.guardarMateria(materia4);
        materiaData.guardarMateria(materia5);
        materiaData.guardarMateria(materia6);
        materiaData.guardarMateria(materia7);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        backgroundPnl = new javax.swing.JPanel();
        menuPnl = new javax.swing.JPanel();
        btnSistemaInscripciones = new javax.swing.JPanel();
        lblSysInsc = new javax.swing.JLabel();
        lblInsc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSistemaAlumnos = new javax.swing.JPanel();
        lblSysAlu = new javax.swing.JLabel();
        lblAlu = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnSistemaMaterias = new javax.swing.JPanel();
        lblSysMat = new javax.swing.JLabel();
        lblMat = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblInageSistema = new javax.swing.JLabel();
        lblDoubleclick = new javax.swing.JLabel();
        ingressPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAcceso = new javax.swing.JButton();
        pnlAccess = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlAccesMsg2 = new javax.swing.JLabel();
        pnlAccesMsg1 = new javax.swing.JLabel();
        pnlSuperior = new javax.swing.JPanel();
        closePnl = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlGeneral = new javax.swing.JPanel();
        pnlIngresoAlumnos = new javax.swing.JPanel();
        btnAccesAlumnos = new javax.swing.JButton();
        btnBackAlumnos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlIngresoMaterias = new javax.swing.JPanel();
        btnAccessMaterias = new javax.swing.JButton();
        btnBackMaterias = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pnlIngresoInsc = new javax.swing.JPanel();
        btnAccesInsc = new javax.swing.JButton();
        btnBackInsc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pnlMsgInicio = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgroundPnl.setBackground(new java.awt.Color(153, 153, 153));
        backgroundPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        backgroundPnl.setMaximumSize(new java.awt.Dimension(1000, 550));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPnl.setBackground(new java.awt.Color(51, 51, 51));
        menuPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSistemaInscripciones.setBackground(new java.awt.Color(51, 51, 51));
        btnSistemaInscripciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSistemaInscripciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistemaInscripciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSistemaInscripcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSistemaInscripcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSistemaInscripcionesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSistemaInscripcionesMouseReleased(evt);
            }
        });
        btnSistemaInscripciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSysInsc.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSysInsc.setForeground(new java.awt.Color(255, 102, 0));
        lblSysInsc.setText("Sistema");
        btnSistemaInscripciones.add(lblSysInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, -1));

        lblInsc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblInsc.setForeground(new java.awt.Color(255, 255, 255));
        lblInsc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsc.setText("INSCRIPCIONES");
        btnSistemaInscripciones.add(lblInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 20));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        btnSistemaInscripciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 10));

        menuPnl.add(btnSistemaInscripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 60));

        btnSistemaAlumnos.setBackground(new java.awt.Color(51, 51, 51));
        btnSistemaAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSistemaAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistemaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSistemaAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSistemaAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSistemaAlumnosMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSistemaAlumnosMouseReleased(evt);
            }
        });
        btnSistemaAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSysAlu.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSysAlu.setForeground(new java.awt.Color(255, 102, 0));
        lblSysAlu.setText("Sistema");
        btnSistemaAlumnos.add(lblSysAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, -1));

        lblAlu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAlu.setForeground(new java.awt.Color(255, 255, 255));
        lblAlu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlu.setText("ALUMNOS");
        btnSistemaAlumnos.add(lblAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        btnSistemaAlumnos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        btnSistemaAlumnos.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -50, 970, 30));

        menuPnl.add(btnSistemaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 60));

        btnSistemaMaterias.setBackground(new java.awt.Color(51, 51, 51));
        btnSistemaMaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSistemaMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSistemaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSistemaMateriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSistemaMateriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSistemaMateriasMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSistemaMateriasMouseReleased(evt);
            }
        });
        btnSistemaMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSysMat.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSysMat.setForeground(new java.awt.Color(255, 102, 0));
        lblSysMat.setText("Sistema");
        btnSistemaMaterias.add(lblSysMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, -1));

        lblMat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMat.setForeground(new java.awt.Color(255, 255, 255));
        lblMat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMat.setText("MATERIAS");
        btnSistemaMaterias.add(lblMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        btnSistemaMaterias.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 10));

        menuPnl.add(btnSistemaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, 60));

        lblInageSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInageSistema.setIcon(new javax.swing.ImageIcon("C:\\Users\\mauri\\OneDrive\\Documentos\\GitHub\\ProyectoTransversal\\GP11.Universidad\\src\\imagenes\\Sistema Ingreso.png")); // NOI18N
        menuPnl.add(lblInageSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 240, 250));

        lblDoubleclick.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblDoubleclick.setForeground(new java.awt.Color(255, 102, 0));
        lblDoubleclick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoubleclick.setText("DOBLE CLIC PARA ACCEDER");
        menuPnl.add(lblDoubleclick, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, 30));

        backgroundPnl.add(menuPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 520));

        ingressPnl.setBackground(new java.awt.Color(204, 204, 204));
        ingressPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingressPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INGRESO");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        ingressPnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        btnAcceso.setBackground(new java.awt.Color(51, 51, 51));
        btnAcceso.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAcceso.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceso.setText("Aceptar");
        btnAcceso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesoActionPerformed(evt);
            }
        });
        ingressPnl.add(btnAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 140));

        pnlAccess.setBackground(new java.awt.Color(0, 0, 0));
        pnlAccess.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Access.png"))); // NOI18N
        pnlAccess.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 185));

        pnlAccesMsg2.setBackground(new java.awt.Color(0, 0, 0));
        pnlAccesMsg2.setForeground(new java.awt.Color(255, 255, 255));
        pnlAccesMsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlAccesMsg2.setText("Ingrese usuario y contraseña");
        pnlAccess.add(pnlAccesMsg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 190, -1));

        pnlAccesMsg1.setBackground(new java.awt.Color(0, 0, 0));
        pnlAccesMsg1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        pnlAccesMsg1.setForeground(new java.awt.Color(255, 255, 255));
        pnlAccesMsg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlAccesMsg1.setText("Para acceder");
        pnlAccess.add(pnlAccesMsg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, -1));

        ingressPnl.add(pnlAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 270));

        backgroundPnl.add(ingressPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 190, 520));

        pnlSuperior.setBackground(new java.awt.Color(102, 102, 102));
        pnlSuperior.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        pnlSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlSuperiorMouseDragged(evt);
            }
        });
        pnlSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuperiorMousePressed(evt);
            }
        });
        pnlSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closePnl.setBackground(new java.awt.Color(255, 102, 0));
        closePnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closePnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closePnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closePnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closePnlMouseExited(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setText("x");
        closeBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout closePnlLayout = new javax.swing.GroupLayout(closePnl);
        closePnl.setLayout(closePnlLayout);
        closePnlLayout.setHorizontalGroup(
            closePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closePnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        closePnlLayout.setVerticalGroup(
            closePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, closePnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSuperior.add(closePnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestión Universitaria");
        jLabel1.setToolTipText("");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        pnlSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        backgroundPnl.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        pnlGeneral.setBackground(new java.awt.Color(153, 153, 153));
        pnlGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngresoAlumnos.setBackground(new java.awt.Color(51, 51, 51));
        pnlIngresoAlumnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        pnlIngresoAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        pnlIngresoAlumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccesAlumnos.setBackground(new java.awt.Color(102, 102, 102));
        btnAccesAlumnos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAccesAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnAccesAlumnos.setText("Ingresar");
        btnAccesAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccesAlumnos.setEnabled(false);
        btnAccesAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesAlumnosActionPerformed(evt);
            }
        });
        pnlIngresoAlumnos.add(btnAccesAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 110, -1));

        btnBackAlumnos.setBackground(new java.awt.Color(102, 102, 102));
        btnBackAlumnos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        btnBackAlumnos.setText("Atras");
        btnBackAlumnos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackAlumnosActionPerformed(evt);
            }
        });
        pnlIngresoAlumnos.add(btnBackAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 110, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema de Gestión");
        pnlIngresoAlumnos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));
        pnlIngresoAlumnos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 250, 10));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlIngresoAlumnos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 190, 190));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Alumnos");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingreso");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIngresoAlumnos.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 60));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Funcionalidad del sistema:\n\n- Inscribir nuevos alumnos.\n- Modificar registros.\n- Alta de alumnos.\n- Baja de alumnos.\n- Borrado de registros.\n- Buscar alumnos mediante distintos\nfiltros y opciones.\n- Listado completo de alumnos.\n\nPara acceder ingrese su Usuario y \ncontraseña.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        pnlIngresoAlumnos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 310, 240));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea2.setRows(5);
        jTextArea2.setText("Usuario Alumno: alumno\nContraseña Alumno: alumno\n\nUsuario Docente: docente\nContraseña Docente: docente");
        jTextArea2.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea2);

        pnlIngresoAlumnos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 100));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pnlIngresoAlumnos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 10, 450));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("S G U");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlIngresoAlumnos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 250));

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GRUPO 11 - V0.1");
        pnlIngresoAlumnos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 170, -1));

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pestchanker Mauricio Andrés");
        pnlIngresoAlumnos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 190, -1));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Quiroga Máximo");
        pnlIngresoAlumnos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 190, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Chirino Sosa Marcos Antonio");
        pnlIngresoAlumnos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, -1));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("TP Transversal");
        pnlIngresoAlumnos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, -1));

        pnlGeneral.add(pnlIngresoAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 10));

        pnlIngresoMaterias.setBackground(new java.awt.Color(51, 51, 51));
        pnlIngresoMaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        pnlIngresoMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccessMaterias.setBackground(new java.awt.Color(102, 102, 102));
        btnAccessMaterias.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAccessMaterias.setForeground(new java.awt.Color(255, 255, 255));
        btnAccessMaterias.setText("Ingresar");
        btnAccessMaterias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccessMaterias.setEnabled(false);
        btnAccessMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessMateriasActionPerformed(evt);
            }
        });
        pnlIngresoMaterias.add(btnAccessMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 100, -1));

        btnBackMaterias.setBackground(new java.awt.Color(102, 102, 102));
        btnBackMaterias.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackMaterias.setForeground(new java.awt.Color(255, 255, 255));
        btnBackMaterias.setText("Atras");
        btnBackMaterias.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMateriasActionPerformed(evt);
            }
        });
        pnlIngresoMaterias.add(btnBackMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 100, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sistema de Gestión");
        pnlIngresoMaterias.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(255, 102, 0));
        pnlIngresoMaterias.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 200, 10));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 102, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Materias");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 140, 26));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Ingreso");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, -1));

        pnlIngresoMaterias.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pnlIngresoMaterias.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 10, 450));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setRows(5);
        jTextArea3.setText("Funcionalidad del sistema:\n\n- Agregar nuevas materias a la currícula.\n\n- Modificar materias existentes.\n\n- Buscar materias.\n\n- Listar materias.\n\n- Borrar materias, física y lógicamente.");
        jScrollPane3.setViewportView(jTextArea3);

        pnlIngresoMaterias.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 300, 200));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea4.setRows(5);
        jTextArea4.setText("Usuario Alumno: alumno\nContraseña Alumno: alumno\n\nUsuario Docente: docente\nContraseña Docente: docente");
        jTextArea4.setAutoscrolls(false);
        jScrollPane4.setViewportView(jTextArea4);

        pnlIngresoMaterias.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 300, 100));

        jLabel22.setBackground(new java.awt.Color(51, 51, 51));
        jLabel22.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("S G U");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlIngresoMaterias.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 250));

        jLabel23.setBackground(new java.awt.Color(51, 51, 51));
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("GRUPO 11 - V0.1");
        pnlIngresoMaterias.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 170, -1));

        jLabel24.setBackground(new java.awt.Color(51, 51, 51));
        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Pestchanker Mauricio Andrés");
        pnlIngresoMaterias.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 190, -1));

        jLabel25.setBackground(new java.awt.Color(51, 51, 51));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Quiroga Máximo");
        pnlIngresoMaterias.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 190, -1));

        jLabel26.setBackground(new java.awt.Color(51, 51, 51));
        jLabel26.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Chirino Sosa Marcos Antonio");
        pnlIngresoMaterias.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, -1));

        jLabel27.setBackground(new java.awt.Color(51, 51, 51));
        jLabel27.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 102, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("TP Transversal");
        pnlIngresoMaterias.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, -1));

        jLabel28.setBackground(new java.awt.Color(102, 102, 102));
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlIngresoMaterias.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 190, 190));

        pnlGeneral.add(pnlIngresoMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 10));

        pnlIngresoInsc.setBackground(new java.awt.Color(51, 51, 51));
        pnlIngresoInsc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        pnlIngresoInsc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAccesInsc.setBackground(new java.awt.Color(102, 102, 102));
        btnAccesInsc.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAccesInsc.setForeground(new java.awt.Color(255, 255, 255));
        btnAccesInsc.setText("Ingresar");
        btnAccesInsc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccesInsc.setEnabled(false);
        btnAccesInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccesInscActionPerformed(evt);
            }
        });
        pnlIngresoInsc.add(btnAccesInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 110, -1));

        btnBackInsc.setBackground(new java.awt.Color(102, 102, 102));
        btnBackInsc.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnBackInsc.setForeground(new java.awt.Color(255, 255, 255));
        btnBackInsc.setText("Atras");
        btnBackInsc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackInscActionPerformed(evt);
            }
        });
        pnlIngresoInsc.add(btnBackInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 110, -1));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sistema de Gestión");
        pnlIngresoInsc.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(255, 102, 0));
        pnlIngresoInsc.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 250, 10));

        jLabel17.setBackground(new java.awt.Color(102, 102, 102));
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlIngresoInsc.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 190, 190));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel30.setBackground(new java.awt.Color(102, 102, 102));
        jLabel30.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Ingreso");

        jLabel18.setBackground(new java.awt.Color(102, 102, 102));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 0));
        jLabel18.setText("Inscripciones");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIngresoInsc.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 190, 80));

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setRows(5);
        jTextArea5.setText("Funcionalidad del sistema:\n\n- Inscribir alumnos a las materias.\n- Calificar Alumnos\n- Listar materias en las q el alumno\nestá inscripto.\n- Alta, baja y borrado de inscripciones.\n\nPara acceder ingrese su Usuario y \ncontraseña.");
        jTextArea5.setBorder(null);
        jScrollPane5.setViewportView(jTextArea5);

        pnlIngresoInsc.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 310, 190));

        jPanel7.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pnlIngresoInsc.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 10, 450));

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea6.setRows(5);
        jTextArea6.setText("Usuario Alumno: alumno\nContraseña Alumno: alumno\n\nUsuario Docente: docente\nContraseña Docente: docente");
        jTextArea6.setAutoscrolls(false);
        jScrollPane6.setViewportView(jTextArea6);

        pnlIngresoInsc.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, 100));

        jLabel31.setBackground(new java.awt.Color(51, 51, 51));
        jLabel31.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("S G U");
        jLabel31.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlIngresoInsc.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 190, 250));

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("GRUPO 11 - V0.1");
        pnlIngresoInsc.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 170, -1));

        jLabel33.setBackground(new java.awt.Color(51, 51, 51));
        jLabel33.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Pestchanker Mauricio Andrés");
        pnlIngresoInsc.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 190, -1));

        jLabel34.setBackground(new java.awt.Color(51, 51, 51));
        jLabel34.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Quiroga Máximo");
        pnlIngresoInsc.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 190, -1));

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Chirino Sosa Marcos Antonio");
        pnlIngresoInsc.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, -1));

        jLabel36.setBackground(new java.awt.Color(51, 51, 51));
        jLabel36.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 102, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("TP Transversal");
        pnlIngresoInsc.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 170, -1));

        pnlGeneral.add(pnlIngresoInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 10));

        pnlMsgInicio.setBackground(new java.awt.Color(0, 0, 0));
        pnlMsgInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 3, true));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Para acceder presione Aceptar");

        javax.swing.GroupLayout pnlMsgInicioLayout = new javax.swing.GroupLayout(pnlMsgInicio);
        pnlMsgInicio.setLayout(pnlMsgInicioLayout);
        pnlMsgInicioLayout.setHorizontalGroup(
            pnlMsgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        pnlMsgInicioLayout.setVerticalGroup(
            pnlMsgInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMsgInicioLayout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pnlGeneral.add(pnlMsgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 490, 70));

        backgroundPnl.add(pnlGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 550, 520));

        desktop.setLayer(backgroundPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
            .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(desktopLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSistemaAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseEntered
        btnSistemaAlumnos.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSistemaAlumnosMouseEntered

    private void btnSistemaAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseExited
        btnSistemaAlumnos.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btnSistemaAlumnosMouseExited

    private void btnSistemaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseClicked
        lblSysAlu.setForeground(new Color(255, 255, 255));
        lblAlu.setForeground(new Color(255, 102, 0));
        btnSistemaAlumnos.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 3));
        btnSistemaInscripciones.setVisible(false);
        btnSistemaMaterias.setVisible(false);
        pnlIngresoAlumnos.setVisible(true);


    }//GEN-LAST:event_btnSistemaAlumnosMouseClicked

    private void btnSistemaAlumnosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseReleased
        pnlIngresoAlumnos.setSize(550, 520);

    }//GEN-LAST:event_btnSistemaAlumnosMouseReleased

    private void btnBackAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackAlumnosActionPerformed
        btnSistemaInscripciones.setVisible(true);
        btnSistemaMaterias.setVisible(true);
        lblSysAlu.setForeground(new Color(255, 102, 0));
        lblAlu.setForeground(new Color(255, 255, 255));
        btnSistemaAlumnos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        pnlIngresoAlumnos.setVisible(false);

    }//GEN-LAST:event_btnBackAlumnosActionPerformed

    private void btnSistemaMateriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMateriasMouseEntered
        btnSistemaMaterias.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSistemaMateriasMouseEntered

    private void btnSistemaMateriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMateriasMouseExited
        btnSistemaMaterias.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btnSistemaMateriasMouseExited

    private void closePnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseExited
        closePnl.setBackground(new Color(255, 155, 0));
    }//GEN-LAST:event_closePnlMouseExited

    private void closePnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseEntered
        closePnl.setBackground(Color.red);
    }//GEN-LAST:event_closePnlMouseEntered

    private void closePnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseClicked
        closePnl.setBackground(Color.YELLOW);
        System.exit(0);
    }//GEN-LAST:event_closePnlMouseClicked

    private void btnBackMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMateriasActionPerformed
        btnSistemaAlumnos.setVisible(true);
        btnSistemaInscripciones.setVisible(true);
        lblSysMat.setForeground(new Color(255, 102, 0));
        lblMat.setForeground(new Color(255, 255, 255));
        btnSistemaMaterias.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        pnlIngresoMaterias.setVisible(false);
    }//GEN-LAST:event_btnBackMateriasActionPerformed

    private void btnSistemaMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMateriasMouseClicked
        lblSysMat.setForeground(new Color(255, 255, 255));
        lblMat.setForeground(new Color(255, 102, 0));
        btnSistemaMaterias.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 3));
        btnSistemaInscripciones.setVisible(false);
        btnSistemaAlumnos.setVisible(false);
        pnlIngresoMaterias.setVisible(true);
    }//GEN-LAST:event_btnSistemaMateriasMouseClicked

    private void btnSistemaMateriasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaMateriasMouseReleased
        pnlIngresoMaterias.setSize(550, 520);
    }//GEN-LAST:event_btnSistemaMateriasMouseReleased

    private void pnlSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlSuperiorMousePressed

    private void pnlSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_pnlSuperiorMouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
//        xMouse = evt.getX();
//        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
//        x = evt.getXOnScreen(); 
//        y = evt.getYOnScreen();
//        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void btnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesoActionPerformed
        if (btnAcceso.getText().equalsIgnoreCase("Aceptar")) {
            pnlMsgInicio.setVisible(false);
            btnSistemaAlumnos.setVisible(true);
            btnSistemaMaterias.setVisible(true);
            btnSistemaInscripciones.setVisible(true);
            lblDoubleclick.setText("DOBLE CLIC PARA ACCEDER");
            pnlAccess.setBackground(new Color(51, 153, 0));
            pnlAccesMsg1.setText("");
            pnlAccesMsg2.setForeground(Color.BLACK);
            pnlAccesMsg2.setText("Acceso concedido");
            btnAcceso.setText("Log Out");
            btnAccessMaterias.setEnabled(true);
            btnAccesAlumnos.setEnabled(true);
            btnAccesInsc.setEnabled(true);
        } else {
            pnlMsgInicio.setVisible(true);
            btnSistemaAlumnos.setVisible(false);
            btnSistemaMaterias.setVisible(false);
            btnSistemaInscripciones.setVisible(false);
            lblDoubleclick.setText("DOBLE CLIC PARA ACCEDER");
            pnlAccess.setBackground(Color.BLACK);
            pnlAccesMsg1.setText("Para Acceder");
            pnlAccesMsg2.setForeground(new Color(255, 255, 255));
            pnlAccesMsg2.setText("Ingrese usuario y contraseña");
            btnAcceso.setText("Aceptar");
            lblSysInsc.setForeground(new Color(255, 102, 0));
            lblInsc.setForeground(new Color(255, 255, 255));
            btnSistemaInscripciones.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
            lblSysAlu.setForeground(new Color(255, 102, 0));
            lblAlu.setForeground(new Color(255, 255, 255));
            btnSistemaAlumnos.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
            lblSysMat.setForeground(new Color(255, 102, 0));
            lblMat.setForeground(new Color(255, 255, 255));
            btnSistemaMaterias.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
            pnlIngresoAlumnos.setVisible(false);
            pnlIngresoInsc.setVisible(false);
            pnlIngresoInsc.setVisible(false);

        }


    }//GEN-LAST:event_btnAccesoActionPerformed

    private void btnSistemaInscripcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaInscripcionesMouseEntered
        btnSistemaInscripciones.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSistemaInscripcionesMouseEntered

    private void btnSistemaInscripcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaInscripcionesMouseExited
        btnSistemaInscripciones.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btnSistemaInscripcionesMouseExited

    private void btnBackInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackInscActionPerformed
        btnSistemaMaterias.setVisible(true);
        btnSistemaAlumnos.setVisible(true);
        lblSysInsc.setForeground(new Color(255, 102, 0));
        lblInsc.setForeground(new Color(255, 255, 255));
        btnSistemaInscripciones.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        pnlIngresoInsc.setVisible(false);
    }//GEN-LAST:event_btnBackInscActionPerformed

    private void btnSistemaInscripcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaInscripcionesMouseClicked
        lblSysInsc.setForeground(new Color(255, 255, 255));
        lblInsc.setForeground(new Color(255, 102, 0));
        btnSistemaInscripciones.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 0), 3));
        btnSistemaMaterias.setVisible(false);
        btnSistemaAlumnos.setVisible(false);
        pnlIngresoInsc.setVisible(true);
    }//GEN-LAST:event_btnSistemaInscripcionesMouseClicked

    private void btnSistemaInscripcionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaInscripcionesMouseReleased
        pnlIngresoInsc.setSize(550, 520);
    }//GEN-LAST:event_btnSistemaInscripcionesMouseReleased

    private void btnAccessMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessMateriasActionPerformed
        backgroundPnl.setVisible(false);
        desktop.repaint();
        VistaMaterias nw = new VistaMaterias(this);
        nw.setVisible(true);
        desktop.moveToFront(nw);

    }//GEN-LAST:event_btnAccessMateriasActionPerformed

    private void btnAccesAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesAlumnosActionPerformed
        backgroundPnl.setVisible(false);
        desktop.repaint();
        VistaAlumnos nw = new VistaAlumnos(this);
        nw.setVisible(true);
        desktop.moveToFront(nw);
    }//GEN-LAST:event_btnAccesAlumnosActionPerformed

    private void btnAccesInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccesInscActionPerformed
        backgroundPnl.setVisible(false);
        desktop.repaint();
        VistaInscripciones nw = new VistaInscripciones(this);
        nw.setVisible(true);
        desktop.moveToFront(nw);
    }//GEN-LAST:event_btnAccesInscActionPerformed
    public void mostrarInicio() {
        desktop.repaint();
        VentanaDeInicio nw = new VentanaDeInicio();
        nw.setVisible(true);
        desktop.moveToFront(nw);

    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDeInicio().setVisible(true);
            }
        });
    }

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JButton btnAccesAlumnos;
    private javax.swing.JButton btnAccesInsc;
    private javax.swing.JButton btnAcceso;
    private javax.swing.JButton btnAccessMaterias;
    private javax.swing.JButton btnBackAlumnos;
    private javax.swing.JButton btnBackInsc;
    private javax.swing.JButton btnBackMaterias;
    private javax.swing.JPanel btnSistemaAlumnos;
    private javax.swing.JPanel btnSistemaInscripciones;
    private javax.swing.JPanel btnSistemaMaterias;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel closePnl;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel ingressPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JLabel lblAlu;
    private javax.swing.JLabel lblDoubleclick;
    private javax.swing.JLabel lblInageSistema;
    private javax.swing.JLabel lblInsc;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblSysAlu;
    private javax.swing.JLabel lblSysInsc;
    private javax.swing.JLabel lblSysMat;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JLabel pnlAccesMsg1;
    private javax.swing.JLabel pnlAccesMsg2;
    private javax.swing.JPanel pnlAccess;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlIngresoAlumnos;
    private javax.swing.JPanel pnlIngresoInsc;
    private javax.swing.JPanel pnlIngresoMaterias;
    private javax.swing.JPanel pnlMsgInicio;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables

}
