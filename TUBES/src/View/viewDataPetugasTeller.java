/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author YAHYA
 */
public class viewDataPetugasTeller extends javax.swing.JFrame {

    /**
     * Creates new form viewDataPetugasCS
     */
    
    public viewDataPetugasTeller() {
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

        tahun = new javax.swing.JComboBox<>();
        bulan = new javax.swing.JComboBox<>();
        tanggal = new javax.swing.JComboBox<>();
        idPetugas = new javax.swing.JTextField();
        namaPetugas = new javax.swing.JTextField();
        alamatPetugas = new javax.swing.JTextField();
        lamaBekerja = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "" }));
        getContentPane().add(tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 70, 30));

        bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        bulan.setToolTipText("");
        getContentPane().add(bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 70, 30));

        tanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 70, 30));
        getContentPane().add(idPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 340, 30));
        getContentPane().add(namaPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 340, 30));
        getContentPane().add(alamatPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 340, 30));
        getContentPane().add(lamaBekerja, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 340, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 340, 30));

        batal.setText("Batal");
        getContentPane().add(batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 100, 40));

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, 100, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/background/18.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 964, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDataPetugasTeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDataPetugasTeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatPetugas;
    private javax.swing.JButton batal;
    private javax.swing.JComboBox<String> bulan;
    private javax.swing.JTextField idPetugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lamaBekerja;
    private javax.swing.JTextField namaPetugas;
    private javax.swing.JButton ok;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> tahun;
    private javax.swing.JComboBox<String> tanggal;
    // End of variables declaration//GEN-END:variables

    public String getAlamatPetugas() {
        return alamatPetugas.getText();
    }

    public void setAlamatPetugas(String alamatPetugas) {
        this.alamatPetugas.setText(alamatPetugas);
    }

    public JButton getBatal() {
        return batal;
    }

    public void setBatal(JButton batal) {
        this.batal = batal;
    }

    public String getIdPetugas() {
        return idPetugas.getText();
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas.setText(idPetugas);
    }

    public int getLamaBekerja() {
        int result=Integer.parseInt(lamaBekerja.getText());
        return result;
    }

    public void setLamaBekerja(String lamaBekerja) {
        this.lamaBekerja.setText(lamaBekerja);
    }

    public String getNamaPetugas() {
        return namaPetugas.getText();
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas.setText(namaPetugas);
    }

    public String getPassword() {
        return password.getText();
    }

    public void setPassword(String password) {
        this.password.setText(password);
    }

    public void addActionListener(ActionListener x) {
        ok.addActionListener(x);
        batal.addActionListener(x);
    }
    public String getDate() {

        String t=tahun.getItemAt(tahun.getSelectedIndex())+"-"+bulan.getSelectedIndex()+"-"+tanggal.getSelectedIndex();
        return t;
    }

    public JComboBox<String> getBulan() {
        return bulan;
    }

    public void setBulan(JComboBox<String> bulan) {
        this.bulan = bulan;
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

    public JButton getOk() {
        return ok;
    }

    public void setOk(JButton ok) {
        this.ok = ok;
    }
    
    


}
