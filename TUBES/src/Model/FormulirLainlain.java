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
public class FormulirLainlain extends Formulir {
    private String keterangan;
    private String keperluan;
    
    public FormulirLainlain(Customer c,String keperluan, String keterangan){
        super(c);
        this.keterangan=keterangan;
        this.keperluan=keperluan;
    }
    public FormulirLainlain (String id,String nama,String keperluan,String keterangan) {
        super(nama);
        this.setIdFormulir(id);
        this.keperluan=keperluan;
        this.keterangan=keterangan;
    }
    public String getKeterangan(){
        return keterangan;
    }
    public void setKeterangan(String keterangan){
        this.keterangan=keterangan;

    }

    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }
    
}
