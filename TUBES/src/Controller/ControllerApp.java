/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DatabaseLogin;
import Model.Petugas;
import View.Awal;
import View.login;
import View.viewAdmin;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

/**
 *
 * @author geryn
 */
public class ControllerApp implements ActionListener {
    private login log;
    private DatabaseLogin dblog;
    private viewAdmin vAdmin;
    
    public ControllerApp() {
    log=new login();
    vAdmin=new viewAdmin();
    dblog=new DatabaseLogin();
    log.addActionListener(this);
    log.setVisible(true);
    loadTable();
    }
    public void loadTable() {
        dblog.getPetugas();
    }
    public void btnLoginAction() {
        String id=log.getUsername();
        String password=log.getPassword();
        boolean t=checkLogin(id,password);
        if (t==true) {
            if (getJenis(id,password).equals("Customer Service")) {
                goToCs();
            } else if (getJenis(id,password).equals("Admin")) {
                goToAdmin();
            }

            
        } else  {
            log.showMessage("id atau Password salah","Error", 0);
        }
        
    }
    public boolean checkLogin(String id, String password) {
        loadTable();
        boolean cek=false;
        ArrayList<Petugas> cs= dblog.getPetugas();
        for (Petugas c:cs) {
            if (c.getIdPetugas().equals(id) && c.getPassword().equals(password)) {
                cek=true;
            }
        }
        return cek;    
    }
    public String getJenis(String id,String password) {
        loadTable();
        String jenis = null;
        ArrayList<Petugas> cs= dblog.getPetugas();
        for (Petugas c:cs) {
            if (c.getIdPetugas().equals(id) && c.getPassword().equals(password)) {
                jenis=c.getJenisService();
                
            }
        }
        return jenis;      
    }
    public void goToCs(){
        
    }
    public void goToAdmin() {
        log.setVisible(false);
        vAdmin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(log.getOk())) {
            btnLoginAction();
        }
    }
    public void hakAkses(){
        log.setEnabled(true);
        log.getOk().setEnabled(true);
        log.getBatal().setEnabled(true);
        
    }

    
}
