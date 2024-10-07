package vistas;

import entidades.Conexion;
import entidades.Materias;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import persistencia.MateriaData;

public class VistaMaterias extends javax.swing.JFrame {
    
    MateriaData materiaData;
    int xMouse, yMouse;
    int x, y;
    private final DefaultTableModel modelo = new DefaultTableModel();
    MateriaData MateriaData;

    public VistaMaterias() {
        initComponents();
        Connection con = Conexion.getConexion();
        materiaData = new MateriaData(con);
        this.setLocationRelativeTo(null);
        crearCabecera();
        llenarTabla();

    }
    

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpSelection = new javax.swing.ButtonGroup();
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
        jRporNombre = new javax.swing.JRadioButton();
        jRporAño = new javax.swing.JRadioButton();
        btnSrc = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

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

        tabAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabAlumnos);

        panelMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 210));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
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
        pnlSrc.add(jRporNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 110, -1));

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
        pnlSrc.add(jRporAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 102, -1));

        btnSrc.setText("Buscar");
        btnSrc.setEnabled(false);
        pnlSrc.add(btnSrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnAccept.setText("Aceptar");
        btnAccept.setEnabled(false);
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        pnlSrc.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        txtMsg.setEditable(false);
        txtMsg.setBackground(new java.awt.Color(255, 204, 153));
        txtMsg.setColumns(6);
        txtMsg.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtMsg.setLineWrap(true);
        txtMsg.setRows(5);
        txtMsg.setWrapStyleWord(true);
        txtMsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(txtMsg);

        pnlSrc.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 340, 140));

        panelGralABMC.add(pnlSrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 340));

        btnBack.setText("VOLVER");
        panelGralABMC.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 140, 40));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSrc;
    private javax.swing.ButtonGroup grpSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRporAño;
    private javax.swing.JRadioButton jRporId;
    private javax.swing.JRadioButton jRporNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelGralABMC;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JPanel pnlSrc;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JTable tabAlumnos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtWarningMsg;
    // End of variables declaration//GEN-END:variables

    private void crearCabecera() {
        modelo.addColumn("ID Materia");
        modelo.addColumn("Nombre Materia");
        modelo.addColumn("Año Cursada");
        modelo.addColumn("Estado");
        tabAlumnos.setModel(modelo);
    }

    private void llenarTabla() {
        List<Materias> listadoMat = materiaData.listarMaterias();
        for (Materias materia : listadoMat) {
            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnioMateria(),
                materia.isEstado()

            });
        }

    }

    
}
