/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author YAHYA
 */
public class viewDataPetugasCS extends javax.swing.JFrame {
    public Connection cn;
    public Statement st;
    /**
     * Creates new form viewDataPetugasCS
     */
    public viewDataPetugasCS() {
        initComponents();
        try{
            cn = DriverManager.getConnection("jdbc://localhost:3306/jdbc:mysql://localhost:3306/customer_service?zeroDateTimeBehavior=convertToNull","root","");
            st=cn.createStatement();
            JOptionPane.showMessageDialog(null, "Connected");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Not Connected");
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idPetugasCS = new javax.swing.JTextField();
        namaPetugasCS = new javax.swing.JTextField();
        alamatPetugasCS = new javax.swing.JTextField();
        tglLahirCS = new javax.swing.JTextField();
        lamaBekerjaCS = new javax.swing.JTextField();
        jenisServiceSC = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(idPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 350, 30));
        getContentPane().add(namaPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 350, 30));
        getContentPane().add(alamatPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 350, 30));
        getContentPane().add(tglLahirCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 350, 30));
        getContentPane().add(lamaBekerjaCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 350, 30));
        getContentPane().add(jenisServiceSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 350, 30));

        batal.setText("Batal");
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 90, 40));

        ok.setText("OK");
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 670, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\GitHub\\tubespbo\\background\\19.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1054, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(viewDataPetugasCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDataPetugasCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatPetugasCS;
    private javax.swing.JButton batal;
    private javax.swing.JTextField idPetugasCS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jenisServiceSC;
    private javax.swing.JTextField lamaBekerjaCS;
    private javax.swing.JTextField namaPetugasCS;
    private javax.swing.JButton ok;
    private javax.swing.JTextField tglLahirCS;
    // End of variables declaration//GEN-END:variables
}
