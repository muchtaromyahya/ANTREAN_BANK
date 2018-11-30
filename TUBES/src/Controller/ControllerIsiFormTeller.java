/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.DatabaseTeller;
import Model.FormulirSetorTarik;
import View.Awal;
import View.viewIsiFormTeller;
import View.viewSetorTarik;
import View.viewTeller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author YAHYA
 */
public class ControllerIsiFormTeller implements ActionListener {
    private Awal Va;
    private viewIsiFormTeller ft;
    private viewSetorTarik fst;
    private DatabaseTeller dt;
    private viewTeller vt;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(ft.getOk())) {
            btnOkActionPerform1();
            viewTeller();
            
        } else if (source.equals(vt.getSetorTarik())) {
            btnSetorTarikActionPerform();
        } else if (source.equals(fst.getOk())) {
            setorTarikOK();
        } else if (source.equals(Va.getTeller())) {
            viewAwalTeller();
        }
    }
    public void btnOkActionPerform1() {
        String nama=ft.getTfNama();
        String norek=ft.getTfNoRek();
        Customer c=new Customer(nama,norek);
        dt.addCustomer(c);
        ft.setVisible(false);
        
    }
    public void viewAwalTeller() {
        ft.setVisible(true);
        Va.setVisible(false);
    }
    public void viewTeller() {
        vt.setVisible(true);
    }
    public void btnSetorTarikActionPerform() {
        fst.setVisible(true);
        vt.setVisible(false);
    }
    public void setorTarikOK() {
        Customer c=dt.getCustomer().get(dt.getCustomer().size()-1);
        String jum=fst.getJumlahUang();
        String ket=fst.getPilihan();
        String berita=fst.getBerita();
        FormulirSetorTarik f=new FormulirSetorTarik(c,jum,ket,berita);
        dt.addFormSetorTarik(f);
    }
    
    public ControllerIsiFormTeller() {
        ft=new viewIsiFormTeller();
        dt=new DatabaseTeller();
        fst=new viewSetorTarik();
        vt=new viewTeller();
        Va=new Awal();
        Va.addActionListener(this);
        fst.addActionListener(this);
        ft.addActionListener(this);
        vt.addActionListener(this);
        
        Va.setVisible(true);
        loadTable();
    }
    public void loadTable() {
        dt.getCustomer();
        dt.getFormulirSetorTarik();
    }
}
