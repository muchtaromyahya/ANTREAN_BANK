/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.DatabaseCS;
import View.viewCustomerService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author YAHYA
 */
public class ControllerCS implements ActionListener {
    private viewCustomerService vcs;
    private DatabaseCS dcs;
    
    public void loadTable () {
        dcs.getCustomer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(vcs.getOk())) {
            getBtnOk();
        }
    }
    public void getBtnOk()  {
        String nik=vcs.getNik();
        String nama=vcs.getNamaLengkap();
        String wali=vcs.getNamaWali();
        String tgl=vcs.getTglLahir();
        String telp=vcs.getNoTelepon();
        String alamat=vcs.getAlamat();
        String no_rek=vcs.getNoRekening();
        String pendidikan=vcs.getPendidikanTerakhir();
        Customer C=new Customer(nama,nik,no_rek,alamat,pendidikan, telp,tgl,wali);
        dcs.addCustomer(C);
    }
    public ControllerCS () {
        vcs=new viewCustomerService();
        dcs=new DatabaseCS();
        vcs.addActionListener(this);
        vcs.setVisible(true);
        loadTable();
    }
}
