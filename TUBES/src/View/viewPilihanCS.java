/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author YAHYA
 */
public class viewPilihanCS extends javax.swing.JFrame {

    /**
     * Creates new form viewPilihanCS
     */
    public viewPilihanCS() {
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

        jLabel1 = new javax.swing.JLabel();
        bukaRekening = new javax.swing.JButton();
        upgrade = new javax.swing.JButton();
        lainlain = new javax.swing.JButton();
        laporanKehilangan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\GitHub\\tubespbo\\background\\24.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 925, -1));

        bukaRekening.setText("jButton1");
        getContentPane().add(bukaRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 740, 90));

        upgrade.setText("jButton1");
        getContentPane().add(upgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 740, 80));

        lainlain.setText("jButton1");
        getContentPane().add(lainlain, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 720, 80));

        laporanKehilangan.setText("jButton1");
        getContentPane().add(laporanKehilangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 740, 90));

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
            java.util.logging.Logger.getLogger(viewPilihanCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewPilihanCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewPilihanCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewPilihanCS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPilihanCS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bukaRekening;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lainlain;
    private javax.swing.JButton laporanKehilangan;
    private javax.swing.JButton upgrade;
    // End of variables declaration//GEN-END:variables
}
