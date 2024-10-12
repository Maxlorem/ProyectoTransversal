package vistas;

import entidades.Alumno;
import entidades.Materias;
import entidades.Conexion;
import entidades.Herramientas;
import entidades.Inscripcion;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.MateriaData;
import persistencia.InscripcionData;

public class VistaInscripciones extends javax.swing.JFrame {

    private VentanaDeInicio ventanaDeInicio;
    AlumnoData alumnoData;
    MateriaData materiaData;
    InscripcionData inscripcionData;
    int xMouse, yMouse;
    int x, y;
    private final DefaultTableModel modelo = new NonEditableTableModel();

    public VistaInscripciones(VentanaDeInicio ventanaDeInicio) {
        initComponents();
        this.ventanaDeInicio = ventanaDeInicio;
        Connection con = Conexion.getConexion();
        alumnoData = new AlumnoData(con);
        materiaData = new MateriaData(con);
        inscripcionData = new InscripcionData(con, alumnoData, materiaData);
        this.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, "Para comenzar seleccione y elija un alumno, puede utilizar los filtros para Alumno en la esquina inferior izquierda. Si selecciona por DNI el campo de texto se habilita para filtrar letra a letra.", "Sistema Alumnos", HEIGHT);
        cargarComboAlumnosReg();
        cargarComboMateriasActivas();
    }

    private class NonEditableTableModel extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMat = new javax.swing.ButtonGroup();
        panelMaterias = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabGeneral = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlSistemasInsc = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jcbMateria = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chckLibres = new javax.swing.JCheckBox();
        chckFiltroApellidos = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        lblInstruc1 = new javax.swing.JLabel();
        lblInstruc2 = new javax.swing.JLabel();
        lblMsgHab = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jbInscripciones = new javax.swing.JButton();
        jbSelectMat = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEraseInsc = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jCheckBox5 = new javax.swing.JCheckBox();
        txtMateriaFilter = new javax.swing.JTextField();
        txtAlumnoFilter = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jbElegirAlu = new javax.swing.JButton();
        jbElegirMat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        txtMateriaData = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnCalif = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        btnInsc = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnSrcCalif = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        txtAlumnoData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMaterias.setBackground(new java.awt.Color(51, 51, 51));
        panelMaterias.setMaximumSize(new java.awt.Dimension(1000, 621));
        panelMaterias.setMinimumSize(new java.awt.Dimension(1000, 621));
        panelMaterias.setName(""); // NOI18N
        panelMaterias.setPreferredSize(new java.awt.Dimension(1000, 621));
        panelMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Gestión de Inscripciones");
        jLabel1.setToolTipText("");
        pnlSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 30));

        panelMaterias.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        tabGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabGeneral.setEnabled(false);
        tabGeneral.setFocusable(false);
        jScrollPane1.setViewportView(tabGeneral);

        panelMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 120));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Panel Inscripciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        panelMaterias.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1000, 40));

        pnlSistemasInsc.setBackground(new java.awt.Color(255, 204, 153));
        pnlSistemasInsc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Motor de Búsqueda");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 555, -1));

        jPanel2.add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 240, -1));

        jcbMateria.setEnabled(false);
        jPanel2.add(jcbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 240, -1));

        jPanel5.setBackground(new java.awt.Color(255, 153, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Filtros de Búsqueda");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, -1));

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Filtros");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 170, -1));

        chckLibres.setBackground(new java.awt.Color(255, 204, 153));
        chckLibres.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        chckLibres.setForeground(new java.awt.Color(0, 0, 0));
        chckLibres.setText("Mostrar Libres");
        chckLibres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chckLibresStateChanged(evt);
            }
        });
        jPanel6.add(chckLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 58, -1, -1));

        chckFiltroApellidos.setBackground(new java.awt.Color(255, 204, 153));
        chckFiltroApellidos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        chckFiltroApellidos.setForeground(new java.awt.Color(0, 0, 0));
        chckFiltroApellidos.setText("por Apellidos");
        chckFiltroApellidos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chckFiltroApellidosStateChanged(evt);
            }
        });
        jPanel6.add(chckFiltroApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 84, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Alumnos");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 36, 170, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Materias");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 110, 170, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("por Nombre");
        jCheckBox3.setEnabled(false);
        jPanel6.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 132, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("por Año");
        jCheckBox4.setEnabled(false);
        jPanel6.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 158, 85, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 200));

        jPanel7.setBackground(new java.awt.Color(255, 204, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Materias");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 150, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Mostrar todo");
        jRadioButton1.setEnabled(false);
        jPanel7.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 32, 150, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("Mostrar Inscriptas");
        jRadioButton2.setEnabled(false);
        jPanel7.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 59, 150, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Mostrar No Inscriptas");
        jRadioButton3.setEnabled(false);
        jPanel7.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 86, 160, -1));

        lblInstruc1.setBackground(new java.awt.Color(255, 204, 153));
        lblInstruc1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblInstruc1.setForeground(new java.awt.Color(0, 0, 0));
        lblInstruc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruc1.setText("Para habilitar Seleccione");
        jPanel7.add(lblInstruc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 135, 160, -1));

        lblInstruc2.setBackground(new java.awt.Color(255, 204, 153));
        lblInstruc2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblInstruc2.setForeground(new java.awt.Color(0, 0, 0));
        lblInstruc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruc2.setText("un Alumno (Lock)");
        jPanel7.add(lblInstruc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 157, 160, -1));

        lblMsgHab.setBackground(new java.awt.Color(255, 204, 153));
        lblMsgHab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblMsgHab.setForeground(new java.awt.Color(204, 51, 0));
        lblMsgHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsgHab.setText("DESHABILITADO");
        jPanel7.add(lblMsgHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 113, 160, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 180, 200));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Listas");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 129, -1));

        jButton2.setText("Reiniciar todo");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 129, 30));

        jbInscripciones.setText("Inscripciones");
        jbInscripciones.setEnabled(false);
        jbInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscripcionesActionPerformed(evt);
            }
        });
        jPanel5.add(jbInscripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 130, -1));

        jbSelectMat.setText("Select Materia");
        jbSelectMat.setEnabled(false);
        jPanel5.add(jbSelectMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 129, -1));

        jToggleButton1.setText("Habilitar Listas");
        jPanel5.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 129, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 390, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, 290));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 73, 130, 10));

        jButton5.setText("Enviar");
        jButton5.setEnabled(false);
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 130, 30));

        jLabel12.setBackground(new java.awt.Color(255, 153, 102));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Borrar Inscripción");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 130, -1));

        btnEraseInsc.setText("Borrar Incripción");
        btnEraseInsc.setEnabled(false);
        jPanel5.add(btnEraseInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 263, 130, 30));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 130, 10));

        jCheckBox5.setBackground(new java.awt.Color(255, 153, 102));
        jCheckBox5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText("Activar Borrar");
        jCheckBox5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 124, 570, 310));

        txtMateriaFilter.setBackground(new java.awt.Color(255, 255, 255));
        txtMateriaFilter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMateriaFilter.setForeground(new java.awt.Color(0, 0, 0));
        txtMateriaFilter.setEnabled(false);
        jPanel2.add(txtMateriaFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 130, -1));

        txtAlumnoFilter.setEditable(false);
        txtAlumnoFilter.setBackground(new java.awt.Color(255, 255, 255));
        txtAlumnoFilter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAlumnoFilter.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtAlumnoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 130, -1));

        jLabel18.setBackground(new java.awt.Color(255, 204, 153));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Alumno");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 76, -1));

        jLabel19.setBackground(new java.awt.Color(255, 204, 153));
        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Materia");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        jbElegirAlu.setText("Elegir");
        jbElegirAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbElegirAluActionPerformed(evt);
            }
        });
        jPanel2.add(jbElegirAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 70, -1));

        jbElegirMat.setText("Elegir");
        jbElegirMat.setEnabled(false);
        jbElegirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbElegirMatActionPerformed(evt);
            }
        });
        jPanel2.add(jbElegirMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 70, -1));

        pnlSistemasInsc.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 440));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sistema Inscripciones");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 404, -1));

        txtIdAlumno.setEditable(false);
        txtIdAlumno.setBackground(new java.awt.Color(255, 204, 102));
        txtIdAlumno.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtIdAlumno.setForeground(new java.awt.Color(0, 0, 0));
        txtIdAlumno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 50, 20));

        txtMateriaData.setEditable(false);
        txtMateriaData.setBackground(new java.awt.Color(255, 204, 102));
        txtMateriaData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMateriaData.setForeground(new java.awt.Color(0, 0, 0));
        txtMateriaData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtMateriaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 76, 340, 20));

        jPanel9.setBackground(new java.awt.Color(255, 204, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Calificar");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalif.setText("Calificar");
        btnCalif.setEnabled(false);

        jLabel17.setBackground(new java.awt.Color(255, 204, 102));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nota:");

        jSpinner1.setEnabled(false);

        jButton3.setText("Aceptar");
        jButton3.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnCalif, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, 70));

        jLabel6.setBackground(new java.awt.Color(255, 204, 153));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Alumno");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 44, 76, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Materia");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 78, 70, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 204, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInsc.setText("Inscribir");
        btnInsc.setEnabled(false);

        jLabel15.setBackground(new java.awt.Color(255, 204, 153));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Inscripción");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnInsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsc)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 70));

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setBackground(new java.awt.Color(255, 204, 153));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSrcCalif.setText("Buscar Inscripcion");
        btnSrcCalif.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSrcCalif, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSrcCalif)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 70));

        jButton4.setText("Finalizar");
        jButton4.setEnabled(false);
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, 20));

        infoBox.setEditable(false);
        infoBox.setBackground(new java.awt.Color(255, 255, 255));
        infoBox.setColumns(20);
        infoBox.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        infoBox.setForeground(new java.awt.Color(0, 0, 0));
        infoBox.setLineWrap(true);
        infoBox.setRows(5);
        infoBox.setText("INFORMACIÓN");
        infoBox.setWrapStyleWord(true);
        jScrollPane2.setViewportView(infoBox);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 400, 120));

        btnBack.setText("VOLVER");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 142, -1));

        txtAlumnoData.setEditable(false);
        txtAlumnoData.setBackground(new java.awt.Color(255, 204, 102));
        txtAlumnoData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtAlumnoData.setForeground(new java.awt.Color(0, 0, 0));
        txtAlumnoData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtAlumnoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 42, 270, 20));

        pnlSistemasInsc.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 420, 440));

        panelMaterias.add(pnlSistemasInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1000, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlSuperiorMouseDragged

    private void pnlSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlSuperiorMousePressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        ventanaDeInicio.mostrarInicio();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void chckLibresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chckLibresStateChanged
        if (chckLibres.isSelected()) {
            jcbAlumnos.removeAllItems();
            cargarComboAlumnos();
        }
        if (!chckLibres.isSelected()) {
            jcbAlumnos.removeAllItems();
            cargarComboAlumnosReg();
        }
    }//GEN-LAST:event_chckLibresStateChanged

    private void chckFiltroApellidosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chckFiltroApellidosStateChanged
        if(chckFiltroApellidos.isSelected()) {
            txtAlumnoFilter.setEditable(true);
            txtAlumnoFilter.requestFocus();
        }
        if(!chckFiltroApellidos.isSelected()) {
            txtAlumnoFilter.setEditable(false);
            
        }
    }//GEN-LAST:event_chckFiltroApellidosStateChanged

    private void jbElegirAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbElegirAluActionPerformed
        if(jcbAlumnos.getSelectedItem().toString().isEmpty()){
            infoBox.setText("Debe elegir un alumno váido");
        }else{
        String cadena = jcbAlumnos.getSelectedItem().toString();
        String[] partes = cadena.split("-");
        String idAlumnotxt = partes[0];
        String nombreApellido = partes [1];
        jbElegirAlu.setEnabled(false);
        jcbAlumnos.setEnabled(false);
        jcbAlumnos.setSelectedIndex(0);
        jbInscripciones.setEnabled(true);
        jbSelectMat.setEnabled(true);
        txtAlumnoData.setText(nombreApellido);
        txtIdAlumno.setText(idAlumnotxt);
        infoBox.setText("Usted ha elejido a "+nombreApellido+" puede elegir Inscripciones para listar las materias a las "
            + "que el alumno está inscripto o puede elegir Select Materia para una nueva inscripción.");
        }
    }//GEN-LAST:event_jbElegirAluActionPerformed

    private void jbInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscripcionesActionPerformed
        jbSelectMat.setEnabled(false);
        llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
        infoBox.setText("El alumno seleccionado está inscripto en las materias que se muestran en la tabla, puede: Calificar o borrar la inscripción. Para borrar la"
                + "inscripción, primero debe Activar Borrar");
        
    }//GEN-LAST:event_jbInscripcionesActionPerformed

    private void jbElegirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbElegirMatActionPerformed
        if(jcbMateria.getSelectedItem().toString().isEmpty()){
            infoBox.setText("Debe elegir una Materia válida");
        }else{
        String cadena = jcbMateria.getSelectedItem().toString();
        String[] partes = cadena.split("-");
        String idMattxt = partes[0];
        String nombreMat = partes [1];
        jbElegirMat.setEnabled(false);
        jcbMateria.setEnabled(false);
        jcbMateria.setSelectedIndex(0);
        txtAlumnoData.setText(nombreMat);
        txtIdAlumno.setText(idMattxt);
        infoBox.setText("Usted ha elejido a "+nombreMat+" puede elegir Inscripciones para listar las materias a las "
            + "que el alumno está inscripto o puede elegir Select Materia para una nueva inscripción.");
        }
    }//GEN-LAST:event_jbElegirMatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMat;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalif;
    private javax.swing.JButton btnEraseInsc;
    private javax.swing.JButton btnInsc;
    private javax.swing.JButton btnSrcCalif;
    private javax.swing.JCheckBox chckFiltroApellidos;
    private javax.swing.JCheckBox chckLibres;
    private javax.swing.JTextArea infoBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbElegirAlu;
    private javax.swing.JButton jbElegirMat;
    private javax.swing.JButton jbInscripciones;
    private javax.swing.JButton jbSelectMat;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JComboBox<String> jcbMateria;
    private javax.swing.JLabel lblInstruc1;
    private javax.swing.JLabel lblInstruc2;
    private javax.swing.JLabel lblMsgHab;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel pnlSistemasInsc;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabGeneral;
    private javax.swing.JTextField txtAlumnoData;
    private javax.swing.JTextField txtAlumnoFilter;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtMateriaData;
    private javax.swing.JTextField txtMateriaFilter;
    // End of variables declaration//GEN-END:variables

    private void cargarComboAlumnosReg() {
        jcbAlumnos.addItem("");
        List<Alumno> listadoAlumnos = alumnoData.listarAlumnosRegulares();
        for (Alumno alumno : listadoAlumnos) {
            jcbAlumnos.addItem(alumno.getIdAlumno()+"-"+alumno.getApellido() + " " + alumno.getNombre());
        }
    }    

    private void cargarComboAlumnos() {
        jcbAlumnos.addItem("");
        List<Alumno> listadoAlumnos = alumnoData.listarAlumnos();
        for (Alumno alumno : listadoAlumnos) {
            jcbAlumnos.addItem(alumno.getIdAlumno()+"-"+alumno.getApellido() + " " + alumno.getNombre());
        }

    }
    
    private void cargarComboMateriasActivas () {
        jcbMateria.addItem("");
        List<Materias> listadoMaterias = materiaData.listarMateriasPorNameActivas();
        for(Materias materias : listadoMaterias) {
            jcbMateria.addItem(materias.getIdMateria()+"-"+materias.getNombre());
        }
    }
    
    private void crearCabeceraInscriptasAlumnos() {
        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        modelo.addColumn("Calificacion");
        
        tabGeneral.setModel(modelo);
    }

    private void llenarTablaInscriptasAlumno(int idAlumno) {
        List<Inscripcion> listadoMaterias = inscripcionData.obtenerInscripcionesPorAlumnoInfo(idAlumno);
        listadoMaterias = Herramientas.cambiarNotaDeNullACero(listadoMaterias);
        for (Inscripcion materiasCursadas : listadoMaterias) {
            modelo.addRow(new Object[]{
            materiasCursadas.getMateria().getNombre(),
            materiasCursadas.getMateria().getAnioMateria(),
            materiasCursadas.getNota()
            
             });

        }

    }
}
