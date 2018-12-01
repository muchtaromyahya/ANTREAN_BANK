/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Administrator;
import Model.Customer;
import Model.CustomerService;
import Model.DatabaseCS;
import Model.DatabaseLogin;
import Model.DatabaseTeller;
import Model.Formulir;
import Model.FormulirBukaRekening;
import Model.FormulirGantiKartu;
import Model.FormulirKehilangan;
import Model.FormulirLainlain;
import Model.FormulirSetorTarik;
import Model.FormulirTransfer;
import Model.Petugas;
import Model.Teller;
import View.Awal;
import View.login;
import View.viewAdmin;
import View.viewAntrean;
import View.viewCustomerService;
import View.viewDataPetugasCS;
import View.viewDataPetugasTeller;
import View.viewFormulirCS;
import View.viewFormulirTeller;
import View.viewIsiFormTeller;
import View.viewLainlain;
import View.viewPilihanCS;
import View.viewSemuaPetugas;
import View.viewSetorTarik;
import View.viewTeller;
import View.viewTransfer;
import View.*;
import View.viewUpgradeKartu;
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
    private viewBukaRekening vBukaRek;
    private viewLaporanKehilangan vLaporanKehilangan; 
    private DatabaseCS dcs;
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
    private viewCustomerService vCS;
    private viewLainlain vLL;
    private viewPilihanCS vPCS;
    private viewFormulirCS CSview;
    private viewUpgradeKartu CSupgrade;
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if (source.equals(ft.getOk())) {
            btnOkActionPerform1();
            
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
        } else if (source.equals(log.getBatal())) {
            log.setVisible(false);
            Va.setVisible(true);
        } else if (source.equals(tellerview.getBack())) {
            tellerview.setVisible(false);
            log.setVisible(true);
        } else if (source.equals(tellerview.getNext())) {
            lanjutAntrean();
        } else if (source.equals(Va.getCustomerService())) {
            Va.setVisible(false);
            vCS.setVisible(true);
            
        } else if (source.equals(vCS.getOk())) {
            addFormCS();
            vCS.setVisible(false);
            vPCS.setVisible(true);
            
        } else if (source.equals(vPCS.getLainlain())) {
            vPCS.setVisible(false);
            vLL.setVisible(true);
        } else if (source.equals(vLL.getOk())) {
            addFormLain();
            vLL.setVisible(false);
            showAntrean();
        } else if (source.equals(vCS.getBatal())) {
            Va.setVisible(true);
            vCS.setVisible(false);
        } else if (source.equals(CSview.getNext())) {
            hapusFormCS();
        } else if(source.equals(CSview.getBack())) {
            CSview.setVisible(false);
            log.setVisible(true);
        } else if (source.equals(vPCS.getUpgrade())) {
            CSupgrade.setVisible(true);
            vPCS.setVisible(false);
        } else if (source.equals(CSupgrade.getOK())) {
            addFormGanti();
            CSupgrade.setVisible(false);
            showAntrean();
        } else if (source.equals(vPCS.getLaporanKehilangan())) {
            vLaporanKehilangan.setVisible(true);
            vPCS.setVisible(false);
        } else if (source.equals(vLaporanKehilangan.getOk())) {
            addKehilangan();
            vLaporanKehilangan.setVisible(false);
            showAntrean();
        } else if (source.equals(vPCS.getBukaRekening())) {
            vBukaRek.setVisible(true);
            vPCS.setVisible(false);
        } else if (source.equals(vBukaRek.getOk())) {
            addBukaRek();
            vBukaRek.getOk();
            showAntrean();
        } else if (source.equals(viewTF.getBatal())) {
            vt.setVisible(true);
            viewTF.setVisible(false);
        } else if (source.equals(vTambahTeller.getBatal())) {
            vAdmin.setVisible(true);
            vTambahTeller.setVisible(false);
        } else if (source.equals(vBukaRek.getBatal())) {
            vPCS.setVisible(true);
            vBukaRek.setVisible(false);
        } else if (source.equals(CSupgrade.getBatal())) {
            vPCS.setVisible(true);
            CSupgrade.setVisible(false);
        } else if (source.equals(vLaporanKehilangan.getBatal())) {
            vPCS.setVisible(true);
            vLaporanKehilangan.setVisible(false);
        } else if (source.equals(vLL.getBatal())) {
            vPCS.setVisible(true);
            vLL.setVisible(false);
        }
    }
    public void addBukaRek() {
        Customer c=dcs.getCustomer().get(dcs.getCustomer().size()-1);
        String jenisKartu=vBukaRek.getJenisRekening();
        String setor=vBukaRek.getjTextField1();
        String ket="Buka Rekening";
        FormulirBukaRekening f=new FormulirBukaRekening(c,jenisKartu,setor,ket);
        dcs.addFormBuka(f);
    }
    public void addKehilangan() {
        Customer c=dcs.getCustomer().get(dcs.getCustomer().size()-1);
        String jam=vLaporanKehilangan.getjComboBox1();
        String tanggal=vLaporanKehilangan.getDate();
        String sebab=vLaporanKehilangan.getSebabKehilangan();
        String ket="Kehilangan";
        FormulirKehilangan f=new FormulirKehilangan(c,sebab,jam,tanggal,ket);
        dcs.addFormKehilangan(f);
    }
    public void addFormLain() {
        Customer c=dcs.getCustomer().get(dcs.getCustomer().size()-1);
        String keperluan=vLL.getKeterangan();
        String ket="Lain-lain";
        FormulirLainlain f =new FormulirLainlain(c,keperluan,ket);
        dcs.addFormLain(f);
        
        
    }
    public void addFormGanti() {
        Customer c=dcs.getCustomer().get(dcs.getCustomer().size()-1);
        String noKartu=CSupgrade.getNoKartu();
        String jenisAwal=CSupgrade.getJenisAwalKartu();
        String jenisAkhir=CSupgrade.getUpgradeKe();
        String ket="Upgrade Kartu";
        FormulirGantiKartu f=new FormulirGantiKartu(c,jenisAwal,jenisAkhir,noKartu,ket);
        dcs.addFormGantiKartu(f);
    }
    public void addFormCS() {
        String nik=vCS.getNik();
        String nama=vCS.getNamaLengkap();
        String wali=vCS.getNamaWali();
        String tgl=vCS.getDate();
        String telp=vCS.getNoTelepon();
        String alamat=vCS.getAlamat();
        String no_rek=vCS.getNoRekening();
        String pendidikan=vCS.getPendidikanTerakhir();
        Customer C=new Customer(nama,nik,no_rek,alamat,pendidikan, telp,tgl,wali);
        dcs.addCustomer(C);
    }
    public void lanjutAntrean() {
        loadTable();
        dt.delForm();
        loadTable();
    }
    public void showAntrean() {
        loadTable();
        fst.setVisible(false);
        antre.setVisible(true);
        antre.setAntreTeller("");
        antre.setAntreCS("");
        if(dcs.getFormulir().isEmpty()==false) {
            antre.setAntreCS(dcs.getFormulir().get(0).getNamaFormulir());
        }
        if (dt.getFormulir().isEmpty()==false) {
            antre.setAntreTeller(dt.getFormulir().get(0).getNamaFormulir());
        }
        loadTable();
    }
    public void hapusFormCS() {
        loadTable();
        dcs.delForm();
        loadTable();
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
            ft.setVisible(false);
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
        vLaporanKehilangan= new viewLaporanKehilangan();
        ft=new viewIsiFormTeller();
        dt=new DatabaseTeller();
        fst=new viewSetorTarik();
        vt=new viewTeller();
        Va=new Awal();
        vBukaRek=new viewBukaRekening();
        CSupgrade=new viewUpgradeKartu();
        vLL=new viewLainlain();
        vCS=new viewCustomerService();
        vPCS=new viewPilihanCS();
        viewTF=new viewTransfer();
        vTambahTeller= new viewDataPetugasTeller();
        vTambahCS=new viewDataPetugasCS();
        vsp=new viewSemuaPetugas();
        CSview=new viewFormulirCS();
        dblog=new DatabaseLogin();
        dcs=new DatabaseCS();
        vPCS.addActionListener(this);
        log=new login();
        vLL.addActionListener(this);
        vCS.addActionListener(this);
        vAdmin=new viewAdmin();
        vTambahCS.addActionListener(this);
        vTambahTeller.addActionListener(this);
        antre.addActionListener(this);
        vBukaRek.addActionListener(this);
        vsp.addActionListener(this);
        log.addActionListener(this);
        vAdmin.addActionListener(this);
        Va.addActionListener(this);
        fst.addActionListener(this);
        ft.addActionListener(this);
        vt.addActionListener(this);
        tellerview.addActionListener(this);
        vLaporanKehilangan.addActionListener(this);
        CSview.addActionListener(this);
        viewTF.addActionListener(this);
        CSupgrade.addActionListener(this);
        Va.setVisible(true);
        loadTable();
    }
    public void loadTable() {
        dt.getCustomer();
        dt.getFormulir();
        dblog.getPetugas();
        dcs.getCustomer();
        dcs.getFormulir();
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama", "Id", "Alamat", "TglLahir","lamaBekerja"}, 0);
        DefaultTableModel model2 = new DefaultTableModel(new String[]{"Nama", "Id", "Alamat", "TglLahir","lamaBekerja"}, 0);
        DefaultTableModel modeldcs=new DefaultTableModel(new String[]{ "id",   "Nama", "NoRek", "setoranAwal","tanggalkehilangan","jamKehilangan","sebabKehilangan","noKartu","jenisAwalKartu","upgradeKartu","keperluan","jenisTabungan","keterangan"}, 0);
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
        ArrayList<Formulir> fcs=dcs.getFormulir();
        for (Formulir d:fcs) {
            if (d instanceof FormulirLainlain) {
                modeldcs.addRow(new Object[]{d.getIdFormulir(),d.getNamaFormulir(),"","","","","","","","",((FormulirLainlain)d).getKeperluan(),"",((FormulirLainlain)d).getKeterangan()});
            } else if (d instanceof FormulirGantiKartu) {
                modeldcs.addRow(new Object[]{d.getIdFormulir(),d.getNamaFormulir(),"","","","","",((FormulirGantiKartu)d).getNoKartu(),((FormulirGantiKartu) d).getJenisAwal(),((FormulirGantiKartu)d).getJenisGanti(),"","",((FormulirGantiKartu)d).getKeterangan()});
            } else if (d instanceof FormulirKehilangan) {
                modeldcs.addRow(new Object[]{d.getIdFormulir(),d.getNamaFormulir(),"","",((FormulirKehilangan)d).getTanggalKehilangan(),((FormulirKehilangan)d).getJamKehilangan(),((FormulirKehilangan)d).getSebabKehilangan(),"","","","","",((FormulirKehilangan)d).getKeterangan()});
            } else if (d instanceof FormulirBukaRekening) {
                modeldcs.addRow(new Object[]{d.getIdFormulir(),d.getNamaFormulir(),"",((FormulirBukaRekening)d).getSetoranAwal(),"","","","","","","",((FormulirBukaRekening)d).getJenisRekening(),((FormulirBukaRekening)d).getKeterangan()});

            }
        }
        CSview.setTabel(modeldcs);
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
                CSview.setVisible(true);
                log.setVisible(false);
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
