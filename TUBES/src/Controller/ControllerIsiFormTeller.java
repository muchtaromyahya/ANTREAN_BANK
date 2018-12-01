/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Administrator;
import Model.Customer;
import Model.CustomerService;
import Model.DatabaseLogin;
import Model.DatabaseTeller;
import Model.Formulir;
import Model.FormulirSetorTarik;
import Model.FormulirTransfer;
import Model.Petugas;
import Model.Teller;
import View.Awal;
import View.login;
import View.viewAdmin;
import View.viewAntrean;
import View.viewDataPetugasCS;
import View.viewDataPetugasTeller;
import View.viewFormulirTeller;
import View.viewIsiFormTeller;
import View.viewSemuaPetugas;
import View.viewSetorTarik;
import View.viewTeller;
import View.viewTransfer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YAHYA
 */
public class ControllerIsiFormTeller implements ActionListener {
    private Awal Va;
    private viewSemuaPetugas vsp;
    private viewIsiFormTeller ft;
    private viewSetorTarik fst;
    private DatabaseTeller dt;
    private viewTeller vt;
    private login log;
    private DatabaseLogin dblog;
    private viewAdmin vAdmin;
    private viewDataPetugasCS vTambahCS;
    private viewDataPetugasTeller vTambahTeller;
    private viewAntrean antre;
    private viewFormulirTeller tellerview;
    private viewTransfer viewTF;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(ft.getOk())) {
            btnOkActionPerform1();
            ft.setVisible(false);
            ft.refresh();
        } else if (source.equals(vt.getSetorTarik())) {
            btnSetorTarikActionPerform();
        } else if (source.equals(fst.getOk())) {
            setorTarikOK();
            showAntrean();
            fst.refresh();
        } else if (source.equals(Va.getTeller())) {
            viewAwalTeller();
        } else if (source.equals(ft.getBatal())) {
            viewAwalbatalTeller();
        } else if(source.equals(fst.getBatal())) {
            btnBatalSetorTarikActionPerform();
        } else if (source.equals(Va.getbLogin())) {
            getButtonLogin();
        } else if (source.equals(log.getOk())) {
            getOKLogin();
            log.refresh();
        } else if (source.equals(vAdmin.getDataPetugas())) {
            btnDataPetugas();
        } else if (source.equals(vsp.getBatal())) {
            vAdmin.setVisible(true);
            vsp.setVisible(false);
        } else if (source.equals(vAdmin.getjButton2())) {
            vAdmin.setVisible(false);
            vTambahCS.setVisible(true);
        } else if (source.equals(vTambahCS.getOk())) {
            btnTambahCS();
        } else if (source.equals(vTambahCS.getBatal())) {
            vTambahCS.setVisible(false);
            vAdmin.setVisible(true);
        } else if (source.equals(vTambahTeller.getOk())) {
            btnTambahTeller();
        } else if (source.equals(vAdmin.getjButton1())) {
            vAdmin.setVisible(false);
            vTambahTeller.setVisible(true);
        } else if (source.equals(vAdmin.getLogout())) {
            log.setVisible(true);
            vAdmin.setVisible(false);
        } else if (source.equals(vsp.getHapus())) {
            hapusPetugas();
        } else if (source.equals(Va.getAntrean())) {
            Va.setVisible(false);
            showAntrean();
        } else if (source.equals(antre.getIsiForm())) {
            antre.setVisible(false);
            Va.setVisible(true);
        } else if (source.equals(vt.getTransfer())) {
            viewTF.setVisible(true);
            vt.setVisible(false);
        } else if (source.equals(viewTF.getOk())) {
            transferOK();
            showAntrean();
            viewTF.refresh();
        }
    }
    public void showAntrean() {
        loadTable();
        fst.setVisible(false);
        antre.setVisible(true);    
        antre.setAntreTeller(dt.getFormulir().get(0).getIdFormulir());
    }
    public void hapusPetugas() {
        String id=vsp.getTfHapus();
        dblog.delPetugas(id);
        loadTable();
    }
    public void btnTambahCS(){
        String nama=vTambahCS.getNamaPetugasCS();
        String id=vTambahCS.getIdPetugasCS();
        String alamat=vTambahCS.getAlamatPetugasCS();
        String tgl=vTambahCS.getDate();
        int lama=vTambahCS.getLamaBekerjaCS();
        String pass=vTambahCS.getPassword();
        String jenis="Customer Service";
        CustomerService cs=new CustomerService(id,pass,nama,alamat,tgl,lama,jenis);
        if (dblog.cekDuplikatID(cs.getIdPetugas())) {
            JOptionPane.showMessageDialog(null, "id duplikat", "Error", 0);
        } else {
            dblog.addPetugas(cs);
            vAdmin.setVisible(true);
            vTambahCS.setVisible(false);
        }
    }
        public void btnTambahTeller(){
        String nama=vTambahTeller.getNamaPetugas();
        String id=vTambahTeller.getIdPetugas();
        String alamat=vTambahTeller.getAlamatPetugas();
        String tgl=vTambahTeller.getDate();
        int lama=vTambahTeller.getLamaBekerja();
        String pass=vTambahTeller.getPassword();
        String jenis="Teller";
        Teller cs=new Teller(id,pass,nama,alamat,tgl,lama,jenis);
        if (dblog.cekDuplikatID(cs.getIdPetugas())) {
            JOptionPane.showMessageDialog(null, "id duplikat", "Error", 0);
        } else {
            dblog.addPetugas(cs);
            vAdmin.setVisible(true);
            vTambahTeller.setVisible(false);
        }
    }
    public void btnDataPetugas() {
        loadTable();
        vsp.setVisible(true);
        vAdmin.setVisible(false);
    }
    public void btnBatalSetorTarikActionPerform() {
        fst.setVisible(false);
        viewTeller();
    }
    public void btnOkActionPerform1() {
        String nama=ft.getTfNama();
        String norek=ft.getTfNoRek();
        Customer c=new Customer(nama,norek);
        
        if (dt.cekDuplikatID(c.getNoRek())) {
            JOptionPane.showMessageDialog(null, "id duplikat", "Error", 0);
        } else {
            dt.addCustomer(c);
            viewTeller();
        }
        
        
    }
    public void viewAwalTeller() {
        ft.setVisible(true);
        Va.setVisible(false);
    }
    public void viewTeller() {
        vt.setVisible(true);
        Va.setVisible(false);
    }
    public void btnSetorTarikActionPerform() {
        fst.setVisible(true);
        vt.setVisible(false);
    }
    public void setorTarikOK() {
        Customer c=dt.getCustomer().get(dt.getCustomer().size()-1);
        String jum=fst.getJumlahUang();
        String ket=fst.getPilihan();
        FormulirSetorTarik f=new FormulirSetorTarik(c,jum,ket);
        dt.addFormSetorTarik(f);
        fst.setVisible(false);
        
        
    }
    public void transferOK() {
        Customer c=dt.getCustomer().get(dt.getCustomer().size()-1);
        String bank=viewTF.getNamaBank();
        String rektuju=viewTF.getNoRekening();
        String jumlah=viewTF.getJumlahTransfer();
        String berita=viewTF.getBerita();
        String ket="transfer";
        FormulirTransfer f=new FormulirTransfer(c,jumlah,rektuju,bank,berita,ket);
        dt.addFormTransfer(f);
        viewTF.setVisible(false);
    }
    public void viewAwalbatalTeller() {
        Va.setVisible(true);
        ft.setVisible(false);
    }
    
    public ControllerIsiFormTeller() {
        antre=new viewAntrean();
        tellerview=new viewFormulirTeller();
        ft=new viewIsiFormTeller();
        dt=new DatabaseTeller();
        fst=new viewSetorTarik();
        vt=new viewTeller();
        Va=new Awal();
        viewTF=new viewTransfer();
        vTambahTeller= new viewDataPetugasTeller();
        vTambahCS=new viewDataPetugasCS();
        vsp=new viewSemuaPetugas();
        dblog=new DatabaseLogin();
        log=new login();
        vAdmin=new viewAdmin();
        vTambahCS.addActionListener(this);
        vTambahTeller.addActionListener(this);
        antre.addActionListener(this);
        vsp.addActionListener(this);
        log.addActionListener(this);
        vAdmin.addActionListener(this);
        Va.addActionListener(this);
        fst.addActionListener(this);
        ft.addActionListener(this);
        vt.addActionListener(this);
        viewTF.addActionListener(this);
        Va.setVisible(true);
        loadTable();
    }
    public void loadTable() {
        dt.getCustomer();
        dt.getFormulir();
        dblog.getPetugas();
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama", "Id", "Alamat", "TglLahir","lamaBekerja"}, 0);
        DefaultTableModel model2 = new DefaultTableModel(new String[]{"Nama", "Id", "Alamat", "TglLahir","lamaBekerja"}, 0);
        DefaultTableModel modeldt=new DefaultTableModel(new String[]{ "id",   "Nama", "NoRek", "NamaBank","rekTujuan","jumlahUang","berita","keterangan"}, 0);
        ArrayList<Petugas> p = dblog.getPetugas();
        for (Petugas o: p) {
            if (o instanceof Teller) {
                model.addRow(new Object[]{o.getNamaPetugas(), o.getIdPetugas(), o.getAlamatPetugas(), o.getTglLahirPetugas(),o.getLamaBekerja()});
            }
        }
        for (Petugas o:p) {
            if (o instanceof CustomerService) {
                model2.addRow(new Object[]{o.getNamaPetugas(), o.getIdPetugas(), o.getAlamatPetugas(), o.getTglLahirPetugas(),o.getLamaBekerja()});
            }
        }
        ArrayList<Formulir> fg=dt.getFormulir();
        for (Formulir s:fg) {
            if (s instanceof FormulirTransfer) {
                modeldt.addRow(new Object[]{s.getIdFormulir(),s.getNamaFormulir(), s.getNoRekFormulir(), ((FormulirTransfer) s).getBankTujuan(),((FormulirTransfer)s).getRekTujuan(),((FormulirTransfer)s).getJumlahTransfer(),((FormulirTransfer)s).getBerita(),((FormulirTransfer)s).getKeterangan()});
            } else if (s instanceof FormulirSetorTarik) {
                modeldt.addRow(new Object[]{s.getIdFormulir(), s.getNamaFormulir(), s.getNoRekFormulir(), "","",((FormulirSetorTarik)s).getJumlahSetorTarik(),"",((FormulirSetorTarik)s).getKeterangan()});
            }
        }
        tellerview.setTabel(modeldt);
        vsp.setTabelCustomerService(model2);
        vsp.setTabelTeller(model);
    }
    public void getButtonLogin() {
        Va.setVisible(false); 
        log.setVisible(true);
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
                if (c instanceof Teller) {
                    jenis=((Teller) c).getJenis();
                } else if (c instanceof CustomerService) {
                    jenis=((CustomerService) c).getJenis();
                } else if (c instanceof Administrator) {
                    jenis=((Administrator)c).getJenis();
                }
                
            } 
        }
        return jenis;      
    }
    public void getOKLogin() {
        String id=log.getUsername();
        String password=log.getPassword();
        boolean t=checkLogin(id,password);
        if (t==true) {
            if (getJenis(id,password).equals("Customer Service")) {
                //goToCs();
            } else if (getJenis(id,password).equals("Admin")) {
                vAdmin.setVisible(t);
                log.setVisible(false);
            } else if (getJenis(id,password).equals("Teller")) {
                tellerview.setVisible(t);
                log.setVisible(false);
            }

            
        } else  {
            log.showMessage("id atau Password salah","Error", 0);
        }
    }
    
}
