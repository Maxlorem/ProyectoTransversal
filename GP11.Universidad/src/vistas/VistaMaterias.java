package vistas;

import entidades.Conexion;
import entidades.Materias;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import persistencia.MateriaData;

public class VistaMaterias extends javax.swing.JFrame {

    private VentanaDeInicio ventanaDeInicio;
    MateriaData materiaData;
    int xMouse, yMouse;
    int x, y;
    private final DefaultTableModel modelo = new NonEditableTableModel();

    public VistaMaterias(VentanaDeInicio ventanaDeInicio) {
        initComponents();
        this.ventanaDeInicio = ventanaDeInicio;
        Connection con = Conexion.getConexion();
        materiaData = new MateriaData(con);
        this.setLocationRelativeTo(null);
        crearCabecera();

        tabMaterias.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int fila = tabMaterias.getSelectedRow();
                    if (fila != -1 && !btnNw.isEnabled()) {

                        Integer idMat = (Integer) tabMaterias.getValueAt(fila, 0);
                        String nomMat = (String) tabMaterias.getValueAt(fila, 1);
                        Integer anio = (Integer) tabMaterias.getValueAt(fila, 2);
                        String stat = (String) tabMaterias.getValueAt(fila, 3);

                        txtId.setText(String.valueOf(idMat));
                        txtName.setText(nomMat);
                        txtYear.setText(String.valueOf(anio));
                        txtState.setText(stat.equals("Vigente") ? "1" : "0");
                        jRedit.setEnabled(true);
                        jRfisicBaja.setEnabled(true);
                        jRlogAlta.setEnabled(true);
                        jRlogBaja.setEnabled(true);
                        txtPanel.setText("Una vez elija que Materia desea modificar, seleccione uno de los metodos de edición");
                        btnSeleccionar.setEnabled(true);
                        btnEdit.setEnabled(false);
                        

                    }
                }
            }

        });
        llenarTabla();
    }

    //Esta clase es para que la tabla que se crea es seleccionable pero los datos que estan dentro de la tabla no son editables
    private class NonEditableTableModel extends DefaultTableModel {

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSelection = new javax.swing.ButtonGroup();
        grpEdit = new javax.swing.ButtonGroup();
        panelMaterias = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabMaterias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelGralABMC = new javax.swing.JPanel();
        pnlSrc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        txtWarningMsg = new javax.swing.JTextField();
        jRporId = new javax.swing.JRadioButton();
        jRporNombre = new javax.swing.JRadioButton();
        jRporAño = new javax.swing.JRadioButton();
        btnSrc = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNw = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExe = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jRfisicBaja = new javax.swing.JRadioButton();
        jRedit = new javax.swing.JRadioButton();
        jRlogAlta = new javax.swing.JRadioButton();
        jRlogBaja = new javax.swing.JRadioButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMaterias.setBackground(new java.awt.Color(51, 51, 51));
        panelMaterias.setMaximumSize(new java.awt.Dimension(1000, 550));
        panelMaterias.setMinimumSize(new java.awt.Dimension(1000, 550));
        panelMaterias.setName(""); // NOI18N
        panelMaterias.setPreferredSize(new java.awt.Dimension(1000, 550));
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
        jLabel1.setText("Sistema de Gestión de Materias");
        jLabel1.setToolTipText("");
        pnlSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        panelMaterias.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        tabMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Materia", "Nombre Materia", "Año Cursada", "Estado Materia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabMaterias.setFocusable(false);
        jScrollPane1.setViewportView(tabMaterias);

        panelMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 210));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PANEL - ABMC - MATERIAS ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelMaterias.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1000, 40));

        panelGralABMC.setBackground(new java.awt.Color(255, 204, 153));
        panelGralABMC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSrc.setBackground(new java.awt.Color(255, 204, 102));
        pnlSrc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlSrc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSQUEDA");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlSrc.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 344, 36));

        txtBusqueda.setEditable(false);
        txtBusqueda.setBackground(new java.awt.Color(204, 204, 204));
        txtBusqueda.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        pnlSrc.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 50, 344, 34));

        txtWarningMsg.setEditable(false);
        txtWarningMsg.setBackground(new java.awt.Color(255, 204, 102));
        txtWarningMsg.setForeground(new java.awt.Color(255, 51, 51));
        txtWarningMsg.setBorder(null);
        pnlSrc.add(txtWarningMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 90, 344, -1));

        jRporId.setBackground(new java.awt.Color(255, 204, 102));
        grpSelection.add(jRporId);
        jRporId.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRporId.setForeground(new java.awt.Color(0, 0, 0));
        jRporId.setText("por ID");
        jRporId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRporIdActionPerformed(evt);
            }
        });
        pnlSrc.add(jRporId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, -1));

        jRporNombre.setBackground(new java.awt.Color(255, 204, 102));
        grpSelection.add(jRporNombre);
        jRporNombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRporNombre.setForeground(new java.awt.Color(0, 0, 0));
        jRporNombre.setText("por Nombre");
        jRporNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRporNombreActionPerformed(evt);
            }
        });
        pnlSrc.add(jRporNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        jRporAño.setBackground(new java.awt.Color(255, 204, 102));
        grpSelection.add(jRporAño);
        jRporAño.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRporAño.setForeground(new java.awt.Color(0, 0, 0));
        jRporAño.setText("por Año");
        jRporAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRporAñoActionPerformed(evt);
            }
        });
        pnlSrc.add(jRporAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, -1));

        btnSrc.setText("Buscar");
        btnSrc.setEnabled(false);
        btnSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcActionPerformed(evt);
            }
        });
        pnlSrc.add(btnSrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnAccept.setText("Aceptar");
        btnAccept.setEnabled(false);
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        pnlSrc.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        txtMsg.setEditable(false);
        txtMsg.setBackground(new java.awt.Color(255, 204, 153));
        txtMsg.setColumns(6);
        txtMsg.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtMsg.setForeground(new java.awt.Color(51, 51, 51));
        txtMsg.setLineWrap(true);
        txtMsg.setRows(5);
        txtMsg.setWrapStyleWord(true);
        txtMsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(txtMsg);

        pnlSrc.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 340, 140));

        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlSrc.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        panelGralABMC.add(pnlSrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 340));

        btnBack.setText("VOLVER");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 140, 40));

        btnNw.setText("Nueva Mat");
        btnNw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNwActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnNw, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 110, 40));

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 110, 40));

        btnExe.setText("Ejecutar");
        btnExe.setEnabled(false);
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnExe, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 110, 30));
        panelGralABMC.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 273, 640, 10));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MATERIA");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelGralABMC.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 440, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelGralABMC.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 10, 330));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 204, 0));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre Materia");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Año Cursada");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID Materia");

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtYear.setEditable(false);
        txtYear.setBackground(new java.awt.Color(255, 255, 255));
        txtYear.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtYear.setForeground(new java.awt.Color(0, 0, 0));
        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtYearKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });

        txtState.setEditable(false);
        txtState.setBackground(new java.awt.Color(255, 255, 255));
        txtState.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtState.setForeground(new java.awt.Color(0, 0, 0));
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStateKeyTyped(evt);
            }
        });

        txtPanel.setEditable(false);
        txtPanel.setBackground(new java.awt.Color(255, 204, 153));
        txtPanel.setColumns(5);
        txtPanel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtPanel.setForeground(new java.awt.Color(51, 51, 51));
        txtPanel.setLineWrap(true);
        txtPanel.setRows(5);
        txtPanel.setWrapStyleWord(true);
        txtPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(txtPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGralABMC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 440, 220));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de Edicion");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGralABMC.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 160, 30));

        btnAdd.setText("Agregar");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 110, 40));

        jRfisicBaja.setBackground(new java.awt.Color(255, 204, 153));
        grpEdit.add(jRfisicBaja);
        jRfisicBaja.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRfisicBaja.setForeground(new java.awt.Color(0, 0, 0));
        jRfisicBaja.setText("Borrar Físico");
        jRfisicBaja.setEnabled(false);
        jRfisicBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfisicBajaActionPerformed(evt);
            }
        });
        panelGralABMC.add(jRfisicBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        jRedit.setBackground(new java.awt.Color(255, 204, 153));
        grpEdit.add(jRedit);
        jRedit.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRedit.setForeground(new java.awt.Color(0, 0, 0));
        jRedit.setText("Editar datos");
        jRedit.setEnabled(false);
        jRedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReditActionPerformed(evt);
            }
        });
        panelGralABMC.add(jRedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, -1, -1));

        jRlogAlta.setBackground(new java.awt.Color(255, 204, 153));
        grpEdit.add(jRlogAlta);
        jRlogAlta.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRlogAlta.setForeground(new java.awt.Color(0, 0, 0));
        jRlogAlta.setText("Alta Lógica");
        jRlogAlta.setEnabled(false);
        jRlogAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRlogAltaActionPerformed(evt);
            }
        });
        panelGralABMC.add(jRlogAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        jRlogBaja.setBackground(new java.awt.Color(255, 204, 153));
        grpEdit.add(jRlogBaja);
        jRlogBaja.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jRlogBaja.setForeground(new java.awt.Color(0, 0, 0));
        jRlogBaja.setText("Baja Lógica");
        jRlogBaja.setEnabled(false);
        jRlogBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRlogBajaActionPerformed(evt);
            }
        });
        panelGralABMC.add(jRlogBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 110, 30));

        panelMaterias.add(panelGralABMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1000, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
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

    private void jRporIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporIdActionPerformed
        txtMsg.setText("Busqueda por ID de Materia, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporIdActionPerformed

    private void jRporNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporNombreActionPerformed
        txtMsg.setText("Busqueda por Nombre de materia, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporNombreActionPerformed

    private void jRporAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporAñoActionPerformed
        txtMsg.setText("Busqueda por Año de cursada de materia, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporAñoActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        txtBusqueda.requestFocus();
        if (jRporId.isSelected()) {
            jRporNombre.setEnabled(false);
            jRporAño.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por ID, asegúrese de ingresar solo NUMEROS en el campo de búsqueda.");
        } else if (jRporNombre.isSelected()) {
            jRporId.setEnabled(false);
            jRporAño.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por Nombre, asegúrese de conocer los nombres de las materias que desea buscar con este método de búsqueda.");

        } else if (jRporAño.isSelected()) {
            jRporId.setEnabled(false);
            jRporNombre.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por Año de cursada, asegúrese de ingresar solo NUMEROS en el campo de busqueda. Los años de cursada son desde 1ro a 5to año.");
        }
        btnAccept.setEnabled(false);
        btnSrc.setEnabled(true);
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if (jRporId.isSelected()) {
            int key = evt.getKeyChar();
            boolean numero = key >= 48 && key <= 57;

            if (!numero) {
                evt.consume();
                txtWarningMsg.setText("Solo debe ingresar Números");
            }
        }
        if (jRporAño.isSelected()) {
            int key = evt.getKeyChar();
            boolean numero = key >= 49 && key <= 53;

            if (!numero || !txtBusqueda.getText().isEmpty()) {
                evt.consume();
                txtWarningMsg.setText("Solo debe ingresar Números entre 1 y 5");
            }

        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        ventanaDeInicio.mostrarInicio();


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcActionPerformed
        if (jRporId.isSelected()) {
            actualizarTablaMat(materiaData.buscarMateriaPorId(Integer.parseInt(txtBusqueda.getText())));
        }
        if (jRporNombre.isSelected()) {
            actualizarTablaMat(materiaData.buscarMateriaPorName(txtBusqueda.getText()));
        }
        if (jRporAño.isSelected()) {
            actualizarTablaList(materiaData.buscarMateriaPorAño(Integer.parseInt(txtBusqueda.getText())));
        }
        txtMsg.setText("Se ha completado la busqueda");
        btnSrc.setEnabled(false);
        btnAccept.setEnabled(true);
        jRporAño.setEnabled(true);
        jRporId.setEnabled(true);
        jRporNombre.setEnabled(true);
        grpSelection.clearSelection();
    }//GEN-LAST:event_btnSrcActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jRporId.setEnabled(true);
        jRporAño.setEnabled(true);
        jRporNombre.setEnabled(true);
        jRporId.setSelected(false);
        jRporId.repaint();
        jRporAño.setSelected(false);
        jRporAño.repaint();
        jRporNombre.setSelected(false);
        jRporNombre.repaint();
        grpSelection.clearSelection();
        btnAccept.setEnabled(false);
        btnSrc.setEnabled(false);
        txtBusqueda.setText("");
        modelo.setRowCount(0);
        llenarTabla();
        txtMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnNwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNwActionPerformed
        txtName.setEditable(true);
        txtYear.setEditable(true);
        txtState.setEditable(true);
        txtName.requestFocus();
    }//GEN-LAST:event_btnNwActionPerformed

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 49 && key <= 53;

        if (!numero) {
            evt.consume();
            txtPanel.setText("Solo debe ingresar Números entre 1 y 5 en el campo 'AÑO DE CURSADA'");
        }
    }//GEN-LAST:event_txtYearKeyTyped

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        
        validarCamposNw();
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyReleased
       
        validarCamposNw();
        
    }//GEN-LAST:event_txtYearKeyReleased

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
        
        validarCamposNw();
        
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtStateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 49;

        if (!numero || !txtState.getText().isEmpty()) {
            evt.consume();
            txtPanel.setText("Solo debe ingresar un único 0 para NO VIGENTE o un único 1 para VIGENTE");
        }
    }//GEN-LAST:event_txtStateKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String nom = txtName.getText();
        int year = Integer.parseInt(txtYear.getText());
        boolean stat = false;
        if (txtState.getText().equals("0")) {
            stat = false;
        } else if (txtState.getText().equals("1")) {
            stat = true;
        }

        Materias nwMat = new Materias(nom, year, stat);
        materiaData.guardarMateria(nwMat);
        modelo.setRowCount(0);
        llenarTabla();
        JOptionPane.showMessageDialog(null, "Materia " + nwMat.getNombre() + " con ID " + nwMat.getIdMateria() + " de " + nwMat.getAnioMateria() + " agregada con éxito.");
        btnAdd.setEnabled(false);
        txtId.setText("");
        txtName.setText("");
        txtState.setText("");
        txtYear.setText("");
        txtMsg.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtPanel.setText("Seleccione la materia a editar en la tabla, luego seleccione el metodo de edicion que desea utilizar.");
        btnClear.setEnabled(false);
        btnNw.setEnabled(false);
        


    }//GEN-LAST:event_btnEditActionPerformed

    private void jReditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReditActionPerformed
        txtPanel.setText("Metodo 'EDITAR', presione 'SELECCIONAR PARA CONTINUAR'.");
        
    }//GEN-LAST:event_jReditActionPerformed

    private void jRlogAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRlogAltaActionPerformed
        txtPanel.setText("Metodo 'ALTA LOGICA', presione 'SELECCIONAR PARA CONTINUAR'.");
      
    }//GEN-LAST:event_jRlogAltaActionPerformed

    private void jRlogBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRlogBajaActionPerformed
        txtPanel.setText("Metodo 'BAJA LOGICA', presione 'SELECCIONAR PARA CONTINUAR'.");
       
    }//GEN-LAST:event_jRlogBajaActionPerformed

    private void jRfisicBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRfisicBajaActionPerformed
        txtPanel.setText("Metodo 'BORRAR FISICO', presione 'SELECCIONAR PARA CONTINUAR'. ATENCION: la entidad 'Materia' puede mantener relacion con algun alumno a traves de una Inscripción.");
     
    }//GEN-LAST:event_jRfisicBajaActionPerformed

    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        int idMat = Integer.parseInt(txtId.getText());
        String nom = txtName.getText();
        int year = Integer.parseInt(txtYear.getText());
        boolean stat = false;
        if (txtState.getText().equals("0")) {
            stat = false;
        } else if (txtState.getText().equals("1")) {
            stat = true;
        }
        Materias nwMat = new Materias(idMat, nom, year, stat);
        if(jRedit.isSelected()){
            materiaData.actualizarMateria(nwMat);
        }
        if(jRfisicBaja.isSelected()){
            materiaData.borrarMateriaFisico(idMat);
        }
        if(jRlogAlta.isSelected()) {
            materiaData.altaLogicaMateria(nwMat);
        }
        if(jRlogBaja.isSelected()) {
            materiaData.bajaLogicaMateria(nwMat);
        }
        btnNw.setEnabled(true);
        btnExe.setEnabled(false);
        btnEdit.setEnabled(true);
        btnClear.setEnabled(true);
        grpEdit.clearSelection();
        txtId.setText("");
        txtName.setText("");
        txtState.setText("");
        txtYear.setText("");
        jRedit.setEnabled(false);
        jRfisicBaja.setEnabled(false);
        jRlogBaja.setEnabled(false);
        jRlogAlta.setEnabled(false);
        txtName.setEditable(false);
        txtYear.setEditable(false);
        modelo.setRowCount(0);
        llenarTabla();
        tabMaterias.setEnabled(true);
        txtPanel.setText("");
        

        
    }//GEN-LAST:event_btnExeActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        
            tabMaterias.setEnabled(false);
            btnSeleccionar.setEnabled(false);
            btnExe.setEnabled(true);
            if (jRedit.isSelected()) {
                txtName.setEditable(true);
                txtYear.setEditable(true);
                txtYear.setText("");
                txtName.requestFocus();
                txtPanel.setText("Cambie el nombre o el año de cursada, luego presione 'Ejecutar' para guardar los cambios.");
                jRfisicBaja.setEnabled(false);
                jRlogAlta.setEnabled(false);
                jRlogBaja.setEnabled(false);
            }
            if (jRfisicBaja.isSelected()) {
                btnExe.setEnabled(true);
                jRedit.setEnabled(false);
                jRlogAlta.setEnabled(false);
                jRlogBaja.setEnabled(false);
            }
            if (jRlogAlta.isSelected()) {
                btnExe.setEnabled(true);
                jRfisicBaja.setEnabled(false);
                jRedit.setEnabled(false);
                jRlogBaja.setEnabled(false);
            }
            if (jRlogBaja.isSelected()) {
                btnExe.setEnabled(true);
                jRfisicBaja.setEnabled(false);
                jRlogAlta.setEnabled(false);
                jRedit.setEnabled(false);
            }
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExe;
    private javax.swing.JButton btnNw;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnSrc;
    private javax.swing.ButtonGroup grpEdit;
    private javax.swing.ButtonGroup grpSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRedit;
    private javax.swing.JRadioButton jRfisicBaja;
    private javax.swing.JRadioButton jRlogAlta;
    private javax.swing.JRadioButton jRlogBaja;
    private javax.swing.JRadioButton jRporAño;
    private javax.swing.JRadioButton jRporId;
    private javax.swing.JRadioButton jRporNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelGralABMC;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel pnlSrc;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabMaterias;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtPanel;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtWarningMsg;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void crearCabecera() {
        modelo.addColumn("ID Materia");
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Año Cursada");
        modelo.addColumn("Estado");
        tabMaterias.setModel(modelo);
    }

    private void llenarTabla() {
        List<Materias> listadoMat = materiaData.listarMaterias();
        for (Materias materia : listadoMat) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnioMateria(),
                materia.isEstado() ? "Vigente" : "No Vigente"

            });

        }

    }

    private void actualizarTablaMat(Materias materia) {
        modelo.setRowCount(0);
        List<Materias> listadoMat = new ArrayList();
        listadoMat.add(materia);
        for (Materias mat : listadoMat) {
            modelo.addRow(new Object[]{
                mat.getIdMateria(),
                mat.getNombre(),
                mat.getAnioMateria(),
                mat.isEstado() ? "Vigente" : "No Vigente"
            });
        }
    }

    private void actualizarTablaList(List<Materias> listMat) {
        modelo.setRowCount(0);
        for (Materias mat : listMat) {
            modelo.addRow(new Object[]{
                mat.getIdMateria(),
                mat.getNombre(),
                mat.getAnioMateria(),
                mat.isEstado() ? "Vigente" : "No Vigente"
            });
        }
    }

    private void validarCamposNw() {
        if (!txtName.getText().isEmpty() && !txtYear.getText().isEmpty() && !txtState.getText().isEmpty() && btnNw.isEnabled()) {
            btnAdd.setEnabled(true);
        }

    }

}
