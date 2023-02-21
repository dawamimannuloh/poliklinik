/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Master_data.Data_Kategori_Obat.Kategori_Obat;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Main_Form extends javax.swing.JFrame {
    JInternalFrame internalFrame;
    
    private void setInternalFrame(JInternalFrame iframe){
    if (internalFrame != null){
        internalFrame.dispose();
    } 
    internalFrame = iframe;
    Dimension dekstopPaneSize = dputama.getSize();
    Dimension internalFrameSize = internalFrame.getSize();
    
    internalFrame.setLocation((dekstopPaneSize.width = internalFrameSize.width)/2, 
            (dekstopPaneSize.height = internalFrameSize.height)/2);
    dputama.add(internalFrame);
    internalFrame.setVisible(true);
    }
   
    public Main_Form() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dputama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mikategori = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dputamaLayout = new javax.swing.GroupLayout(dputama);
        dputama.setLayout(dputamaLayout);
        dputamaLayout.setHorizontalGroup(
            dputamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dputamaLayout.setVerticalGroup(
            dputamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jMenu1.setText("Home  ");

        miexit.setText("Exit");
        miexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miexitActionPerformed(evt);
            }
        });
        jMenu1.add(miexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(" Data ");

        mikategori.setText("Kategori Obat");
        mikategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mikategoriActionPerformed(evt);
            }
        });
        jMenu2.add(mikategori);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dputama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dputama)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mikategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mikategoriActionPerformed
        // TODO add your handling code here:
        setInternalFrame(new Kategori_Obat());
        dputama.removeAll();
        Kategori_Obat in = new Kategori_Obat();
        dputama.add(in);
        try {
            in.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        in.setVisible(true);
    }//GEN-LAST:event_mikategoriActionPerformed

    private void miexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miexitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Terimakasih!");
        System.exit(0);
    }//GEN-LAST:event_miexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dputama;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miexit;
    private javax.swing.JMenuItem mikategori;
    // End of variables declaration//GEN-END:variables
}
