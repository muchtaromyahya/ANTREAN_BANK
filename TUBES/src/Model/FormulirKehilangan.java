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
    
    public FormulirKehilangan( Customer c,String id, String sebabKehilangan, String jamKehilangan, String tanggalKehilangan){
        super(c,id);
        this.jamKehilangan=jamKehilangan;
        this.sebabKehilangan=sebabKehilangan;
        this.tanggalKehilangan=tanggalKehilangan;
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
}
