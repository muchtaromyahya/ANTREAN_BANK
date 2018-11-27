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
public class FormulirBukaRekening extends Formulir {
    private String jenisRekening;
    private double setoranAwal;
    
    public FormulirBukaRekening(Customer c,String id, String jenisRekening, double setoranAwal){
        super(c,id);
        this.jenisRekening=jenisRekening;
        this.setoranAwal=setoranAwal;
    }
    public String getJenisRekening(){
        return jenisRekening;
        
    }
    public void setJenisRekening(String jenisRekening){
        this.jenisRekening=jenisRekening;
    }
    public double getSetoranAwal(){
        return setoranAwal;
    }
    public void setSetoranAwal(double setoranAwal){
        this.setoranAwal=setoranAwal;
    }
}
