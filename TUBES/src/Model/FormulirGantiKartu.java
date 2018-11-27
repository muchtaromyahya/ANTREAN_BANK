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
    
    public FormulirGantiKartu( Customer c,String id, String jenisAwal, String jenisGanti, String noKartu ){
        super(c,id);
        this.jenisAwal=jenisAwal;
        this.jenisGanti=jenisGanti;
        this.noKartu=noKartu;
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
 
}
