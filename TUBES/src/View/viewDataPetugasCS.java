/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author YAHYA
 */
public class viewDataPetugasCS extends javax.swing.JFrame {
    /**
     * Creates new form viewDataPetugasCS
     */
    public viewDataPetugasCS() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tanggal = new javax.swing.JComboBox<>();
        bulan = new javax.swing.JComboBox<>();
        tahun = new javax.swing.JComboBox<>();
        idPetugasCS = new javax.swing.JTextField();
        namaPetugasCS = new javax.swing.JTextField();
        alamatPetugasCS = new javax.swing.JTextField();
        lamaBekerjaCS = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 70, 30));

        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        bulan.setToolTipText("");
        getContentPane().add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 70, 30));

        tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "" }));
        getContentPane().add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 70, 30));
        getContentPane().add(idPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 350, 30));
        getContentPane().add(namaPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 350, 30));
        getContentPane().add(alamatPetugasCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 350, 30));
        getContentPane().add(lamaBekerjaCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 350, 30));
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 350, 30));

        batal.setText("Batal");
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 90, 40));

        ok.setText("OK");
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/34.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

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
    private javax.swing.JTextField Password;
    private javax.swing.JTextField alamatPetugasCS;
    private javax.swing.JButton batal;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JTextField idPetugasCS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lamaBekerjaCS;
    private javax.swing.JTextField namaPetugasCS;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox<String> tahun;
    private javax.swing.JComboBox<String> tanggal;
    // End of variables declaration//GEN-END:variables

    public String getDate() {

        String t=tahun.getItemAt(tahun.getSelectedIndex())+"-"+bulan.getSelectedIndex()+"-"+tanggal.getSelectedIndex();
        return t;
        
    }

    public String getPassword() {
        return Password.getText();
    }

    public void setPassword(String Password) {
        this.Password.setText(Password);
    }

    public String getAlamatPetugasCS() {
        return alamatPetugasCS.getText();
    }

    public void setAlamatPetugasCS(String alamatPetugasCS) {
        this.alamatPetugasCS.setText(alamatPetugasCS);
    }

    public JButton getBatal() {
        return batal;
    }

    public void setBatal(JButton batal) {
        this.batal = batal;
    }

    public JComboBox<String> getBulan() {
        return bulan;
    }

    public void setBulan(JComboBox<String> bulan) {
        this.bulan = bulan;
    }

    public String getIdPetugasCS() {
        return idPetugasCS.getText();
    }

    public void setIdPetugasCS(String idPetugasCS) {
        this.idPetugasCS.setText(idPetugasCS);
    }

    public int getLamaBekerjaCS() {
        int result=Integer.parseInt(lamaBekerjaCS.getText());
        return result;
    }

    public void setLamaBekerjaCS(String lamaBekerjaCS) {
        this.lamaBekerjaCS.setText(lamaBekerjaCS);
    }

    public String getNamaPetugasCS() {
        return namaPetugasCS.getText();
    }

    public void setNamaPetugasCS(String namaPetugasCS) {
        this.namaPetugasCS.setText(namaPetugasCS);
    }

    public JComboBox<String> getTahun() {
        return tahun;
    }

    public void setTahun(JComboBox<String> tahun) {
        this.tahun = tahun;
    }

    public JComboBox<String> getTanggal() {
        return tanggal;
    }

    public void setTanggal(JComboBox<String> tanggal) {
        this.tanggal = tanggal;
    }
    public void addActionListener(ActionListener x) {
        ok.addActionListener(x);
        batal.addActionListener(x);
    }

    public JButton getOk() {
        return ok;
    }

    public void setOk(JButton ok) {
        this.ok = ok;
    }
    
    
}
