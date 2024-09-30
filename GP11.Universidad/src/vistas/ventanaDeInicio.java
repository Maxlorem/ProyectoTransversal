package vistas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class ventanaDeInicio extends javax.swing.JFrame {

        public ventanaDeInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        imagenPnl = new javax.swing.JPanel();
        closePnl = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgroundPnl.setBackground(new java.awt.Color(153, 153, 153));
        backgroundPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPnl.setBackground(new java.awt.Color(51, 51, 51));
        menuPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSistemaInscripciones.setBackground(new java.awt.Color(51, 51, 51));
        btnSistemaInscripciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSysInsc.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSysInsc.setForeground(new java.awt.Color(255, 102, 0));
        lblSysInsc.setText("Sistema");
        btnSistemaInscripciones.add(lblSysInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, -1));

        lblInsc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblInsc.setForeground(new java.awt.Color(255, 255, 255));
        lblInsc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblInsc.setText("INSCRIPCIONES");
        btnSistemaInscripciones.add(lblInsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 31, 180, 20));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        btnSistemaInscripciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 10));

        menuPnl.add(btnSistemaInscripciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 240, 60));

        btnSistemaAlumnos.setBackground(new java.awt.Color(51, 51, 51));
        btnSistemaAlumnos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
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
        btnSistemaAlumnos.add(lblAlu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 33, 130, -1));

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
        btnSistemaMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSysMat.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblSysMat.setForeground(new java.awt.Color(255, 102, 0));
        lblSysMat.setText("Sistema");
        btnSistemaMaterias.add(lblSysMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 228, -1));

        lblMat.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMat.setForeground(new java.awt.Color(255, 255, 255));
        lblMat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMat.setText("MATERIAS");
        btnSistemaMaterias.add(lblMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 33, 130, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        btnSistemaMaterias.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 10));

        menuPnl.add(btnSistemaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 240, 60));

        backgroundPnl.add(menuPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 550));

        imagenPnl.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout imagenPnlLayout = new javax.swing.GroupLayout(imagenPnl);
        imagenPnl.setLayout(imagenPnlLayout);
        imagenPnlLayout.setHorizontalGroup(
            imagenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenPnlLayout.createSequentialGroup()
                .addGap(0, 159, Short.MAX_VALUE)
                .addComponent(closePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        imagenPnlLayout.setVerticalGroup(
            imagenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenPnlLayout.createSequentialGroup()
                .addComponent(closePnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 520, Short.MAX_VALUE))
        );

        backgroundPnl.add(imagenPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 190, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closePnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseEntered
        closePnl.setBackground(Color.red);
    }//GEN-LAST:event_closePnlMouseEntered

    private void closePnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseClicked
        closePnl.setBackground(Color.YELLOW);
        System.exit(0);
    }//GEN-LAST:event_closePnlMouseClicked

    private void closePnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePnlMouseExited
        closePnl.setBackground(new Color(255, 155, 0));
    }//GEN-LAST:event_closePnlMouseExited

    private void btnSistemaAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseEntered
        btnSistemaAlumnos.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSistemaAlumnosMouseEntered

    private void btnSistemaAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseExited
        btnSistemaAlumnos.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_btnSistemaAlumnosMouseExited

    private void btnSistemaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSistemaAlumnosMouseClicked
       lblSysAlu.setForeground(new Color(255,255,255));
       lblAlu.setForeground(new Color(255, 102, 0));
       btnSistemaAlumnos.setBorder(BorderFactory.createLineBorder(new Color(255,102,0),3));
    }//GEN-LAST:event_btnSistemaAlumnosMouseClicked

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaDeInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JPanel btnSistemaAlumnos;
    private javax.swing.JPanel btnSistemaInscripciones;
    private javax.swing.JPanel btnSistemaMaterias;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel closePnl;
    private javax.swing.JPanel imagenPnl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAlu;
    private javax.swing.JLabel lblInsc;
    private javax.swing.JLabel lblMat;
    private javax.swing.JLabel lblSysAlu;
    private javax.swing.JLabel lblSysInsc;
    private javax.swing.JLabel lblSysMat;
    private javax.swing.JPanel menuPnl;
    // End of variables declaration//GEN-END:variables
}
