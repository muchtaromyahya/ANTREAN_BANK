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
 * @author geryn
 */
public class DatabaseCS {
private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Customer> customer = new ArrayList<>();

    public DatabaseCS() {
        loadCustomer();
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/customer_service";
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

    public void loadCustomer() {
        connect();
        try {
            String query = "SELECT * FROM customer";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                customer.add(new Customer(rs.getString("nik"),rs.getString("nama_lengkap"),rs.getString("nama_wali"),rs.getString("tgl_lahir"),rs.getString("telp"),rs.getString("alamat"),rs.getString("no_rek"),rs.getString("pendidikan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public ArrayList<Customer> getCustomer() {
        return customer;
    }
    
    public void addCustomer(Customer c) {
        connect();
        
        String query = "INSERT INTO mahasiswa VALUES (";
            query += "'" + c.getNama()+ "',";
            query += "'" + c.getNik()+ "',";
            query += "'" + c.getNoRek()+ "',";
            query += "'" + c.getAlamat()+ "',";
            query += "'" + c.getPendidikan()+ "',";
            query += "'" + c.getNoHp()+ "',";
            query += "'" + c.getTglLahir()+ "',";
            query += "'" + c.getWali()+ "'";
            query += ")";

        if (manipulate(query)) customer.add(c);
        disconnect();
    }
    public boolean cekDuplikatNIK(String NIK){
        boolean cek = false;
        for (Customer c : customer) {
            if (c.getNik().equals(NIK)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
}
