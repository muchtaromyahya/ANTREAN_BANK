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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YAHYA
 */
public class DatabaseTeller {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Customer> p = new ArrayList<>();
    private ArrayList<FormulirSetorTarik> fst=new ArrayList<>();
    
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
    public void addCustomer(Customer c,FormulirSetorTarik fs) {
        connect();
        
        String query = "INSERT INTO formulirteller VALUES (";
            query += "'" + c.getNama()+ "',";
            query += "'" + c.getNoRek()+ "'";
            query += ")";

        if (manipulate(query)) p.add(c);
        disconnect();
        connect();
        String query2="INSERT INTO setortarik (namaNasabah,noRek,jumlahUang,keterangan,berita) VALUES (";
            query2 += "'" + fs.getNamaFormulir()+ "',";
            query2 += "'" + fs.getNoRekFormulir()+ "',";
            query2 += "'" + fs.getJumlahSetorTarik()+ "',";
            query2 += "'" + fs.getKeterangan()+ "',";
            query2 += "'" + fs.getBerita()+ "'";
            query2 += ")";
        if(manipulate(query2)) fst.add(fs);
        disconnect();
        
    }

    public ArrayList<Customer> getCustomer() {
        return p;
    }
    public DatabaseTeller() {
        loadC();
    }

    public ArrayList<FormulirSetorTarik> getFormulirSetorTarik() {
        return fst;
    }
    
}
