/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author YAHYA
 */
public class FormulirSetorTarik extends Formulir{
    private String keterangan;
    private String jumlahSetorTarik;
    
    public FormulirSetorTarik(Customer c, boolean isWithdraw, String jumlah, String berita){
        super(c);
        this.jumlahSetorTarik=jumlah;
    }
    public FormulirSetorTarik(Customer c,String jumlahUang,String keterangan) {
        super(c);
        this.jumlahSetorTarik=jumlahUang;
        this.keterangan=keterangan;
    }
    public FormulirSetorTarik(String id,String nama,String noRek,String jumlahUang,String keterangan) {
        super(nama,noRek);
        this.setIdFormulir(id);
        this.jumlahSetorTarik=jumlahUang;
        this.keterangan=keterangan;
    }
    public String getJumlahSetorTarik(){
        return jumlahSetorTarik;
    }
    public void setJumlahSetorTarik(String jumlah){
        this.jumlahSetorTarik=jumlah;
    }
    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }


    
    
}