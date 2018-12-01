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
public class FormulirGantiKartu extends Formulir {
    private String jenisAwal;
    private String jenisGanti;
    private String noKartu;
    private String keterangan;
    
    public FormulirGantiKartu( Customer c,String id, String jenisAwal, String jenisGanti, String noKartu,String keterangan ){
        super(c);
        this.jenisAwal=jenisAwal;
        this.jenisGanti=jenisGanti;
        this.noKartu=noKartu;
        this.keterangan=keterangan;
        this.setIdFormulir(id);
    }
    public FormulirGantiKartu(String id,String nama,String jenisAwal,String jenisGanti,String noKartu,String keterangan) {
        super(nama);
        this.jenisAwal=jenisAwal;
        this.jenisGanti=jenisGanti;
        this.noKartu=noKartu;
        this.keterangan=keterangan;
    }
        public FormulirGantiKartu( Customer c, String jenisAwal, String jenisGanti, String noKartu,String keterangan ){
        super(c);
        this.jenisAwal=jenisAwal;
        this.jenisGanti=jenisGanti;
        this.noKartu=noKartu;
        this.keterangan=keterangan;
    }
    public String getJenisAwal(){
        return jenisAwal;
    }
    public void setJenisAwal(String jenisAwal){
        this.jenisAwal= jenisAwal;
    }
    public String getJenisGanti(){
        return jenisGanti;
    }
    public void setJenisGanti(String jenisGanti){
        this.jenisGanti=jenisGanti;
    }
    public String getNoKartu(){
        return noKartu;
    }
    public void setNoKartu(String noKartu){
        this.noKartu=noKartu;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
 
}
