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
public class FormulirTransfer extends Formulir {
    private String jumlahTransfer;
    private String rekTujuan;
    private String bankTujuan;
    private String keterangan;
    private String berita ;
    
    public FormulirTransfer(Customer c, String jumlah, String rekTujuan, String bankTujuan,String berita,String keterangan){
        super(c);
        this.bankTujuan=bankTujuan;
        this.jumlahTransfer=jumlah;
        this.rekTujuan=rekTujuan;
        this.keterangan=keterangan;
        this.berita=berita;
    }
    public FormulirTransfer(String id,String nama,String norek,String jumlah,String rekTujuan,String bankTujuan,String berita,String keterangan) {
        super(nama,norek);
        this.setIdFormulir(id);
        this.bankTujuan=bankTujuan;
        this.jumlahTransfer=jumlah;
        this.rekTujuan=rekTujuan;
        this.keterangan=keterangan;
        this.berita=berita;
    }
    public String getJumlahTransfer(){
        return jumlahTransfer;
    }
    public void setJumlahTransfer(String jumlah){
        this.jumlahTransfer= jumlah;
    }
    public String getRekTujuan(){
        return rekTujuan;
    }
    public void setRekTujuan(String rekTujuan){
        this.rekTujuan=rekTujuan;
    }
    public String getBankTujuan(){
        return bankTujuan;
    }
    public void setBankTujuan(String bankTujuan){
        this.bankTujuan=bankTujuan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getBerita() {
        return berita;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }
    
    
    
}
