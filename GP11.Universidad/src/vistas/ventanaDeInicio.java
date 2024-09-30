package vistas;

public class ventanaDeInicio extends javax.swing.JFrame {

        public ventanaDeInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        menuPnl = new javax.swing.JPanel();
        closePnl = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        imagenPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 550));
        setResizable(false);

        backgroundPnl.setBackground(new java.awt.Color(153, 153, 153));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closePnl.setBackground(new java.awt.Color(255, 102, 102));

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

        menuPnl.add(closePnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        backgroundPnl.add(menuPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 550));

        imagenPnl.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout imagenPnlLayout = new javax.swing.GroupLayout(imagenPnl);
        imagenPnl.setLayout(imagenPnlLayout);
        imagenPnlLayout.setHorizontalGroup(
            imagenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        imagenPnlLayout.setVerticalGroup(
            imagenPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaDeInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel closePnl;
    private javax.swing.JPanel imagenPnl;
    private javax.swing.JPanel menuPnl;
    // End of variables declaration//GEN-END:variables
}
