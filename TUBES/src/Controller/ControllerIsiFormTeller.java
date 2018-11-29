/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Customer;
import Model.DatabaseTeller;
import Model.FormulirSetorTarik;
import View.viewIsiFormTeller;
import View.viewSetorTarik;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author YAHYA
 */
public class ControllerIsiFormTeller implements ActionListener {
    private viewIsiFormTeller ft;
    private viewSetorTarik fst;
    private DatabaseTeller dt;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(ft.getOk())) {
            btnOkActionPerform();
        }
        if (source.equals(fst.getOk())) {
            
        }
    }
    public void btnOkActionPerform() {
        String nama=ft.getTfNama();
        String norek=ft.getTfNoRek();
        Customer c=new Customer(nama,norek);
        fst.addActionListener(this);
        fst.setVisible(true);
        ft.setVisible(false);
        String jum=fst.getJumlahUang();
        String ket=fst.getPilihan();
        String berita=fst.getBerita();
        FormulirSetorTarik f=new FormulirSetorTarik(c,jum,ket,berita);
        dt.addCustomer(c, f);
        
        
        
    }
    public ControllerIsiFormTeller() {
        ft=new viewIsiFormTeller();
        dt=new DatabaseTeller();
        fst=new viewSetorTarik();
        ft.addActionListener(this);
        
        ft.setVisible(true);
        loadTable();
    }
    public void loadTable() {
        dt.getCustomer();
        dt.getFormulirSetorTarik();
    }
}
