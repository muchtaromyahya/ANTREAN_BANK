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
import javax.swing.JOptionPane;

/**
 *
 * @author geryn
 */
public class DatabaseCS {
private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Customer> customer = new ArrayList<>();
    private ArrayList<Formulir> f=new ArrayList<>();

    public DatabaseCS() {
        loadCustomer();
        loadLainlain();
//        loadGantiKartu();
//        loadKehilangan();
//        loadBuka();
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

    public void loadCustomer() {
        connect();
        try {
            String query = "SELECT * FROM formulir_cs";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                customer.add(new Customer(rs.getString("nama_lengkap"),rs.getString("nik"),rs.getString("no_rek"),rs.getString("alamat"),rs.getString("pendidikan"),rs.getString("telp"),rs.getString("tgl_lahir"),rs.getString("nama_wali")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public void loadLainlain() {
        connect();
        try {
            String query = "SELECT * FROM formuliruntukcs where keterangan='Lain-lain'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                if (rs.getString("keterangan").equals("Lain-lain")) {
                    f.add(new FormulirLainlain(rs.getString("id"),rs.getString("nama_lengkap"),rs.getString("keperluan"),rs.getString("keterangan")));
                } else if (rs.getString("keterangan").equals("Kehilangan")) {
                    f.add(new FormulirKehilangan(rs.getString("nama_lengkap"),rs.getString("id"),rs.getString("sebabKehilangan"),rs.getString("jamKehilangan"),rs.getString("tanggalKehilangan"),rs.getString("keterangan")));
                } else if (rs.getString("keterangan").equals("Upgrade Kartu")) {
                    f.add(new FormulirGantiKartu(rs.getString("id"),rs.getString("nama_lengkap"),rs.getString("jenisAwalKartu"),rs.getString("upgradeKartu"),rs.getString("noKartu"),rs.getString("keterangan")));
                    
                } else if (rs.getString("keterangan").equals("Buka Rekening")) {
                    f.add(new FormulirBukaRekening(rs.getString("nama_lengkap"),rs.getString("id"),rs.getString("jenisTabungan"),rs.getString("SetoranAwal"),rs.getString("keterangan")));

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public void addFormLain(FormulirLainlain c) {
        connect();
        
        String query = "INSERT INTO formuliruntukcs VALUES (";
            query += "'" + c.getIdFormulir()+ "',";
            query += "'" + c.getNamaFormulir()+ "',";
            query += "'" + "" + "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + c.getKeperluan()+ "',";
            query += "'" + c.getKeterangan()+ "'";
            query += ")";

        if (manipulate(query)) f.add((FormulirLainlain)c);
        disconnect();
    }
    public void addFormKehilangan(FormulirKehilangan c) {
        connect();
        
        String query = "INSERT INTO formuliruntukcs VALUES (";
            query += "'" + c.getIdFormulir()+ "',";
            query += "'" + c.getNamaFormulir()+ "',";
            query += "'" + "" + "',";
            query += "'" + ""+ "',";
            query += "'" + c.getTanggalKehilangan()+ "',";
            query += "'" + c.getJamKehilangan()+ "',";
            query += "'" + c.getSebabKehilangan()+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + c.getKeterangan()+ "'";
            query += ")";

        if (manipulate(query)) f.add((FormulirKehilangan)c);
        disconnect();
    }
    public void loadKehilangan() {
        connect();
        try {
            String query = "SELECT * FROM formuliruntukcs where keterangan='Kehilangan'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                f.add(new FormulirKehilangan(rs.getString("nama_lengkap"),rs.getString("id"),rs.getString("sebabKehilangan"),rs.getString("jamKehilangan"),rs.getString("tanggalKehilangan"),rs.getString("keterangan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public void addFormBuka(FormulirBukaRekening c) {
        connect();
        
        String query = "INSERT INTO formuliruntukcs VALUES (";
            query += "'" + c.getIdFormulir()+ "',";
            query += "'" + c.getNamaFormulir()+ "',";
            query += "'" + "" + "',";
            query += "'" + c.getSetoranAwal()+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + c.getJenisRekening()+ "',";
            query += "'" + c.getKeterangan()+ "'";
            query += ")";

        if (manipulate(query)) f.add((FormulirBukaRekening)c);
        disconnect();
    }
    public void loadBuka() {
        connect();
        try {
            String query = "SELECT * FROM formuliruntukcs where keterangan='Buka Rekening'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                f.add(new FormulirBukaRekening(rs.getString("nama_lengkap"),rs.getString("id"),rs.getString("jenisTabungan"),rs.getString("SetoranAwal"),rs.getString("keterangan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    public void loadGantiKartu() {
        connect();
        try {
            String query = "SELECT * FROM formuliruntukcs where keterangan='Upgrade Kartu'";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                f.add(new FormulirGantiKartu(rs.getString("id"),rs.getString("nama_lengkap"),rs.getString("jenisAwalKartu"),rs.getString("upgradeKartu"),rs.getString("noKartu"),rs.getString("keterangan")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseCS.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
        public void addFormGantiKartu(FormulirGantiKartu c) {
        connect();
        
        String query = "INSERT INTO formuliruntukcs VALUES (";
            query += "'" + c.getIdFormulir()+ "',";
            query += "'" + c.getNamaFormulir()+ "',";
            query += "'" + "" + "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + c.getNoKartu()+ "',";
            query += "'" + c.getJenisAwal()+ "',";
            query += "'" + c.getJenisGanti()+ "',";
            query += "'" + ""+ "',";
            query += "'" + ""+ "',";
            query += "'" + c.getKeterangan()+ "'";
            query += ")";

        if (manipulate(query)) f.add((FormulirGantiKartu)c);
        disconnect();
    }
    
    
    public void addCustomer(Customer c) {
        connect();
        
        String query = "INSERT INTO formulir_cs VALUES (";
            query += "'" + c.getNik()+ "',";
            query += "'" + c.getNama()+ "',";
            query += "'" + c.getWali()+ "',";
            query += "'" + c.getTglLahir()+ "',";
            query += "'" + c.getNoHp()+ "',";
            query += "'" + c.getAlamat()+ "',";
            query += "'" + c.getNoRek()+ "',";
            query += "'" + c.getPendidikan()+ "'";
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
    public void delForm() {
        connect();
        boolean t=false;
        String query = "DELETE FROM formuliruntukCS WHERE id='" + f.get(0).getIdFormulir() + "'";
        String noRek=f.get(0).getNamaFormulir();
        if (manipulate(query)){
            for (Formulir o:f) {
                if (o.getIdFormulir().equals(f.get(0).getIdFormulir())){
                    f.remove(o);
                    t=true;
                    JOptionPane.showMessageDialog(null, "berhasil ke formulir selanjutnya", "sukses", 0);
                    query="DELETE FROM formulir_cs WHERE nama_lengkap='" + noRek + "'";
                    if(manipulate(query)) {
                        for (Customer i:customer) {
                            if (i.getNama().equals(noRek)) {
                                customer.remove(i);
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

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public ArrayList<Formulir> getFormulir() {
        return f;
    }
    
    
    
}
