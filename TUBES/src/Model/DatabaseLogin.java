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
public class DatabaseLogin {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Petugas> p = new ArrayList<>();

    public DatabaseLogin() {
        loadCS();
    }
    
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
    public void loadCS() {
        connect();
        try {
            String query = "SELECT * FROM daftarPetugas ";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                p.add(new Petugas(rs.getString("idPetugas"),rs.getString("password"),rs.getString("namaPetugas"),rs.getString("alamatPetugas"),rs.getString("tanggalLahir"),rs.getInt("lamaBekerja"),rs.getString("jenisService")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public ArrayList<Petugas> getPetugas() {
        return p;
    }
    public void addPetugas(Petugas c) {
        connect();
        
        String query = "INSERT INTO daftarPetugas VALUES (";
            query += "'" + c.getIdPetugas()+ "',";
            query += "'" + c.getPassword()+ "',";
            query += "'" + c.getNamaPetugas()+ "',";
            query += "'" + c.getAlamatPetugas()+ "',";
            query += "'" + c.getTglLahirPetugas()+ "',";
            query += "'" + c.getLamaBekerja()+ "',";
            query += "'" + c.getJenisService()+ "'";
            query += ")";

        if (manipulate(query)) p.add(c);
        disconnect();
    }
    public boolean cekDuplikatID(String id){
        boolean cek = false;
        for (Petugas c : p) {
            if (c.getIdPetugas().equals(id)){
                cek = true;
                break;
            }
        }
        return cek;
    }
}
