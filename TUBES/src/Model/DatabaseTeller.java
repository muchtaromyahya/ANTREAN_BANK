/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author YAHYA
 */
public class DatabaseTeller {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Customer> p = new ArrayList<>();
    private ArrayList<Formulir> fst=new ArrayList<>();
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/data_petugas";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadC() {
        connect();
        try {
            String query = "SELECT * FROM formulirteller ";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                p.add(new Customer(rs.getString("namaLengkap"),rs.getString("noRek")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
//    public void loadF() {
//        connect();
//        try {
//            String query = "SELECT * FROM FormulirUntukTeller where keterangan='setoran' or keterangan='tarikan'";
//            rs = stmt.executeQuery(query);
//            while (rs.next()){
//                fst.add(new FormulirSetorTarik(rs.getString("id"),rs.getString("namaLengkap"),rs.getString("noRek"),rs.getString("jumlahUang"),rs.getString("keterangan")));
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        disconnect();
//    }
    public void loadFTR() {
        connect();
        try {
            String query = "SELECT * FROM FormulirUntukTeller";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                if (rs.getString("keterangan").equals("transfer")) {
                    fst.add(new FormulirTransfer(rs.getString("id"),rs.getString("namaLengkap"),rs.getString("noRek"),rs.getString("jumlahUang"),rs.getString("rekTujuan"),rs.getString("namaBank"),rs.getString("berita"),rs.getString("keterangan")));
                } else if (rs.getString("keterangan").equals("setoran") || rs.getString("keterangan").equals("tarikan")) {
                    fst.add(new FormulirSetorTarik(rs.getString("id"),rs.getString("namaLengkap"),rs.getString("noRek"),rs.getString("jumlahUang"),rs.getString("keterangan")));
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void addCustomer(Customer c) {
        connect();
        
        String query = "INSERT INTO formulirteller VALUES (";
            query += "'" + c.getNama()+ "',";
            query += "'" + c.getNoRek()+ "'";
            query += ")";

        if (manipulate(query)) p.add(c);
        else JOptionPane.showMessageDialog(null, "id duplikat", "Error", 0);
        disconnect();
    }
    public void addFormSetorTarik(FormulirSetorTarik fs) {
        connect();
        String query2="INSERT INTO FormulirUntukTeller VALUES (";
            query2 += "'" + fs.getIdFormulir()+ "',";
            query2 += "'" + fs.getNamaFormulir()+ "',";
            query2 += "'" + fs.getNoRekFormulir()+ "',";
            query2 += "'" + "" + "',";
            query2 += "'" + "" + "',";
            query2 += "'" + fs.getJumlahSetorTarik()+ "',";
            query2 += "'" + "" + "',";
            query2 += "'" + fs.getKeterangan()+ "'";
            query2 += ")";
        if(manipulate(query2)) fst.add((FormulirSetorTarik)fs);
        disconnect();
    }
        public void addFormTransfer(FormulirTransfer fs) {
        connect();
        String query2="INSERT INTO FormulirUntukTeller VALUES (";
            query2 += "'" + fs.getIdFormulir()+ "',";
            query2 += "'" + fs.getNamaFormulir()+ "',";
            query2 += "'" + fs.getNoRekFormulir()+ "',";
            query2 += "'" + fs.getBankTujuan() + "',";
            query2 += "'" + fs.getRekTujuan() + "',";
            query2 += "'" + fs.getJumlahTransfer() + "',";
            query2 += "'" + fs.getBerita() + "',";
            query2 += "'" + fs.getKeterangan()+ "'";
            query2 += ")";
        if(manipulate(query2)) fst.add((FormulirTransfer)fs);
        disconnect();
    }

    public ArrayList<Customer> getCustomer() {
        return p;
    }
    public DatabaseTeller() {
        loadC();
//        loadF();
        loadFTR();
    }

    public ArrayList<Formulir> getFormulir() {
        return fst;
    }
        public boolean cekDuplikatID(String noRek){
        boolean cek = false;
        for (Customer c : p) {
            if (c.getNoRek().equals(noRek)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    public void delForm() {
        connect();
        boolean t=false;
        String query = "DELETE FROM formuliruntukteller WHERE id='" + fst.get(0).getIdFormulir() + "'";
        String noRek=fst.get(0).getNoRekFormulir();
        if (manipulate(query)){
            for (Formulir o:fst) {
                if (o.getIdFormulir().equals(fst.get(0).getIdFormulir())){
                    fst.remove(o);
                    t=true;
                    JOptionPane.showMessageDialog(null, "berhasil ke formulir selanjutnya", "sukses", 0);
                    query="DELETE FROM formulirteller WHERE norek='" + noRek + "'";
                    if(manipulate(query)) {
                        for (Customer i:p) {
                            if (i.getNoRek().equals(noRek)) {
                                p.remove(i);
                            }
                        }
                    }
                    break;
                }
            }
            
        }
        if (t==false) {
                JOptionPane.showMessageDialog(null, "id tidak ditemukan", "Error", 0);
            }
        
        disconnect();
    }
    
}
