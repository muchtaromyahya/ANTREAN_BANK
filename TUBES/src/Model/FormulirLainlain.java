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
    
    public FormulirLainlain(Customer c,String id, String keterangan){
        super(c,id);
        this.keterangan=keterangan;
    }
    public String getKeterangan(){
        return keterangan;
    }
    public void setKeterangan(String keterangan){
        this.keterangan=keterangan;
    }
}
