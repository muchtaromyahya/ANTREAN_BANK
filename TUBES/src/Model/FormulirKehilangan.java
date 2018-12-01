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
public class FormulirKehilangan extends Formulir {
    private String sebabKehilangan;
    private String tanggalKehilangan;
    private String jamKehilangan;
    private String keterangan;
    
    public FormulirKehilangan( Customer c, String sebabKehilangan, String jamKehilangan, String tanggalKehilangan,String keterangan){
        super(c);
        this.jamKehilangan=jamKehilangan;
        this.sebabKehilangan=sebabKehilangan;
        this.tanggalKehilangan=tanggalKehilangan;
        this.keterangan=keterangan;
    }
        public FormulirKehilangan( String nama,String id, String sebabKehilangan, String jamKehilangan, String tanggalKehilangan,String keterangan){
        super(nama);
        this.jamKehilangan=jamKehilangan;
        this.sebabKehilangan=sebabKehilangan;
        this.tanggalKehilangan=tanggalKehilangan;
        this.keterangan=keterangan;
        this.setIdFormulir(id);
    }
    public String getSebabKehilangan(){
        return sebabKehilangan;
    }
    public void setSebabKehilangan(String sebebKehilangan){
        this.sebabKehilangan=sebebKehilangan;
    }
    public String getTanggalKehilangan(){
        return tanggalKehilangan;
    }
    public void setTanggalKehilangan(String tanggalKehilangan){
        this.tanggalKehilangan=tanggalKehilangan;
    }
    public String getJamKehilangan(){
        return jamKehilangan;
    }
    public void setJamKehilangan(String jamKehilangan){
        this.jamKehilangan=jamKehilangan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
}
