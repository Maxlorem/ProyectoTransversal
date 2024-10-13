package vistas;

import entidades.Alumno;
import entidades.Materias;
import entidades.Conexion;
import entidades.Herramientas;
import entidades.Inscripcion;
import java.sql.Connection;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
        infoBox.setText("Para comenzar seleccione y elija un alumno, puede utilizar los filtros para Alumno en la esquina inferior izquierda. Si selecciona por Apellido el campo de texto se habilita para filtrar letra a letra.");
        cargarComboAlumnosReg();
        cargarComboMateriasActivas();
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 10, 1);
        spinCalificador.setModel(model);

        tabGeneral.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int fila = tabGeneral.getSelectedRow();
                    if (fila != -1 && chckBorrar.isSelected()) {
                        txtIdMateria.setText((tabGeneral.getValueAt(fila, 0)).toString());
                    }
                    if (fila != -1 && infoBox.getText().equalsIgnoreCase("Seleccione una materia de la tabla de materias en las que el alumno esta inscripto y desea calificar.")) {
                        txtIdMateria.setText((tabGeneral.getValueAt(fila, 0)).toString());
                        spinCalificador.setEnabled(true);
                        infoBox.setText("Ya puede calificar la materia seleccionada, seleccione la calificación desde el Spinner 'Nota' y a continuación presione Aceptar."); 
                       
                    }
                    
                }
            }
        });
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
        jPanel6 = new javax.swing.JPanel();
        radioMostrarTodo = new javax.swing.JRadioButton();
        radioMostrarInscriptas = new javax.swing.JRadioButton();
        radioMostrarNoInscriptas = new javax.swing.JRadioButton();
        btnMostrar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnListas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnInscripciones = new javax.swing.JButton();
        btnSelectMat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        chckBorrar = new javax.swing.JCheckBox();
        btnEraseInsc = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnCalif = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnInsc = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnElegirAlu = new javax.swing.JButton();
        btnElegirMat = new javax.swing.JButton();
        chckLibres = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        spinCalificador = new javax.swing.JSpinner();
        btnAceptarCalificacion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoBox = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        txtAlumnoData = new javax.swing.JTextField();
        txtMateriaData = new javax.swing.JTextField();

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

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioMostrarTodo.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(radioMostrarTodo);
        radioMostrarTodo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radioMostrarTodo.setForeground(new java.awt.Color(0, 0, 0));
        radioMostrarTodo.setText("Mostrar todo");
        radioMostrarTodo.setEnabled(false);
        radioMostrarTodo.setFocusable(false);
        radioMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarTodoActionPerformed(evt);
            }
        });
        jPanel6.add(radioMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, -1));

        radioMostrarInscriptas.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(radioMostrarInscriptas);
        radioMostrarInscriptas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radioMostrarInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        radioMostrarInscriptas.setText("Mostrar Inscriptas");
        radioMostrarInscriptas.setEnabled(false);
        radioMostrarInscriptas.setFocusable(false);
        radioMostrarInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarInscriptasActionPerformed(evt);
            }
        });
        jPanel6.add(radioMostrarInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        radioMostrarNoInscriptas.setBackground(new java.awt.Color(255, 204, 153));
        bgMat.add(radioMostrarNoInscriptas);
        radioMostrarNoInscriptas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        radioMostrarNoInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        radioMostrarNoInscriptas.setText("Mostrar No Inscriptas");
        radioMostrarNoInscriptas.setEnabled(false);
        radioMostrarNoInscriptas.setFocusable(false);
        radioMostrarNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMostrarNoInscriptasActionPerformed(evt);
            }
        });
        jPanel6.add(radioMostrarNoInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        btnMostrar.setText("Mostrar");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel6.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 144, 30));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 10));
        jPanel6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 10));

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listas");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        btnListas.setText("Habilitar Listas");
        btnListas.setEnabled(false);
        btnListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListasActionPerformed(evt);
            }
        });
        jPanel6.add(btnListas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 290));

        jButton2.setText("Reiniciar todo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 140, 70));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, 290));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 130, 10));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnInscripciones.setText("Inscripciones");
        btnInscripciones.setEnabled(false);
        btnInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscripcionesActionPerformed(evt);
            }
        });

        btnSelectMat.setText("Select Materia");
        btnSelectMat.setEnabled(false);
        btnSelectMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectMatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inscribir/Calificar");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(255, 153, 102));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Borrar Inscripción");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chckBorrar.setBackground(new java.awt.Color(255, 204, 153));
        chckBorrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        chckBorrar.setForeground(new java.awt.Color(0, 0, 0));
        chckBorrar.setText("Activar Borrar");
        chckBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chckBorrar.setEnabled(false);
        chckBorrar.setFocusable(false);
        chckBorrar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chckBorrarItemStateChanged(evt);
            }
        });

        btnEraseInsc.setText("Borrar Incripción");
        btnEraseInsc.setEnabled(false);
        btnEraseInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseInscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelectMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(chckBorrar)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEraseInsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnEraseInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 290));

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setBackground(new java.awt.Color(255, 204, 153));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Calificar");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCalif.setText("Calificar");
        btnCalif.setEnabled(false);
        btnCalif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalif, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, 90));

        jPanel10.setBackground(new java.awt.Color(255, 204, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnInsc.setText("Inscribir");
        btnInsc.setEnabled(false);
        btnInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(btnInsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInsc, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, 90));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 124, 570, 310));

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

        btnElegirAlu.setText("Elegir");
        btnElegirAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirAluActionPerformed(evt);
            }
        });
        jPanel2.add(btnElegirAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 70, -1));

        btnElegirMat.setText("Elegir");
        btnElegirMat.setEnabled(false);
        btnElegirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirMatActionPerformed(evt);
            }
        });
        jPanel2.add(btnElegirMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 70, -1));

        chckLibres.setBackground(new java.awt.Color(255, 204, 153));
        chckLibres.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        chckLibres.setForeground(new java.awt.Color(0, 0, 0));
        chckLibres.setText("Mostrar Libres");
        chckLibres.setFocusable(false);
        chckLibres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chckLibresStateChanged(evt);
            }
        });
        jPanel2.add(chckLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

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

        txtIdMateria.setEditable(false);
        txtIdMateria.setBackground(new java.awt.Color(255, 204, 102));
        txtIdMateria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtIdMateria.setForeground(new java.awt.Color(0, 0, 0));
        txtIdMateria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtIdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 50, 20));

        jPanel9.setBackground(new java.awt.Color(255, 204, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Calificar");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setBackground(new java.awt.Color(255, 204, 102));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nota:");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        spinCalificador.setEnabled(false);
        spinCalificador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinCalificadorStateChanged(evt);
            }
        });

        btnAceptarCalificacion.setText("Aceptar");
        btnAceptarCalificacion.setEnabled(false);
        btnAceptarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(spinCalificador, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarCalificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinCalificador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 80));

        jLabel6.setBackground(new java.awt.Color(255, 204, 153));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Alumno");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 44, 76, -1));

        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Materia");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 400, 210));

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
        jPanel3.add(txtAlumnoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 270, 20));

        txtMateriaData.setEditable(false);
        txtMateriaData.setBackground(new java.awt.Color(255, 204, 102));
        txtMateriaData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtMateriaData.setForeground(new java.awt.Color(0, 0, 0));
        txtMateriaData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtMateriaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 270, 20));

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

    private void btnElegirAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirAluActionPerformed
        if (jcbAlumnos.getSelectedItem().toString().isEmpty()) {
            infoBox.setText("Debe elegir un alumno váido");
        } else {
            String cadena = jcbAlumnos.getSelectedItem().toString();
            String[] partes = cadena.split("-");
            String idAlumnotxt = partes[0];
            String nombreApellido = partes[1];
            btnElegirAlu.setEnabled(false);
            jcbAlumnos.setEnabled(false);
            jcbAlumnos.setSelectedIndex(0);
            btnInscripciones.setEnabled(true);
            btnListas.setEnabled(true);
            btnSelectMat.setEnabled(true);
            txtAlumnoData.setText(nombreApellido);
            txtIdAlumno.setText(idAlumnotxt);
            infoBox.setText("Usted ha elejido a " + nombreApellido + " puede elegir INSCRIPCIONES calificar o borrar materias en las "
                    + "que el alumno está inscripto o puede elegir SELECT MATERIA para una nueva inscripción. Puede HABILITAR LISTAS para listar las "
                    + "materiase en las que el alumno esta inscripto, en las que no esta inscripto o listar todas las materias.");
            chckLibres.setEnabled(false);
        }
    }//GEN-LAST:event_btnElegirAluActionPerformed

    private void btnInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscripcionesActionPerformed
        btnSelectMat.setEnabled(false);
        btnInscripciones.setEnabled(false);
        btnListas.setEnabled(false);
        crearCabeceraInscriptasAlumnos();
        modelo.setRowCount(0);
        llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
        infoBox.setText("El alumno seleccionado está inscripto en las materias que se muestran en la tabla, puede: Calificar o borrar la inscripción. Para borrar la"
                + "inscripción, primero debe Activar Borrar");
        if (tabGeneral.getRowCount() != 0) {
            btnCalif.setEnabled(true);
            chckBorrar.setEnabled(true);
        } else {
            chckBorrar.setEnabled(false);
            btnCalif.setEnabled(false);
            btnSelectMat.setEnabled(true);
            infoBox.setText("El alumno no se encuentra inscripto en ninguna materia. Seleccione Select Materia para una nueva inscripcion o Reiniciar todo para comenzar de nuevo.");
        }
    }//GEN-LAST:event_btnInscripcionesActionPerformed

    private void btnElegirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirMatActionPerformed
        if (jcbMateria.getSelectedItem().toString().isEmpty()) {
            infoBox.setText("Debe elegir una Materia válida");
        } else {
            String cadena = jcbMateria.getSelectedItem().toString();
            String[] partes = cadena.split("-");
            String idMattxt = partes[0];
            String nombreMat = partes[1];
            btnElegirMat.setEnabled(false);
            jcbMateria.setEnabled(false);
            jcbMateria.setSelectedIndex(0);
            txtMateriaData.setText(nombreMat);
            txtIdMateria.setText(idMattxt);
            btnInsc.setEnabled(true);
            infoBox.setText("Usted ha elejido a " + nombreMat + "para inscribir al alumno " + txtAlumnoData.getText() + " presione inscribir.");
        }
    }//GEN-LAST:event_btnElegirMatActionPerformed

    private void chckBorrarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chckBorrarItemStateChanged
        if (chckBorrar.isSelected()) {
            btnEraseInsc.setEnabled(true);
            tabGeneral.setEnabled(true);
            chckBorrar.setEnabled(false);
            btnCalif.setEnabled(false);
            infoBox.setText("Seleccione de la tabla la materia a desinscribir para el alumno " + txtAlumnoData.getText());
        }
    }//GEN-LAST:event_chckBorrarItemStateChanged

    private void btnEraseInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseInscActionPerformed
        if (!txtIdMateria.getText().isEmpty()) {
            btnEraseInsc.setEnabled(false);
            inscripcionData.borrarInscripcionMateriaAlumno(Integer.parseInt(txtIdAlumno.getText()), Integer.parseInt(txtIdMateria.getText()));
            modelo.setRowCount(0);
            llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
            infoBox.setText("Inscripcion borrada con éxito presione Reiniciar Todo para continuar.");
        } else {
            infoBox.setText("Debe seleccionar una materia desde la tabla.");
        }
    }//GEN-LAST:event_btnEraseInscActionPerformed

    private void btnSelectMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectMatActionPerformed
        btnListas.setEnabled(false);
        jcbMateria.setEnabled(true);
        jcbMateria.removeAllItems();
        cargarComboMateriasActivas();
        btnSelectMat.setEnabled(false);
        btnElegirMat.setEnabled(true);
        btnInscripciones.setEnabled(false);
        crearCabeceraInscriptasAlumnos();
        modelo.setRowCount(0);
        llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
    }//GEN-LAST:event_btnSelectMatActionPerformed

    private void btnInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscActionPerformed
        Inscripcion inscribir = new Inscripcion();
        Alumno alumno = alumnoData.buscarAlumnoPorId(Integer.parseInt(txtIdAlumno.getText()));
        System.out.println("Alumno boyon: " + alumno.toString());
        Materias materia = materiaData.buscarMateriaPorId(Integer.parseInt(txtIdMateria.getText()));
        System.out.println("Materia boyon: " + materia.toString());
        inscribir.setAlumno(alumno);
        System.out.println("Alumno boyon Despues del set: " + alumno.toString());
        inscribir.setMateria(materia);
        System.out.println("Materia boyon despues del set: " + materia.toString());
        inscripcionData.guardarInscripcion(inscribir);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        crearCabeceraInscriptasAlumnos();
        llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
        btnInsc.setEnabled(false);
        infoBox.setText("Para volver a empezar seleccione un alumno.");
        jcbAlumnos.setEnabled(true);
        btnElegirAlu.setEnabled(true);

    }//GEN-LAST:event_btnInscActionPerformed

    private void btnCalifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalifActionPerformed
        infoBox.setText("Seleccione una materia de la tabla de materias en las que el alumno esta inscripto y desea calificar.");
        tabGeneral.setEnabled(true);
        btnCalif.setEnabled(false);
        
        
    }//GEN-LAST:event_btnCalifActionPerformed

    private void btnAceptarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCalificacionActionPerformed
        btnAceptarCalificacion.setEnabled(false); 
        inscripcionData.actualizarNota(Integer.parseInt(txtIdAlumno.getText()), Integer.parseInt(txtIdMateria.getText()), (int) spinCalificador.getValue());
        modelo.setColumnCount(0);
        crearCabeceraInscriptasAlumnos();
        modelo.setRowCount(0);
        llenarTablaInscriptasAlumno(Integer.parseInt(txtIdAlumno.getText()));
    }//GEN-LAST:event_btnAceptarCalificacionActionPerformed

    private void spinCalificadorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinCalificadorStateChanged
        if(!txtIdMateria.getText().isEmpty()) {
        btnAceptarCalificacion.setEnabled(true);
        }
    }//GEN-LAST:event_spinCalificadorStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnElegirAlu.setEnabled(true);
        jcbAlumnos.setEnabled(true);
        txtAlumnoData.setText("");
        txtIdAlumno.setText("");
        txtIdMateria.setText("");
        txtMateriaData.setText("");
        btnElegirMat.setEnabled(false);
        jcbMateria.setSelectedIndex(0);
        jcbMateria.setEnabled(false);
        btnListas.setEnabled(false);
        btnInscripciones.setEnabled(false);
        btnSelectMat.setEnabled(false);
        chckBorrar.setEnabled(false);
        chckBorrar.setSelected(false);
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        tabGeneral.setEnabled(false);
        chckLibres.setEnabled(true);
        chckLibres.setSelected(false);
        btnInsc.setEnabled(false);
        btnCalif.setEnabled(false);
        btnEraseInsc.setEnabled(false);
        btnAceptarCalificacion.setEnabled(false);
        spinCalificador.setValue(1);
        spinCalificador.setEnabled(false);
        jcbAlumnos.setSelectedIndex(0);
        jcbMateria.setSelectedIndex(0);
        infoBox.setText("Para comenzar seleccione y elija un alumno, puede utilizar los filtros para Alumno en la esquina inferior izquierda. Si selecciona por Apellido el campo de texto se habilita para filtrar letra a letra.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListasActionPerformed
        radioMostrarInscriptas.setEnabled(true);
        radioMostrarNoInscriptas.setEnabled(true);
        radioMostrarTodo.setEnabled(true);
        btnInscripciones.setEnabled(false);
        btnSelectMat.setEnabled(false);
        infoBox.setText("Mostrar Todo mostrará todas las materias (Vigentes o No) y si el alumno se encuentra o no inscripto en dicha materia, "
                + "Mostrar Inscriptas solo mostrará las materias en las que el alumno seleccionado se encuentra inscripto, y, finalmente"
                + "No Inscriptas mostrará todas las materias (Vigentes o No) en las que el alumno no está inscripto.");
    }//GEN-LAST:event_btnListasActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        tabGeneral.setEnabled(true);
        crearCabeceraListadoMaterias();
        modelo.setRowCount(0);
        String inscripto = "Si";
        String noInsc = "No";
        infoBox.setText("En la tabla se muestra la información requerida, presione Reiniciar Todo para volver a comenzar");

        if (radioMostrarTodo.isSelected()) {
            List<Materias> matInscriptas = inscripcionData.obtenerMateriasCursadasPorAlumno(Integer.parseInt(txtIdAlumno.getText()));
            for (Materias materiaInsc : matInscriptas) {
                modelo.addRow(new Object[]{
                    materiaInsc.getNombre(),
                    materiaInsc.getAnioMateria(),
                    materiaInsc.isEstado() ? "Vigente" : "No Vigente",
                    inscripto
                });
            }
            List<Materias> matNoInscriptas = inscripcionData.obtenerMateriasNOCursadasPorAlumno(Integer.parseInt(txtIdAlumno.getText()));
            for (Materias matNoInsc : matNoInscriptas) {
                modelo.addRow(new Object[]{
                    matNoInsc.getNombre(),
                    matNoInsc.getAnioMateria(),
                    matNoInsc.isEstado() ? "Vigente" : "No Vigente",
                    noInsc
                });
            }
        }
        if (radioMostrarInscriptas.isSelected()) {
            List<Materias> matInscriptas = inscripcionData.obtenerMateriasCursadasPorAlumno(Integer.parseInt(txtIdAlumno.getText()));
            for (Materias materiaInsc : matInscriptas) {
                modelo.addRow(new Object[]{
                    materiaInsc.getNombre(),
                    materiaInsc.getAnioMateria(),
                    materiaInsc.isEstado() ? "Vigente" : "No Vigente",
                    inscripto
                });
            }
        }
        if (radioMostrarNoInscriptas.isSelected()) {
            List<Materias> matNoInscriptas = inscripcionData.obtenerMateriasNOCursadasPorAlumno(Integer.parseInt(txtIdAlumno.getText()));
            for (Materias matNoInsc : matNoInscriptas) {
                modelo.addRow(new Object[]{
                    matNoInsc.getNombre(),
                    matNoInsc.getAnioMateria(),
                    matNoInsc.isEstado() ? "Vigente" : "No Vigente",
                    noInsc
                });
            }
        }

        bgMat.clearSelection();
        btnMostrar.setEnabled(false);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void radioMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMostrarTodoActionPerformed
         listarToggles();
         infoBox.setText("Ha seleccionado Mostrar todo, para proceder presione MOSTRAR");
    }//GEN-LAST:event_radioMostrarTodoActionPerformed

    private void radioMostrarInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMostrarInscriptasActionPerformed
         listarToggles();
         infoBox.setText("Ha seleccionado Mostrar Inscriptas, para proceder presione MOSTRAR");
    }//GEN-LAST:event_radioMostrarInscriptasActionPerformed

    private void radioMostrarNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMostrarNoInscriptasActionPerformed
         listarToggles();
         infoBox.setText("Ha seleccionado Mostrar No Inscriptas, para proceder presione MOSTRAR");
    }//GEN-LAST:event_radioMostrarNoInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMat;
    private javax.swing.JButton btnAceptarCalificacion;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalif;
    private javax.swing.JButton btnElegirAlu;
    private javax.swing.JButton btnElegirMat;
    private javax.swing.JButton btnEraseInsc;
    private javax.swing.JButton btnInsc;
    private javax.swing.JButton btnInscripciones;
    private javax.swing.JButton btnListas;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSelectMat;
    private javax.swing.JCheckBox chckBorrar;
    private javax.swing.JCheckBox chckLibres;
    private javax.swing.JTextArea infoBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JComboBox<String> jcbMateria;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel pnlSistemasInsc;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JRadioButton radioMostrarInscriptas;
    private javax.swing.JRadioButton radioMostrarNoInscriptas;
    private javax.swing.JRadioButton radioMostrarTodo;
    private javax.swing.JSpinner spinCalificador;
    private javax.swing.JTable tabGeneral;
    private javax.swing.JTextField txtAlumnoData;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtMateriaData;
    // End of variables declaration//GEN-END:variables

    private void cargarComboAlumnosReg() {
        jcbAlumnos.addItem("");
        List<Alumno> listadoAlumnos = alumnoData.listarAlumnosRegulares();
        for (Alumno alumno : listadoAlumnos) {
            jcbAlumnos.addItem(alumno.getIdAlumno() + "-" + alumno.getApellido() + " " + alumno.getNombre());
        }
    }

    private void cargarComboAlumnos() {
        jcbAlumnos.addItem("");
        List<Alumno> listadoAlumnos = alumnoData.listarAlumnos();
        for (Alumno alumno : listadoAlumnos) {
            jcbAlumnos.addItem(alumno.getIdAlumno() + "-" + alumno.getApellido() + " " + alumno.getNombre());
        }

    }

    private void cargarComboMateriasActivas() {
        jcbMateria.addItem("");
        List<Materias> listadoMaterias = materiaData.listarMateriasPorNameActivas();
        for (Materias materias : listadoMaterias) {
            jcbMateria.addItem(materias.getIdMateria() + "-" + materias.getNombre());
        }
    }

    private void crearCabeceraInscriptasAlumnos() {
        modelo.addColumn("idMateria");
        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        modelo.addColumn("Calificacion");

        tabGeneral.setModel(modelo);
    }

    private void crearCabeceraListadoMaterias() {
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Año de Cursada");
        modelo.addColumn("Materia activa");
        modelo.addColumn("Inscripto");
        
        tabGeneral.setModel(modelo);
    }

    private void llenarTablaInscriptasAlumno(int idAlumno) {
        List<Inscripcion> listadoMaterias = inscripcionData.AlumnoInfo(idAlumno);
        listadoMaterias = Herramientas.cambiarNotaDeNullACero(listadoMaterias);

        for (Inscripcion materiasCursadas : listadoMaterias) {
            modelo.addRow(new Object[]{
                materiasCursadas.getMateria().getIdMateria(),
                materiasCursadas.getMateria().getNombre(),
                materiasCursadas.getMateria().getAnioMateria(),
                materiasCursadas.getNota()

            });

        }

    }

    private void listarToggles() {
        radioMostrarInscriptas.setEnabled(false);
        radioMostrarNoInscriptas.setEnabled(false);
        radioMostrarTodo.setEnabled(false);
        btnListas.setEnabled(false);
        btnMostrar.setEnabled(true);
    }
}
