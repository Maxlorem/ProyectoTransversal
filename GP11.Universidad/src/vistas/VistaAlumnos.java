
package vistas;
import entidades.Alumno;
import entidades.Conexion;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;

public class VistaAlumnos extends javax.swing.JFrame {
    
    private VentanaDeInicio ventanaDeInicio;
    AlumnoData alumnoData;
    int xMouse, yMouse;
    int x, y;
    private final DefaultTableModel modelo = new NonEditableTableModel();
    
   
    public VistaAlumnos(VentanaDeInicio ventanaDeInicio) {
        
        initComponents();
        this.ventanaDeInicio = ventanaDeInicio;
        Connection con = Conexion.getConexion();
        alumnoData = new AlumnoData(con);
        this.setLocationRelativeTo(null);
        crearCabecera();

        tabAlumnos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int fila = tabAlumnos.getSelectedRow();
                    if (fila != -1 && !btnNw.isEnabled()) {

                        Integer idAlu = (Integer) tabAlumnos.getValueAt(fila, 0); //CUANDO NO LO ENCUENTRA EXPLOTA
                        Long dni = (Long) tabAlumnos.getValueAt(fila, 1);
                        String ape = (String) tabAlumnos.getValueAt(fila, 2);
                        String nom = (String) tabAlumnos.getValueAt(fila, 3);
                        //java.sql.Date sqlFecha = (java.sql.Date) tabAlumnos.getValueAt(fila, 4);
                        //LocalDate fecNac = sqlFecha.toLocalDate();
                        LocalDate fecNac = (LocalDate) tabAlumnos.getValueAt(fila, 4);
                        Date date = Date.from(fecNac.atStartOfDay(ZoneId.systemDefault()).toInstant());
                        String stat = (String) tabAlumnos.getValueAt(fila, 5);

                        txtId.setText(String.valueOf(idAlu));
                        txtDni.setText(String.valueOf(dni));
                        txtApe.setText(ape);
                        txtName.setText(nom);
                        calendar.setDate(date);
                        txtState.setText(stat.equals("Regular") ? "1" : "0");
                        jRedit.setEnabled(true);
                        jRfisicBaja.setEnabled(true);
                        jRlogAlta.setEnabled(true);
                        jRlogBaja.setEnabled(true);
                        txtPanel.setText("Una vez elija que Alumno desea modificar, seleccione uno de los metodos de edición");
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        panelMaterias = new javax.swing.JPanel();
        pnlSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlumnos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelGralABMC = new javax.swing.JPanel();
        pnlSrc = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        txtWarningMsg = new javax.swing.JTextField();
        jRporId = new javax.swing.JRadioButton();
        jRporApellido = new javax.swing.JRadioButton();
        jRporDni = new javax.swing.JRadioButton();
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
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPanel = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        calendar = new com.toedter.calendar.JDateChooser();
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
        jLabel1.setText("Sistema de Gestión de Alumnos");
        jLabel1.setToolTipText("");
        pnlSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        panelMaterias.add(pnlSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        tabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Alumno", "DNI", "Apellido", "Nombre", "Fecha Nacimiento", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAlumnos.setEnabled(false);
        tabAlumnos.setFocusable(false);
        jScrollPane1.setViewportView(tabAlumnos);

        panelMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 210));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 2, true));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PANEL - ABMC - ALUMNOS ");

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

        jRporApellido.setBackground(new java.awt.Color(255, 204, 102));
        grpSelection.add(jRporApellido);
        jRporApellido.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRporApellido.setForeground(new java.awt.Color(0, 0, 0));
        jRporApellido.setText("por Apellido");
        jRporApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRporApellidoActionPerformed(evt);
            }
        });
        pnlSrc.add(jRporApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, -1));

        jRporDni.setBackground(new java.awt.Color(255, 204, 102));
        grpSelection.add(jRporDni);
        jRporDni.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRporDni.setForeground(new java.awt.Color(0, 0, 0));
        jRporDni.setText("por DNI");
        jRporDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRporDniActionPerformed(evt);
            }
        });
        pnlSrc.add(jRporDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 80, -1));

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
        panelGralABMC.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 140, 30));

        btnNw.setText("Nuevo Alumno");
        btnNw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNwActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnNw, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, 30));

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 110, 30));

        btnExe.setText("Ejecutar");
        btnExe.setEnabled(false);
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });
        panelGralABMC.add(btnExe, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 110, 30));
        panelGralABMC.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 640, 10));

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
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha Nac");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Apellido");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ID Alumnos");

        txtDni.setEditable(false);
        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtApe.setEditable(false);
        txtApe.setBackground(new java.awt.Color(255, 255, 255));
        txtApe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtApe.setForeground(new java.awt.Color(0, 0, 0));
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeKeyReleased(evt);
            }
        });

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
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

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Estado");

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

        calendar.setDateFormatString("yyyy-MM-dd");
        calendar.setEnabled(false);
        calendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtApe, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))))
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
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGralABMC.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 440, 290));

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
        panelGralABMC.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 110, 30));

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
        jRlogAlta.setText("Estado Regular");
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
        jRlogBaja.setText("Estado Libre");
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

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if (jRporId.isSelected()) {
            int key = evt.getKeyChar();
            boolean numero = key >= 48 && key <= 57;

            if (!numero) {
                evt.consume();
                txtWarningMsg.setText("Solo debe ingresar Números");
            }
        }
        if (jRporDni.isSelected()) {
            int key = evt.getKeyChar();
            boolean numero = key >= 48 && key <= 57;

            if (!numero) {
                evt.consume();
                txtWarningMsg.setText("Solo debe ingresar Números");
            }

        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void jRporIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporIdActionPerformed
        txtBusqueda.setText("");
        txtMsg.setText("Busqueda por ID de Alumno, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporIdActionPerformed

    private void jRporApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporApellidoActionPerformed
        txtBusqueda.setText("");
        txtMsg.setText("Busqueda por Apellido, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporApellidoActionPerformed

    private void jRporDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRporDniActionPerformed
        txtBusqueda.setText("");
        txtMsg.setText("Busqueda por DNI, presione Aceptar para comenzar.");
        btnAccept.setEnabled(true);
    }//GEN-LAST:event_jRporDniActionPerformed

    private void btnSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcActionPerformed
        if (jRporId.isSelected()) {
            String idEnviado = txtBusqueda.getText();
            
            if(idEnviado.isEmpty()){
                txtMsg.setText("no puede estar vacio");
            }else{
                Integer idParseado = Integer.parseInt(idEnviado);
                Alumno alumnoBuscado = alumnoData.buscarAlumnoPorId(idParseado);
                if(alumnoBuscado != null){
                    txtMsg.setText("Se ha completado la busqueda: Alumno Encontrado");
                    actualizarTablaAlu(alumnoBuscado);
                }else{
                    txtMsg.setText("No se encontro el alumno");
                }
            }
             
            
            //actualizarTablaAlu(alumnoData.buscarAlumnoPorId(Integer.parseInt(txtBusqueda.getText())));
        }
        if (jRporApellido.isSelected()) {
            String apellidoEnviado = txtBusqueda.getText();
            ArrayList<Alumno> alumnoBuscado = alumnoData.buscarAlumnoPorApellido(apellidoEnviado);
            if(!alumnoBuscado.isEmpty()){
                actualizarTablaList(alumnoBuscado);
                txtMsg.setText("Se ha completado la busqueda: Alumno Encontrado");
            }else{
                txtMsg.setText("No se encontraron alumnos con ese apellido");
            }
            //actualizarTablaList(alumnoData.buscarAlumnoPorApellido(txtBusqueda.getText()));
        }
        if (jRporDni.isSelected()) {
            String dniEnviado = txtBusqueda.getText();
            Integer dniParseado = Integer.parseInt(dniEnviado);
            Alumno alumnoBuscado = alumnoData.buscarAlumnoPorId(dniParseado);
            if(alumnoBuscado != null){
                txtMsg.setText("Se ha completado la busqueda: Alumno Encontrado");
                
                actualizarTablaAlu(alumnoBuscado);
            }else{
                txtMsg.setText("No se encontro el alumno");
            }
            //actualizarTablaAlu(alumnoData.buscarAlumnoPorDni(Integer.parseInt(txtBusqueda.getText())));
        }
        
        btnSrc.setEnabled(false);
        btnAccept.setEnabled(true);
        jRporDni.setEnabled(true);
        jRporId.setEnabled(true);
        jRporApellido.setEnabled(true);
        grpSelection.clearSelection();
        txtBusqueda.setText("");
        txtBusqueda.setEditable(false);
        btnSrc.setEnabled(false);
        btnAccept.setEnabled(false);
    }//GEN-LAST:event_btnSrcActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        txtBusqueda.setEnabled(true);
        txtBusqueda.requestFocus();
        if (jRporId.isSelected()) {
            jRporApellido.setEnabled(false);
            jRporDni.setEnabled(false);
            jRporId.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por ID, asegúrese de ingresar solo NUMEROS en el campo de búsqueda.");
        } else if (jRporApellido.isSelected()) {
            jRporId.setEnabled(false);
            jRporDni.setEnabled(false);
            jRporApellido.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por Apellido, asegúrese de conocer el apellido de los alumnos que desea buscar con este método de búsqueda.");

        } else if (jRporDni.isSelected()) {
            jRporId.setEnabled(false);
            jRporApellido.setEnabled(false);
            jRporDni.setEnabled(false);
            txtBusqueda.setEditable(true);
            txtMsg.setText("Realizará una búsqueda por DNI, asegúrese de ingresar solo NUMEROS en el campo de busqueda.");
        }
        btnAccept.setEnabled(false);
        btnSrc.setEnabled(true);
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jRporId.setEnabled(true);
        jRporDni.setEnabled(true);
        jRporApellido.setEnabled(true);
        jRporId.setSelected(false);
        jRporId.repaint();
        jRporDni.setSelected(false);
        jRporDni.repaint();
        jRporApellido.setSelected(false);
        jRporApellido.repaint();
        grpSelection.clearSelection();
        btnAccept.setEnabled(false);
        btnSrc.setEnabled(false);
        txtBusqueda.setText("");
        txtBusqueda.setEnabled(false);
        modelo.setRowCount(0);
        llenarTabla();
        txtMsg.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        ventanaDeInicio.mostrarInicio();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNwActionPerformed
        txtDni.setEditable(true);
        txtApe.setEditable(true);
        txtName.setEditable(true);
        calendar.setEnabled(true);
        txtState.setEditable(true);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnNwActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtPanel.setText("Seleccione el Alumno a editar en la tabla, luego seleccione el metodo de edicion que desea utilizar.");
        tabAlumnos.setEnabled(true);
        btnClear.setEnabled(false);
        btnNw.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        int idAlu = Integer.parseInt(txtId.getText());
        Long dniAlu = Long.valueOf(txtDni.getText());
        String ape = txtApe.getText();
        String name = txtName.getText();
        //AK HAY QUE VER
        Date campoDeTextoFecha = calendar.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fText = dateFormat.format(campoDeTextoFecha);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fNac = LocalDate.parse(fText, formatter);
       
        boolean stat = true;
        if (txtState.getText().equals("0")) {
            stat = false;
        }
        if (txtState.getText().equals("1")) {
            stat = true;
        }
        Alumno nwAlu = new Alumno(idAlu, dniAlu, ape, name, fNac, stat);
        if(jRedit.isSelected()){
            alumnoData.actualizarAlumno(nwAlu);
        }
        if(jRfisicBaja.isSelected()){
            alumnoData.borrarAlumnoFisico(idAlu);
        }
        if(jRlogAlta.isSelected()) {
            alumnoData.altaLogicaAlumno(nwAlu);
        }
        if(jRlogBaja.isSelected()) {
            alumnoData.bajaLogicaAlumno(nwAlu);
        }
        btnNw.setEnabled(true);
        btnExe.setEnabled(false);
        btnEdit.setEnabled(true);
        btnClear.setEnabled(true);
        grpEdit.clearSelection();
        txtId.setText("");
        txtDni.setText("");
        txtName.setText("");
        txtApe.setText("");
        calendar.setDate(null);
        txtState.setText("");
        jRedit.setEnabled(false);
        jRfisicBaja.setEnabled(false);
        jRlogBaja.setEnabled(false);
        jRlogAlta.setEnabled(false);
        txtDni.setEditable(false);
        txtApe.setEditable(false);
        txtName.setEditable(false);
        calendar.setEnabled(false);
        
        modelo.setRowCount(0);
        llenarTabla();
        tabAlumnos.setEnabled(false);
        txtPanel.setText("");

    }//GEN-LAST:event_btnExeActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased

        validarCamposNw();

    }//GEN-LAST:event_txtDniKeyReleased

    private void txtApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyReleased

        validarCamposNw();

    }//GEN-LAST:event_txtApeKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

        validarCamposNw();

    }//GEN-LAST:event_txtNameKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        Long dniAlu = Long.valueOf(txtDni.getText());
        String ape = txtApe.getText();
        String nom = txtName.getText();
        //Ver si funciona
        Date campoDeTextoFecha = calendar.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fText = dateFormat.format(campoDeTextoFecha);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fNac = LocalDate.parse(fText, formatter);
        
        boolean stat = false;
        if (txtState.getText().equals("0")) {
            stat = false;
        } else if (txtState.getText().equals("1")) {
            stat = true;
        }

        Alumno nwAlu = new Alumno(dniAlu, ape, nom, fNac, stat);
        alumnoData.guardarAlumno(nwAlu);
        modelo.setRowCount(0);
        llenarTabla();
        JOptionPane.showMessageDialog(null, "Alumno " + nwAlu.getApellido()+ " DNI " + nwAlu.getDni() + " agregado con éxito.");
        btnAdd.setEnabled(false);
        txtId.setText("");
        txtDni.setText("");
        txtName.setText("");
        txtApe.setText("");
        txtMsg.setText("");
        calendar.setDate(null);
        txtState.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void jRfisicBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRfisicBajaActionPerformed
        txtPanel.setText("Metodo 'BORRAR FISICO', presione 'SELECCIONAR PARA CONTINUAR'. ATENCION: la entidad 'Alumno' puede mantener relacion con alguna materia a traves de una Inscripción.");

    }//GEN-LAST:event_jRfisicBajaActionPerformed

    private void jReditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReditActionPerformed
        txtPanel.setText("Metodo 'EDITAR', presione 'SELECCIONAR PARA CONTINUAR'.");

    }//GEN-LAST:event_jReditActionPerformed

    private void jRlogAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRlogAltaActionPerformed
        txtPanel.setText("Metodo 'ALTA LOGICA', presione 'SELECCIONAR PARA CONTINUAR'.");

    }//GEN-LAST:event_jRlogAltaActionPerformed

    private void jRlogBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRlogBajaActionPerformed
        txtPanel.setText("Metodo 'BAJA LOGICA', presione 'SELECCIONAR PARA CONTINUAR'.");

    }//GEN-LAST:event_jRlogBajaActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        tabAlumnos.setEnabled(false);
        btnSeleccionar.setEnabled(false);
        btnExe.setEnabled(true);
        if (jRedit.isSelected()) {
            txtDni.setEditable(true);
            txtApe.setEditable(true);
            txtName.setEditable(true);
            calendar.setEnabled(true);
            txtDni.requestFocus();
            txtPanel.setText("Cambie el DNI, Apellido, Nombre o la Fecha de Nacimiento, luego presione 'Ejecutar' para guardar los cambios.");
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

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
        validarCamposNw();
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int key = evt.getKeyChar();
            boolean numero = key >= 48 && key <= 57;

            if (!numero) {
                evt.consume();
                txtWarningMsg.setText("Solo debe ingresar Números");
            }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtStateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 49;

        if (!numero || !txtState.getText().isEmpty()) {
            evt.consume();
            txtPanel.setText("Solo debe ingresar un único 0 para NO VIGENTE o un único 1 para VIGENTE");
        }
    }//GEN-LAST:event_txtStateKeyTyped

    private void calendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarPropertyChange
        validarCamposNw();
    }//GEN-LAST:event_calendarPropertyChange


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
    private com.toedter.calendar.JDateChooser calendar;
    private javax.swing.ButtonGroup grpEdit;
    private javax.swing.ButtonGroup grpSelection;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRedit;
    private javax.swing.JRadioButton jRfisicBaja;
    private javax.swing.JRadioButton jRlogAlta;
    private javax.swing.JRadioButton jRlogBaja;
    private javax.swing.JRadioButton jRporApellido;
    private javax.swing.JRadioButton jRporDni;
    private javax.swing.JRadioButton jRporId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelGralABMC;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel pnlSrc;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabAlumnos;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtPanel;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtWarningMsg;
    // End of variables declaration//GEN-END:variables

        private void crearCabecera() {
        modelo.addColumn("ID Alumno");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Estado");
        tabAlumnos.setModel(modelo);
    }

    private void llenarTabla() {
        List<Alumno> listadoAlu = alumnoData.listarAlumnos();
        for (Alumno alu : listadoAlu) {
            modelo.addRow(new Object[]{
                alu.getIdAlumno(),
                alu.getDni(),
                alu.getApellido(),
                alu.getNombre(),
                alu.getFechaNac(),
                alu.isEstado() ? "Regular" : "Libre"
             });

        }

    }

    private void actualizarTablaAlu(Alumno alumno) {
        modelo.setRowCount(0);
        List<Alumno> listadoAlu = new ArrayList();
        listadoAlu.add(alumno);
        for (Alumno alu : listadoAlu) {
            modelo.addRow(new Object[]{
                alu.getIdAlumno(),
                alu.getDni(),
                alu.getApellido(),
                alu.getNombre(),
                alu.getFechaNac(),
                alu.isEstado() ? "Regular" : "Libre"
            });
        }
    }

    private void actualizarTablaList(List<Alumno> listAlu) {
        modelo.setRowCount(0);
        for (Alumno alu : listAlu) {
            modelo.addRow(new Object[]{
                alu.getIdAlumno(),
                alu.getDni(),
                alu.getApellido(),
                alu.getNombre(),
                alu.getFechaNac(),
                alu.isEstado() ? "Regular" : "Libre"
            });
        }
    }

    private void validarCamposNw() {
        if (!txtDni.getText().isEmpty() && !txtApe.getText().isEmpty() && !txtName.getText().isEmpty() && 
            !calendar.getDate().toString().isEmpty() && !txtState.getText().isEmpty() && btnNw.isEnabled()) {
            btnAdd.setEnabled(true);
        }

    }

}


