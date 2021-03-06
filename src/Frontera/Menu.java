/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    private Ingresar ingresar = new Ingresar();
    private Visualizar visualizar = new Visualizar();
    
    
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        ingresarB = new javax.swing.JButton();
        visualizarB = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        ingresarB.setText("Ingresar");
        ingresarB.setFocusable(false);
        ingresarB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresarB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ingresarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarBMouseClicked(evt);
            }
        });
        ingresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBActionPerformed(evt);
            }
        });
        jToolBar1.add(ingresarB);

        visualizarB.setText("Visualizar");
        visualizarB.setFocusable(false);
        visualizarB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizarB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        visualizarB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visualizarBMouseClicked(evt);
            }
        });
        visualizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBActionPerformed(evt);
            }
        });
        jToolBar1.add(visualizarB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        panelPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresar);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_ingresarBActionPerformed

    private void visualizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBActionPerformed
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(visualizar);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_visualizarBActionPerformed

    private void ingresarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarBMouseClicked
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(ingresar);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_ingresarBMouseClicked

    private void visualizarBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visualizarBMouseClicked
        panelPrincipal.setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(visualizar);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_visualizarBMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarB;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JButton visualizarB;
    // End of variables declaration//GEN-END:variables
}
